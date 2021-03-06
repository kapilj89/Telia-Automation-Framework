package com.siebel.ordermanagement.order;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-27T16:35:58.224+05:30
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://siebel.com/OrderManagement/Order", name = "OrderPort")
@XmlSeeAlso({ObjectFactory.class, com.siebel.ordermanagement.order.item.data.ObjectFactory.class, com.siebel.ordermanagement.order.data.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface OrderPort {

    @WebMethod(operationName = "SynchronizeOrder", action = "document/http://siebel.com/OrderManagement/Order:SynchronizeOrder")
    @WebResult(name = "SynchronizeOrder_Output", targetNamespace = "http://siebel.com/OrderManagement/Order", partName = "SynchronizeOrder_Output")
    public SynchronizeOrderOutput synchronizeOrder(
        @WebParam(partName = "SynchronizeOrder_Input", name = "SynchronizeOrder_Input", targetNamespace = "http://siebel.com/OrderManagement/Order")
        SynchronizeOrderInput synchronizeOrderInput
    );

    @WebMethod(operationName = "DeleteOrder", action = "document/http://siebel.com/OrderManagement/Order:DeleteOrder")
    @WebResult(name = "DeleteOrder_Output", targetNamespace = "http://siebel.com/OrderManagement/Order", partName = "DeleteOrder_Output")
    public DeleteOrderOutput deleteOrder(
        @WebParam(partName = "DeleteOrder_Input", name = "DeleteOrder_Input", targetNamespace = "http://siebel.com/OrderManagement/Order")
        DeleteOrderInput deleteOrderInput
    );

    @WebMethod(operationName = "UpdateOrder", action = "document/http://siebel.com/OrderManagement/Order:UpdateOrder")
    @WebResult(name = "UpdateOrder_Output", targetNamespace = "http://siebel.com/OrderManagement/Order", partName = "UpdateOrder_Output")
    public UpdateOrderOutput updateOrder(
        @WebParam(partName = "UpdateOrder_Input", name = "UpdateOrder_Input", targetNamespace = "http://siebel.com/OrderManagement/Order")
        UpdateOrderInput updateOrderInput
    );

    @WebMethod(operationName = "GetOrder", action = "document/http://siebel.com/OrderManagement/Order:GetOrder")
    @WebResult(name = "GetOrder_Output", targetNamespace = "http://siebel.com/OrderManagement/Order", partName = "GetOrder_Output")
    public GetOrderOutput getOrder(
        @WebParam(partName = "GetOrder_Input", name = "GetOrder_Input", targetNamespace = "http://siebel.com/OrderManagement/Order")
        GetOrderInput getOrderInput
    );

    @WebMethod(operationName = "GetOrderById", action = "document/http://siebel.com/OrderManagement/Order:GetOrderById")
    @WebResult(name = "GetOrderById_Output", targetNamespace = "http://siebel.com/OrderManagement/Order", partName = "GetOrderById_Output")
    public GetOrderByIdOutput getOrderById(
        @WebParam(partName = "GetOrderById_Input", name = "GetOrderById_Input", targetNamespace = "http://siebel.com/OrderManagement/Order")
        GetOrderByIdInput getOrderByIdInput
    );

    @WebMethod(operationName = "InsertOrder", action = "document/http://siebel.com/OrderManagement/Order:InsertOrder")
    @WebResult(name = "InsertOrder_Output", targetNamespace = "http://siebel.com/OrderManagement/Order", partName = "InsertOrder_Output")
    public InsertOrderOutput insertOrder(
        @WebParam(partName = "InsertOrder_Input", name = "InsertOrder_Input", targetNamespace = "http://siebel.com/OrderManagement/Order")
        InsertOrderInput insertOrderInput
    );
}
