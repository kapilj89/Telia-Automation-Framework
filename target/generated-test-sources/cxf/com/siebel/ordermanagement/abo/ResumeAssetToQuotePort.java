package com.siebel.ordermanagement.abo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-27T14:13:59.292+05:30
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://siebel.com/OrderManagement/ABO", name = "ResumeAssetToQuotePort")
@XmlSeeAlso({com.siebel.ordermanagement.asset.data.ObjectFactory.class, ObjectFactory.class, com.siebel.ordermanagement.quote.data.ObjectFactory.class, com.siebel.ordermanagement.order.data.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ResumeAssetToQuotePort {

    @WebMethod(operationName = "ResumeAssetToQuote", action = "document/http://siebel.com/OrderManagement/ABO:ResumeAssetToQuote")
    @WebResult(name = "ResumeAssetToQuote_Output", targetNamespace = "http://siebel.com/OrderManagement/ABO", partName = "ResumeAssetToQuote_Output")
    public ResumeAssetToQuoteOutput resumeAssetToQuote(
        @WebParam(partName = "ResumeAssetToQuote_Input", name = "ResumeAssetToQuote_Input", targetNamespace = "http://siebel.com/OrderManagement/ABO")
        ResumeAssetToQuoteInput resumeAssetToQuoteInput
    );
}
