package com.siebel.ordermanagement.quote;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-27T15:39:17.611+05:30
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://siebel.com/OrderManagement/Quote", name = "QuotePort")
@XmlSeeAlso({ObjectFactory.class, com.siebel.ordermanagement.quote.item.data.ObjectFactory.class, com.siebel.ordermanagement.quote.data.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface QuotePort {

    @WebMethod(operationName = "SynchronizeQuote", action = "document/http://siebel.com/OrderManagement/Quote:SynchronizeQuote")
    @WebResult(name = "SynchronizeQuote_Output", targetNamespace = "http://siebel.com/OrderManagement/Quote", partName = "SynchronizeQuote_Output")
    public SynchronizeQuoteOutput synchronizeQuote(
        @WebParam(partName = "SynchronizeQuote_Input", name = "SynchronizeQuote_Input", targetNamespace = "http://siebel.com/OrderManagement/Quote")
        SynchronizeQuoteInput synchronizeQuoteInput
    );

    @WebMethod(operationName = "InsertQuote", action = "document/http://siebel.com/OrderManagement/Quote:InsertQuote")
    @WebResult(name = "InsertQuote_Output", targetNamespace = "http://siebel.com/OrderManagement/Quote", partName = "InsertQuote_Output")
    public InsertQuoteOutput insertQuote(
        @WebParam(partName = "InsertQuote_Input", name = "InsertQuote_Input", targetNamespace = "http://siebel.com/OrderManagement/Quote")
        InsertQuoteInput insertQuoteInput
    );

    @WebMethod(operationName = "GetQuote", action = "document/http://siebel.com/OrderManagement/Quote:GetQuote")
    @WebResult(name = "GetQuote_Output", targetNamespace = "http://siebel.com/OrderManagement/Quote", partName = "GetQuote_Output")
    public GetQuoteOutput getQuote(
        @WebParam(partName = "GetQuote_Input", name = "GetQuote_Input", targetNamespace = "http://siebel.com/OrderManagement/Quote")
        GetQuoteInput getQuoteInput
    );

    @WebMethod(operationName = "GetQuoteById", action = "document/http://siebel.com/OrderManagement/Quote:GetQuoteById")
    @WebResult(name = "GetQuoteById_Output", targetNamespace = "http://siebel.com/OrderManagement/Quote", partName = "GetQuoteById_Output")
    public GetQuoteByIdOutput getQuoteById(
        @WebParam(partName = "GetQuoteById_Input", name = "GetQuoteById_Input", targetNamespace = "http://siebel.com/OrderManagement/Quote")
        GetQuoteByIdInput getQuoteByIdInput
    );

    @WebMethod(operationName = "UpdateQuote", action = "document/http://siebel.com/OrderManagement/Quote:UpdateQuote")
    @WebResult(name = "UpdateQuote_Output", targetNamespace = "http://siebel.com/OrderManagement/Quote", partName = "UpdateQuote_Output")
    public UpdateQuoteOutput updateQuote(
        @WebParam(partName = "UpdateQuote_Input", name = "UpdateQuote_Input", targetNamespace = "http://siebel.com/OrderManagement/Quote")
        UpdateQuoteInput updateQuoteInput
    );

    @WebMethod(operationName = "DeleteQuote", action = "document/http://siebel.com/OrderManagement/Quote:DeleteQuote")
    @WebResult(name = "DeleteQuote_Output", targetNamespace = "http://siebel.com/OrderManagement/Quote", partName = "DeleteQuote_Output")
    public DeleteQuoteOutput deleteQuote(
        @WebParam(partName = "DeleteQuote_Input", name = "DeleteQuote_Input", targetNamespace = "http://siebel.com/OrderManagement/Quote")
        DeleteQuoteInput deleteQuoteInput
    );
}
