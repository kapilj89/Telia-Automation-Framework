package se.telia.siebel.stepdefs;

import com.siebel.ordermanagement.quote.data.ListOfQuoteItem;
import com.siebel.ordermanagement.quote.data.Quote;
import com.siebel.ordermanagement.quote.data.QuoteItem;
import com.siebel.xml.asset_management_complex_io.data.AssetMgmtAssetHeaderData;
import se.telia.siebel.apiquerys.*;
import coreFramework.ExcelData;

import org.junit.Assert;
import cucumber.api.java8.En;
import se.telia.siebel.apiquerys.*;
import se.telia.siebel.data.AccountDetails;
import se.telia.siebel.data.DataStorage;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import static se.telia.siebel.apiquerys.GenerateQuoteNumber.getGeneratedQuoteNumber;
 

public class DisconnectStepdef implements En {
	DataStorage dataStorage;
	boolean flag;
	int assetcount;
	final Map<String, String> promotions = new HashMap<>();
	final Map<String, Quote> QuoteList = new HashMap<>();


	public DisconnectStepdef(DataStorage dataStorage) {
		System.out.println("Disconnect Constructor");
		this.dataStorage = dataStorage;

		Given("^call QueryMainAsset using SSN \"([^\"]*)\" to get asset details AssetNumber and ServiceAccountId for promotionName \"([^\"]*)\"$",
				(String ssn, String promotionName) -> {
					try {
						verifyingStatusofSSN verifyingStatus = new verifyingStatusofSSN();
						verifyingStatus.verifySSNStatus(ExcelData.getData(CommonStepDefs.Tc_Name, ssn));

						QueryAsset queryAsset = new QueryAsset(dataStorage);
						String[] promotionNameParam = ExcelData.getData(CommonStepDefs.Tc_Name, promotionName)
								.split(";");
						System.out.println("No of Promotions:" + promotionNameParam.length);
						int j = promotionNameParam.length;
						for (int i = 0; i < promotionNameParam.length; i++) {
							System.out.println(promotionNameParam[i]);
							AssetMgmtAssetHeaderData assetMgmtAssetHeaderData = queryAsset.getAssetMgmtAssetHeaderData(
									ExcelData.getData(CommonStepDefs.Tc_Name, ssn), promotionNameParam[i]);
							System.out.println("Asset MgmtAssetHeaderData" + assetMgmtAssetHeaderData);
							if (assetMgmtAssetHeaderData == null) {
								System.out.println("Promotion is not available: " + promotionNameParam[i]);
								flag = false;
								assetcount = j - 1;
								j--;
							} else {
								String assetNumber = assetMgmtAssetHeaderData.getAssetNumber();
								String serviceAccountId = assetMgmtAssetHeaderData.getServiceAccountId();
								String ProductId = assetMgmtAssetHeaderData.getProductId();
								System.out.println("AssetNumber" + i + ":" + assetNumber);
								promotions.put("AssetNumber" + i, assetNumber);
								System.out.println("serviceAccountId=" + serviceAccountId);
								dataStorage.setServiceAccountId(serviceAccountId);
							}
							System.out.println(assetcount);
						}

						if (assetcount == 0) {
							Assert.assertTrue(
									"No Assets Found :) in SSN NO: " + ExcelData.getData(CommonStepDefs.Tc_Name, ssn),
									flag);
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				});

		When("^call DisconnectAssetToQuote$", () -> {
			System.out.println("DisconnectAssetToQuote");
			String quoteNumber = getGeneratedQuoteNumber();
			System.out.println("quoteNumber=" + quoteNumber);
			System.out.println("Number of promo:" + promotions.size());
			List<String> Assetno = new ArrayList(promotions.values());
			for (int i = 0; i < promotions.size(); i++) {
				String Promo = promotions.get("AssetNumber" + i);
				System.out.println("Promo" + promotions.values());
				QueryDisconnectAssetToQuote queryDisconnectAssetToQuote = new QueryDisconnectAssetToQuote(dataStorage);
				queryDisconnectAssetToQuote.DisconnectAsset(quoteNumber, Assetno.get(i));

			}
		});

		When("^call SynchronizeQuote for a Disconnect order$", () -> {
			Quote quote = dataStorage.getQuote();
			ListOfQuoteItem listOfQuoteItem = quote.getListOfQuoteItem();
			List<QuoteItem> quoteItemList = listOfQuoteItem.getQuoteItem();
			quoteItemList.stream()
					.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
					.forEach(quoteItem -> {
					});
			QueryQuote queryQuote = new QueryQuote(dataStorage);
			queryQuote.updateQuote(quote);
		});

		Given("^SSN for bulk disconnect verify and disconnect exsiting asset$", () -> {
			try {
				/* - promotions required for disconnect - */
				String promotion = "P-IA-Fiber-Broadband-1743;P-IA-xDSL-Broadband-1711;P-BIA-xDSL-BB Start-1827;P-BIA-OF-BB Start-1827;P-TV-IPTV-PlayPlus-1711;VoIP SE_Promo_Offer_1743;P-VAS-Spotify-1711";
				List data = ExcelData.getExcelData();
				System.out.println("\nTotal No.of SSN for disconnect: "+data.size());
				
				for (int d = 0; d < data.size(); d++) {
					int row =d+2;
					System.out.println("EXECUTING ROW "+ row);
					final Map<String, String> promotionlist = new HashMap<>();

					String SSN = data.get(d).toString();
					verifyingStatusofSSN verifyingStatus = new verifyingStatusofSSN();
					boolean dbcheck = verifyingStatus.verifySSNStatus(SSN);
					if(!dbcheck){
						System.out.println("Pre-check failed!! SSN "+SSN+" is not vaild for disconnect.");

					}else{
					System.out.println("Pre check of SSN "+SSN+" done.");
					QueryAsset queryAsset = new QueryAsset(dataStorage);
					String[] promotionNameParam = promotion.split(";");
					System.out.println("No of Promotions:" + promotionNameParam.length);
					int j = promotionNameParam.length;
					for (int i = 0; i < promotionNameParam.length; i++) {
						System.out.println(promotionNameParam[i]);
						AssetMgmtAssetHeaderData assetMgmtAssetHeaderData = queryAsset.getAssetMgmtAssetHeaderData(SSN,
								promotionNameParam[i]);
						System.out.println("Asset MgmtAssetHeaderData" + assetMgmtAssetHeaderData);
						if (assetMgmtAssetHeaderData == null) {
							System.out.println("Promotion is not available: " + promotionNameParam[i]);
							flag = false;
							assetcount = j - 1;
							j--;
						} else {
							String assetNumber = assetMgmtAssetHeaderData.getAssetNumber();
							String serviceAccountId = assetMgmtAssetHeaderData.getServiceAccountId();
							String ProductId = assetMgmtAssetHeaderData.getProductId();
							System.out.println("AssetNumber" + i + ":" + assetNumber);
							promotionlist.put("AssetNumber" + i, assetNumber);
							System.out.println("serviceAccountId=" + serviceAccountId);
							dataStorage.setServiceAccountId(serviceAccountId);
						}
						System.out.println(assetcount);
					}
					if (assetcount == 0) {
						System.out.println("No Assets Found in SSN: " + SSN);
						ExcelData.setData(SSN, "OrderNo", "Asset not found");
					} else {
						System.out.println("SSN "+ SSN+" is ready to disconnect.");
//						disconnectAssetToQuote();
//						QueryQuote_and_synchronize();
//						QuoteCheckOut_and_SumbitOrder(SSN);
						if(!disconnectAssetToQuote(promotionlist)){
							ExcelData.setData(SSN, "OrderNo", "Error in disconnectAssetToQuote");
							} else if (!QueryQuote_and_synchronize()) {
								ExcelData.setData(SSN, "OrderNo", "Error in Query/SyncQuote");
							} else if (!QuoteCheckOut_and_SumbitOrder(SSN)) {
								ExcelData.setData(SSN, "OrderNo", "Error in Query/SyncQuote");
							}
					}
				}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		});

	}

	public boolean disconnectAssetToQuote(Map<String, String> promotionlist) {
		try {

			System.out.println("DisconnectAssetToQuote");
			String quoteNumber = getGeneratedQuoteNumber();
			System.out.println("quoteNumber=" + quoteNumber);
			System.out.println("Number of promo:" + promotionlist.size());
			List<String> Assetno = new ArrayList(promotionlist.values());
			for (int i = 0; i < promotionlist.size(); i++) {
				String Promo = promotionlist.get("AssetNumber" + i);
				System.out.println("Promo" + promotionlist.values());
				QueryDisconnectAssetToQuote queryDisconnectAssetToQuote = new QueryDisconnectAssetToQuote(dataStorage);
				queryDisconnectAssetToQuote.DisconnectAsset(quoteNumber, Assetno.get(i));
			
			/**	System.out.println("QueryQuote");
				QueryQuote queryQuote = new QueryQuote(dataStorage);
				List<Quote> quoteList = queryQuote.getQuoteById();
				System.out.println("quote.size()= " + quoteList.size());
				Assert.assertTrue("Wrong number of quotes in the list: " + quoteList.size(), quoteList.size() == 1);
				dataStorage.setQuote(quoteList.get(0));
				System.out.println("The quote is now in the dataStorage. id=" + quoteList.get(0).getId());

				System.out.println("SynchronizeQuote");
				Quote quote = dataStorage.getQuote();
				ListOfQuoteItem listOfQuoteItem = quote.getListOfQuoteItem();
				List<QuoteItem> quoteItemList = listOfQuoteItem.getQuoteItem();
				quoteItemList.stream()
						.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
						.forEach(quoteItem -> {
						});
				QueryQuote queryQuoteorder = new QueryQuote(dataStorage);
				queryQuoteorder.updateQuote(quote);
			}
			
			System.out.println("\nQuoteCheckOutService\n");
			QueryQuoteCheckout queryQuoteCheckout = new QueryQuoteCheckout(dataStorage);
			String activeOrderId = queryQuoteCheckout.quoteCheckout(dataStorage.getQuote().getId());
			Assert.assertNotNull("Order id is null after quoteCheckout", activeOrderId);
			dataStorage.setActiveOrderId(activeOrderId);
			System.out.println("activeOrderId=" + activeOrderId);

			System.out.println("\nSubmitOrder\n");
			QueryTSChannelSISOMBillingSubmitOrder queryTSChannelSISOMBillingSubmitOrder = new QueryTSChannelSISOMBillingSubmitOrder(
					dataStorage);
			String objectSpcId = queryTSChannelSISOMBillingSubmitOrder.submitOrder(dataStorage.getActiveOrderId(),SSN);
			if(objectSpcId==null){
				return false;
			}else{
				QueryCustomer queryCustomer = new QueryCustomer(dataStorage);
				queryCustomer.getGetAccountDetailsString(SSN);
				String pointID = dataStorage.getServiceAddressId();
				ExcelData.setData(SSN, "PointID", pointID);
			}**/
			}
			return true;
		} catch (Exception e) {
			System.out.println("Error in disconnect asset to quote method");

			return false;
		}
	}

	public boolean QueryQuote_and_synchronize() {
		try {
			System.out.println("QueryQuote");

			QueryQuote queryQuote = new QueryQuote(dataStorage);
			List<Quote> quoteList = queryQuote.getQuoteById();
			System.out.println("quote.size()= " + quoteList.size());
			Assert.assertTrue("Wrong number of quotes in the list: " + quoteList.size(), quoteList.size() == 1);
			dataStorage.setQuote(quoteList.get(0));
			System.out.println("The quote is now in the dataStorage. id=" + quoteList.get(0).getId());

			System.out.println("SynchronizeQuote");
			Quote quote = dataStorage.getQuote();
			ListOfQuoteItem listOfQuoteItem = quote.getListOfQuoteItem();
			List<QuoteItem> quoteItemList = listOfQuoteItem.getQuoteItem();
			quoteItemList.stream()
					.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
					.forEach(quoteItem -> {
					});
			QueryQuote queryQuoteorder = new QueryQuote(dataStorage);
			queryQuoteorder.updateQuote(quote);
			return true;
		} catch (Exception e) {
			System.out.println("Error in queryQuote | syncQuote");
			return false;
		}
	}

	public boolean QuoteCheckOut_and_SumbitOrder(String SSN) {
		try {
			System.out.println("\nQuoteCheckOutService\n");
			QueryQuoteCheckout queryQuoteCheckout = new QueryQuoteCheckout(dataStorage);
			String activeOrderId = queryQuoteCheckout.quoteCheckout(dataStorage.getQuote().getId());
			Assert.assertNotNull("Order id is null after quoteCheckout", activeOrderId);
			dataStorage.setActiveOrderId(activeOrderId);
			System.out.println("activeOrderId=" + activeOrderId);

			System.out.println("\nSubmitOrder\n");
			QueryTSChannelSISOMBillingSubmitOrder queryTSChannelSISOMBillingSubmitOrder = new QueryTSChannelSISOMBillingSubmitOrder(
					dataStorage);
			String objectSpcId = queryTSChannelSISOMBillingSubmitOrder.submitOrder(dataStorage.getActiveOrderId(),SSN);
			if(objectSpcId==null){
				return false;
			}else{
				System.out.println("***FETCHING POINTID***");
				QueryCustomer queryCustomer = new QueryCustomer(dataStorage);
				queryCustomer.getGetAccountDetailsString(SSN);
				String pointID = dataStorage.getServiceAddressId();
				ExcelData.setData(SSN, "PointID", pointID);
			}

			return true;

		} catch (Exception e) {
			System.out.println("Error in quotecheckout | SubmitOrder");
			return false;
		}
	}

}