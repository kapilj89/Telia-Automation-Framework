package com.siebel.selfservice.common.address;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-27T15:39:18.725+05:30
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://siebel.com/SelfService/Common/Address", name = "SelfServiceAddress")
@XmlSeeAlso({com.siebel.selfservice.common.address.data.ObjectFactory.class, ObjectFactory.class, com.siebel.selfservice.common.address.id.ObjectFactory.class, com.siebel.selfservice.common.address.query.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SelfServiceAddress {

    @WebMethod(operationName = "SelfServiceAddressUpdate", action = "document/http://siebel.com/SelfService/Common/Address:SelfServiceAddressUpdate")
    @WebResult(name = "SelfServiceAddressUpdate_Output", targetNamespace = "http://siebel.com/SelfService/Common/Address", partName = "SelfServiceAddressUpdate_Output")
    public SelfServiceAddressUpdateOutput selfServiceAddressUpdate(
        @WebParam(partName = "SelfServiceAddressUpdate_Input", name = "SelfServiceAddressUpdate_Input", targetNamespace = "http://siebel.com/SelfService/Common/Address")
        SelfServiceAddressUpdateInput selfServiceAddressUpdateInput
    );

    @WebMethod(operationName = "SelfServiceAddressInsert", action = "document/http://siebel.com/SelfService/Common/Address:SelfServiceAddressInsert")
    @WebResult(name = "SelfServiceAddressInsert_Output", targetNamespace = "http://siebel.com/SelfService/Common/Address", partName = "SelfServiceAddressInsert_Output")
    public SelfServiceAddressInsertOutput selfServiceAddressInsert(
        @WebParam(partName = "SelfServiceAddressInsert_Input", name = "SelfServiceAddressInsert_Input", targetNamespace = "http://siebel.com/SelfService/Common/Address")
        SelfServiceAddressInsertInput selfServiceAddressInsertInput
    );

    @WebMethod(operationName = "SelfServiceAddressInit", action = "document/http://siebel.com/SelfService/Common/Address:SelfServiceAddressInit")
    @WebResult(name = "SelfServiceAddressInit_Output", targetNamespace = "http://siebel.com/SelfService/Common/Address", partName = "SelfServiceAddressInit_Output")
    public SelfServiceAddressInitOutput selfServiceAddressInit(
        @WebParam(partName = "SelfServiceAddressInit_Input", name = "SelfServiceAddressInit_Input", targetNamespace = "http://siebel.com/SelfService/Common/Address")
        SelfServiceAddressInitInput selfServiceAddressInitInput
    );

    @WebMethod(operationName = "SelfServiceAddressDelete", action = "document/http://siebel.com/SelfService/Common/Address:SelfServiceAddressDelete")
    @WebResult(name = "SelfServiceAddressDelete_Output", targetNamespace = "http://siebel.com/SelfService/Common/Address", partName = "SelfServiceAddressDelete_Output")
    public SelfServiceAddressDeleteOutput selfServiceAddressDelete(
        @WebParam(partName = "SelfServiceAddressDelete_Input", name = "SelfServiceAddressDelete_Input", targetNamespace = "http://siebel.com/SelfService/Common/Address")
        SelfServiceAddressDeleteInput selfServiceAddressDeleteInput
    );

    @WebMethod(operationName = "SelfServiceAddressQueryPage", action = "document/http://siebel.com/SelfService/Common/Address:SelfServiceAddressQueryPage")
    @WebResult(name = "SelfServiceAddressQueryPage_Output", targetNamespace = "http://siebel.com/SelfService/Common/Address", partName = "SelfServiceAddressQueryPage_Output")
    public SelfServiceAddressQueryPageOutput selfServiceAddressQueryPage(
        @WebParam(partName = "SelfServiceAddressQueryPage_Input", name = "SelfServiceAddressQueryPage_Input", targetNamespace = "http://siebel.com/SelfService/Common/Address")
        SelfServiceAddressQueryPageInput selfServiceAddressQueryPageInput
    );

    @WebMethod(operationName = "SelfServiceAddressExecute", action = "document/http://siebel.com/SelfService/Common/Address:SelfServiceAddressExecute")
    @WebResult(name = "SelfServiceAddressExecute_Output", targetNamespace = "http://siebel.com/SelfService/Common/Address", partName = "SelfServiceAddressExecute_Output")
    public SelfServiceAddressExecuteOutput selfServiceAddressExecute(
        @WebParam(partName = "SelfServiceAddressExecute_Input", name = "SelfServiceAddressExecute_Input", targetNamespace = "http://siebel.com/SelfService/Common/Address")
        SelfServiceAddressExecuteInput selfServiceAddressExecuteInput
    );
}
