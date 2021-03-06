
package com.siebel.ordermanagement.catalog.data.searchableproductclass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSearchableProductClassTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSearchableProductClassTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfSearchableProductClass" type="{http://siebel.com/OrderManagement/Catalog/Data/SearchableProductClass}ListOfSearchableProductClass"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSearchableProductClassTopElmt", propOrder = {
    "listOfSearchableProductClass"
})
public class ListOfSearchableProductClassTopElmt {

    @XmlElement(name = "ListOfSearchableProductClass", required = true)
    protected ListOfSearchableProductClass listOfSearchableProductClass;

    /**
     * Gets the value of the listOfSearchableProductClass property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSearchableProductClass }
     *     
     */
    public ListOfSearchableProductClass getListOfSearchableProductClass() {
        return listOfSearchableProductClass;
    }

    /**
     * Sets the value of the listOfSearchableProductClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSearchableProductClass }
     *     
     */
    public void setListOfSearchableProductClass(ListOfSearchableProductClass value) {
        this.listOfSearchableProductClass = value;
    }

}
