package se.telia.siebel.stepdefs;

import static se.telia.siebel.apiquerys.GenerateQuoteNumber.getGeneratedQuoteNumber;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.siebel.ordermanagement.catalog.data.productdetails.Product;
import com.siebel.ordermanagement.configurator.cfginteractdata.Attribute;
import com.siebel.ordermanagement.configurator.cfginteractdata.DomainItem;
import com.siebel.ordermanagement.configurator.cfginteractdata.Item;
import com.siebel.ordermanagement.configurator.cfginteractdata.Relationship;
import com.siebel.ordermanagement.quote.data.Quote;
import com.siebel.ordermanagement.quote.data.QuoteItem;

import coreFramework.ExcelData;
import cucumber.api.java8.En;
import se.telia.siebel.apiquerys.QueryApplyProductPromotion;
import se.telia.siebel.apiquerys.QueryApplyPromotionOnExistingQuote;
import se.telia.siebel.apiquerys.QueryGetProductPromotionDetails;
import se.telia.siebel.apiquerys.QueryQuote;
import se.telia.siebel.apiquerys.QueryUpdateConfiguration;
import se.telia.siebel.apiquerys.QuoteAddBundleItem;
import se.telia.siebel.apiquerys.SiebelDateFormat;
import se.telia.siebel.apiquerys.SiebelFlattenDataStructures;
import se.telia.siebel.data.DataStorage;


public class Mobile_NewStepDefs implements En {
	DataStorage dataStorage;
	String BundleId;

