
package com.siebel.ordermanagement.catalog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.catalog.data.categoryproduct.ListOfCategoryProduct;


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
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/CategoryProduct}ListOfCategoryProduct" minOccurs="0"/&gt;
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
    "listOfCategoryProduct"
})
@XmlRootElement(name = "GetCategoryProducts_Output")
public class GetCategoryProductsOutput {

    @XmlElement(name = "ListOfCategoryProduct", namespace = "http://siebel.com/OrderManagement/Catalog/Data/CategoryProduct")
    protected ListOfCategoryProduct listOfCategoryProduct;

    /**
     * Gets the value of the listOfCategoryProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCategoryProduct }
     *     
     */
    public ListOfCategoryProduct getListOfCategoryProduct() {
        return listOfCategoryProduct;
    }

    /**
     * Sets the value of the listOfCategoryProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCategoryProduct }
     *     
     */
    public void setListOfCategoryProduct(ListOfCategoryProduct value) {
        this.listOfCategoryProduct = value;
    }

}
