
package com.siebel.ordermanagement.catalog.data.productattributedomain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfProductAttributeDomainTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfProductAttributeDomainTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfProductAttributeDomain" type="{http://siebel.com/OrderManagement/Catalog/Data/ProductAttributeDomain}ListOfProductAttributeDomain"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfProductAttributeDomainTopElmt", propOrder = {
    "listOfProductAttributeDomain"
})
public class ListOfProductAttributeDomainTopElmt {

    @XmlElement(name = "ListOfProductAttributeDomain", required = true)
    protected ListOfProductAttributeDomain listOfProductAttributeDomain;

    /**
     * Gets the value of the listOfProductAttributeDomain property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProductAttributeDomain }
     *     
     */
    public ListOfProductAttributeDomain getListOfProductAttributeDomain() {
        return listOfProductAttributeDomain;
    }

    /**
     * Sets the value of the listOfProductAttributeDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProductAttributeDomain }
     *     
     */
    public void setListOfProductAttributeDomain(ListOfProductAttributeDomain value) {
        this.listOfProductAttributeDomain = value;
    }

}
