
package com.siebel.ordermanagement.catalog.data.udspublishcatalog.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfUDSPublishCatalogTopElmtQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfUDSPublishCatalogTopElmtQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfUDSPublishCatalog" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}ListOfUDSPublishCatalogQuery" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfUDSPublishCatalogTopElmtQuery", propOrder = {
    "listOfUDSPublishCatalog"
})
public class ListOfUDSPublishCatalogTopElmtQuery {

    @XmlElement(name = "ListOfUDSPublishCatalog")
    protected ListOfUDSPublishCatalogQuery listOfUDSPublishCatalog;

    /**
     * Gets the value of the listOfUDSPublishCatalog property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfUDSPublishCatalogQuery }
     *     
     */
    public ListOfUDSPublishCatalogQuery getListOfUDSPublishCatalog() {
        return listOfUDSPublishCatalog;
    }

    /**
     * Sets the value of the listOfUDSPublishCatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfUDSPublishCatalogQuery }
     *     
     */
    public void setListOfUDSPublishCatalog(ListOfUDSPublishCatalogQuery value) {
        this.listOfUDSPublishCatalog = value;
    }

}
