
package com.siebel.ordermanagement.catalog.data.productclassattributes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfProductClassAttributesTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfProductClassAttributesTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfProductClassAttributes" type="{http://siebel.com/OrderManagement/Catalog/Data/ProductClassAttributes}ListOfProductClassAttributes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfProductClassAttributesTopElmt", propOrder = {
    "listOfProductClassAttributes"
})
public class ListOfProductClassAttributesTopElmt {

    @XmlElement(name = "ListOfProductClassAttributes", required = true)
    protected ListOfProductClassAttributes listOfProductClassAttributes;

    /**
     * Gets the value of the listOfProductClassAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProductClassAttributes }
     *     
     */
    public ListOfProductClassAttributes getListOfProductClassAttributes() {
        return listOfProductClassAttributes;
    }

    /**
     * Sets the value of the listOfProductClassAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProductClassAttributes }
     *     
     */
    public void setListOfProductClassAttributes(ListOfProductClassAttributes value) {
        this.listOfProductClassAttributes = value;
    }

}
