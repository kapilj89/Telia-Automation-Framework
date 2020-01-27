
package com.siebel.ordermanagement.configurator.cfginteractrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfRequestTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfRequestTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfRequest" type="{http://siebel.com/OrderManagement/Configurator/CfgInteractRequest}ListOfRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfRequestTopElmt", propOrder = {
    "listOfRequest"
})
public class ListOfRequestTopElmt {

    @XmlElement(name = "ListOfRequest", required = true)
    protected ListOfRequest listOfRequest;

    /**
     * Gets the value of the listOfRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfRequest }
     *     
     */
    public ListOfRequest getListOfRequest() {
        return listOfRequest;
    }

    /**
     * Sets the value of the listOfRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfRequest }
     *     
     */
    public void setListOfRequest(ListOfRequest value) {
        this.listOfRequest = value;
    }

}
