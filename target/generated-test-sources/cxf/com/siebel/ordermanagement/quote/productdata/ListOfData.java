
package com.siebel.ordermanagement.quote.productdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductData" type="{http://siebel.com/OrderManagement/Quote/ProductData}ProductData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfData", propOrder = {
    "productData"
})
public class ListOfData {

    @XmlElement(name = "ProductData", required = true)
    protected ProductData productData;

    /**
     * Gets the value of the productData property.
     * 
     * @return
     *     possible object is
     *     {@link ProductData }
     *     
     */
    public ProductData getProductData() {
        return productData;
    }

    /**
     * Sets the value of the productData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductData }
     *     
     */
    public void setProductData(ProductData value) {
        this.productData = value;
    }

}
