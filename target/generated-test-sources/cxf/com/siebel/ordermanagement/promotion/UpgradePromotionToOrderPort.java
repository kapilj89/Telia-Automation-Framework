package com.siebel.ordermanagement.promotion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-27T16:35:59.500+05:30
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://siebel.com/OrderManagement/Promotion", name = "UpgradePromotionToOrderPort")
@XmlSeeAlso({com.siebel.ordermanagement.catalog.data.catalogcontext.ObjectFactory.class, ObjectFactory.class, com.siebel.ordermanagement.quote.data.ObjectFactory.class, com.siebel.ordermanagement.catalog.data.product.ObjectFactory.class, com.siebel.ordermanagement.order.data.ObjectFactory.class, com.siebel.ordermanagement.promotion.data.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UpgradePromotionToOrderPort {

    @WebMethod(operationName = "UpgradePromotionToOrder", action = "document/http://siebel.com/OrderManagement/Promotion:UpgradePromotionToOrder")
    @WebResult(name = "UpgradePromotionToOrder_Output", targetNamespace = "http://siebel.com/OrderManagement/Promotion", partName = "UpgradePromotionToOrder_Output")
    public UpgradePromotionToOrderOutput upgradePromotionToOrder(
        @WebParam(partName = "UpgradePromotionToOrder_Input", name = "UpgradePromotionToOrder_Input", targetNamespace = "http://siebel.com/OrderManagement/Promotion")
        UpgradePromotionToOrderInput upgradePromotionToOrderInput
    );
}
