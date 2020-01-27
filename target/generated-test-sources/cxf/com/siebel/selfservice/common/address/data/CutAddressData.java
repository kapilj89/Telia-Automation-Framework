
package com.siebel.selfservice.common.address.data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CutAddressData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CutAddressData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TSHDBlockFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TSHDStream" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSSDStream" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TSVDSLBlockFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActiveStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Addressee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressNameLockedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Altitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ApartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BrickId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisableDataCleansing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LandlordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LandlordPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MailCodeORG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OccupancyCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PremiseFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="S-SInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UTMEasting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UTMNorthing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSApartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSBillingAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TSPostalFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TSEntrance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSExistingLANAvail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSFMOId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSFiberSmallBusinesses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSFiberVilla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSInstallationAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TSLeftRight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSLegalAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TSLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSMunicipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPointId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPropertyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSShippingAddressFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TSStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSStreetAddress5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSStreetAddress6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSStreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSXCoordinate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSYCoordinate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSAttentionInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSCareOfField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSFiberStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListOfCUTAddress_MVAccount" type="{http://siebel.com/SelfService/Common/Address/Data}ListOfCUTAddress_MVAccountData" minOccurs="0"/&gt;
 *         &lt;element name="ListOfCUTAddress_MVContact" type="{http://siebel.com/SelfService/Common/Address/Data}ListOfCUTAddress_MVContactData" minOccurs="0"/&gt;
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
@XmlType(name = "CutAddressData", propOrder = {
    "tshdBlockFlag",
    "tshdStream",
    "tssdStream",
    "tsvdslBlockFlag",
    "id",
    "created",
    "createdBy",
    "updated",
    "updatedBy",
    "conflictId",
    "modId",
    "accountId",
    "accountLoc",
    "addressLine3",
    "accountName",
    "activeStatus",
    "addressId",
    "addressName",
    "addressee",
    "addressNameLockedFlag",
    "addressType",
    "altitude",
    "apartmentNumber",
    "billAddressFlag",
    "brickId",
    "brickName",
    "city",
    "contactId",
    "country",
    "county",
    "descriptor",
    "disableDataCleansing",
    "emailAddress",
    "faxNumber",
    "integrationId",
    "landlordName",
    "landlordPhoneNumber",
    "latitude",
    "longitude",
    "mailCodeORG",
    "mailTypeCode",
    "mainAddressFlag",
    "occupancyCD",
    "organizationId",
    "parentLocation",
    "phoneNumber",
    "postalCode",
    "premiseFlag",
    "province",
    "ssInstance",
    "shipAddressFlag",
    "startDate",
    "state",
    "streetAddress",
    "streetAddress2",
    "utmEasting",
    "utmNorthing",
    "tsApartmentNumber",
    "tsBillingAddressFlag",
    "tsPostalFlag",
    "tsEntrance",
    "tsExistingLANAvail",
    "tsfmoId",
    "tsFiberSmallBusinesses",
    "tsFiberVilla",
    "tsInstallationAddressFlag",
    "tsLeftRight",
    "tsLegalAddressFlag",
    "tsLocationId",
    "tsMunicipality",
    "tsPointId",
    "tsProperty",
    "tsPropertyType",
    "tsShippingAddressFlag",
    "tsStation",
    "tsStreetAddress5",
    "tsStreetAddress6",
    "tsStreetNumber",
    "tsxCoordinate",
    "tsyCoordinate",
    "tsAttentionInformation",
    "tsCareOfField",
    "tsFiberStatus",
    "listOfCUTAddressMVAccount",
    "listOfCUTAddressMVContact"
})
public class CutAddressData {

