
package com.siebel.ordermanagement.configurator.cfginteractstatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfStatusTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfStatusTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfStatus" type="{http://siebel.com/OrderManagement/Configurator/CfgInteractStatus}ListOfStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfStatusTopElmt", propOrder = {
    "listOfStatus"
})
public class ListOfStatusTopElmt {

    @XmlElement(name = "ListOfStatus", required = true)
    protected ListOfStatus listOfStatus;

    /**
     * Gets the value of the listOfStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfStatus }
     *     
     */
    public ListOfStatus getListOfStatus() {
        return listOfStatus;
    }

    /**
     * Sets the value of the listOfStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfStatus }
     *     
     */
    public void setListOfStatus(ListOfStatus value) {
        this.listOfStatus = value;
    }

}
