package se.telia.siebel.stepdefs;

import static se.telia.siebel.apiquerys.GenerateQuoteNumber.getGeneratedQuoteNumber;
import static se.telia.siebel.apiquerys.SiebelFlattenDataStructures.getFlattenedQuoteItems;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.siebel.ordermanagement.catalog.data.productdetails.Product;
import com.siebel.ordermanagement.configurator.cfginteractdata.DomainItem;
import com.siebel.ordermanagement.configurator.cfginteractdata.Item;
import com.siebel.ordermanagement.configurator.cfginteractdata.ListOfData;
import com.siebel.ordermanagement.configurator.cfginteractdata.Relationship;
import com.siebel.ordermanagement.quote.data.ListOfQuote;
import com.siebel.ordermanagement.quote.data.Quote;
import com.siebel.ordermanagement.quote.data.QuoteItem;
import com.siebel.ordermanagement.quote.data.QuoteItemXA;

import coreFramework.ExcelData;
import cucumber.api.java8.En;
import se.telia.siebel.apiquerys.QueryApplyProductPromotion;
import se.telia.siebel.apiquerys.QueryCustomer;
import se.telia.siebel.apiquerys.QueryEndConfiguration;
import se.telia.siebel.apiquerys.QueryGetProductDetails;
import se.telia.siebel.apiquerys.QueryProductConfigurator;
import se.telia.siebel.apiquerys.QueryQuote;
import se.telia.siebel.apiquerys.QueryQuotingWebService;
import se.telia.siebel.apiquerys.QuerySelfServiceAddressQueryPage;
import se.telia.siebel.apiquerys.QuerySelfServiceUser;
import se.telia.siebel.apiquerys.QueryUpdateConfiguration;
import se.telia.siebel.apiquerys.QuoteAddItem;
import se.telia.siebel.apiquerys.SiebelDateFormat;
import se.telia.siebel.apiquerys.SiebelFlattenDataStructures;
import se.telia.siebel.data.AccountDetails;
import se.telia.siebel.data.DataStorage;


public class NewStepdef implements En {
	DataStorage dataStorage;

