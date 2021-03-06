
package com.siebel.ordermanagement.configurator.cfglinkeditems;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfLinkedItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfLinkedItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LinkedItems" type="{http://siebel.com/OrderManagement/Configurator/CfgLinkedItems}LinkedItems" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfLinkedItems", propOrder = {
    "linkedItems"
})
public class ListOfLinkedItems {

    @XmlElement(name = "LinkedItems")
    protected LinkedItems linkedItems;

    /**
     * Gets the value of the linkedItems property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedItems }
     *     
     */
    public LinkedItems getLinkedItems() {
        return linkedItems;
    }

    /**
     * Sets the value of the linkedItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedItems }
     *     
     */
    public void setLinkedItems(LinkedItems value) {
        this.linkedItems = value;
    }

}
