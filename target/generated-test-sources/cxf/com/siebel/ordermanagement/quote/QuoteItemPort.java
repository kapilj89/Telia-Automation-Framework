package com.siebel.ordermanagement.quote;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-24T13:42:49.432+05:30
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://siebel.com/OrderManagement/Quote", name = "QuoteItemPort")
@XmlSeeAlso({ObjectFactory.class, com.siebel.ordermanagement.quote.item.data.ObjectFactory.class, com.siebel.ordermanagement.quote.data.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface QuoteItemPort {

    @WebMethod(operationName = "DeleteQuoteItem", action = "document/http://siebel.com/OrderManagement/Quote:DeleteQuoteItem")
    @WebResult(name = "DeleteQuoteItem_Output", targetNamespace = "http://siebel.com/OrderManagement/Quote", partName = "DeleteQuoteItem_Output")
    public DeleteQuoteItemOutput deleteQuoteItem(
        @WebParam(partName = "DeleteQuoteItem_Input", name = "DeleteQuoteItem_Input", targetNamespace = "http://siebel.com/OrderManagement/Quote")
        DeleteQuoteItemInput deleteQuoteItemInput
    );

    @WebMethod(operationName = "InsertQuoteItem", action = "document/http://siebel.com/OrderManagement/Quote:InsertQuoteItem")
    @WebResult(name = "InsertQuoteItem_Output", targetNamespace = "http://siebel.com/OrderManagement/Quote", partName = "InsertQuoteItem_Output")
    public InsertQuoteItemOutput insertQuoteItem(
        @WebParam(partName = "InsertQuoteItem_Input", name = "InsertQuoteItem_Input", targetNamespace = "http://siebel.com/OrderManagement/Quote")
        InsertQuoteItemInput insertQuoteItemInput
    );

    @WebMethod(operationName = "UpdateQuoteItem", action = "document/http://siebel.com/OrderManagement/Quote:UpdateQuoteItem")
    @WebResult(name = "UpdateQuoteItem_Output", targetNamespace = "http://siebel.com/OrderManagement/Quote", partName = "UpdateQuoteItem_Output")
    public UpdateQuoteItemOutput updateQuoteItem(
        @WebParam(partName = "UpdateQuoteItem_Input", name = "UpdateQuoteItem_Input", targetNamespace = "http://siebel.com/OrderManagement/Quote")
        UpdateQuoteItemInput updateQuoteItemInput
    );

    @WebMethod(operationName = "SynchronizeQuoteItem", action = "document/http://siebel.com/OrderManagement/Quote:SynchronizeQuoteItem")
    @WebResult(name = "SynchronizeQuoteItem_Output", targetNamespace = "http://siebel.com/OrderManagement/Quote", partName = "SynchronizeQuoteItem_Output")
    public SynchronizeQuoteItemOutput synchronizeQuoteItem(
        @WebParam(partName = "SynchronizeQuoteItem_Input", name = "SynchronizeQuoteItem_Input", targetNamespace = "http://siebel.com/OrderManagement/Quote")
        SynchronizeQuoteItemInput synchronizeQuoteItemInput
    );

    @WebMethod(operationName = "GetQuoteItem", action = "document/http://siebel.com/OrderManagement/Quote:GetQuoteItem")
    @WebResult(name = "GetQuoteItem_Output", targetNamespace = "http://siebel.com/OrderManagement/Quote", partName = "GetQuoteItem_Output")
    public GetQuoteItemOutput getQuoteItem(
        @WebParam(partName = "GetQuoteItem_Input", name = "GetQuoteItem_Input", targetNamespace = "http://siebel.com/OrderManagement/Quote")
        GetQuoteItemInput getQuoteItemInput
    );

    @WebMethod(operationName = "GetQuoteItemById", action = "document/http://siebel.com/OrderManagement/Quote:GetQuoteItemById")
    @WebResult(name = "GetQuoteItemById_Output", targetNamespace = "http://siebel.com/OrderManagement/Quote", partName = "GetQuoteItemById_Output")
    public GetQuoteItemByIdOutput getQuoteItemById(
        @WebParam(partName = "GetQuoteItemById_Input", name = "GetQuoteItemById_Input", targetNamespace = "http://siebel.com/OrderManagement/Quote")
        GetQuoteItemByIdInput getQuoteItemByIdInput
    );
}
