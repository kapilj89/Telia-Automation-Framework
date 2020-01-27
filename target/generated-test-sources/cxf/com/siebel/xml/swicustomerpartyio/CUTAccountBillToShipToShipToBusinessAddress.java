
package com.siebel.xml.swicustomerpartyio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUTAccount-BillToShipTo_ShipToBusinessAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUTAccount-BillToShipTo_ShipToBusinessAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToStreetAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShipToStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AddressName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IsPrimaryMVG" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="searchspec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUTAccount-BillToShipTo_ShipToBusinessAddress", propOrder = {
    "shipToCountry",
    "shipToCounty",
    "shipToPostalCode",
    "shipToProvince",
    "shipToState",
    "shipToStreetAddress2",
    "shipToStreetAddress3",
    "shipToCity",
    "shipToStreetAddress",
    "addressName",
    "id"
})
public class CUTAccountBillToShipToShipToBusinessAddress {

    @XmlElement(name = "ShipToCountry")
    protected String shipToCountry;
    @XmlElement(name = "ShipToCounty")
    protected String shipToCounty;
    @XmlElement(name = "ShipToPostalCode")
    protected String shipToPostalCode;
    @XmlElement(name = "ShipToProvince")
    protected String shipToProvince;
    @XmlElement(name = "ShipToState")
    protected String shipToState;
    @XmlElement(name = "ShipToStreetAddress2")
    protected String shipToStreetAddress2;
    @XmlElement(name = "ShipToStreetAddress3")
    protected String shipToStreetAddress3;
    @XmlElement(name = "ShipToCity", required = true)
    protected String shipToCity;
    @XmlElement(name = "ShipToStreetAddress", required = true)
    protected String shipToStreetAddress;
    @XmlElement(name = "AddressName", required = true)
    protected String addressName;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "IsPrimaryMVG")
    protected String isPrimaryMVG;
    @XmlAttribute(name = "operation")
    protected String operation;
    @XmlAttribute(name = "searchspec")
    protected String searchspec;

    /**
     * Gets the value of the shipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCountry() {
        return shipToCountry;
    }

    /**
     * Sets the value of the shipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCountry(String value) {
        this.shipToCountry = value;
    }

    /**
     * Gets the value of the shipToCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCounty() {
        return shipToCounty;
    }

    /**
     * Sets the value of the shipToCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCounty(String value) {
        this.shipToCounty = value;
    }

    /**
     * Gets the value of the shipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToPostalCode() {
        return shipToPostalCode;
    }

    /**
     * Sets the value of the shipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToPostalCode(String value) {
        this.shipToPostalCode = value;
    }

    /**
     * Gets the value of the shipToProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToProvince() {
        return shipToProvince;
    }

    /**
     * Sets the value of the shipToProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToProvince(String value) {
        this.shipToProvince = value;
    }

    /**
     * Gets the value of the shipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToState() {
        return shipToState;
    }

    /**
     * Sets the value of the shipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToState(String value) {
        this.shipToState = value;
    }

    /**
     * Gets the value of the shipToStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToStreetAddress2() {
        return shipToStreetAddress2;
    }

    /**
     * Sets the value of the shipToStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToStreetAddress2(String value) {
        this.shipToStreetAddress2 = value;
    }

    /**
     * Gets the value of the shipToStreetAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToStreetAddress3() {
        return shipToStreetAddress3;
    }

    /**
     * Sets the value of the shipToStreetAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToStreetAddress3(String value) {
        this.shipToStreetAddress3 = value;
    }

    /**
     * Gets the value of the shipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCity() {
        return shipToCity;
    }

    /**
     * Sets the value of the shipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCity(String value) {
        this.shipToCity = value;
    }

    /**
     * Gets the value of the shipToStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToStreetAddress() {
        return shipToStreetAddress;
    }

    /**
     * Sets the value of the shipToStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToStreetAddress(String value) {
        this.shipToStreetAddress = value;
    }

    /**
     * Gets the value of the addressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressName() {
        return addressName;
    }

    /**
     * Sets the value of the addressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressName(String value) {
        this.addressName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the isPrimaryMVG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrimaryMVG() {
        return isPrimaryMVG;
    }

    /**
     * Sets the value of the isPrimaryMVG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrimaryMVG(String value) {
        this.isPrimaryMVG = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the searchspec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchspec() {
        return searchspec;
    }

    /**
     * Sets the value of the searchspec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchspec(String value) {
        this.searchspec = value;
    }

}
