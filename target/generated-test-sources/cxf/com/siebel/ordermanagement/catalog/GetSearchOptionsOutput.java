
package com.siebel.ordermanagement.catalog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.catalog.data.searchableproductclass.ListOfSearchableProductClass;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/SearchableProductClass}ListOfSearchableProductClass" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfSearchableProductClass"
})
@XmlRootElement(name = "GetSearchOptions_Output")
public class GetSearchOptionsOutput {

    @XmlElement(name = "ListOfSearchableProductClass", namespace = "http://siebel.com/OrderManagement/Catalog/Data/SearchableProductClass")
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
