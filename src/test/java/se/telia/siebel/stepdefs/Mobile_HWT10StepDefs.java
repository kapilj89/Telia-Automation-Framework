package se.telia.siebel.stepdefs;

import java.util.List;

import org.junit.Assert;

import com.siebel.ordermanagement.order.data.Order;
import com.siebel.ordermanagement.quote.data.Quote;
import com.siebel.ordermanagement.quote.data.QuoteItem;

import coreFramework.ExcelData;
import cucumber.api.java8.En;
import se.telia.siebel.apiquerys.QueryCustomer;
import se.telia.siebel.apiquerys.QueryOrder;
import se.telia.siebel.apiquerys.QueryQuote;
import se.telia.siebel.apiquerys.QuerySWICancelSpcSalesSpcOrder;
import se.telia.siebel.apiquerys.SiebelFlattenDataStructures;
import se.telia.siebel.apiquerys.verifyingStatusofSSN;
import se.telia.siebel.data.AccountDetails;
import se.telia.siebel.data.DataStorage;

public class Mobile_HWT10StepDefs implements En {
	DataStorage dataStorage;

	public Mobile_HWT10StepDefs(DataStorage datastorage) {

		this.dataStorage = datastorage;
		
		And("^call SynchronizeQuote for a \"([^\"]*)\" Mobile Hardware \"([^\"]*)\" to add shipping method \"([^\"]*)\" and SSID \"([^\"]*)\"$",
				(String serviceBundle, String hardwareProduct, String shippingMethod, String SSID) -> {
					Quote quote = dataStorage.getQuote();
					try{
					System.out.println("\nSynchronizeQuote\n");
					
//					quote.setTSSSID(ExcelData.getData(CommonStepDefs.Tc_Name,SSID));
					quote.setCarrierPriority(ExcelData.getData(CommonStepDefs.Tc_Name,shippingMethod));
					}catch (Exception e){
						e.printStackTrace();
					}
				
					List<QuoteItem> quoteItemList = SiebelFlattenDataStructures.getFlattenedQuoteItems(quote);
					quoteItemList.stream()
							.filter(quoteItem -> !"Penalty PS".equalsIgnoreCase(quoteItem.getFulfillmentItemCode()))
							.forEach(quoteItem -> {
								try {
//								if (quoteItem.getTSProductType().contains("HW")
//										|| quoteItem.getName().equals(ExcelData.getData(CommonStepDefs.Tc_Name, hardwareProduct))) {
//									System.out.println(
//											"Subscription Relation ID : " + dataStorage.getSubscriptionRelId());
//									quoteItem.setTsServiceIntegrationID(dataStorage.getSubscriptionRelId());
//
//								}
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


		
		Then("^call QueryOrder to verify the status and delivery method$", () -> {
			try {

				QueryOrder queryOrder = new QueryOrder(dataStorage);
				Order validateOrder = queryOrder.getOrderById(dataStorage.getActiveOrderId());
				// Order validateOrder = queryOrder.getOrderById("1-4MIGRWK");

				String status = validateOrder.getStatus();
				if (status.equalsIgnoreCase("Open") || status.equalsIgnoreCase("Complete")) {
					System.out.println("Order is in " + status + " state.");
					// validateOrder.getd
				} else {
					int i = 0;
					System.out.println("order is in " + status + " state. Please check");
					while ("Pending".equals(status) && i < 10) {
						Thread.sleep(10 * 1000);

						queryOrder.getOrderById(dataStorage.getActiveOrderId());
						// queryOrder.getOrderById("1-4MIGRWK");
						status = validateOrder.getStatus();
						System.out.println("order is in " + status + " state now.");
						i++;

					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
	}
}
