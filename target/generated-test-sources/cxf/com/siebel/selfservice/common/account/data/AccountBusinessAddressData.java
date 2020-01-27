
package com.siebel.selfservice.common.account.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountBusinessAddressData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountBusinessAddressData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressActiveStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Addressee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPointId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSBillingAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TSInstallationAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TSLegalAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TSShippingAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TSApartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSEntrance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSStreetAddress5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSStreetAddress6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSStreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSXCoordinate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSYCoordinate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TSPropertyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSCareOf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSLeftRight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSHDBlockFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TSHDStream" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSSDStream" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSVDSLBlockFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TSFiberStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSAttentionInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IsPrimaryMVG" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountBusinessAddressData", propOrder = {
    "id",
    "created",
    "createdBy",
    "updated",
    "updatedBy",
    "conflictId",
    "modId",
    "addressActiveStatus",
    "addressId",
    "addressIntegrationId",
    "billAddressFlag",
    "city",
    "country",
    "county",
    "emailAddress",
    "faxNumber",
    "mainAddressFlag",
    "phoneNumber",
    "postalCode",
    "province",
    "shipAddressFlag",
    "state",
    "streetAddress",
    "streetAddress2",
    "addressLine3",
    "addressee",
    "tsPointId",
    "tsBillingAddressFlag",
    "tsInstallationAddressFlag",
    "tsLegalAddressFlag",
    "tsShippingAddressFlag",
    "tsApartmentNumber",
    "tsEntrance",
    "tsLocationId",
    "tsStreetAddress5",
    "tsStreetAddress6",
    "tsStreetNumber",
    "tsxCoordinate",
    "tsyCoordinate",
    "tsProperty",
    "effectiveDate",
    "tsPropertyType",
    "type",
    "tsCareOf",
    "tsLeftRight",
    "tshdBlockFlag",
    "tshdStream",
    "tssdStream",
    "tsvdslBlockFlag",
    "tsFiberStatus",
    "tsAttentionInformation",
    "startDate",
    "endDate"
})
public class AccountBusinessAddressData {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Created")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "Updated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updated;
    @XmlElement(name = "UpdatedBy")
    protected String updatedBy;
    @XmlElement(name = "ConflictId")
    protected String conflictId;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "AddressActiveStatus")
    protected Boolean addressActiveStatus;
    @XmlElement(name = "AddressId")
    protected String addressId;
    @XmlElement(name = "AddressIntegrationId")
    protected String addressIntegrationId;
    @XmlElement(name = "BillAddressFlag")
    protected Boolean billAddressFlag;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
    @XmlElement(name = "MainAddressFlag")
    protected Boolean mainAddressFlag;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "Province")
    protected String province;
    @XmlElement(name = "ShipAddressFlag")
    protected Boolean shipAddressFlag;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "StreetAddress")
    protected String streetAddress;
    @XmlElement(name = "StreetAddress2")
    protected String streetAddress2;
    @XmlElement(name = "AddressLine3")
    protected String addressLine3;
    @XmlElement(name = "Addressee")
    protected String addressee;
    @XmlElement(name = "TSPointId")
    protected String tsPointId;
    @XmlElement(name = "TSBillingAddressFlag")
    protected Boolean tsBillingAddressFlag;
    @XmlElement(name = "TSInstallationAddressFlag")
    protected Boolean tsInstallationAddressFlag;
    @XmlElement(name = "TSLegalAddressFlag")
    protected Boolean tsLegalAddressFlag;
    @XmlElement(name = "TSShippingAddressFlag")
    protected Boolean tsShippingAddressFlag;
    @XmlElement(name = "TSApartmentNumber")
    protected String tsApartmentNumber;
    @XmlElement(name = "TSEntrance")
    protected String tsEntrance;
    @XmlElement(name = "TSLocationId")
    protected String tsLocationId;
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
    @XmlElement(name = "TSProperty")
    protected String tsProperty;
    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "TSPropertyType")
    protected String tsPropertyType;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "TSCareOf")
    protected String tsCareOf;
    @XmlElement(name = "TSLeftRight")
    protected String tsLeftRight;
    @XmlElement(name = "TSHDBlockFlag")
    protected Boolean tshdBlockFlag;
    @XmlElement(name = "TSHDStream")
    protected Integer tshdStream;
    @XmlElement(name = "TSSDStream")
    protected Integer tssdStream;
    @XmlElement(name = "TSVDSLBlockFlag")
    protected Boolean tsvdslBlockFlag;
    @XmlElement(name = "TSFiberStatus")
    protected String tsFiberStatus;
    @XmlElement(name = "TSAttentionInformation")
    protected String tsAttentionInformation;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "IsPrimaryMVG")
    protected String isPrimaryMVG;
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
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdated(XMLGregorianCalendar value) {
        this.updated = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflictId(String value) {
        this.conflictId = value;
    }

    /**
     * Gets the value of the modId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModId() {
        return modId;
    }

    /**
     * Sets the value of the modId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModId(String value) {
        this.modId = value;
    }

    /**
     * Gets the value of the addressActiveStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressActiveStatus() {
        return addressActiveStatus;
    }

    /**
     * Sets the value of the addressActiveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressActiveStatus(Boolean value) {
        this.addressActiveStatus = value;
    }

    /**
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressId(String value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the addressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressIntegrationId() {
        return addressIntegrationId;
    }

    /**
     * Sets the value of the addressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressIntegrationId(String value) {
        this.addressIntegrationId = value;
    }

    /**
     * Gets the value of the billAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillAddressFlag() {
        return billAddressFlag;
    }

    /**
     * Sets the value of the billAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillAddressFlag(Boolean value) {
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
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the mainAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMainAddressFlag() {
        return mainAddressFlag;
    }

    /**
     * Sets the value of the mainAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMainAddressFlag(Boolean value) {
        this.mainAddressFlag = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
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
     * Gets the value of the shipAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipAddressFlag() {
        return shipAddressFlag;
    }

    /**
     * Sets the value of the shipAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipAddressFlag(Boolean value) {
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
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressee() {
        return addressee;
    }

    /**
     * Sets the value of the addressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressee(String value) {
        this.addressee = value;
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
     * Gets the value of the tsBillingAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTSBillingAddressFlag() {
        return tsBillingAddressFlag;
    }

    /**
     * Sets the value of the tsBillingAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTSBillingAddressFlag(Boolean value) {
        this.tsBillingAddressFlag = value;
    }

    /**
     * Gets the value of the tsInstallationAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTSInstallationAddressFlag() {
        return tsInstallationAddressFlag;
    }

    /**
     * Sets the value of the tsInstallationAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTSInstallationAddressFlag(Boolean value) {
        this.tsInstallationAddressFlag = value;
    }

    /**
     * Gets the value of the tsLegalAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTSLegalAddressFlag() {
        return tsLegalAddressFlag;
    }

    /**
     * Sets the value of the tsLegalAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTSLegalAddressFlag(Boolean value) {
        this.tsLegalAddressFlag = value;
    }

    /**
     * Gets the value of the tsShippingAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTSShippingAddressFlag() {
        return tsShippingAddressFlag;
    }

    /**
     * Sets the value of the tsShippingAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTSShippingAddressFlag(Boolean value) {
        this.tsShippingAddressFlag = value;
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
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the tsCareOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCareOf() {
        return tsCareOf;
    }

    /**
     * Sets the value of the tsCareOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCareOf(String value) {
        this.tsCareOf = value;
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
     * Gets the value of the tshdBlockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTSHDBlockFlag() {
        return tshdBlockFlag;
    }

    /**
     * Sets the value of the tshdBlockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTSHDBlockFlag(Boolean value) {
        this.tshdBlockFlag = value;
    }

    /**
     * Gets the value of the tshdStream property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTSHDStream() {
        return tshdStream;
    }

    /**
     * Sets the value of the tshdStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTSHDStream(Integer value) {
        this.tshdStream = value;
    }

    /**
     * Gets the value of the tssdStream property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTSSDStream() {
        return tssdStream;
    }

    /**
     * Sets the value of the tssdStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTSSDStream(Integer value) {
        this.tssdStream = value;
    }

    /**
     * Gets the value of the tsvdslBlockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTSVDSLBlockFlag() {
        return tsvdslBlockFlag;
    }

    /**
     * Sets the value of the tsvdslBlockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTSVDSLBlockFlag(Boolean value) {
        this.tsvdslBlockFlag = value;
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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
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

}
