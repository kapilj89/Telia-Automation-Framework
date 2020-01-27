package com.siebel.ordermanagement.quote;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-24T13:42:48.722+05:30
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://siebel.com/OrderManagement/Quote", name = "QuoteAddItemsPort")
@XmlSeeAlso({ObjectFactory.class, com.siebel.ordermanagement.quote.productdata.ObjectFactory.class, com.siebel.ordermanagement.quote.data.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface QuoteAddItemsPort {

    @WebMethod(operationName = "QuoteAddItems", action = "document/http://siebel.com/OrderManagement/Quote:QuoteAddItems")
    @WebResult(name = "QuoteAddItems_Output", targetNamespace = "http://siebel.com/OrderManagement/Quote", partName = "QuoteAddItems_Output")
    public QuoteAddItemsOutput quoteAddItems(
        @WebParam(partName = "QuoteAddItems_Input", name = "QuoteAddItems_Input", targetNamespace = "http://siebel.com/OrderManagement/Quote")
        QuoteAddItemsInput quoteAddItemsInput
    );
}