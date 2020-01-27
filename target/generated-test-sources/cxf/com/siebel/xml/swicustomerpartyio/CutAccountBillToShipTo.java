
package com.siebel.xml.swicustomerpartyio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CutAccount-BillToShipTo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CutAccount-BillToShipTo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HomePage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastModified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainFaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryBillToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AIAIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListOfCUTAccount-BillToShipTo_BillToBusinessAddress" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfCUTAccount-BillToShipTo_BillToBusinessAddress" minOccurs="0"/&gt;
 *         &lt;element name="ListOfCUTAccount-BillToShipTo_ShipToBusinessAddress" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfCUTAccount-BillToShipTo_ShipToBusinessAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
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
@XmlType(name = "CutAccount-BillToShipTo", propOrder = {
    "id",
    "description",
    "homePage",
    "lastModified",
    "ssn",
    "mainFaxNumber",
    "mainPhoneNumber",
    "parentAccountId",
    "primaryAddressId",
    "primaryBillToAddressId",
    "primaryShipToAddressId",
    "region",
    "rowId",
    "name2",
    "aiaIntegrationId",
    "listOfCUTAccountBillToShipToBillToBusinessAddress",
    "listOfCUTAccountBillToShipToShipToBusinessAddress"
})
public class CutAccountBillToShipTo {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "HomePage")
    protected String homePage;
    @XmlElement(name = "LastModified")
    protected String lastModified;
    @XmlElement(name = "SSN")
    protected String ssn;
    @XmlElement(name = "MainFaxNumber")
    protected String mainFaxNumber;
    @XmlElement(name = "MainPhoneNumber")
    protected String mainPhoneNumber;
    @XmlElement(name = "ParentAccountId")
    protected String parentAccountId;
    @XmlElement(name = "PrimaryAddressId")
    protected String primaryAddressId;
    @XmlElement(name = "PrimaryBillToAddressId")
    protected String primaryBillToAddressId;
    @XmlElement(name = "PrimaryShipToAddressId")
    protected String primaryShipToAddressId;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "RowId")
    protected String rowId;
    @XmlElement(name = "Name2", required = true)
    protected String name2;
    @XmlElement(name = "AIAIntegrationId")
    protected String aiaIntegrationId;
    @XmlElement(name = "ListOfCUTAccount-BillToShipTo_BillToBusinessAddress")
    protected ListOfCUTAccountBillToShipToBillToBusinessAddress listOfCUTAccountBillToShipToBillToBusinessAddress;
    @XmlElement(name = "ListOfCUTAccount-BillToShipTo_ShipToBusinessAddress")
    protected ListOfCUTAccountBillToShipToShipToBusinessAddress listOfCUTAccountBillToShipToShipToBusinessAddress;
    @XmlAttribute(name = "operation")
    protected String operation;
    @XmlAttribute(name = "searchspec")
    protected String searchspec;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the homePage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePage() {
        return homePage;
    }

    /**
     * Sets the value of the homePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePage(String value) {
        this.homePage = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModified(String value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the mainFaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainFaxNumber() {
        return mainFaxNumber;
    }

    /**
     * Sets the value of the mainFaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainFaxNumber(String value) {
        this.mainFaxNumber = value;
    }

    /**
     * Gets the value of the mainPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainPhoneNumber() {
        return mainPhoneNumber;
    }

    /**
     * Sets the value of the mainPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainPhoneNumber(String value) {
        this.mainPhoneNumber = value;
    }

    /**
     * Gets the value of the parentAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAccountId() {
        return parentAccountId;
    }

    /**
     * Sets the value of the parentAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAccountId(String value) {
        this.parentAccountId = value;
    }

    /**
     * Gets the value of the primaryAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressId() {
        return primaryAddressId;
    }

    /**
     * Sets the value of the primaryAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressId(String value) {
        this.primaryAddressId = value;
    }

    /**
     * Gets the value of the primaryBillToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToAddressId() {
        return primaryBillToAddressId;
    }

    /**
     * Sets the value of the primaryBillToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToAddressId(String value) {
        this.primaryBillToAddressId = value;
    }

    /**
     * Gets the value of the primaryShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToAddressId() {
        return primaryShipToAddressId;
    }

    /**
     * Sets the value of the primaryShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToAddressId(String value) {
        this.primaryShipToAddressId = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the rowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowId(String value) {
        this.rowId = value;
    }

    /**
     * Gets the value of the name2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2() {
        return name2;
    }

    /**
     * Sets the value of the name2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName2(String value) {
        this.name2 = value;
    }

    /**
     * Gets the value of the aiaIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIAIntegrationId() {
        return aiaIntegrationId;
    }

    /**
     * Sets the value of the aiaIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIAIntegrationId(String value) {
        this.aiaIntegrationId = value;
    }

    /**
     * Gets the value of the listOfCUTAccountBillToShipToBillToBusinessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCUTAccountBillToShipToBillToBusinessAddress }
     *     
     */
    public ListOfCUTAccountBillToShipToBillToBusinessAddress getListOfCUTAccountBillToShipToBillToBusinessAddress() {
        return listOfCUTAccountBillToShipToBillToBusinessAddress;
    }

    /**
     * Sets the value of the listOfCUTAccountBillToShipToBillToBusinessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCUTAccountBillToShipToBillToBusinessAddress }
     *     
     */
    public void setListOfCUTAccountBillToShipToBillToBusinessAddress(ListOfCUTAccountBillToShipToBillToBusinessAddress value) {
        this.listOfCUTAccountBillToShipToBillToBusinessAddress = value;
    }

    /**
     * Gets the value of the listOfCUTAccountBillToShipToShipToBusinessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCUTAccountBillToShipToShipToBusinessAddress }
     *     
     */
    public ListOfCUTAccountBillToShipToShipToBusinessAddress getListOfCUTAccountBillToShipToShipToBusinessAddress() {
        return listOfCUTAccountBillToShipToShipToBusinessAddress;
    }

    /**
     * Sets the value of the listOfCUTAccountBillToShipToShipToBusinessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCUTAccountBillToShipToShipToBusinessAddress }
     *     
     */
    public void setListOfCUTAccountBillToShipToShipToBusinessAddress(ListOfCUTAccountBillToShipToShipToBusinessAddress value) {
        this.listOfCUTAccountBillToShipToShipToBusinessAddress = value;
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
