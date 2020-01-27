
package com.siebel.ordermanagement.catalog.data.productdetails;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfProductLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfProductLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductLine" type="{http://siebel.com/OrderManagement/Catalog/Data/ProductDetails}ProductLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfProductLine", propOrder = {
    "productLine"
})
public class ListOfProductLine {

    @XmlElement(name = "ProductLine")
    protected List<ProductLine> productLine;

    /**
     * Gets the value of the productLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductLine }
     * 
     * 
     */
    public List<ProductLine> getProductLine() {
        if (productLine == null) {
            productLine = new ArrayList<ProductLine>();
        }
        return this.productLine;
    }

}
