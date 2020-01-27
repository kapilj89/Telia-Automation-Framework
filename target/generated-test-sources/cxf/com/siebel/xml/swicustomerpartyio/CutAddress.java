
package com.siebel.xml.swicustomerpartyio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CutAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CutAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillAddressFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisableDataCleansing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainAddressFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipAddressFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AIAIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPointId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSShippingAddressFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSInstallationAddressFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSBillingAddressFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSLegalAddressFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSBillingAddressVisibilityFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSApartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSEntrance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSExistingLANAvail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSFMOId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSFiberSmallBusinesses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSFiberVilla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSLeftRight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSMunicipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPropertyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSStreetAddress5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSStreetAddress6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSStreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSXCoordinate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSYCoordinate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSAttentionInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSCareOfField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSFiberStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSHDStream" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSSDStream" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSHDBlockFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSVDSLBlockFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSMDURefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CutAddress", propOrder = {
    "id",
    "addressName",
    "addressType",
    "billAddressFlag",
    "city",
    "country",
    "county",
    "disableDataCleansing",
    "emailAddress",
    "integrationId",
    "endDate",
    "mainAddressFlag",
    "postalCode",
    "province",
    "rowId",
    "shipAddressFlag",
    "state",
    "streetAddress",
    "startDate",
    "streetAddress2",
    "aiaIntegrationId",
    "tsPointId",
    "tsShippingAddressFlag",
    "tsInstallationAddressFlag",
    "tsBillingAddressFlag",
    "tsLegalAddressFlag",
    "tsBillingAddressVisibilityFlag",
    "tsApartmentNumber",
    "tsEntrance",
    "tsExistingLANAvail",
    "tsfmoId",
    "tsFiberSmallBusinesses",
    "tsFiberVilla",
    "tsLeftRight",
    "tsLocationId",
    "tsMunicipality",
    "tsProperty",
    "tsPropertyType",
    "tsStation",
    "tsStreetAddress5",
    "tsStreetAddress6",
    "tsStreetNumber",
    "tsxCoordinate",
    "tsyCoordinate",
    "tsAttentionInformation",
    "tsCareOfField",
    "tsFiberStatus",
    "tshdStream",
    "tssdStream",
    "tshdBlockFlag",
    "tsvdslBlockFlag",
    "tsmduRefNumber"
})
public class CutAddress {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "AddressName", required = true)
    protected String addressName;
    @XmlElement(name = "AddressType")
    protected String addressType;
    @XmlElement(name = "BillAddressFlag")
    protected String billAddressFlag;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "DisableDataCleansing")
    protected String disableDataCleansing;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "MainAddressFlag")
    protected String mainAddressFlag;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "Province")
    protected String province;
    @XmlElement(name = "RowId")
    protected String rowId;
    @XmlElement(name = "ShipAddressFlag")
    protected String shipAddressFlag;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "StreetAddress", required = true)
    protected String streetAddress;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "StreetAddress2")
    protected String streetAddress2;
    @XmlElement(name = "AIAIntegrationId")
    protected String aiaIntegrationId;
    @XmlElement(name = "TSPointId")
    protected String tsPointId;
    @XmlElement(name = "TSShippingAddressFlag")
    protected String tsShippingAddressFlag;
    @XmlElement(name = "TSInstallationAddressFlag")
    protected String tsInstallationAddressFlag;
    @XmlElement(name = "TSBillingAddressFlag")
    protected String tsBillingAddressFlag;
    @XmlElement(name = "TSLegalAddressFlag")
    protected String tsLegalAddressFlag;
    @XmlElement(name = "TSBillingAddressVisibilityFlag")
    protected String tsBillingAddressVisibilityFlag;
    @XmlElement(name = "TSApartmentNumber")
    protected String tsApartmentNumber;
    @XmlElement(name = "TSEntrance")
    protected String tsEntrance;
    @XmlElement(name = "TSExistingLANAvail")
    protected String tsExistingLANAvail;
    @XmlElement(name = "TSFMOId")
    protected String tsfmoId;
    @XmlElement(name = "TSFiberSmallBusinesses")
    protected String tsFiberSmallBusinesses;
    @XmlElement(name = "TSFiberVilla")
    protected String tsFiberVilla;
    @XmlElement(name = "TSLeftRight")
    protected String tsLeftRight;
    @XmlElement(name = "TSLocationId")
    protected String tsLocationId;
    @XmlElement(name = "TSMunicipality")
    protected String tsMunicipality;
    @XmlElement(name = "TSProperty")
    protected String tsProperty;
    @XmlElement(name = "TSPropertyType")
    protected String tsPropertyType;
    @XmlElement(name = "TSStation")
    protected String tsStation;
    @XmlElement(name = "TSStreetAddress5")
    protected String tsStreetAddress5;
    @XmlElement(name = "TSStreetAddress6")
    protected String tsStreetAddress6;
    @XmlElement(name = "TSStreetNumber")
    protected String tsStreetNumber;
    @XmlElement(name = "TSXCoordinate")
    protected String tsxCoordinate;
    @XmlElement(name = "TSYCoordinate")
    protected String tsyCoordinate;
    @XmlElement(name = "TSAttentionInformation")
    protected String tsAttentionInformation;
    @XmlElement(name = "TSCareOfField")
    protected String tsCareOfField;
    @XmlElement(name = "TSFiberStatus")
    protected String tsFiberStatus;
    @XmlElement(name = "TSHDStream")
    protected String tshdStream;
    @XmlElement(name = "TSSDStream")
    protected String tssdStream;
    @XmlElement(name = "TSHDBlockFlag")
    protected String tshdBlockFlag;
    @XmlElement(name = "TSVDSLBlockFlag")
    protected String tsvdslBlockFlag;
    @XmlElement(name = "TSMDURefNumber")
    protected String tsmduRefNumber;
    @XmlAttribute(name = "operation")
    protected String operation;

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
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the billAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAddressFlag() {
        return billAddressFlag;
    }

    /**
     * Sets the value of the billAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAddressFlag(String value) {
        this.billAddressFlag = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the disableDataCleansing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisableDataCleansing() {
        return disableDataCleansing;
    }

    /**
     * Sets the value of the disableDataCleansing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisableDataCleansing(String value) {
        this.disableDataCleansing = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationId(String value) {
        this.integrationId = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the mainAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainAddressFlag() {
        return mainAddressFlag;
    }

    /**
     * Sets the value of the mainAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainAddressFlag(String value) {
        this.mainAddressFlag = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
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
     * Gets the value of the shipAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAddressFlag() {
        return shipAddressFlag;
    }

    /**
     * Sets the value of the shipAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAddressFlag(String value) {
        this.shipAddressFlag = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress(String value) {
        this.streetAddress = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the streetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress2() {
        return streetAddress2;
    }

    /**
     * Sets the value of the streetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress2(String value) {
        this.streetAddress2 = value;
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
     * Gets the value of the tsPointId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPointId() {
        return tsPointId;
    }

    /**
     * Sets the value of the tsPointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPointId(String value) {
        this.tsPointId = value;
    }

    /**
     * Gets the value of the tsShippingAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSShippingAddressFlag() {
        return tsShippingAddressFlag;
    }

    /**
     * Sets the value of the tsShippingAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSShippingAddressFlag(String value) {
        this.tsShippingAddressFlag = value;
    }

    /**
     * Gets the value of the tsInstallationAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSInstallationAddressFlag() {
        return tsInstallationAddressFlag;
    }

    /**
     * Sets the value of the tsInstallationAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSInstallationAddressFlag(String value) {
        this.tsInstallationAddressFlag = value;
    }

    /**
     * Gets the value of the tsBillingAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSBillingAddressFlag() {
        return tsBillingAddressFlag;
    }

    /**
     * Sets the value of the tsBillingAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSBillingAddressFlag(String value) {
        this.tsBillingAddressFlag = value;
    }

    /**
     * Gets the value of the tsLegalAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLegalAddressFlag() {
        return tsLegalAddressFlag;
    }

    /**
     * Sets the value of the tsLegalAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLegalAddressFlag(String value) {
        this.tsLegalAddressFlag = value;
    }

    /**
     * Gets the value of the tsBillingAddressVisibilityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSBillingAddressVisibilityFlag() {
        return tsBillingAddressVisibilityFlag;
    }

    /**
     * Sets the value of the tsBillingAddressVisibilityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSBillingAddressVisibilityFlag(String value) {
        this.tsBillingAddressVisibilityFlag = value;
    }

    /**
     * Gets the value of the tsApartmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSApartmentNumber() {
        return tsApartmentNumber;
    }

    /**
     * Sets the value of the tsApartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSApartmentNumber(String value) {
        this.tsApartmentNumber = value;
    }

    /**
     * Gets the value of the tsEntrance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSEntrance() {
        return tsEntrance;
    }

    /**
     * Sets the value of the tsEntrance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSEntrance(String value) {
        this.tsEntrance = value;
    }

    /**
     * Gets the value of the tsExistingLANAvail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSExistingLANAvail() {
        return tsExistingLANAvail;
    }

    /**
     * Sets the value of the tsExistingLANAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSExistingLANAvail(String value) {
        this.tsExistingLANAvail = value;
    }

    /**
     * Gets the value of the tsfmoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSFMOId() {
        return tsfmoId;
    }

    /**
     * Sets the value of the tsfmoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSFMOId(String value) {
        this.tsfmoId = value;
    }

    /**
     * Gets the value of the tsFiberSmallBusinesses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSFiberSmallBusinesses() {
        return tsFiberSmallBusinesses;
    }

    /**
     * Sets the value of the tsFiberSmallBusinesses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSFiberSmallBusinesses(String value) {
        this.tsFiberSmallBusinesses = value;
    }

    /**
     * Gets the value of the tsFiberVilla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSFiberVilla() {
        return tsFiberVilla;
    }

    /**
     * Sets the value of the tsFiberVilla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSFiberVilla(String value) {
        this.tsFiberVilla = value;
    }

    /**
     * Gets the value of the tsLeftRight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLeftRight() {
        return tsLeftRight;
    }

    /**
     * Sets the value of the tsLeftRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLeftRight(String value) {
        this.tsLeftRight = value;
    }

    /**
     * Gets the value of the tsLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLocationId() {
        return tsLocationId;
    }

    /**
     * Sets the value of the tsLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLocationId(String value) {
        this.tsLocationId = value;
    }

    /**
     * Gets the value of the tsMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSMunicipality() {
        return tsMunicipality;
    }

    /**
     * Sets the value of the tsMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSMunicipality(String value) {
        this.tsMunicipality = value;
    }

    /**
     * Gets the value of the tsProperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSProperty() {
        return tsProperty;
    }

    /**
     * Sets the value of the tsProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSProperty(String value) {
        this.tsProperty = value;
    }

    /**
     * Gets the value of the tsPropertyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPropertyType() {
        return tsPropertyType;
    }

    /**
     * Sets the value of the tsPropertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPropertyType(String value) {
        this.tsPropertyType = value;
    }

    /**
     * Gets the value of the tsStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSStation() {
        return tsStation;
    }

    /**
     * Sets the value of the tsStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSStation(String value) {
        this.tsStation = value;
    }

    /**
     * Gets the value of the tsStreetAddress5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSStreetAddress5() {
        return tsStreetAddress5;
    }

    /**
     * Sets the value of the tsStreetAddress5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSStreetAddress5(String value) {
        this.tsStreetAddress5 = value;
    }

    /**
     * Gets the value of the tsStreetAddress6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSStreetAddress6() {
        return tsStreetAddress6;
    }

    /**
     * Sets the value of the tsStreetAddress6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSStreetAddress6(String value) {
        this.tsStreetAddress6 = value;
    }

    /**
     * Gets the value of the tsStreetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSStreetNumber() {
        return tsStreetNumber;
    }

    /**
     * Sets the value of the tsStreetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSStreetNumber(String value) {
        this.tsStreetNumber = value;
    }

    /**
     * Gets the value of the tsxCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSXCoordinate() {
        return tsxCoordinate;
    }

    /**
     * Sets the value of the tsxCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSXCoordinate(String value) {
        this.tsxCoordinate = value;
    }

    /**
     * Gets the value of the tsyCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSYCoordinate() {
        return tsyCoordinate;
    }

    /**
     * Sets the value of the tsyCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSYCoordinate(String value) {
        this.tsyCoordinate = value;
    }

    /**
     * Gets the value of the tsAttentionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSAttentionInformation() {
        return tsAttentionInformation;
    }

    /**
     * Sets the value of the tsAttentionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSAttentionInformation(String value) {
        this.tsAttentionInformation = value;
    }

    /**
     * Gets the value of the tsCareOfField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCareOfField() {
        return tsCareOfField;
    }

    /**
     * Sets the value of the tsCareOfField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCareOfField(String value) {
        this.tsCareOfField = value;
    }

    /**
     * Gets the value of the tsFiberStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSFiberStatus() {
        return tsFiberStatus;
    }

    /**
     * Sets the value of the tsFiberStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSFiberStatus(String value) {
        this.tsFiberStatus = value;
    }

    /**
     * Gets the value of the tshdStream property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSHDStream() {
        return tshdStream;
    }

    /**
     * Sets the value of the tshdStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSHDStream(String value) {
        this.tshdStream = value;
    }

    /**
     * Gets the value of the tssdStream property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSDStream() {
        return tssdStream;
    }

    /**
     * Sets the value of the tssdStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSDStream(String value) {
        this.tssdStream = value;
    }

    /**
     * Gets the value of the tshdBlockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSHDBlockFlag() {
        return tshdBlockFlag;
    }

    /**
     * Sets the value of the tshdBlockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSHDBlockFlag(String value) {
        this.tshdBlockFlag = value;
    }

    /**
     * Gets the value of the tsvdslBlockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSVDSLBlockFlag() {
        return tsvdslBlockFlag;
    }

    /**
     * Sets the value of the tsvdslBlockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSVDSLBlockFlag(String value) {
        this.tsvdslBlockFlag = value;
    }

    /**
     * Gets the value of the tsmduRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSMDURefNumber() {
        return tsmduRefNumber;
    }

    /**
     * Sets the value of the tsmduRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSMDURefNumber(String value) {
        this.tsmduRefNumber = value;
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

}
