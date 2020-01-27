package com.siebel.customui;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-24T13:42:52.471+05:30
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://siebel.com/CustomUI", name = "TSC2BTransferOrderProcess")
@XmlSeeAlso({ObjectFactory.class, com.siebel.ordermanagement.quote.data.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface TSC2BTransferOrderProcess {

    @WebMethod(operationName = "TransferModifyAssetToQuote", action = "document/http://siebel.com/CustomUI:TransferModifyAssetToQuote")
    @WebResult(name = "TransferModifyAssetToQuote_Output", targetNamespace = "http://siebel.com/CustomUI", partName = "TransferModifyAssetToQuote_Output")
    public TransferModifyAssetToQuoteOutput transferModifyAssetToQuote(
        @WebParam(partName = "TransferModifyAssetToQuote_Input", name = "TransferModifyAssetToQuote_Input", targetNamespace = "http://siebel.com/CustomUI")
        TransferModifyAssetToQuoteInput transferModifyAssetToQuoteInput
    );
}