package com.siebel.ordermanagement.configurator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-24T13:42:47.432+05:30
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://siebel.com/OrderManagement/Configurator", name = "EndConfigurationPort")
@XmlSeeAlso({com.siebel.ordermanagement.configurator.cfgproperties.ObjectFactory.class, com.siebel.ordermanagement.configurator.cfglinkeditems.ObjectFactory.class, com.siebel.ordermanagement.configurator.cfginteractrequest.ObjectFactory.class, com.siebel.ordermanagement.configurator.webchannelobjgroupitems.ObjectFactory.class, com.siebel.ordermanagement.configurator.cfginteractstatus.ObjectFactory.class, ObjectFactory.class, com.siebel.ordermanagement.configurator.webchannelobjstructure.ObjectFactory.class, com.siebel.ordermanagement.quote.data.ObjectFactory.class, com.siebel.ordermanagement.configurator.cfginteractdata.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface EndConfigurationPort {

    @WebMethod(operationName = "EndConfiguration", action = "document/http://siebel.com/OrderManagement/Configurator:EndConfiguration")
    @WebResult(name = "EndConfiguration_Output", targetNamespace = "http://siebel.com/OrderManagement/Configurator", partName = "EndConfiguration_Output")
    public EndConfigurationOutput endConfiguration(
        @WebParam(partName = "EndConfiguration_Input", name = "EndConfiguration_Input", targetNamespace = "http://siebel.com/OrderManagement/Configurator")
        EndConfigurationInput endConfigurationInput
    );
}
