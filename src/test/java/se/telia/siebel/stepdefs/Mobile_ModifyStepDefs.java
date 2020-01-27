package se.telia.siebel.stepdefs;

import static se.telia.siebel.apiquerys.GenerateQuoteNumber.getGeneratedQuoteNumber;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.siebel.ordermanagement.catalog.data.productdetails.Product;
import com.siebel.ordermanagement.configurator.cfginteractdata.Attribute;
import com.siebel.ordermanagement.configurator.cfginteractdata.Item;
import com.siebel.ordermanagement.configurator.cfginteractdata.Relationship;
import com.siebel.ordermanagement.quote.data.ListOfQuote;
import com.siebel.ordermanagement.quote.data.Quote;
import com.siebel.ordermanagement.quote.data.QuoteItem;
import com.siebel.xml.asset_management_complex_io.data.AssetMgmtAssetHeaderData;

import coreFramework.ExcelData;
import cucumber.api.java8.En;
import se.telia.siebel.apiquerys.QueryApplyProductPromotion;
import se.telia.siebel.apiquerys.QueryApplyPromotionOnExistingQuote;
import se.telia.siebel.apiquerys.QueryAsset;
import se.telia.siebel.apiquerys.QueryGetProductPromotionDetails;
import se.telia.siebel.apiquerys.QueryModifyAssetToQuote;
import se.telia.siebel.apiquerys.QueryQuote;
import se.telia.siebel.apiquerys.QueryUpdateConfiguration;
import se.telia.siebel.apiquerys.QueryUpgradePromotionToQuote;
import se.telia.siebel.apiquerys.QuoteAddBundleItem;
import se.telia.siebel.apiquerys.SiebelDateFormat;
import se.telia.siebel.apiquerys.SiebelFlattenDataStructures;
import se.telia.siebel.data.AccountDetails;
import se.telia.siebel.data.DataStorage;


public class Mobile_ModifyStepDefs implements En {
	DataStorage dataStorage;
	String BundleId;

