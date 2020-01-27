
package com.siebel.xml.swicustomerpartyio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUTAccount-BillToShipTo_BillToBusinessAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUTAccount-BillToShipTo_BillToBusinessAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToStreetAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillToCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BillToStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CUTAccount-BillToShipTo_BillToBusinessAddress", propOrder = {
    "billToCountry",
    "billToCounty",
    "billToPostalCode",
    "billToProvince",
    "billToState",
    "billToStreetAddress2",
    "billToStreetAddress3",
    "billToCity",
    "billToStreetAddress",
    "id"
})
public class CUTAccountBillToShipToBillToBusinessAddress {

    @XmlElement(name = "BillToCountry")
    protected String billToCountry;
    @XmlElement(name = "BillToCounty")
    protected String billToCounty;
    @XmlElement(name = "BillToPostalCode")
    protected String billToPostalCode;
    @XmlElement(name = "BillToProvince")
    protected String billToProvince;
    @XmlElement(name = "BillToState")
    protected String billToState;
    @XmlElement(name = "BillToStreetAddress2")
    protected String billToStreetAddress2;
    @XmlElement(name = "BillToStreetAddress3")
    protected String billToStreetAddress3;
    @XmlElement(name = "BillToCity", required = true)
    protected String billToCity;
    @XmlElement(name = "BillToStreetAddress", required = true)
    protected String billToStreetAddress;
    @XmlElement(name = "Id")
    protected String id;
    @XmlAttribute(name = "IsPrimaryMVG")
    protected String isPrimaryMVG;
    @XmlAttribute(name = "operation")
    protected String operation;
    @XmlAttribute(name = "searchspec")
    protected String searchspec;

    /**
     * Gets the value of the billToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCountry() {
        return billToCountry;
    }

    /**
     * Sets the value of the billToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCountry(String value) {
        this.billToCountry = value;
    }

    /**
     * Gets the value of the billToCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCounty() {
        return billToCounty;
    }

    /**
     * Sets the value of the billToCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCounty(String value) {
        this.billToCounty = value;
    }

    /**
     * Gets the value of the billToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToPostalCode() {
        return billToPostalCode;
    }

    /**
     * Sets the value of the billToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToPostalCode(String value) {
        this.billToPostalCode = value;
    }

    /**
     * Gets the value of the billToProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToProvince() {
        return billToProvince;
    }

    /**
     * Sets the value of the billToProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToProvince(String value) {
        this.billToProvince = value;
    }

    /**
     * Gets the value of the billToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToState() {
        return billToState;
    }

    /**
     * Sets the value of the billToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToState(String value) {
        this.billToState = value;
    }

    /**
     * Gets the value of the billToStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToStreetAddress2() {
        return billToStreetAddress2;
    }

    /**
     * Sets the value of the billToStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToStreetAddress2(String value) {
        this.billToStreetAddress2 = value;
    }

    /**
     * Gets the value of the billToStreetAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToStreetAddress3() {
        return billToStreetAddress3;
    }

    /**
     * Sets the value of the billToStreetAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToStreetAddress3(String value) {
        this.billToStreetAddress3 = value;
    }

    /**
     * Gets the value of the billToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCity() {
        return billToCity;
    }

    /**
     * Sets the value of the billToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCity(String value) {
        this.billToCity = value;
    }

    /**
     * Gets the value of the billToStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToStreetAddress() {
        return billToStreetAddress;
    }

    /**
     * Sets the value of the billToStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToStreetAddress(String value) {
        this.billToStreetAddress = value;
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
