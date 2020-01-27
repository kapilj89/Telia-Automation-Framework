package com.siebel.ordermanagement.order;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-27T14:14:01.245+05:30
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://siebel.com/OrderManagement/Order", name = "OrderItemPort")
@XmlSeeAlso({ObjectFactory.class, com.siebel.ordermanagement.order.item.data.ObjectFactory.class, com.siebel.ordermanagement.order.data.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface OrderItemPort {

    @WebMethod(operationName = "UpdateOrderItem", action = "document/http://siebel.com/OrderManagement/Order:UpdateOrderItem")
    @WebResult(name = "UpdateOrderItem_Output", targetNamespace = "http://siebel.com/OrderManagement/Order", partName = "UpdateOrderItem_Output")
    public UpdateOrderItemOutput updateOrderItem(
        @WebParam(partName = "UpdateOrderItem_Input", name = "UpdateOrderItem_Input", targetNamespace = "http://siebel.com/OrderManagement/Order")
        UpdateOrderItemInput updateOrderItemInput
    );

    @WebMethod(operationName = "SynchronizeOrderItem", action = "document/http://siebel.com/OrderManagement/Order:SynchronizeOrderItem")
    @WebResult(name = "SynchronizeOrderItem_Output", targetNamespace = "http://siebel.com/OrderManagement/Order", partName = "SynchronizeOrderItem_Output")
    public SynchronizeOrderItemOutput synchronizeOrderItem(
        @WebParam(partName = "SynchronizeOrderItem_Input", name = "SynchronizeOrderItem_Input", targetNamespace = "http://siebel.com/OrderManagement/Order")
        SynchronizeOrderItemInput synchronizeOrderItemInput
    );

    @WebMethod(operationName = "InsertOrderItem", action = "document/http://siebel.com/OrderManagement/Order:InsertOrderItem")
    @WebResult(name = "InsertOrderItem_Output", targetNamespace = "http://siebel.com/OrderManagement/Order", partName = "InsertOrderItem_Output")
    public InsertOrderItemOutput insertOrderItem(
        @WebParam(partName = "InsertOrderItem_Input", name = "InsertOrderItem_Input", targetNamespace = "http://siebel.com/OrderManagement/Order")
        InsertOrderItemInput insertOrderItemInput
    );

    @WebMethod(operationName = "DeleteOrderItem", action = "document/http://siebel.com/OrderManagement/Order:DeleteOrderItem")
    @WebResult(name = "DeleteOrderItem_Output", targetNamespace = "http://siebel.com/OrderManagement/Order", partName = "DeleteOrderItem_Output")
    public DeleteOrderItemOutput deleteOrderItem(
        @WebParam(partName = "DeleteOrderItem_Input", name = "DeleteOrderItem_Input", targetNamespace = "http://siebel.com/OrderManagement/Order")
        DeleteOrderItemInput deleteOrderItemInput
    );

    @WebMethod(operationName = "GetOrderItemById", action = "document/http://siebel.com/OrderManagement/Order:GetOrderItemById")
    @WebResult(name = "GetOrderItemById_Output", targetNamespace = "http://siebel.com/OrderManagement/Order", partName = "GetOrderItemById_Output")
    public GetOrderItemByIdOutput getOrderItemById(
        @WebParam(partName = "GetOrderItemById_Input", name = "GetOrderItemById_Input", targetNamespace = "http://siebel.com/OrderManagement/Order")
        GetOrderItemByIdInput getOrderItemByIdInput
    );

    @WebMethod(operationName = "GetOrderItem", action = "document/http://siebel.com/OrderManagement/Order:GetOrderItem")
    @WebResult(name = "GetOrderItem_Output", targetNamespace = "http://siebel.com/OrderManagement/Order", partName = "GetOrderItem_Output")
    public GetOrderItemOutput getOrderItem(
        @WebParam(partName = "GetOrderItem_Input", name = "GetOrderItem_Input", targetNamespace = "http://siebel.com/OrderManagement/Order")
        GetOrderItemInput getOrderItemInput
    );
}
