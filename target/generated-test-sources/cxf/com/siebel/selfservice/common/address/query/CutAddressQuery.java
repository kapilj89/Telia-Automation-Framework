
package com.siebel.selfservice.common.address.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CutAddressQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CutAddressQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TSHDBlockFlag" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSHDStream" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSSDStream" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSVDSLBlockFlag" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Created" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Updated" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedBy" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ConflictId" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ModId" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AccountLoc" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine3" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AccountName" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ActiveStatus" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AddressId" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AddressName" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Addressee" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AddressNameLockedFlag" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AddressType" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Altitude" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ApartmentNumber" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="BillAddressFlag" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="BrickId" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="BrickName" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ContactId" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="County" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Descriptor" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="DisableDataCleansing" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="FaxNumber" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="LandlordName" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="LandlordPhoneNumber" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Longitude" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="MailCodeORG" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="MailTypeCode" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="MainAddressFlag" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="OccupancyCD" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationId" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ParentLocation" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="PremiseFlag" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Province" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="S-SInstance" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ShipAddressFlag" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddress" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddress2" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="UTMEasting" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="UTMNorthing" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSApartmentNumber" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSBillingAddressFlag" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSPostalFlag" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSEntrance" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSExistingLANAvail" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSFMOId" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSFiberSmallBusinesses" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSFiberVilla" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSInstallationAddressFlag" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSLeftRight" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSLegalAddressFlag" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSLocationId" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSMunicipality" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSPointId" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSProperty" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSPropertyType" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSShippingAddressFlag" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSStation" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSStreetAddress5" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSStreetAddress6" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSStreetNumber" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSXCoordinate" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSYCoordinate" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSAttentionInformation" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSCareOfField" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSFiberStatus" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ListOfCUTAddress_MVAccount" type="{http://siebel.com/SelfService/Common/Address/Query}ListOfCUTAddress_MVAccountQuery" minOccurs="0"/&gt;
 *         &lt;element name="ListOfCUTAddress_MVContact" type="{http://siebel.com/SelfService/Common/Address/Query}ListOfCUTAddress_MVContactQuery" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="searchspec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CutAddressQuery", propOrder = {
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
public class CutAddressQuery {

    @XmlElement(name = "TSHDBlockFlag")
    protected QueryType tshdBlockFlag;
    @XmlElement(name = "TSHDStream")
    protected QueryType tshdStream;
    @XmlElement(name = "TSSDStream")
    protected QueryType tssdStream;
    @XmlElement(name = "TSVDSLBlockFlag")
    protected QueryType tsvdslBlockFlag;
    @XmlElement(name = "Id")
    protected QueryType id;
    @XmlElement(name = "Created")
    protected QueryType created;
    @XmlElement(name = "CreatedBy")
    protected QueryType createdBy;
    @XmlElement(name = "Updated")
    protected QueryType updated;
    @XmlElement(name = "UpdatedBy")
    protected QueryType updatedBy;
    @XmlElement(name = "ConflictId")
    protected QueryType conflictId;
    @XmlElement(name = "ModId")
    protected QueryType modId;
    @XmlElement(name = "AccountId")
    protected QueryType accountId;
    @XmlElement(name = "AccountLoc")
    protected QueryType accountLoc;
    @XmlElement(name = "AddressLine3")
    protected QueryType addressLine3;
    @XmlElement(name = "AccountName")
    protected QueryType accountName;
    @XmlElement(name = "ActiveStatus")
    protected QueryType activeStatus;
    @XmlElement(name = "AddressId")
    protected QueryType addressId;
    @XmlElement(name = "AddressName")
    protected QueryType addressName;
    @XmlElement(name = "Addressee")
    protected QueryType addressee;
    @XmlElement(name = "AddressNameLockedFlag")
    protected QueryType addressNameLockedFlag;
    @XmlElement(name = "AddressType")
    protected QueryType addressType;
    @XmlElement(name = "Altitude")
    protected QueryType altitude;
    @XmlElement(name = "ApartmentNumber")
    protected QueryType apartmentNumber;
    @XmlElement(name = "BillAddressFlag")
    protected QueryType billAddressFlag;
    @XmlElement(name = "BrickId")
    protected QueryType brickId;
    @XmlElement(name = "BrickName")
    protected QueryType brickName;
    @XmlElement(name = "City")
    protected QueryType city;
    @XmlElement(name = "ContactId")
    protected QueryType contactId;
    @XmlElement(name = "Country")
    protected QueryType country;
    @XmlElement(name = "County")
    protected QueryType county;
    @XmlElement(name = "Descriptor")
    protected QueryType descriptor;
    @XmlElement(name = "DisableDataCleansing")
    protected QueryType disableDataCleansing;
    @XmlElement(name = "EmailAddress")
    protected QueryType emailAddress;
    @XmlElement(name = "FaxNumber")
    protected QueryType faxNumber;
    @XmlElement(name = "IntegrationId")
    protected QueryType integrationId;
    @XmlElement(name = "LandlordName")
    protected QueryType landlordName;
    @XmlElement(name = "LandlordPhoneNumber")
    protected QueryType landlordPhoneNumber;
    @XmlElement(name = "Latitude")
    protected QueryType latitude;
    @XmlElement(name = "Longitude")
    protected QueryType longitude;
    @XmlElement(name = "MailCodeORG")
    protected QueryType mailCodeORG;
    @XmlElement(name = "MailTypeCode")
    protected QueryType mailTypeCode;
    @XmlElement(name = "MainAddressFlag")
    protected QueryType mainAddressFlag;
    @XmlElement(name = "OccupancyCD")
    protected QueryType occupancyCD;
    @XmlElement(name = "OrganizationId")
    protected QueryType organizationId;
    @XmlElement(name = "ParentLocation")
    protected QueryType parentLocation;
    @XmlElement(name = "PhoneNumber")
    protected QueryType phoneNumber;
    @XmlElement(name = "PostalCode")
    protected QueryType postalCode;
    @XmlElement(name = "PremiseFlag")
    protected QueryType premiseFlag;
    @XmlElement(name = "Province")
    protected QueryType province;
    @XmlElement(name = "S-SInstance")
    protected QueryType ssInstance;
    @XmlElement(name = "ShipAddressFlag")
    protected QueryType shipAddressFlag;
    @XmlElement(name = "StartDate")
    protected QueryType startDate;
    @XmlElement(name = "State")
    protected QueryType state;
    @XmlElement(name = "StreetAddress")
    protected QueryType streetAddress;
    @XmlElement(name = "StreetAddress2")
    protected QueryType streetAddress2;
    @XmlElement(name = "UTMEasting")
    protected QueryType utmEasting;
    @XmlElement(name = "UTMNorthing")
    protected QueryType utmNorthing;
    @XmlElement(name = "TSApartmentNumber")
    protected QueryType tsApartmentNumber;
    @XmlElement(name = "TSBillingAddressFlag")
    protected QueryType tsBillingAddressFlag;
    @XmlElement(name = "TSPostalFlag")
    protected QueryType tsPostalFlag;
    @XmlElement(name = "TSEntrance")
    protected QueryType tsEntrance;
    @XmlElement(name = "TSExistingLANAvail")
    protected QueryType tsExistingLANAvail;
    @XmlElement(name = "TSFMOId")
    protected QueryType tsfmoId;
    @XmlElement(name = "TSFiberSmallBusinesses")
    protected QueryType tsFiberSmallBusinesses;
    @XmlElement(name = "TSFiberVilla")
    protected QueryType tsFiberVilla;
    @XmlElement(name = "TSInstallationAddressFlag")
    protected QueryType tsInstallationAddressFlag;
    @XmlElement(name = "TSLeftRight")
    protected QueryType tsLeftRight;
    @XmlElement(name = "TSLegalAddressFlag")
    protected QueryType tsLegalAddressFlag;
    @XmlElement(name = "TSLocationId")
    protected QueryType tsLocationId;
    @XmlElement(name = "TSMunicipality")
    protected QueryType tsMunicipality;
    @XmlElement(name = "TSPointId")
    protected QueryType tsPointId;
    @XmlElement(name = "TSProperty")
    protected QueryType tsProperty;
    @XmlElement(name = "TSPropertyType")
    protected QueryType tsPropertyType;
    @XmlElement(name = "TSShippingAddressFlag")
    protected QueryType tsShippingAddressFlag;
    @XmlElement(name = "TSStation")
    protected QueryType tsStation;
    @XmlElement(name = "TSStreetAddress5")
    protected QueryType tsStreetAddress5;
    @XmlElement(name = "TSStreetAddress6")
    protected QueryType tsStreetAddress6;
    @XmlElement(name = "TSStreetNumber")
    protected QueryType tsStreetNumber;
    @XmlElement(name = "TSXCoordinate")
    protected QueryType tsxCoordinate;
    @XmlElement(name = "TSYCoordinate")
    protected QueryType tsyCoordinate;
    @XmlElement(name = "TSAttentionInformation")
    protected QueryType tsAttentionInformation;
    @XmlElement(name = "TSCareOfField")
    protected QueryType tsCareOfField;
    @XmlElement(name = "TSFiberStatus")
    protected QueryType tsFiberStatus;
    @XmlElement(name = "ListOfCUTAddress_MVAccount")
    protected ListOfCUTAddressMVAccountQuery listOfCUTAddressMVAccount;
    @XmlElement(name = "ListOfCUTAddress_MVContact")
    protected ListOfCUTAddressMVContactQuery listOfCUTAddressMVContact;
    @XmlAttribute(name = "searchspec")
    protected String searchspec;

    /**
     * Gets the value of the tshdBlockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSHDBlockFlag() {
        return tshdBlockFlag;
    }

    /**
     * Sets the value of the tshdBlockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSHDBlockFlag(QueryType value) {
        this.tshdBlockFlag = value;
    }

    /**
     * Gets the value of the tshdStream property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSHDStream() {
        return tshdStream;
    }

    /**
     * Sets the value of the tshdStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSHDStream(QueryType value) {
        this.tshdStream = value;
    }

    /**
     * Gets the value of the tssdStream property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSSDStream() {
        return tssdStream;
    }

    /**
     * Sets the value of the tssdStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSSDStream(QueryType value) {
        this.tssdStream = value;
    }

    /**
     * Gets the value of the tsvdslBlockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSVDSLBlockFlag() {
        return tsvdslBlockFlag;
    }

    /**
     * Sets the value of the tsvdslBlockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSVDSLBlockFlag(QueryType value) {
        this.tsvdslBlockFlag = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setId(QueryType value) {
        this.id = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreated(QueryType value) {
        this.created = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreatedBy(QueryType value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUpdated(QueryType value) {
        this.updated = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUpdatedBy(QueryType value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setConflictId(QueryType value) {
        this.conflictId = value;
    }

    /**
     * Gets the value of the modId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getModId() {
        return modId;
    }

    /**
     * Sets the value of the modId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setModId(QueryType value) {
        this.modId = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountId(QueryType value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountLoc property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountLoc() {
        return accountLoc;
    }

    /**
     * Sets the value of the accountLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountLoc(QueryType value) {
        this.accountLoc = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAddressLine3(QueryType value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountName(QueryType value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the activeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getActiveStatus() {
        return activeStatus;
    }

    /**
     * Sets the value of the activeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setActiveStatus(QueryType value) {
        this.activeStatus = value;
    }

    /**
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAddressId(QueryType value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the addressName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAddressName() {
        return addressName;
    }

    /**
     * Sets the value of the addressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAddressName(QueryType value) {
        this.addressName = value;
    }

    /**
     * Gets the value of the addressee property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAddressee() {
        return addressee;
    }

    /**
     * Sets the value of the addressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAddressee(QueryType value) {
        this.addressee = value;
    }

    /**
     * Gets the value of the addressNameLockedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAddressNameLockedFlag() {
        return addressNameLockedFlag;
    }

    /**
     * Sets the value of the addressNameLockedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAddressNameLockedFlag(QueryType value) {
        this.addressNameLockedFlag = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAddressType(QueryType value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAltitude(QueryType value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the apartmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * Sets the value of the apartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setApartmentNumber(QueryType value) {
        this.apartmentNumber = value;
    }

    /**
     * Gets the value of the billAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillAddressFlag() {
        return billAddressFlag;
    }

    /**
     * Sets the value of the billAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillAddressFlag(QueryType value) {
        this.billAddressFlag = value;
    }

    /**
     * Gets the value of the brickId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBrickId() {
        return brickId;
    }

    /**
     * Sets the value of the brickId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBrickId(QueryType value) {
        this.brickId = value;
    }

    /**
     * Gets the value of the brickName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBrickName() {
        return brickName;
    }

    /**
     * Sets the value of the brickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBrickName(QueryType value) {
        this.brickName = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCity(QueryType value) {
        this.city = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactId(QueryType value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCountry(QueryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCounty(QueryType value) {
        this.county = value;
    }

    /**
     * Gets the value of the descriptor property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDescriptor() {
        return descriptor;
    }

    /**
     * Sets the value of the descriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDescriptor(QueryType value) {
        this.descriptor = value;
    }

    /**
     * Gets the value of the disableDataCleansing property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDisableDataCleansing() {
        return disableDataCleansing;
    }

    /**
     * Sets the value of the disableDataCleansing property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDisableDataCleansing(QueryType value) {
        this.disableDataCleansing = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEmailAddress(QueryType value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFaxNumber(QueryType value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIntegrationId(QueryType value) {
        this.integrationId = value;
    }

    /**
     * Gets the value of the landlordName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLandlordName() {
        return landlordName;
    }

    /**
     * Sets the value of the landlordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLandlordName(QueryType value) {
        this.landlordName = value;
    }

    /**
     * Gets the value of the landlordPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLandlordPhoneNumber() {
        return landlordPhoneNumber;
    }

    /**
     * Sets the value of the landlordPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLandlordPhoneNumber(QueryType value) {
        this.landlordPhoneNumber = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLatitude(QueryType value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLongitude(QueryType value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the mailCodeORG property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMailCodeORG() {
        return mailCodeORG;
    }

    /**
     * Sets the value of the mailCodeORG property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMailCodeORG(QueryType value) {
        this.mailCodeORG = value;
    }

    /**
     * Gets the value of the mailTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMailTypeCode() {
        return mailTypeCode;
    }

    /**
     * Sets the value of the mailTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMailTypeCode(QueryType value) {
        this.mailTypeCode = value;
    }

    /**
     * Gets the value of the mainAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMainAddressFlag() {
        return mainAddressFlag;
    }

    /**
     * Sets the value of the mainAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMainAddressFlag(QueryType value) {
        this.mainAddressFlag = value;
    }

    /**
     * Gets the value of the occupancyCD property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOccupancyCD() {
        return occupancyCD;
    }

    /**
     * Sets the value of the occupancyCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOccupancyCD(QueryType value) {
        this.occupancyCD = value;
    }

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrganizationId(QueryType value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the parentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentLocation() {
        return parentLocation;
    }

    /**
     * Sets the value of the parentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentLocation(QueryType value) {
        this.parentLocation = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPhoneNumber(QueryType value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPostalCode(QueryType value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the premiseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPremiseFlag() {
        return premiseFlag;
    }

    /**
     * Sets the value of the premiseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPremiseFlag(QueryType value) {
        this.premiseFlag = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProvince(QueryType value) {
        this.province = value;
    }

    /**
     * Gets the value of the ssInstance property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSSInstance() {
        return ssInstance;
    }

    /**
     * Sets the value of the ssInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSSInstance(QueryType value) {
        this.ssInstance = value;
    }

    /**
     * Gets the value of the shipAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipAddressFlag() {
        return shipAddressFlag;
    }

    /**
     * Sets the value of the shipAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipAddressFlag(QueryType value) {
        this.shipAddressFlag = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStartDate(QueryType value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setState(QueryType value) {
        this.state = value;
    }

    /**
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStreetAddress(QueryType value) {
        this.streetAddress = value;
    }

    /**
     * Gets the value of the streetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStreetAddress2() {
        return streetAddress2;
    }

    /**
     * Sets the value of the streetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStreetAddress2(QueryType value) {
        this.streetAddress2 = value;
    }

    /**
     * Gets the value of the utmEasting property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUTMEasting() {
        return utmEasting;
    }

    /**
     * Sets the value of the utmEasting property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUTMEasting(QueryType value) {
        this.utmEasting = value;
    }

    /**
     * Gets the value of the utmNorthing property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUTMNorthing() {
        return utmNorthing;
    }

    /**
     * Sets the value of the utmNorthing property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUTMNorthing(QueryType value) {
        this.utmNorthing = value;
    }

    /**
     * Gets the value of the tsApartmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSApartmentNumber() {
        return tsApartmentNumber;
    }

    /**
     * Sets the value of the tsApartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSApartmentNumber(QueryType value) {
        this.tsApartmentNumber = value;
    }

    /**
     * Gets the value of the tsBillingAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSBillingAddressFlag() {
        return tsBillingAddressFlag;
    }

    /**
     * Sets the value of the tsBillingAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSBillingAddressFlag(QueryType value) {
        this.tsBillingAddressFlag = value;
    }

    /**
     * Gets the value of the tsPostalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSPostalFlag() {
        return tsPostalFlag;
    }

    /**
     * Sets the value of the tsPostalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSPostalFlag(QueryType value) {
        this.tsPostalFlag = value;
    }

    /**
     * Gets the value of the tsEntrance property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSEntrance() {
        return tsEntrance;
    }

    /**
     * Sets the value of the tsEntrance property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSEntrance(QueryType value) {
        this.tsEntrance = value;
    }

    /**
     * Gets the value of the tsExistingLANAvail property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSExistingLANAvail() {
        return tsExistingLANAvail;
    }

    /**
     * Sets the value of the tsExistingLANAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSExistingLANAvail(QueryType value) {
        this.tsExistingLANAvail = value;
    }

    /**
     * Gets the value of the tsfmoId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSFMOId() {
        return tsfmoId;
    }

    /**
     * Sets the value of the tsfmoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSFMOId(QueryType value) {
        this.tsfmoId = value;
    }

    /**
     * Gets the value of the tsFiberSmallBusinesses property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSFiberSmallBusinesses() {
        return tsFiberSmallBusinesses;
    }

    /**
     * Sets the value of the tsFiberSmallBusinesses property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSFiberSmallBusinesses(QueryType value) {
        this.tsFiberSmallBusinesses = value;
    }

    /**
     * Gets the value of the tsFiberVilla property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSFiberVilla() {
        return tsFiberVilla;
    }

    /**
     * Sets the value of the tsFiberVilla property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSFiberVilla(QueryType value) {
        this.tsFiberVilla = value;
    }

    /**
     * Gets the value of the tsInstallationAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSInstallationAddressFlag() {
        return tsInstallationAddressFlag;
    }

    /**
     * Sets the value of the tsInstallationAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSInstallationAddressFlag(QueryType value) {
        this.tsInstallationAddressFlag = value;
    }

    /**
     * Gets the value of the tsLeftRight property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSLeftRight() {
        return tsLeftRight;
    }

    /**
     * Sets the value of the tsLeftRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSLeftRight(QueryType value) {
        this.tsLeftRight = value;
    }

    /**
     * Gets the value of the tsLegalAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSLegalAddressFlag() {
        return tsLegalAddressFlag;
    }

    /**
     * Sets the value of the tsLegalAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSLegalAddressFlag(QueryType value) {
        this.tsLegalAddressFlag = value;
    }

    /**
     * Gets the value of the tsLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSLocationId() {
        return tsLocationId;
    }

    /**
     * Sets the value of the tsLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSLocationId(QueryType value) {
        this.tsLocationId = value;
    }

    /**
     * Gets the value of the tsMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSMunicipality() {
        return tsMunicipality;
    }

    /**
     * Sets the value of the tsMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSMunicipality(QueryType value) {
        this.tsMunicipality = value;
    }

    /**
     * Gets the value of the tsPointId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSPointId() {
        return tsPointId;
    }

    /**
     * Sets the value of the tsPointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSPointId(QueryType value) {
        this.tsPointId = value;
    }

    /**
     * Gets the value of the tsProperty property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSProperty() {
        return tsProperty;
    }

    /**
     * Sets the value of the tsProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSProperty(QueryType value) {
        this.tsProperty = value;
    }

    /**
     * Gets the value of the tsPropertyType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSPropertyType() {
        return tsPropertyType;
    }

    /**
     * Sets the value of the tsPropertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSPropertyType(QueryType value) {
        this.tsPropertyType = value;
    }

    /**
     * Gets the value of the tsShippingAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSShippingAddressFlag() {
        return tsShippingAddressFlag;
    }

    /**
     * Sets the value of the tsShippingAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSShippingAddressFlag(QueryType value) {
        this.tsShippingAddressFlag = value;
    }

    /**
     * Gets the value of the tsStation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSStation() {
        return tsStation;
    }

    /**
     * Sets the value of the tsStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSStation(QueryType value) {
        this.tsStation = value;
    }

    /**
     * Gets the value of the tsStreetAddress5 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSStreetAddress5() {
        return tsStreetAddress5;
    }

    /**
     * Sets the value of the tsStreetAddress5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSStreetAddress5(QueryType value) {
        this.tsStreetAddress5 = value;
    }

    /**
     * Gets the value of the tsStreetAddress6 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSStreetAddress6() {
        return tsStreetAddress6;
    }

    /**
     * Sets the value of the tsStreetAddress6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSStreetAddress6(QueryType value) {
        this.tsStreetAddress6 = value;
    }

    /**
     * Gets the value of the tsStreetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSStreetNumber() {
        return tsStreetNumber;
    }

    /**
     * Sets the value of the tsStreetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSStreetNumber(QueryType value) {
        this.tsStreetNumber = value;
    }

    /**
     * Gets the value of the tsxCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSXCoordinate() {
        return tsxCoordinate;
    }

    /**
     * Sets the value of the tsxCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSXCoordinate(QueryType value) {
        this.tsxCoordinate = value;
    }

    /**
     * Gets the value of the tsyCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSYCoordinate() {
        return tsyCoordinate;
    }

    /**
     * Sets the value of the tsyCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSYCoordinate(QueryType value) {
        this.tsyCoordinate = value;
    }

    /**
     * Gets the value of the tsAttentionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSAttentionInformation() {
        return tsAttentionInformation;
    }

    /**
     * Sets the value of the tsAttentionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSAttentionInformation(QueryType value) {
        this.tsAttentionInformation = value;
    }

    /**
     * Gets the value of the tsCareOfField property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSCareOfField() {
        return tsCareOfField;
    }

    /**
     * Sets the value of the tsCareOfField property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSCareOfField(QueryType value) {
        this.tsCareOfField = value;
    }

    /**
     * Gets the value of the tsFiberStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSFiberStatus() {
        return tsFiberStatus;
    }

    /**
     * Sets the value of the tsFiberStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSFiberStatus(QueryType value) {
        this.tsFiberStatus = value;
    }

    /**
     * Gets the value of the listOfCUTAddressMVAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCUTAddressMVAccountQuery }
     *     
     */
    public ListOfCUTAddressMVAccountQuery getListOfCUTAddressMVAccount() {
        return listOfCUTAddressMVAccount;
    }

    /**
     * Sets the value of the listOfCUTAddressMVAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCUTAddressMVAccountQuery }
     *     
     */
    public void setListOfCUTAddressMVAccount(ListOfCUTAddressMVAccountQuery value) {
        this.listOfCUTAddressMVAccount = value;
    }

    /**
     * Gets the value of the listOfCUTAddressMVContact property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCUTAddressMVContactQuery }
     *     
     */
    public ListOfCUTAddressMVContactQuery getListOfCUTAddressMVContact() {
        return listOfCUTAddressMVContact;
    }

    /**
     * Sets the value of the listOfCUTAddressMVContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCUTAddressMVContactQuery }
     *     
     */
    public void setListOfCUTAddressMVContact(ListOfCUTAddressMVContactQuery value) {
        this.listOfCUTAddressMVContact = value;
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
