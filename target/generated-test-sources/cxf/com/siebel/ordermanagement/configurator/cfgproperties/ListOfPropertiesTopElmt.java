
package com.siebel.ordermanagement.configurator.cfgproperties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfPropertiesTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfPropertiesTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfProperties" type="{http://siebel.com/OrderManagement/Configurator/CfgProperties}ListOfProperties"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPropertiesTopElmt", propOrder = {
    "listOfProperties"
})
public class ListOfPropertiesTopElmt {

    @XmlElement(name = "ListOfProperties", required = true)
    protected ListOfProperties listOfProperties;

    /**
     * Gets the value of the listOfProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProperties }
     *     
     */
    public ListOfProperties getListOfProperties() {
        return listOfProperties;
    }

    /**
     * Sets the value of the listOfProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProperties }
     *     
     */
    public void setListOfProperties(ListOfProperties value) {
        this.listOfProperties = value;
    }

}
