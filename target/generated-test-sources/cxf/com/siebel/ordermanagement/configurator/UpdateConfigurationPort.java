package com.siebel.ordermanagement.configurator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-27T15:39:16.134+05:30
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://siebel.com/OrderManagement/Configurator", name = "UpdateConfigurationPort")
@XmlSeeAlso({com.siebel.ordermanagement.configurator.cfgproperties.ObjectFactory.class, com.siebel.ordermanagement.configurator.cfglinkeditems.ObjectFactory.class, com.siebel.ordermanagement.configurator.cfginteractrequest.ObjectFactory.class, com.siebel.ordermanagement.configurator.webchannelobjgroupitems.ObjectFactory.class, com.siebel.ordermanagement.configurator.cfginteractstatus.ObjectFactory.class, ObjectFactory.class, com.siebel.ordermanagement.configurator.webchannelobjstructure.ObjectFactory.class, com.siebel.ordermanagement.quote.data.ObjectFactory.class, com.siebel.ordermanagement.configurator.cfginteractdata.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UpdateConfigurationPort {

    @WebMethod(operationName = "UpdateConfiguration", action = "document/http://siebel.com/OrderManagement/Configurator:UpdateConfiguration")
    @WebResult(name = "UpdateConfiguration_Output", targetNamespace = "http://siebel.com/OrderManagement/Configurator", partName = "UpdateConfiguration_Output")
    public UpdateConfigurationOutput updateConfiguration(
        @WebParam(partName = "UpdateConfiguration_Input", name = "UpdateConfiguration_Input", targetNamespace = "http://siebel.com/OrderManagement/Configurator")
        UpdateConfigurationInput updateConfigurationInput
    );
}