	public Mobile_ModifyStepDefs(DataStorage dataStorage) {

		System.out.println("Mobile_ModifyStepDefs Constructor");
		this.dataStorage = dataStorage;

		And("^call Mobile ModifyAssetToQuote for ServiceBundle \"([^\"]*)\"$", (String ServiceBundle) -> {
			System.out.println("ModifyAssetToQuote");
			String quoteNumber = getGeneratedQuoteNumber();
			try {

			System.out.println("quoteNumber=" + quoteNumber);
			for (int i = 0; i < dataStorage.getAssetHolder().size(); i++) {
				System.out.println("Size of Assets:" + dataStorage.getAssetHolder().size());

				String Asset = dataStorage.getAssetHolder().get("AssetNumber" + i);
				if (Asset == null) {
					System.out.println("NO SUCH ASSET");
				} else {

					QueryModifyAssetToQuote queryModifyAssetToQuote = new QueryModifyAssetToQuote(dataStorage);
					ListOfQuote quoteList = queryModifyAssetToQuote.modifyAssetToQuote(quoteNumber, Asset,
							ExcelData.getData(CommonStepDefs.Tc_Name, ServiceBundle), null, null);
					dataStorage.setPrimaryOrganizationId(quoteList.getQuote().get(0).getPrimaryOrganizationId());
					dataStorage.setPriceListId(quoteList.getQuote().get(0).getPriceListId());
					
					AccountDetails accountDetails = new AccountDetails();
					accountDetails.setCustomerAccount(quoteList.getQuote().get(0).getAccountId());
					accountDetails.setServiceAccount(quoteList.getQuote().get(0).getServiceAccountId());
					accountDetails.setPrimaryContact(quoteList.getQuote().get(0).getContactId());
					accountDetails.setBillingAccount(quoteList.getQuote().get(0).getBillingAccountId());
					accountDetails.setBillingProfile(quoteList.getQuote().get(0).getBillingProfileId());
					dataStorage.setQuoteNumber(quoteNumber);
					dataStorage.setAccountDetails(accountDetails);
					dataStorage.setQuote(quoteList.getQuote().get(0));
					System.out.println("quoteNumber=" + quoteNumber);


				}

			}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		});

		And("^call ApplyPromotionOnExistingQuoteService and get quote", () -> {
			

			System.out.println("\nApplyProductPromotionServiceforHWPROMOTION\n");

			String quoteNumber = dataStorage.getQuoteNumber();
			System.out.println("quoteNumber=" + quoteNumber);
			String dueDate = SiebelDateFormat.getCETtime();
			QueryApplyPromotionOnExistingQuote queryApplyProductPromotion = new QueryApplyPromotionOnExistingQuote(
					dataStorage);
			System.out.println("AccountDetails :" + dataStorage.getAccountDetails());
			Quote quote = queryApplyProductPromotion.applyProductPromotion(null, dataStorage.getProductId(),
					null);
			Assert.assertNotNull(quote);
			dataStorage.setQuote(quote);
			dataStorage.setQuoteNumber(quote.getQuoteNumber());
		});

		And("^call HWUpdateConfiguration to SetAttribute \"([^\"]*)\" Value of SIM \"([^\"]*)\"$",
				(String Attribute, String Value) -> {
					System.out.println("\nUPDATE ATTRIBUTE\n");
					try {
					String[] List_of_Attributes = Attribute.split(";");
					String[] List_of_Values = ExcelData.getData(CommonStepDefs.Tc_Name, Value).split(";");
					Map<String, String> attributes = new HashMap<>();

					for (int i = 0; i < List_of_Attributes.length; i++) {
						attributes.put(List_of_Attributes[i], List_of_Values[i]);

					}
					List<Item> itemList = dataStorage.getListOfData().getProductData().getItem();
					String integrationId = null;

					for (Item item : itemList) {
						List<Attribute> AttributeList = item.getAttribute();
						for (Attribute PresentAttribute : AttributeList) {
							if (Attribute.equalsIgnoreCase(PresentAttribute.getName())) {
								integrationId = item.getIntegrationId();
								// integrationId = "1-184FLUX";
							}
						}
					}
					Assert.assertNotNull("integrationId not found", integrationId);
					// System.out.println("UPDATE FOR " +List_of_Attributes[i]);
					QueryUpdateConfiguration queryUpdateConfiguration = new QueryUpdateConfiguration(dataStorage);
					boolean ok = queryUpdateConfiguration.setAttributes(integrationId, attributes);
					Assert.assertTrue("Update of the commitment duration failed", ok);
					dataStorage.setIntegrationId(integrationId);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				});

		And("^call SynchronizeQuote for a \"([^\"]*)\" Mobile Modify and HW \"([^\"]*)\" order$",
				(String serviceBundle, String hardwareProduct) -> {
					System.out.println("\nSynchronizeQuote\n");
					Quote quote = dataStorage.getQuote();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								try {
								if (quoteItem.getName().equalsIgnoreCase(ExcelData.getData(CommonStepDefs.Tc_Name, serviceBundle))) {
									dataStorage.setSubscriptionRelId(quoteItem.getAssetIntegrationId());
									System.out.println(
											"Subscription Relation ID : " + dataStorage.getSubscriptionRelId());
								}
								if (quoteItem.getTSProductType().contains("HW")
										|| quoteItem.getName().equals(ExcelData.getData(CommonStepDefs.Tc_Name, hardwareProduct))) {
									System.out.println(
											"Subscription Relation ID : " + dataStorage.getSubscriptionRelId());
									quoteItem.setTsServiceIntegrationID(dataStorage.getSubscriptionRelId());

								}
									if (quoteItem.getTSProductType().contains("HW")
											|| quoteItem.getName().equals(ExcelData.getData(CommonStepDefs.Tc_Name, hardwareProduct))
											|| quoteItem.getTSProductType().contains("simcard")) {
										quoteItem.setProductShipFlag("N");

									}
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

	}
}
