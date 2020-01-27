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


public class Mobile_TransferStepDefs implements En {
	DataStorage dataStorage;
	String ServiceAccId;

	public Mobile_TransferStepDefs(DataStorage dataStorage) {

		System.out.println("MobileTransferStepDefs Constructor");
		this.dataStorage = dataStorage;

		Given("^call QueryAsset for source SSN \"([^\"]*)\" to get asset details AssetNumber and ServiceAccountId for promotionName \"([^\"]*)\"$",
				(String ssn, String Promotion) -> {
					try {

					QueryAsset queryAsset = new QueryAsset(dataStorage);
						System.out.println("Check for Asset " + ExcelData.getData(CommonStepDefs.Tc_Name, Promotion));
					AssetMgmtAssetHeaderData assetMgmtAssetHeaderData = queryAsset.getAssetMgmtAssetHeaderData(ExcelData.getData(CommonStepDefs.Tc_Name, ssn),
							ExcelData.getData(CommonStepDefs.Tc_Name, Promotion));
					if (assetMgmtAssetHeaderData == null) {
						System.out.println("Asset is not available: " + ExcelData.getData(CommonStepDefs.Tc_Name, Promotion));
						Assert.assertNotNull("ASSET NOT FOUND ", assetMgmtAssetHeaderData);
					}
					String assetNumber = assetMgmtAssetHeaderData.getAssetNumber();
					ServiceAccId = assetMgmtAssetHeaderData.getServiceAccountId();
					String ProductId = assetMgmtAssetHeaderData.getProductId();
					System.out.println("AssetNumber :" + assetNumber);
					System.out.println("serviceAccountId=" + ServiceAccId);
					dataStorage.setIntegrationId(assetMgmtAssetHeaderData.getIntegrationId());
					dataStorage.setAssetNumber(assetNumber);
					dataStorage.setProductId(ProductId);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				});

		When("^call QueryTransferModifyAssetToQuote and transfer Service to \"([^\"]*)\"$", (String TargetSSN) -> {
			System.out.println("TransferAssetToQuote");
			try {
			String quoteNumber = getGeneratedQuoteNumber();
			System.out.println("quoteNumber=" + quoteNumber);
			QueryTransferModifyAssetToQuote queryTransferModifyAssetToQuote;
				queryTransferModifyAssetToQuote = new QueryTransferModifyAssetToQuote(dataStorage);
				String serviceAccId = ServiceAccId;
				String BillingProfileId = dataStorage.getAccountDetails().getBillingProfile();
				String TargetserviceAccountId = dataStorage.getAccountDetails().getServiceAccount();
				System.out.println("serviceAccId " + serviceAccId + "\nTargetserviceAccountId " +TargetserviceAccountId);
					queryTransferModifyAssetToQuote.transfermodifyAssetToQuote(quoteNumber, dataStorage.getAssetNumber(), serviceAccId, ExcelData.getData(CommonStepDefs.Tc_Name, TargetSSN ), BillingProfileId ,TargetserviceAccountId );
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		});
		
		When("^call SynchronizeQuote for a Transfer order$", () -> {
			Quote quote = dataStorage.getQuote();
//			quote.setTSReasonCode("Non-Payment");
			quote.setTSSkipCreditCheckflag("Y");
			ListOfQuoteItem listOfQuoteItem = quote.getListOfQuoteItem();
			List<QuoteItem> quoteItemList = listOfQuoteItem.getQuoteItem();
			quoteItemList.stream()
					.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
					.forEach(quoteItem -> {
					});
			QueryQuote queryQuote = new QueryQuote(dataStorage);
			queryQuote.updateQuote(quote);
		});

	}
}
