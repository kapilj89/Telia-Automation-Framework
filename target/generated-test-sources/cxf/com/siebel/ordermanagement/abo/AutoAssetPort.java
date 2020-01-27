package com.siebel.ordermanagement.abo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-27T15:39:13.457+05:30
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://siebel.com/OrderManagement/ABO", name = "AutoAssetPort")
@XmlSeeAlso({com.siebel.ordermanagement.asset.data.ObjectFactory.class, ObjectFactory.class, com.siebel.ordermanagement.quote.data.ObjectFactory.class, com.siebel.ordermanagement.order.data.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AutoAssetPort {

    @WebMethod(operationName = "AutoAsset", action = "document/http://siebel.com/OrderManagement/ABO:AutoAsset")
    @WebResult(name = "AutoAsset_Output", targetNamespace = "http://siebel.com/OrderManagement/ABO", partName = "AutoAsset_Output")
    public AutoAssetOutput autoAsset(
        @WebParam(partName = "AutoAsset_Input", name = "AutoAsset_Input", targetNamespace = "http://siebel.com/OrderManagement/ABO")
        AutoAssetInput autoAssetInput
    );
}
