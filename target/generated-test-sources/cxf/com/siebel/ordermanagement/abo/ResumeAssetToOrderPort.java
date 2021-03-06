package com.siebel.ordermanagement.abo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-27T16:35:56.445+05:30
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://siebel.com/OrderManagement/ABO", name = "ResumeAssetToOrderPort")
@XmlSeeAlso({com.siebel.ordermanagement.asset.data.ObjectFactory.class, ObjectFactory.class, com.siebel.ordermanagement.quote.data.ObjectFactory.class, com.siebel.ordermanagement.order.data.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ResumeAssetToOrderPort {

    @WebMethod(operationName = "ResumeAssetToOrder", action = "document/http://siebel.com/OrderManagement/ABO:ResumeAssetToOrder")
    @WebResult(name = "ResumeAssetToOrder_Output", targetNamespace = "http://siebel.com/OrderManagement/ABO", partName = "ResumeAssetToOrder_Output")
    public ResumeAssetToOrderOutput resumeAssetToOrder(
        @WebParam(partName = "ResumeAssetToOrder_Input", name = "ResumeAssetToOrder_Input", targetNamespace = "http://siebel.com/OrderManagement/ABO")
        ResumeAssetToOrderInput resumeAssetToOrderInput
    );
}