	public NewStepdef(DataStorage dataStorage) {

		System.out.println("NewStepDefs Constructor");
		this.dataStorage = dataStorage; // dataStorage is injected and contains
										// stuff that needs sharing between
										// steps
		When("^call SelfServiceUser to get primary organization id which is used in quote creation$", () -> {
			System.out.println("\nSelfServiceUser\n");
			QuerySelfServiceUser selfService = new QuerySelfServiceUser(dataStorage);
			String primaryOrgID = selfService.getPrimaryOrganizationId(dataStorage.getLoginName());
			System.out.println("Primary Organization id is :" + primaryOrgID);
			dataStorage.setPrimaryOrganizationId(primaryOrgID);
		});

		And("^call QueryCustomer using SSN \"([^\"]*)\" to get account and billing details$", (String ssn) -> {
			System.out.println("\nQueryCustomer\n");
			try {

				QueryCustomer queryCustomer = new QueryCustomer(dataStorage);
				AccountDetails accountDetails = queryCustomer
						.getGetAccountDetailsString(ExcelData.getData(CommonStepDefs.Tc_Name, ssn));
				String AddressID = queryCustomer.getPrimaryAddressId(ExcelData.getData(CommonStepDefs.Tc_Name, ssn));
				dataStorage.setPrimaryAddressId(AddressID);
				Assert.assertNotNull("accountDetails is null", accountDetails);
				System.out.println("This is the accountDetails that we got back:");
				System.out.println(accountDetails.dump());
				dataStorage.setAccountDetails(accountDetails);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		And("^call SDU BB SynchronizeQuote to populate the AccessCode \"([^\"]*)\" on the quote line items for a SDU order$",
				(String accessType) -> {
					System.out.println("\nSynchronizeQuote for BroadBand+IPTV\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCurentCETtime();
					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")) {
									try {
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call SDU IPTV SynchronizeQuote to populate the AccessCode \"([^\"]*)\" on the quote line items for a SDU order$",
				(String accessType) -> {
					System.out.println("\nSynchronizeQuote for IPTV\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCurentCETtime();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getLineNumber().equals("4") || quoteItem.getLineNumber().equals("5")
										|| quoteItem.getLineNumber().equals("6")) {
									try {
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call SDU BBIPTV SynchronizeQuote to populate the AccessCode \"([^\"]*)\" on the quote line items for a SDU order$",
				(String accessType) -> {
					System.out.println("\nSynchronizeQuote for BroadBand+IPTV\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCurentCETtime();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")
										|| quoteItem.getLineNumber().equals("7")) {
									try {
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call SDU BBVOIP SynchronizeQuote to populate the AccessCode \"([^\"]*)\" on the quote line items for a SDU order$",
				(String accessType) -> {
					System.out.println("\nSynchronizeQuote for BroadBand+IPTV\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")
										|| quoteItem.getLineNumber().equals("5")
										|| quoteItem.getLineNumber().equals("7")) {
									try {
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}

								}
								if (quoteItem.getName().equals("VoIP SE Service bundle_1606")
										|| quoteItem.getName().equals("VoIP SE_B2B Service bundle_1649")) {
									quoteItem.setTSVoIPDeviceType("RGW");
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call BB xDSLSynchronizeQuote to populate the AccessCode \"([^\"]*)\" and ConnRef number \"([^\"]*)\" on the quote line items for a xDSL order$",
				(String accessType, String fbNumber) -> {
					System.out.println("\nSynchronizeQuote for BroadBand\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();
					String BBDueDate = SiebelDateFormat.BBDueDate();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);

								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("5")) {
									try {
										quoteItem.setRequestedDeliveryDate(BBDueDate);
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
										quoteItem.setConnectivityReferenceNumber(
												ExcelData.getData(CommonStepDefs.Tc_Name, fbNumber));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}

								}
								// if (quoteItem.getLineNumber().equals("5")) {
								// quoteItem.setRequestedDeliveryDate(BBDueDate);
								//
								// }

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call BBVOIPIPTV xDSLSynchronizeQuote to populate the AccessCode \"([^\"]*)\" and ConnRef number \"([^\"]*)\" on the quote line items for a xDSL order$",
				(String accessType, String fbNumber) -> {
					System.out.println("\nSynchronizeQuote for BroadBand\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();
					String BBDueDate = SiebelDateFormat.BBDueDate();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);

								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")
										|| quoteItem.getLineNumber().equals("5")
										|| quoteItem.getLineNumber().equals("7")
										|| quoteItem.getLineNumber().equals("8")
										|| quoteItem.getLineNumber().equals("9")
										|| quoteItem.getLineNumber().equals("11")) {
									try {

										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
										quoteItem.setConnectivityReferenceNumber(
												ExcelData.getData(CommonStepDefs.Tc_Name, fbNumber));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								if (quoteItem.getLineNumber().equals("3")) {
									quoteItem.setRequestedDeliveryDate(BBDueDate);
								}
								if (quoteItem.getName().equals("VoIP SE Service bundle_1606")
										|| quoteItem.getName().equals("VoIP SE_B2B Service bundle_1649")) {
									quoteItem.setTSVoIPDeviceType("RGW");
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call BBVOIPIPTV SynchronizeQuote to populate the deliveryContract \"([^\"]*)\" and AccessCode \"([^\"]*)\" on the quote line items for a MDU order$",
				(String Agreement, String RowID, String RevisionNumber, String AccessCode) -> {
					System.out.println("\nSynchronizeQuote for BroadBand\n");
					Quote quote = dataStorage.getQuote();
					// String dueDate =
					// SiebelDateFormat.siebelDateFormat(SiebelDateFormat.getTomorrowsDate());
					String dueDate = SiebelDateFormat.getCETtime();
					String dueDateHardware = SiebelDateFormat.siebelDateFormat(new Date());

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								// if(quoteItem.getLineNumber().equals("2")){
								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")
										|| quoteItem.getLineNumber().equals("7")
										|| quoteItem.getLineNumber().equals("8")
										|| quoteItem.getLineNumber().equals("9")) {
									try {
										quoteItem.setTSDeliveryContractId(
												ExcelData.getData(CommonStepDefs.Tc_Name, RowID));
										quoteItem.setTSMDUDeliveryContractNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, Agreement));
										quoteItem.setTSMDUDeliveryContractRevNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, RevisionNumber));
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, AccessCode));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
								quoteItem.setTSColtDeliveryFromDate(dueDateHardware);
								System.out.println("Setting TSColtDeliveryFromDate to " + dueDateHardware);
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call BBIPTV SynchronizeQuote to populate the deliveryContract \"([^\"]*)\" Revision \"([^\"]*)\" RowID \"([^\"]*)\" and AccessCode \"([^\"]*)\" on the quote line items for a MDU order$",
				(String Agreement, String RevisionNumber, String RowID, String AccessCode) -> {
					System.out.println("\nSynchronizeQuote for BroadBandIPTVMDU\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();
					String dueDateHardware = SiebelDateFormat.siebelDateFormat(new Date());

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")
										|| quoteItem.getLineNumber().equals("7")
										|| quoteItem.getLineNumber().equals("8")
										|| quoteItem.getLineNumber().equals("9")) {
									try {
										quoteItem.setTSDeliveryContractId(
												ExcelData.getData(CommonStepDefs.Tc_Name, RowID));
										quoteItem.setTSMDUDeliveryContractNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, Agreement));
										quoteItem.setTSMDUDeliveryContractRevNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, RevisionNumber));
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, AccessCode));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
								quoteItem.setTSColtDeliveryFromDate(dueDateHardware);
								System.out.println("Setting TSColtDeliveryFromDate to " + dueDateHardware);
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call BBVOIPIPTV SynchronizeQuote to populate the deliveryContract \"([^\"]*)\" Revision \"([^\"]*)\" RowID \"([^\"]*)\" and AccessCode \"([^\"]*)\" on the quote line items for a MDU order$",
				(String Agreement, String RevisionNumber, String RowID, String AccessCode) -> {
					System.out.println("\nSynchronizeQuote for BroadBandIPTVMDU\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.siebelDateFormat(SiebelDateFormat.getTomorrowsDate());
					String dueDateHardware = SiebelDateFormat.siebelDateFormat(new Date());

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")
										|| quoteItem.getLineNumber().equals("7")
										|| quoteItem.getLineNumber().equals("8")
										|| quoteItem.getLineNumber().equals("9")
										|| quoteItem.getLineNumber().equals("11")) {
									try {

										quoteItem.setTSDeliveryContractId(
												ExcelData.getData(CommonStepDefs.Tc_Name, RowID));
										quoteItem.setTSMDUDeliveryContractNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, Agreement));
										quoteItem.setTSMDUDeliveryContractRevNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, RevisionNumber));
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, AccessCode));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								if (quoteItem.getName().equals("VoIP SE Service bundle_1606")
										|| quoteItem.getName().equals("VoIP SE_B2B Service bundle_1649")) {
									quoteItem.setTSVoIPDeviceType("RGW");
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
								quoteItem.setTSColtDeliveryFromDate(dueDateHardware);
								System.out.println("Setting TSColtDeliveryFromDate to " + dueDateHardware);
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call SDU BBIPTV_VOIP SynchronizeQuote to populate the AccessCode \"([^\"]*)\" on the quote line items for a SDU order$",
				(String accessType) -> {
					System.out.println("\nSynchronizeQuote for BroadBand+IPTV\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")
										|| quoteItem.getLineNumber().equals("7")
										|| quoteItem.getLineNumber().equals("9")
										|| quoteItem.getLineNumber().equals("8")
										|| quoteItem.getLineNumber().equals("11")) {
									try {
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								if (quoteItem.getName().equals("VoIP SE Service bundle_1606")
										|| quoteItem.getName().equals("VoIP SE_B2B Service bundle_1649")) {
									quoteItem.setTSVoIPDeviceType("RGW");
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call QuerySelfServiceAddress Add/Update for XDSL format StreetName,StreetNumber,Entrance,City,Apartnumber,PointID;Postalcode \"([^\"]*)\"$",
				(String AddressData) -> {
					System.out.println("\nQuerySelfServiceAccount\n");
					Map<String, String> AddressMap = new HashMap<>();
					String[] AddressParam = AddressData.split(";");
					AddressMap.put("StreetAddress", AddressParam[0]);
					AddressMap.put("StreetAddress2", AddressParam[1]);
					AddressMap.put("Entrance", AddressParam[2]);
					AddressMap.put("City", AddressParam[3]);
					AddressMap.put("ApartmentNum", AddressParam[4]);
					AddressMap.put("PostalCode", AddressParam[6]);
					AddressMap.put("PointId", AddressParam[5]);
					QuerySelfServiceAddressQueryPage querySelfServiceAddress = new QuerySelfServiceAddressQueryPage(
							dataStorage);
					querySelfServiceAddress.SiebelCheckExistingAddress(AddressMap, "2");
				});

		And("^call GetProductDetailsService using promotionCode \"([^\"]*)\" and get ProductId, PriceList$",
				(String productName) -> {
					try {

						System.out.println("\nGetProductDetailsService\n");
						System.out.println("\nPROMOTION:" + ExcelData.getData(CommonStepDefs.Tc_Name, productName));
						QueryGetProductDetails queryGetProdDetails = new QueryGetProductDetails(dataStorage);
						Product product = queryGetProdDetails
								.getProductsDetails(ExcelData.getData(CommonStepDefs.Tc_Name, productName));
						String productID = product.getID();
						System.out.println("ProductID is :" + productID);
						dataStorage.setProductId(productID);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});

		And("^^call ApplyProductPromotionService \"([^\"]*)\" for and get quote$", (String Promotion) -> {
			System.out.println("\nApplyProductPromotionService\n");

			try {

				String dueDate;
				String quoteNumber = getGeneratedQuoteNumber();
				System.out.println("quoteNumber=" + quoteNumber);
				if (ExcelData.getData(CommonStepDefs.Tc_Name, Promotion).contains("VoIP")) {
					dueDate = SiebelDateFormat.getCETtime();

				} else {
					dueDate = SiebelDateFormat.getCurentCETtime();
				}
				QueryApplyProductPromotion queryApplyProductPromotion = new QueryApplyProductPromotion(dataStorage);
				Quote quote = queryApplyProductPromotion.applyProductPromotion(dataStorage.getAccountDetails(),
						quoteNumber, dueDate, dataStorage.getPrimaryOrganizationId(), dataStorage.getProductId(),
						dataStorage.getPriceListId());
				Assert.assertNotNull(quote);
				dataStorage.setQuote(quote);
				dataStorage.setQuoteNumber(quote.getQuoteNumber());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

		And("^call QuoteAddItems and get quote", () -> {
			System.out.println("\nQuoteAdditems\n");

			String ProductId = dataStorage.getProductId();
			QuoteAddItem quoteAddItem = new QuoteAddItem(dataStorage);
			Quote quote = quoteAddItem.quoteAddItems(dataStorage.getQuote(), ProductId);

			String quoteId = dataStorage.getActiveQuoteId();
			dataStorage.setQuote(quote);

		});

		And("^call Addproduct to set RelationShipName \"([^\"]*)\" and Package \"([^\"]*)\"",
				(String RelationshipName, String PackageName) -> {
					System.out.println("Inside Add product");
					List<Item> itemList = dataStorage.getListOfData().getProductData().getItem();

					String RelationShipID = null, ProductID = null;
					for (Item item : itemList) {
						List<Relationship> RelationList = item.getRelationship();
						for (Relationship relation : RelationList) {
							try {
								if (relation.getName().equalsIgnoreCase(
										ExcelData.getData(CommonStepDefs.Tc_Name, RelationshipName))) {
									System.out.println("PRINTRELATIONSHIPID:" + relation.getId());
									RelationShipID = relation.getId();
									List<DomainItem> packagename = relation.getDomainItem();
									for (DomainItem speed : packagename) {
										if (speed.getName().equalsIgnoreCase(
												ExcelData.getData(CommonStepDefs.Tc_Name, PackageName))) {
											ProductID = speed.getId();
											System.out.println("PRINTProductID:" + ProductID);
											break;
										}
									}

								}
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}

						String innerItemList = item.getIntegrationId();
						System.out.println("Addproduct IntID:" + innerItemList);
						if (innerItemList.length() > 1) {
							dataStorage.setIntegrationId(innerItemList);
							break;
						}
					}
					String integrationId = dataStorage.getIntegrationId();
					System.out.println("Add item int" + integrationId);
					QueryUpdateConfiguration queryUpdateConfiguration = new QueryUpdateConfiguration(dataStorage);
					Map<String, String> attributes = new HashMap<>();
					boolean ok = queryUpdateConfiguration.AddItem(integrationId, RelationShipID, ProductID);
					// Assert.assertTrue("Update of the commitment duration
					// failed", ok);
				});

		And("^call UpdateConfiguration to set RelationShipName \"([^\"]*)\" and Package \"([^\"]*)\" for testcase \"([^\"]*)\"",
				(String RelationshipName, String PackageName, String testcase) -> {
					System.out.println("Inside UpdateConfiguration");
					if (testcase.equalsIgnoreCase("MDU_Ext_KO_B2B_BB_VoIP_Access_Type_1100")) {
						System.out.println("SKIP STEP");

					} else {
						String RelationShipID = null, ProductID = null, ModifiedProductID = null, integrationId = null;
						ListOfData LOD = dataStorage.getListOfData();
						List<Item> itemList = LOD.getProductData().getItem();
						ListOfQuote listofQuote = dataStorage.getListofQuote();
						for (Item item : itemList) {
							List<Item> ToFetchItem = item.getItem();
							for (Item FetchInt : ToFetchItem) {
								if (FetchInt.getName().equalsIgnoreCase("VoIP-Price Agreement Mini-1612")) {
									integrationId = FetchInt.getIntegrationId();
									System.out.println("Fetched INTID :" + integrationId);
								}
							}

							List<Relationship> RelationList = item.getRelationship();
							for (Relationship relation : RelationList) {
								try {
									if (relation.getName().equalsIgnoreCase(
											ExcelData.getData(CommonStepDefs.Tc_Name, RelationshipName))) {
										System.out.println("PRINT RELATIONSHIP: " + relation.getName());
										System.out.println("PRINTRELATIONSHIPID:" + relation.getId());
										RelationShipID = relation.getId();
										List<DomainItem> packagename = relation.getDomainItem();
										for (DomainItem speed : packagename) {
											if (speed.getName().equalsIgnoreCase("VoIP-Price Agreement Mini-1612")) {
												System.out.println("PRINT Product: " + speed.getName());
												ProductID = speed.getId();
												System.out.println("PRINTProductID:" + ProductID);
											}
											if (speed.getName().equalsIgnoreCase(
													ExcelData.getData(CommonStepDefs.Tc_Name, PackageName))) {
												System.out.println("PRINT Product to be modified: " + speed.getName());
												ModifiedProductID = speed.getId();
												System.out.println("PRINTProductIDtobe modified:" + ModifiedProductID);
											}
										}
									}
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							// String integrationId =
							// dataStorage.getIntegrationId();
							System.out.println("Add item int" + integrationId);
							QueryUpdateConfiguration queryUpdateConfiguration = new QueryUpdateConfiguration(
									dataStorage);
							Map<String, String> attributes = new HashMap<>();
							boolean ok = queryUpdateConfiguration.UpdateItem(integrationId, RelationShipID, ProductID,
									ModifiedProductID);
							Assert.assertTrue("Modified Successfully", ok);
						}
					}
				});

		And("^call ExecuteQuoting to commit the virtual quote in Siebel and get updated quote$", () -> {
			System.out.println("\nQuotingPortService\n");

			QueryQuotingWebService queryQuotingWebService = new QueryQuotingWebService(dataStorage);
			Quote updatedQuote = queryQuotingWebService.commitVirtualQuote(dataStorage.getQuote());
			dataStorage.setQuote(updatedQuote);
			List<QuoteItem> quoteitems = updatedQuote.getListOfQuoteItem().getQuoteItem();
			System.out.println("The number of quoteitems" + quoteitems.size());
			for (QuoteItem quoteitem : quoteitems) {
				String innerItemList = quoteitem.getRootAssetIntegrationId();
				System.out.println("ExecuteQuote" + innerItemList);
				if (innerItemList.length() > 1) {
					dataStorage.setIntegrationId(innerItemList);
					break;
				}
			}

		});

		And("^call BeginConfigurationService using product item name \"([^\"]*)\"$", (String productItemName) -> {
			try {

				System.out.println("\nBeginConfigurationService\n");
				String ActiveQuoteID = dataStorage.getQuote().getId();
				dataStorage.setActiveQuoteId(ActiveQuoteID);
				QueryProductConfigurator queryProductConfigurator = new QueryProductConfigurator(dataStorage);
				ListOfData listOfData = queryProductConfigurator.beginConfiguration(dataStorage.getQuote(),
						ExcelData.getData(CommonStepDefs.Tc_Name, productItemName));

				// Assert.assertNotNull("beginConfiguration returned
				// null",listOfData);
				dataStorage.setListOfData(listOfData);
				String quoteId = dataStorage.getActiveQuoteId();
				// dataStorage.setIntegrationId(dataStorage.getIntegrationId());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		And("^call UpdateConfigurationSetAttribute to set commitment duration to \"([^\"]*)\" months for product item name \"([^\"]*)\"$",
				(String commitmentDuration, String productItemName) -> {
					System.out.println("Vi letar efter " + productItemName);
					List<Item> itemList = dataStorage.getListOfData().getProductData().getItem();
					String integrationId = null;
					try {

						for (Item item : itemList) {
							List<Item> innerItemList = item.getItem();
							for (Item innerItem : innerItemList) {
								if (ExcelData.getData(CommonStepDefs.Tc_Name, productItemName)
										.equals(innerItem.getName())) {
									integrationId = innerItem.getIntegrationId();
								}
							}
						}
						Assert.assertNotNull("integrationId not found", integrationId);

						QueryUpdateConfiguration queryUpdateConfiguration = new QueryUpdateConfiguration(dataStorage);
						Map<String, String> attributes = new HashMap<>();
						attributes.put("CommitmentDuration",
								ExcelData.getData(CommonStepDefs.Tc_Name, commitmentDuration));
						attributes.put("CommitmentUOM", "Months");
						boolean ok = queryUpdateConfiguration.setAttributes(integrationId, attributes);
						Assert.assertTrue("Update of the commitment duration failed", ok);
						// dataStorage.setQty(qty);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
		And("^call UpdateConfiguration set commitment duration to \"([^\"]*)\" months for type \"([^\"]*)\" product item name \"([^\"]*)\"$",
				(String commitmentDuration, String Relation, String productItemName) -> {
					try {

						if (ExcelData.getData(CommonStepDefs.Tc_Name, commitmentDuration).equals("")) {
							System.out.println("This Test case is without commitment");
						} else {
							System.out.println("Vi letar efter " + productItemName);
							List<Item> itemList = dataStorage.getListOfData().getProductData().getItem();
							String integrationId = null;

							for (Item item : itemList) {
								List<Item> innerItemList = item.getItem();
								for (Item innerItem : innerItemList) {
									if (ExcelData.getData(CommonStepDefs.Tc_Name, productItemName)
											.equals(innerItem.getName())) {
										integrationId = innerItem.getIntegrationId();
									}
								}
							}
							Assert.assertNotNull("integrationId not found", integrationId);

							QueryUpdateConfiguration queryUpdateConfiguration = new QueryUpdateConfiguration(
									dataStorage);
							Map<String, String> attributes = new HashMap<>();
							attributes.put("CommitmentDuration",
									ExcelData.getData(CommonStepDefs.Tc_Name, commitmentDuration));
							attributes.put("CommitmentUOM", "Months");
							boolean ok = queryUpdateConfiguration.setAttributes(integrationId, attributes);
							Assert.assertTrue("Update of the commitment duration failed", ok);

						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});

		And("^call EndConfigurationService and get Quote$", () -> {
			System.out.println("\nEndConfigurationService\n");
			System.out.println("dataStorage.getIntegrationId()=" + dataStorage.getIntegrationId() + "\n");
			QueryEndConfiguration queryEndConfiguration = new QueryEndConfiguration(dataStorage);
			Quote quote = queryEndConfiguration.endConfiguration();
			Assert.assertNotNull("quote from endConfiguration is null", quote);
			List<QuoteItem> quoteItemList = getFlattenedQuoteItems(quote);
			System.out.println("Length of quoteItemList=" + quoteItemList.size() + "\n");
			String commitmentDuration = null;
			outerloop: for (QuoteItem quoteItem : quoteItemList) {
				if (dataStorage.getIntegrationId().equals(quoteItem.getId())) {
					System.out.println("found integration id in quoteitem, looking for quoteItemXA \n");
					for (QuoteItemXA quoteItemXA : quoteItem.getListOfQuoteItemXA().getQuoteItemXA()) {
						if (quoteItemXA.getAttribute().equals("CommitmentDuration")) {
							commitmentDuration = quoteItemXA.getValue();
							System.out.println(
									"in response commitmentDuration was found to be " + commitmentDuration + "\n");
							break outerloop;
						}
					}
				}
			}
			// Assert.assertNotNull("commitmentDuration is null after end
			// configuration",commitmentDuration);
			// Assert.assertEquals("commitmentDuration is wrong value after end
			// configuration",commitmentDuration,
			// dataStorage.getCommitmentDuration());
			dataStorage.setQuote(quote);
		});

		And("^call SynchronizeQuote to populate the AccessCode \"([^\"]*)\" on the quote line items for a SDU order$",
				(String accessType) -> {
					System.out.println("\nSynchronizeQuote for BroadBand\n");
					Quote quote = dataStorage.getQuote();
					// String dueDate =
					// SiebelDateFormat.siebelDateFormat(SiebelDateFormat.getCurentCETtime()).trim();
					String dueDate;
					try {
						dueDate = SiebelDateFormat.siebelDateFormat(SiebelDateFormat.converteddate()).trim();

						String dueDateHardware = SiebelDateFormat.siebelDateFormat(new Date());

						List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
						quoteItemList.stream()
								.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
								.forEach(quoteItem -> {
									quoteItem.setTSC2BDueDate(dueDate);
									quoteItem.setRequestedDeliveryDate(dueDate);
									if (quoteItem.getLineNumber().equals("2")
											|| quoteItem.getLineNumber().equals("3")) {
										try {
											quoteItem.setTSAccessTypeId(
													ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
										} catch (Exception e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}

								});
						quoteItemList.stream()
								.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
								.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
									quoteItem.setTSColtDeliveryFromDate(dueDateHardware);
									System.out.println("Setting TSColtDeliveryFromDate to " + dueDateHardware);
								});

						QueryQuote queryQuote = new QueryQuote(dataStorage);
						boolean result = queryQuote.updateQuote(quote);
						Assert.assertTrue("No id from synchronizeQuoteOutput", result);
						System.out.println("synchronizeQuoteOutput OK");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});

		And("^call xDSLSynchronizeQuote to populate the AccessCode \"([^\"]*)\" and ConnRef number \"([^\"]*)\" on the quote line items for a xDSL order$",
				(String accessType, String fbNumber) -> {
					System.out.println("\nSynchronizeQuote for BroadBand\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.siebelDateFormat(SiebelDateFormat.getTomorrowsDate());
					String dueDateHardware = SiebelDateFormat.siebelDateFormat(new Date());
					String BBDueDate = SiebelDateFormat.BBDueDate();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")
										|| quoteItem.getLineNumber().equals("10")) {
									try {
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
										quoteItem.setConnectivityReferenceNumber(
												ExcelData.getData(CommonStepDefs.Tc_Name, fbNumber));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}

								}
								if (quoteItem.getLineNumber().equals("5") || quoteItem.getLineNumber().equals("3")) {
									quoteItem.setRequestedDeliveryDate(BBDueDate);
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
								quoteItem.setTSColtDeliveryFromDate(dueDateHardware);
								System.out.println("Setting TSColtDeliveryFromDate to " + dueDateHardware);
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call xDSL DataPrep SynchronizeQuote to populate the AccessCode \"([^\"]*)\" PSTN \"([^\"]*)\" and ConnRef number \"([^\"]*)\" on the quote line items for a xDSL order$",
				(String AccessCode, String PSTN, String FbNumber) -> {
					System.out.println("\nSynchronizeQuote for BroadBand\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.siebelDateFormat(SiebelDateFormat.getTomorrowsDate());
					String dueDateHardware = SiebelDateFormat.siebelDateFormat(new Date());
					String BBDueDate = SiebelDateFormat.BBDueDate();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")
										|| quoteItem.getLineNumber().equals("7")
										|| quoteItem.getLineNumber().equals("9")) {
									try {
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, AccessCode));
										quoteItem.setConnectivityReferenceNumber(
												ExcelData.getData(CommonStepDefs.Tc_Name, FbNumber));
										quoteItem.setTSPSTNNumber(ExcelData.getData(CommonStepDefs.Tc_Name, PSTN));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}

								}
								if (quoteItem.getLineNumber().equals("3") || quoteItem.getLineNumber().equals("5")) {
									quoteItem.setRequestedDeliveryDate(BBDueDate);

								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
								quoteItem.setTSColtDeliveryFromDate(dueDateHardware);
								System.out.println("Setting TSColtDeliveryFromDate to " + dueDateHardware);
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call SynchronizeQuote to populate the deliveryContract \"([^\"]*)\" on the quote line items for a MDU order$",
				(String Agreement) -> {
					System.out.println("\nSynchronizeQuote for BroadBand\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.siebelDateFormat(SiebelDateFormat.getTomorrowsDate());
					String dueDateHardware = SiebelDateFormat.siebelDateFormat(new Date());

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getLineNumber().equals("2")) {
									// quoteItem.setTSDeliveryContractId(Agreement);
									try {
										quoteItem.setTSMDUDeliveryContractNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, Agreement));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									quoteItem.setTSAccessTypeId("300");
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
								quoteItem.setTSColtDeliveryFromDate(dueDateHardware);
								System.out.println("Setting TSColtDeliveryFromDate to " + dueDateHardware);
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call KO BB SynchronizeQuote to populate the AccessCode \"([^\"]*)\" FBNumber \"([^\"]*)\" and KO agreement \"([^\"]*)\" row \"([^\"]*)\" revision \"([^\"]*)\" the quote line items for a ExtKO order$",
				(String accessType, String FBNumber, String agreement, String rowID, String revisionNum) -> {
					System.out.println("\nSynchronizeQuote for BroadBand\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCurentCETtime();
					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")) {
									try {
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
										quoteItem.setConnectivityReferenceNumber(
												ExcelData.getData(CommonStepDefs.Tc_Name, FBNumber));
										quoteItem.setTSDeliveryContractId(
												ExcelData.getData(CommonStepDefs.Tc_Name, rowID));
										quoteItem.setTSMDUDeliveryContractNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, agreement));
										quoteItem.setTSMDUDeliveryContractRevNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, revisionNum));

									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call KO BBVOIP SynchronizeQuote to populate the AccessCode \"([^\"]*)\" FBNumber \"([^\"]*)\" and KO agreement \"([^\"]*)\" row \"([^\"]*)\" revision \"([^\"]*)\" the quote line items for a ExtKO order$",
				(String accessType, String FBNumber, String agreement, String rowID, String revisionNum) -> {
					System.out.println("\nSynchronizeQuote for BroadBandVOIP\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")
										|| quoteItem.getLineNumber().equals("5")
										|| quoteItem.getLineNumber().equals("7")) {
									try {
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
										quoteItem.setConnectivityReferenceNumber(
												ExcelData.getData(CommonStepDefs.Tc_Name, FBNumber));
										quoteItem.setTSDeliveryContractId(
												ExcelData.getData(CommonStepDefs.Tc_Name, rowID));
										quoteItem.setTSMDUDeliveryContractNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, agreement));
										quoteItem.setTSMDUDeliveryContractRevNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, revisionNum));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}

								}
								if (quoteItem.getName().equals("VoIP SE Service bundle_1606")
										|| quoteItem.getName().equals("VoIP SE_B2B Service bundle_1649")) {
									quoteItem.setTSVoIPDeviceType("ATA");
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call KO BBIPTV SynchronizeQuote to populate the AccessCode \"([^\"]*)\" FBNumber \"([^\"]*)\" and KO agreement \"([^\"]*)\" row \"([^\"]*)\" revision \"([^\"]*)\" the quote line items for a ExtKO order$",
				(String accessType, String FBNumber, String agreement, String rowID, String revisionNum) -> {
					System.out.println("\nSynchronizeQuote for BroadBand\n");
					System.out.println("\nSynchronizeQuote for BroadBandIPTVMDU\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();
					String dueDateHardware = SiebelDateFormat.siebelDateFormat(new Date());

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")
										|| quoteItem.getLineNumber().equals("7")
										|| quoteItem.getLineNumber().equals("8")
										|| quoteItem.getLineNumber().equals("9")) {
									try {
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
										quoteItem.setConnectivityReferenceNumber(
												ExcelData.getData(CommonStepDefs.Tc_Name, FBNumber));
										quoteItem.setTSDeliveryContractId(
												ExcelData.getData(CommonStepDefs.Tc_Name, rowID));
										quoteItem.setTSMDUDeliveryContractNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, agreement));
										quoteItem.setTSMDUDeliveryContractRevNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, revisionNum));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
								quoteItem.setTSColtDeliveryFromDate(dueDateHardware);
								System.out.println("Setting TSColtDeliveryFromDate to " + dueDateHardware);
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call KO BBVOIPIPTV SynchronizeQuote to populate the AccessCode \"([^\"]*)\" FBNumber \"([^\"]*)\" and KO agreement \"([^\"]*)\" row \"([^\"]*)\" revision \"([^\"]*)\" the quote line items for a ExtKO order$",
				(String accessType, String FBNumber, String agreement, String rowID, String revisionNum) -> {
					System.out.println("\nSynchronizeQuote for BroadBand\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();
					String BBDueDate = SiebelDateFormat.BBDueDate();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);

								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")
										|| quoteItem.getLineNumber().equals("5")
										|| quoteItem.getLineNumber().equals("7")
										|| quoteItem.getLineNumber().equals("8")
										|| quoteItem.getLineNumber().equals("9")
										|| quoteItem.getLineNumber().equals("11")) {
									try {

										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
										quoteItem.setConnectivityReferenceNumber(
												ExcelData.getData(CommonStepDefs.Tc_Name, FBNumber));
										quoteItem.setTSDeliveryContractId(
												ExcelData.getData(CommonStepDefs.Tc_Name, rowID));
										quoteItem.setTSMDUDeliveryContractNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, agreement));
										quoteItem.setTSMDUDeliveryContractRevNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, revisionNum));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								if (quoteItem.getName().equals("VoIP SE Service bundle_1606")
										|| quoteItem.getName().equals("VoIP SE_B2B Service bundle_1649")) {
									quoteItem.setTSVoIPDeviceType("ATA");
								}

							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});
		And("^call KO VOIP SynchronizeQuote to populate the AccessCode \"([^\"]*)\" FBNumber \"([^\"]*)\" and KO agreement \"([^\"]*)\" row \"([^\"]*)\" revision \"([^\"]*)\" the quote line items for a ExtKO order$",
				(String accessType, String FBNumber, String agreement, String rowID, String revisionNum) -> {
					System.out.println("\nSynchronizeQuote for BroadBand\n");
					System.out.println("\nSynchronizeQuote for VOIP\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getLineNumber().equals("2")) {
									try {
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
										quoteItem.setConnectivityReferenceNumber(
												ExcelData.getData(CommonStepDefs.Tc_Name, FBNumber));
										quoteItem.setTSDeliveryContractId(
												ExcelData.getData(CommonStepDefs.Tc_Name, rowID));
										quoteItem.setTSMDUDeliveryContractNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, agreement));
										quoteItem.setTSMDUDeliveryContractRevNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, revisionNum));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}

								}
								if (quoteItem.getName().equals("VoIP SE Service bundle_1606")
										|| quoteItem.getName().equals("VoIP SE_B2B Service bundle_1649")) {
									quoteItem.setTSVoIPDeviceType("ATA");
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});
		And("^call xDSL BB SynchronizeQuote to populate the AccessCode \"([^\"]*)\" and ConnRef number \"([^\"]*)\" and PSTN \"([^\"]*)\" on the quote line items for a xDSL order$",
				(String accessType, String fbNumber, String PSTN) -> {
					System.out.println("\nSynchronizeQuote for BroadBand\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();
					String BBDueDate = SiebelDateFormat.BBDueDate();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);

								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("5")) {
									try {
										quoteItem.setTSPSTNNumber(ExcelData.getData(CommonStepDefs.Tc_Name, PSTN));
										quoteItem.setRequestedDeliveryDate(BBDueDate);
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
										quoteItem.setConnectivityReferenceNumber(
												ExcelData.getData(CommonStepDefs.Tc_Name, fbNumber));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}

								}
								if (quoteItem.getLineNumber().equals("3")) {
									quoteItem.setRequestedDeliveryDate(BBDueDate);

								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call xDSL BBVOIP SynchronizeQuote to populate the AccessCode \"([^\"]*)\" and ConnRef number \"([^\"]*)\" and PSTN \"([^\"]*)\" on the quote line items for Customer Type \"([^\"]*)\" a xDSL order$",
				(String accessType, String fbNumber, String PSTN, String CustomerType) -> {
					System.out.println("\nSynchronizeQuote for BroadBand VOIP\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();
					String BBDueDate = SiebelDateFormat.BBDueDate();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								try {
									if (quoteItem.getLineNumber().equals("2")
											|| quoteItem.getLineNumber().equals("5")) {
										quoteItem.setTSPSTNNumber(ExcelData.getData(CommonStepDefs.Tc_Name, PSTN));
										// quoteItem.setRequestedDeliveryDate(BBDueDate);
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
										quoteItem.setConnectivityReferenceNumber(
												ExcelData.getData(CommonStepDefs.Tc_Name, fbNumber));
									}

									if (ExcelData.getData(CommonStepDefs.Tc_Name, CustomerType).equals("B2B")) {
										if (quoteItem.getLineNumber().equals("5")
												|| quoteItem.getName().equals("Bredbandsaccesser")) {
											quoteItem.setRequestedDeliveryDate(BBDueDate);
										}
									}
									if (ExcelData.getData(CommonStepDefs.Tc_Name, CustomerType).equals("B2C")) {
										if (quoteItem.getLineNumber().equals("3")
												|| quoteItem.getName().equals("Service Bundle-IA-1703-1")) {
											quoteItem.setRequestedDeliveryDate(BBDueDate);
										}
									}
									if (quoteItem.getName().equals("VoIP SE Service bundle_1606")
											|| quoteItem.getName().equals("VoIP SE_B2B Service bundle_1649")) {
										quoteItem.setTSVoIPDeviceType("RGW");
									}
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});
		And("^call xDSL BBIPTV SynchronizeQuote to populate the AccessCode \"([^\"]*)\" and ConnRef number \"([^\"]*)\" and PSTN \"([^\"]*)\" on the quote line items for Customer Type \"([^\"]*)\" a xDSL order$",
				(String accessType, String fbNumber, String PSTN, String CustomerType) -> {
					System.out.println("\nSynchronizeQuote for BroadBand IPTV\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();
					String BBDueDate = SiebelDateFormat.BBDueDate();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								try {

									if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")
											|| quoteItem.getLineNumber().equals("7")
											|| quoteItem.getLineNumber().equals("8")
											|| quoteItem.getLineNumber().equals("9")) {
										quoteItem.setTSPSTNNumber(ExcelData.getData(CommonStepDefs.Tc_Name, PSTN));
										// quoteItem.setRequestedDeliveryDate(BBDueDate);
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
										quoteItem.setConnectivityReferenceNumber(
												ExcelData.getData(CommonStepDefs.Tc_Name, fbNumber));
									}

									if (ExcelData.getData(CommonStepDefs.Tc_Name, CustomerType).equals("B2B")) {
										if (quoteItem.getLineNumber().equals("5")
												|| quoteItem.getName().equals("Bredbandsaccesser")) {
											quoteItem.setRequestedDeliveryDate(BBDueDate);
										}
									}
									if (ExcelData.getData(CommonStepDefs.Tc_Name, CustomerType).equals("B2C")) {
										if (quoteItem.getLineNumber().equals("3")
												|| quoteItem.getName().equals("Service Bundle-IA-1703-1")) {
											quoteItem.setRequestedDeliveryDate(BBDueDate);
										}
									}
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call xDSL BBVOIPIPTV SynchronizeQuote to populate the AccessCode \"([^\"]*)\" and ConnRef number \"([^\"]*)\" and PSTN \"([^\"]*)\" on the quote line items for Customer Type \"([^\"]*)\" a xDSL order$",
				(String accessType, String fbNumber, String PSTN, String CustomerType) -> {
					System.out.println("\nSynchronizeQuote for BroadBand IPTV VOIP\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();
					String BBDueDate = SiebelDateFormat.BBDueDate();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								try {

									if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")
											|| quoteItem.getLineNumber().equals("5")
											|| quoteItem.getLineNumber().equals("7")
											|| quoteItem.getLineNumber().equals("8")
											|| quoteItem.getLineNumber().equals("9")
											|| quoteItem.getLineNumber().equals("11")) {
										quoteItem.setTSPSTNNumber(ExcelData.getData(CommonStepDefs.Tc_Name, PSTN));
										// quoteItem.setRequestedDeliveryDate(BBDueDate);
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
										quoteItem.setConnectivityReferenceNumber(
												ExcelData.getData(CommonStepDefs.Tc_Name, fbNumber));
									}

									if (ExcelData.getData(CommonStepDefs.Tc_Name, CustomerType).equals("B2B")) {
										if (quoteItem.getLineNumber().equals("5")
												|| quoteItem.getName().equals("Bredbandsaccesser")) {
											quoteItem.setRequestedDeliveryDate(BBDueDate);
										}
									}
									if (ExcelData.getData(CommonStepDefs.Tc_Name, CustomerType).equals("B2C")) {
										if (quoteItem.getLineNumber().equals("3")
												|| quoteItem.getName().equals("Service Bundle-IA-1703-1")) {
											quoteItem.setRequestedDeliveryDate(BBDueDate);
										}
									}
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call BB SynchronizeQuote to populate the deliveryContract \"([^\"]*)\" Revision \"([^\"]*)\" RowID \"([^\"]*)\" and AccessCode \"([^\"]*)\" on the quote line items for a MDU order$",
				(String Agreement, String RevisionNumber, String RowID, String AccessCode) -> {
					System.out.println("\nSynchronizeQuote for BroadBandMDU\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();
					String dueDateHardware = SiebelDateFormat.siebelDateFormat(new Date());

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")) {
									try {
										quoteItem.setTSDeliveryContractId(
												ExcelData.getData(CommonStepDefs.Tc_Name, RowID));
										quoteItem.setTSMDUDeliveryContractNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, Agreement));
										quoteItem.setTSMDUDeliveryContractRevNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, RevisionNumber));
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, AccessCode));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
								quoteItem.setTSColtDeliveryFromDate(dueDateHardware);
								System.out.println("Setting TSColtDeliveryFromDate to " + dueDateHardware);
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});

		And("^call BBVOIP SynchronizeQuote to populate the deliveryContract \"([^\"]*)\" Revision \"([^\"]*)\" RowID \"([^\"]*)\" and AccessCode \"([^\"]*)\" on the quote line items for a MDU order$",
				(String Agreement, String RevisionNumber, String RowID, String AccessCode) -> {
					System.out.println("\nSynchronizeQuote for BroadBandVOIP\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getLineNumber().equals("2") || quoteItem.getLineNumber().equals("3")
										|| quoteItem.getLineNumber().equals("5")
										|| quoteItem.getLineNumber().equals("7")) {
									try {
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, AccessCode));
										quoteItem.setTSDeliveryContractId(
												ExcelData.getData(CommonStepDefs.Tc_Name, RowID));
										quoteItem.setTSMDUDeliveryContractNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, Agreement));
										quoteItem.setTSMDUDeliveryContractRevNum(
												ExcelData.getData(CommonStepDefs.Tc_Name, RevisionNumber));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}

								}
								if (quoteItem.getName().equals("VoIP SE Service bundle_1606")
										|| quoteItem.getName().equals("VoIP SE_B2B Service bundle_1649")) {
									quoteItem.setTSVoIPDeviceType("RGW");
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});
		And("^call SDU VOIP SynchronizeQuote to populate the AccessCode \"([^\"]*)\" on the quote line items for a SDU order$",
				(String accessType) -> {
					System.out.println("\nSynchronizeQuote for VOIP\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								if (quoteItem.getName().equals("VoIP SE Service bundle_1606")
										|| quoteItem.getName().equals("VoIP SE_B2B Service bundle_1649")) {
									quoteItem.setTSVoIPDeviceType("RGW");
									try {
										quoteItem.setTSAccessTypeId(
												ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});
		
		And("^call HT xDSLSynchronizeQuote to populate the CustomerNote \"([^\"]*)\" on the quote line items for a HT order$",
				(String accessType) -> {
					System.out.println("\nSynchronizeQuote for BroadBand\n");
					Quote quote = dataStorage.getQuote();
					String dueDate = SiebelDateFormat.getCETtime();

					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								quoteItem.setTSC2BDueDate(dueDate);
								quoteItem.setRequestedDeliveryDate(dueDate);
								try {
									if (quoteItem.getName().equals(ExcelData.getData(CommonStepDefs.Tc_Name, "RelationBroadband"))) {
										quoteItem.setTSNote(ExcelData.getData(CommonStepDefs.Tc_Name, accessType));
									}
								}catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}

							});
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.filter(quoteItem -> "Y".equals(quoteItem.getProductShipFlag())).forEach(quoteItem -> {
							});

					QueryQuote queryQuote = new QueryQuote(dataStorage);
					boolean result = queryQuote.updateQuote(quote);
					Assert.assertTrue("No id from synchronizeQuoteOutput", result);
					System.out.println("synchronizeQuoteOutput OK");
				});


	}
}