	public Mobile_NewStepDefs(DataStorage dataStorage) {

		System.out.println("Mobile_NewStepDefs Constructor");
		this.dataStorage = dataStorage;

		And("^call GetProductPromotionDetailsService using promotionCode \"([^\"]*)\" and service \"([^\"]*)\" and get ProductId, PriceList$",
				(String productName, String AdditionalService) -> {
					try {

					System.out.println("\nGetProductDetailsService\n");
					QueryGetProductPromotionDetails getProdDetails = new QueryGetProductPromotionDetails(dataStorage);
					List<Product> productList = getProdDetails.getProductsDetails(ExcelData.getData(CommonStepDefs.Tc_Name, productName),ExcelData.getData(CommonStepDefs.Tc_Name, AdditionalService));

					for (Product product : productList) {
							if (ExcelData.getData(CommonStepDefs.Tc_Name,AdditionalService).equalsIgnoreCase(product.getName())) {
								BundleId = product.getID();
								System.out.println("BundleId is :" + BundleId);
							} else if (ExcelData.getData(CommonStepDefs.Tc_Name,productName).equalsIgnoreCase(product.getName())) {
								String productID = product.getID();
								String priceList = product.getPriceListId();
								System.out.println("ProductID is :" + productID + ".  PriceList ID is :" + priceList);
								dataStorage.setProductId(productID);
								dataStorage.setPriceListId(priceList);
							}
					}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				});
		
		And("^call ApplyProductPromotionService and get quote", () -> {
			System.out.println("\nApplyProductPromotionService\n");

			String quoteNumber = getGeneratedQuoteNumber();
			System.out.println("quoteNumber=" + quoteNumber);
			String dueDate = SiebelDateFormat.getCurentCETtime();
			QueryApplyProductPromotion queryApplyProductPromotion = new QueryApplyProductPromotion(dataStorage);
			Quote quote = queryApplyProductPromotion.applyProductPromotion(dataStorage.getAccountDetails(), quoteNumber,
					dueDate, dataStorage.getPrimaryOrganizationId(), dataStorage.getProductId(),
					dataStorage.getPriceListId());
			Assert.assertNotNull(quote);
			dataStorage.setQuote(quote);
			dataStorage.setQuoteNumber(quote.getQuoteNumber());
		});
		
		And("^call QuoteAddBundleItem to add a serviceBundle and get quote", () -> {
			System.out.println("\nQuoteAdditems\n");

			QuoteAddBundleItem quoteAddItem = new QuoteAddBundleItem(dataStorage);
			Quote quote = quoteAddItem.quoteAddItems(dataStorage.getQuote(), BundleId);
			dataStorage.setQuote(quote);

		});


		And("^call QuoteAddBundleItem to add \"([^\"]*)\" serviceBundle and \"([^\"]*)\" product", (String Bundle, String product) -> {
			System.out.println("\nQuoteAdditems\n");

			QuoteAddBundleItem quoteAddItem = new QuoteAddBundleItem(dataStorage);
			Quote quote = quoteAddItem.quoteAddItems(dataStorage.getQuote(), BundleId);
			List<QuoteItem> quoteItem = quote.getListOfQuoteItem().getQuoteItem();
			for(QuoteItem QITEM : quoteItem){
				try {
					if(QITEM.getName().equalsIgnoreCase(ExcelData.getData(CommonStepDefs.Tc_Name,product))){
						dataStorage.setRootId(QITEM.getId()); /**ProdPromInstanceId**/
						System.out.println("productInstanceId=" + dataStorage.setRootId(QITEM.getId()));

					}
					if(QITEM.getName().equalsIgnoreCase(ExcelData.getData(CommonStepDefs.Tc_Name,Bundle))){
					dataStorage.setIntegrationId(QITEM.getId()); /**setLineItemId**/
					System.out.println("LineItemId=" + dataStorage.setIntegrationId(QITEM.getId()));

				}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			dataStorage.setQuote(quote);

		});
		
		And("^call ApplyProductPromotionService to associate Bundle", () -> {
			System.out.println("\nAssociateBundle\n");

			QueryApplyPromotionOnExistingQuote queryApplyProductPromotion = new QueryApplyPromotionOnExistingQuote(dataStorage);
			Quote quote = queryApplyProductPromotion.applyProductPromotion(dataStorage.getRootId(), dataStorage.getProductId(),
					dataStorage.getIntegrationId());
			Assert.assertNotNull(quote);
			dataStorage.setQuote(quote);
			dataStorage.setQuoteNumber(quote.getQuoteNumber());
		});

		And("^call UpdateConfiguration to SetAttribute \"([^\"]*)\" Value of SIM \"([^\"]*)\"$",
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
						List<Item> innerItemList = item.getItem();
						for (Item innerItem : innerItemList) {
							List<Relationship> relationship = innerItem.getRelationship();
							for (Relationship relation : relationship) {
								relation.setHasGenericsFlag("false");
							}
							List<Attribute> AttributeList = innerItem.getAttribute();
							for (Attribute PresentAttribute : AttributeList) {
								if (Attribute.equalsIgnoreCase(PresentAttribute.getName())) {
									integrationId = innerItem.getIntegrationId();
								}
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
		

		And("^call SynchronizeQuote to book number \"([^\"]*)\" for serivce \"([^\"]*)\" in a Mobile order$",
				(String Number, String ServiceBundle) -> {
					System.out.println("\nSynchronizeQuote\n");
					Quote quote = dataStorage.getQuote();

					quote.setTSRetailerId("000000");

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								try {
									if (quoteItem.getName().equalsIgnoreCase(ExcelData.getData(CommonStepDefs.Tc_Name, ServiceBundle))) {
										System.out.println("SERVICE ID : " + ExcelData.getData(CommonStepDefs.Tc_Name, Number));
										quoteItem.setTSNHFReservationStatus("Booked");
										quoteItem.setServiceId(ExcelData.getData(CommonStepDefs.Tc_Name, Number));

									}
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								if (quoteItem.getTSProductType().equalsIgnoreCase("simcard")) {
									quoteItem.setProductShipFlag("N");
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

		And("^call AddVoice SynchronizeQuote to book number \"([^\"]*)\" for serivce \"([^\"]*)\" and \"([^\"]*)\" in a Mobile order$",
				(String Number, String ServiceBundle, String addtionalBundle) -> {
					System.out.println("\nSynchronizeQuote\n");
					try {

					Quote quote = dataStorage.getQuote();
					String[] bookingId;
						bookingId = ExcelData.getData(CommonStepDefs.Tc_Name, Number).split(";");
					quote.setTSRetailerId("000000");

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								try {
									if (quoteItem.getName().equalsIgnoreCase(ExcelData.getData(CommonStepDefs.Tc_Name, ServiceBundle))) {
										System.out.println("SERVICE ID : " + bookingId[0]);
										quoteItem.setTSNHFReservationStatus("Booked");
										quoteItem.setServiceId(bookingId[0]);

									} else if (quoteItem.getName().equalsIgnoreCase(ExcelData.getData(CommonStepDefs.Tc_Name, addtionalBundle))) {
										System.out.println("SERVICE ID : " + bookingId[1]);
										quoteItem.setTSNHFReservationStatus("Booked");
										quoteItem.setServiceId(bookingId[1]);

									}
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								if (quoteItem.getTSProductType().equalsIgnoreCase("simcard")) {
									quoteItem.setProductShipFlag("N");
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
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				});
		And("^call SynchronizeQuote to book unique number \"([^\"]*)\" for product and book number \"([^\"]*)\" for serivce \"([^\"]*)\" in a Mobile Hemtelifoni order$",
				(String UniqueNumber, String Number, String ServiceBundle) -> {
					System.out.println("\nSynchronizeQuote\n");
					Quote quote = dataStorage.getQuote();

					quote.setTSRetailerId("000000");

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								if (quoteItem.getName().equalsIgnoreCase(ServiceBundle)) {
									System.out.println("SERVICE ID : " + Number);
									quoteItem.setTSNHFReservationStatus("Booked");
									quoteItem.setServiceId(Number);

								}
								if (quoteItem.getName().equalsIgnoreCase("MT-Mitt Hemnummer Free-1826")) {
									try {
									System.out.println("SERVICE ID : " + ExcelData.getData(CommonStepDefs.Tc_Name,UniqueNumber));
										quoteItem.setServiceId(ExcelData.getData(CommonStepDefs.Tc_Name,UniqueNumber));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}

								if (quoteItem.getTSProductType().equalsIgnoreCase("simcard")) {
									quoteItem.setProductShipFlag("N");
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
