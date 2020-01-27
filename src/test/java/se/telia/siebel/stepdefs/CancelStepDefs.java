package se.telia.siebel.stepdefs;

import java.util.List;
import coreFramework.ExcelData;
import cucumber.api.java8.En;
import se.telia.siebel.apiquerys.*;
//import se.telia.siebel.apiquerys.QuerySWICancelSpcSalesSpcOrder;
//import se.telia.siebel.apiquerys.verifyingStatusofSSN;
import se.telia.siebel.data.DataStorage;

public class CancelStepDefs implements En {
	DataStorage dataStorage;

	public CancelStepDefs(DataStorage datastorage) {

		this.dataStorage = datastorage;

		Given("^call CancelSalesOrder and abandon all pending orders$", () -> {
			try {
				List data = ExcelData.getExcelData();
				// System.out.println("\nData in step def :" +data);
				System.out.println("\nTotal No.of SSN for Cancel: "+data.size());

				for (int i = 0; i < data.size(); i++) {
					int row =i+2;
					System.out.println("EXECUTING ROW "+ row);

					String SSN = data.get(i).toString();
					verifyingStatusofSSN verifyingStatusobj = new verifyingStatusofSSN();
					List pendingOrders = verifyingStatusobj.pendingOrdersFromDB(SSN);
					System.out.println("pendingOrders " + pendingOrders);

					if (!pendingOrders.isEmpty()) {

						for (int j = 0; j < pendingOrders.size(); j++) {
							System.out.println("The " + SSN + " has pending orders\n" + pendingOrders);

							QuerySWICancelSpcSalesSpcOrder querySWICancelSpcSalesSpcOrder = new QuerySWICancelSpcSalesSpcOrder(
									datastorage);
							boolean cancelOk = querySWICancelSpcSalesSpcOrder
									.cancelOrder(pendingOrders.get(j).toString().replaceAll("[\\[|\\]]", ""));
							if (!cancelOk) {
								System.out.println("Invalid order or something went wrong while cancelling the order :"
										+ pendingOrders.get(j));
								ExcelData.setData(SSN, "OrderNo", "Verify SSN/order");

							}
							// Assert.assertTrue("The cancelation of the order went wrong", cancelOk);
							// System.out.println("Order was cancelled OK.");
							// verifyingStatusofSSN.updateAbandonedOrders(SSN);
						}
					} else {
						System.out.println("The " + SSN + " is not having any pending orders.");
						ExcelData.setData(SSN, "OrderNo", "No Pending Order");
					}
				}

			} catch (Exception e) {
				System.out.println(e);
			}

		});
	}

}
