
package com.siebel.ordermanagement.catalog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.catalog.data.product.ListOfProduct;


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
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/Product}ListOfProduct" minOccurs="0"/&gt;
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
    "listOfProduct"
})
@XmlRootElement(name = "ExecuteSearch_Output")
public class ExecuteSearchOutput {

    @XmlElement(name = "ListOfProduct", namespace = "http://siebel.com/OrderManagement/Catalog/Data/Product")
    protected ListOfProduct listOfProduct;

    /**
     * Gets the value of the listOfProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProduct }
     *     
     */
    public ListOfProduct getListOfProduct() {
        return listOfProduct;
    }

    /**
     * Sets the value of the listOfProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProduct }
     *     
     */
    public void setListOfProduct(ListOfProduct value) {
        this.listOfProduct = value;
    }

}
