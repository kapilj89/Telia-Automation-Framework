
package com.siebel.ordermanagement.catalog.data.udspublishcatalog.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfUDSPublishCatalogTopElmtData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfUDSPublishCatalogTopElmtData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfUDSPublishCatalog" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Data}ListOfUDSPublishCatalogData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfUDSPublishCatalogTopElmtData", propOrder = {
    "listOfUDSPublishCatalog"
})
public class ListOfUDSPublishCatalogTopElmtData {

    @XmlElement(name = "ListOfUDSPublishCatalog", required = true)
    protected ListOfUDSPublishCatalogData listOfUDSPublishCatalog;

    /**
     * Gets the value of the listOfUDSPublishCatalog property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfUDSPublishCatalogData }
     *     
     */
    public ListOfUDSPublishCatalogData getListOfUDSPublishCatalog() {
        return listOfUDSPublishCatalog;
    }

    /**
     * Sets the value of the listOfUDSPublishCatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfUDSPublishCatalogData }
     *     
     */
    public void setListOfUDSPublishCatalog(ListOfUDSPublishCatalogData value) {
        this.listOfUDSPublishCatalog = value;
    }

}