    @XmlElement(name = "TSHDBlockFlag")
    protected Boolean tshdBlockFlag;
    @XmlElement(name = "TSHDStream")
    protected Integer tshdStream;
    @XmlElement(name = "TSSDStream")
    protected Integer tssdStream;
    @XmlElement(name = "TSVDSLBlockFlag")
    protected Boolean tsvdslBlockFlag;
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
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "AccountLoc")
    protected String accountLoc;
    @XmlElement(name = "AddressLine3")
    protected String addressLine3;
    @XmlElement(name = "AccountName")
    protected String accountName;
    @XmlElement(name = "ActiveStatus")
    protected Boolean activeStatus;
    @XmlElement(name = "AddressId")
    protected String addressId;
    @XmlElement(name = "AddressName")
    protected String addressName;
    @XmlElement(name = "Addressee")
    protected String addressee;
    @XmlElement(name = "AddressNameLockedFlag")
    protected Boolean addressNameLockedFlag;
    @XmlElement(name = "AddressType")
    protected String addressType;
    @XmlElement(name = "Altitude")
    protected BigDecimal altitude;
    @XmlElement(name = "ApartmentNumber")
    protected String apartmentNumber;
    @XmlElement(name = "BillAddressFlag")
    protected Boolean billAddressFlag;
    @XmlElement(name = "BrickId")
    protected String brickId;
    @XmlElement(name = "BrickName")
    protected String brickName;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "ContactId")
    protected String contactId;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "Descriptor")
    protected String descriptor;
    @XmlElement(name = "DisableDataCleansing")
    protected Boolean disableDataCleansing;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "LandlordName")
    protected String landlordName;
    @XmlElement(name = "LandlordPhoneNumber")
    protected String landlordPhoneNumber;
    @XmlElement(name = "Latitude")
    protected BigDecimal latitude;
    @XmlElement(name = "Longitude")
    protected BigDecimal longitude;
    @XmlElement(name = "MailCodeORG")
    protected String mailCodeORG;
    @XmlElement(name = "MailTypeCode")
    protected String mailTypeCode;
    @XmlElement(name = "MainAddressFlag")
    protected Boolean mainAddressFlag;
    @XmlElement(name = "OccupancyCD")
    protected String occupancyCD;
    @XmlElement(name = "OrganizationId")
    protected String organizationId;
    @XmlElement(name = "ParentLocation")
    protected String parentLocation;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "PremiseFlag")
    protected Boolean premiseFlag;
    @XmlElement(name = "Province")
    protected String province;
    @XmlElement(name = "S-SInstance")
    protected String ssInstance;
    @XmlElement(name = "ShipAddressFlag")
    protected Boolean shipAddressFlag;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "StreetAddress")
    protected String streetAddress;
    @XmlElement(name = "StreetAddress2")
    protected String streetAddress2;
    @XmlElement(name = "UTMEasting")
    protected String utmEasting;
    @XmlElement(name = "UTMNorthing")
    protected String utmNorthing;
    @XmlElement(name = "TSApartmentNumber")
    protected String tsApartmentNumber;
    @XmlElement(name = "TSBillingAddressFlag")
    protected Boolean tsBillingAddressFlag;
    @XmlElement(name = "TSPostalFlag")
    protected Boolean tsPostalFlag;
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
    @XmlElement(name = "TSInstallationAddressFlag")
    protected Boolean tsInstallationAddressFlag;
    @XmlElement(name = "TSLeftRight")
    protected String tsLeftRight;
    @XmlElement(name = "TSLegalAddressFlag")
    protected Boolean tsLegalAddressFlag;
    @XmlElement(name = "TSLocationId")
    protected String tsLocationId;
    @XmlElement(name = "TSMunicipality")
    protected String tsMunicipality;
    @XmlElement(name = "TSPointId")
    protected String tsPointId;
    @XmlElement(name = "TSProperty")
    protected String tsProperty;
    @XmlElement(name = "TSPropertyType")
    protected String tsPropertyType;
    @XmlElement(name = "TSShippingAddressFlag")
    protected Boolean tsShippingAddressFlag;
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
    @XmlElement(name = "ListOfCUTAddress_MVAccount")
    protected ListOfCUTAddressMVAccountData listOfCUTAddressMVAccount;
    @XmlElement(name = "ListOfCUTAddress_MVContact")
    protected ListOfCUTAddressMVContactData listOfCUTAddressMVContact;
    @XmlAttribute(name = "operation")
    protected String operation;

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
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLoc() {
        return accountLoc;
    }

    /**
     * Sets the value of the accountLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLoc(String value) {
        this.accountLoc = value;
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
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the activeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveStatus() {
        return activeStatus;
    }

    /**
     * Sets the value of the activeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveStatus(Boolean value) {
        this.activeStatus = value;
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
     * Gets the value of the addressNameLockedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressNameLockedFlag() {
        return addressNameLockedFlag;
    }

    /**
     * Sets the value of the addressNameLockedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressNameLockedFlag(Boolean value) {
        this.addressNameLockedFlag = value;
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
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAltitude(BigDecimal value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the apartmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * Sets the value of the apartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentNumber(String value) {
        this.apartmentNumber = value;
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
     * Gets the value of the brickId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrickId() {
        return brickId;
    }

    /**
     * Sets the value of the brickId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrickId(String value) {
        this.brickId = value;
    }

    /**
     * Gets the value of the brickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrickName() {
        return brickName;
    }

    /**
     * Sets the value of the brickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrickName(String value) {
        this.brickName = value;
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
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
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
     * Gets the value of the descriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptor() {
        return descriptor;
    }

    /**
     * Sets the value of the descriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptor(String value) {
        this.descriptor = value;
    }

    /**
     * Gets the value of the disableDataCleansing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableDataCleansing() {
        return disableDataCleansing;
    }

    /**
     * Sets the value of the disableDataCleansing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableDataCleansing(Boolean value) {
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
     * Gets the value of the landlordName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandlordName() {
        return landlordName;
    }

    /**
     * Sets the value of the landlordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandlordName(String value) {
        this.landlordName = value;
    }

    /**
     * Gets the value of the landlordPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandlordPhoneNumber() {
        return landlordPhoneNumber;
    }

    /**
     * Sets the value of the landlordPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandlordPhoneNumber(String value) {
        this.landlordPhoneNumber = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the mailCodeORG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailCodeORG() {
        return mailCodeORG;
    }

    /**
     * Sets the value of the mailCodeORG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailCodeORG(String value) {
        this.mailCodeORG = value;
    }

    /**
     * Gets the value of the mailTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailTypeCode() {
        return mailTypeCode;
    }

    /**
     * Sets the value of the mailTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailTypeCode(String value) {
        this.mailTypeCode = value;
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
     * Gets the value of the occupancyCD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupancyCD() {
        return occupancyCD;
    }

    /**
     * Sets the value of the occupancyCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupancyCD(String value) {
        this.occupancyCD = value;
    }

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the parentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentLocation() {
        return parentLocation;
    }

    /**
     * Sets the value of the parentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentLocation(String value) {
        this.parentLocation = value;
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
     * Gets the value of the premiseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPremiseFlag() {
        return premiseFlag;
    }

    /**
     * Sets the value of the premiseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPremiseFlag(Boolean value) {
        this.premiseFlag = value;
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
     * Gets the value of the ssInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSInstance() {
        return ssInstance;
    }

    /**
     * Sets the value of the ssInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSInstance(String value) {
        this.ssInstance = value;
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
     * Gets the value of the utmEasting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTMEasting() {
        return utmEasting;
    }

    /**
     * Sets the value of the utmEasting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTMEasting(String value) {
        this.utmEasting = value;
    }

    /**
     * Gets the value of the utmNorthing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTMNorthing() {
        return utmNorthing;
    }

    /**
     * Sets the value of the utmNorthing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTMNorthing(String value) {
        this.utmNorthing = value;
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
     * Gets the value of the tsPostalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTSPostalFlag() {
        return tsPostalFlag;
    }

    /**
     * Sets the value of the tsPostalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTSPostalFlag(Boolean value) {
        this.tsPostalFlag = value;
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
     * Gets the value of the listOfCUTAddressMVAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCUTAddressMVAccountData }
     *     
     */
    public ListOfCUTAddressMVAccountData getListOfCUTAddressMVAccount() {
        return listOfCUTAddressMVAccount;
    }

    /**
     * Sets the value of the listOfCUTAddressMVAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCUTAddressMVAccountData }
     *     
     */
    public void setListOfCUTAddressMVAccount(ListOfCUTAddressMVAccountData value) {
        this.listOfCUTAddressMVAccount = value;
    }

    /**
     * Gets the value of the listOfCUTAddressMVContact property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCUTAddressMVContactData }
     *     
     */
    public ListOfCUTAddressMVContactData getListOfCUTAddressMVContact() {
        return listOfCUTAddressMVContact;
    }

    /**
     * Sets the value of the listOfCUTAddressMVContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCUTAddressMVContactData }
     *     
     */
    public void setListOfCUTAddressMVContact(ListOfCUTAddressMVContactData value) {
        this.listOfCUTAddressMVContact = value;
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
