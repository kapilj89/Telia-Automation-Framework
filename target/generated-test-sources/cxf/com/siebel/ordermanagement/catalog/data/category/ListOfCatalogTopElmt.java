
package com.siebel.ordermanagement.catalog.data.category;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfCatalogTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfCatalogTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfCatalog" type="{http://siebel.com/OrderManagement/Catalog/Data/Category}ListOfCatalog"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCatalogTopElmt", propOrder = {
    "listOfCatalog"
})
public class ListOfCatalogTopElmt {

    @XmlElement(name = "ListOfCatalog", required = true)
    protected ListOfCatalog listOfCatalog;

    /**
     * Gets the value of the listOfCatalog property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCatalog }
     *     
     */
    public ListOfCatalog getListOfCatalog() {
        return listOfCatalog;
    }

    /**
     * Sets the value of the listOfCatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCatalog }
     *     
     */
    public void setListOfCatalog(ListOfCatalog value) {
        this.listOfCatalog = value;
    }

}
