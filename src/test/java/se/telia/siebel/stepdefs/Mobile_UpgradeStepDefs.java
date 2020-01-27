package se.telia.siebel.stepdefs;

import static se.telia.siebel.apiquerys.GenerateQuoteNumber.getGeneratedQuoteNumber;

import java.util.List;

import org.junit.Assert;

import com.siebel.ordermanagement.quote.data.ListOfQuoteItem;
import com.siebel.ordermanagement.quote.data.Quote;
import com.siebel.ordermanagement.quote.data.QuoteItem;
import com.siebel.xml.asset_management_complex_io.data.AssetMgmtAssetHeaderData;

import coreFramework.ExcelData;
import cucumber.api.java8.En;
import se.telia.siebel.apiquerys.QueryAsset;
import se.telia.siebel.apiquerys.QueryQuote;
import se.telia.siebel.apiquerys.QueryTransferModifyAssetToQuote;
import se.telia.siebel.apiquerys.QueryUpgradePromotionToQuote;
import se.telia.siebel.apiquerys.SiebelDateFormat;
import se.telia.siebel.apiquerys.SiebelFlattenDataStructures;
import se.telia.siebel.data.DataStorage;


public class Mobile_UpgradeStepDefs implements En {
	DataStorage dataStorage;
	String BundleId;

	public Mobile_UpgradeStepDefs(DataStorage dataStorage) {

		System.out.println("Mobile_UpgradeStepDefs Constructor");
		this.dataStorage = dataStorage;

		Given("^call QueryAsset using SSN \"([^\"]*)\" to get asset details AssetNumber and ServiceAccountId for promotionName \"([^\"]*)\"$",
				(String ssn, String Promotion) -> {
					try {

					QueryAsset queryAsset = new QueryAsset(dataStorage);
						System.out.println("Check for Asset " + ExcelData.getData(CommonStepDefs.Tc_Name, Promotion));
					AssetMgmtAssetHeaderData assetMgmtAssetHeaderData = queryAsset.getAssetMgmtAssetHeaderData(ExcelData.getData(CommonStepDefs.Tc_Name, ssn),
							ExcelData.getData(CommonStepDefs.Tc_Name, Promotion));
					if (assetMgmtAssetHeaderData == null) {
						System.out.println("Asset is not available: " +ExcelData.getData(CommonStepDefs.Tc_Name, Promotion));
						Assert.assertNotNull("ASSET NOT FOUND ", assetMgmtAssetHeaderData);
					}
					String assetNumber = assetMgmtAssetHeaderData.getAssetNumber();
					String serviceAccountId = assetMgmtAssetHeaderData.getServiceAccountId();
					String ProductId = assetMgmtAssetHeaderData.getProductId();
					System.out.println("AssetNumber :" + assetNumber);
					System.out.println("serviceAccountId=" + serviceAccountId);
					dataStorage.setServiceAccountId(serviceAccountId);
					dataStorage.setIntegrationId(assetMgmtAssetHeaderData.getIntegrationId());
					dataStorage.setAssetNumber(assetNumber);
					dataStorage.setProductId(ProductId);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				});

		And("^call QueryUpgradePromotionToQuote for \"([^\"]*)\" Order and get Quote$", (String ReasonCode) -> {
			System.out.println("\nQueryUpgradePromotionToQuote\n");
			try {
			String quoteNumber = getGeneratedQuoteNumber();
			System.out.println("quoteNumber=" + quoteNumber);
			String dueDate = SiebelDateFormat.getCETtime();
			QueryUpgradePromotionToQuote queryUpgradePromotionToQuote = new QueryUpgradePromotionToQuote(dataStorage);
			Quote quote = queryUpgradePromotionToQuote.upgradePromotion(dataStorage.getAccountDetails(), quoteNumber,
						dueDate, dataStorage.getPrimaryOrganizationId(), dataStorage.getProductId(),ExcelData.getData(CommonStepDefs.Tc_Name, ReasonCode),
						dataStorage.getAssetNumber());
			Assert.assertNotNull(quote);
			dataStorage.setQuote(quote);
			dataStorage.setQuoteNumber(quoteNumber);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

		And("^call SynchronizeQuote to change dueDate of \"([^\"]*)\" for serivce \"([^\"]*)\" and \"([^\"]*)\" in a Mobile order$",
				(String ReasonCode, String OldPlan, String NewPlan) -> {
					System.out.println("\nSynchronizeQuote\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.MobileDueDate();
					quote.setTSRetailerId("000000");

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								try {
								if (ExcelData.getData(CommonStepDefs.Tc_Name, ReasonCode).equalsIgnoreCase("Upgrade")) {
									if (quoteItem.getName().equalsIgnoreCase(ExcelData.getData(CommonStepDefs.Tc_Name, OldPlan))
											|| quoteItem.getName().equalsIgnoreCase(ExcelData.getData(CommonStepDefs.Tc_Name, NewPlan))) {
										quoteItem.setRequestedDeliveryDate(dueDate);
									}

								} else if (ExcelData.getData(CommonStepDefs.Tc_Name, ReasonCode).equalsIgnoreCase("Downgrade")
										|| ExcelData.getData(CommonStepDefs.Tc_Name, ReasonCode).equalsIgnoreCase("Sidegrade")) {

									if (quoteItem.getName().equalsIgnoreCase(ExcelData.getData(CommonStepDefs.Tc_Name, OldPlan))
											|| quoteItem.getName().equalsIgnoreCase(ExcelData.getData(CommonStepDefs.Tc_Name, NewPlan))) {
										quoteItem.setRequestedDeliveryDate(dueDate);
										List<QuoteItem> quoteList = quoteItem.getQuoteItem();
										for (QuoteItem q : quoteList) {
											q.setRequestedDeliveryDate(dueDate);
										}

									}

								}
								if (quoteItem.getTSProductType().equalsIgnoreCase("simcard")
										|| quoteItem.getName().equalsIgnoreCase(NewPlan)) {
									quoteItem.setProductShipFlag("N");

								}
								if (quoteItem.getName().equalsIgnoreCase(NewPlan)) {
									quoteItem.setTSCommitmentReason(ExcelData.getData(CommonStepDefs.Tc_Name, ReasonCode));

								}
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
								if (quoteItem.getName().equals("MT-SIM Card 559-1620")) {
									quoteItem.setProductShipFlag("N");
								}
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});
	}
}
