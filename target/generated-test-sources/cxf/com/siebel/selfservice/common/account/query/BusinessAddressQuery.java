
package com.siebel.selfservice.common.account.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessAddressQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessAddressQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Created" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Updated" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedBy" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ConflictId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ModId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ActiveStatus" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine3" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AddressName" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AddressNameLockedFlag" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Addressee" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AlignmentFlag" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="BillAddressFlag" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="CalculatedAddressComma1" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="CalculatedAddressComma2" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="CalculatedAddressName" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="CalculatedAddressNameENU" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="CalculatedAddressNameJPN" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="CityLen" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="CityStateZipCountry" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="CityStateZipCountryENU" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="CityStateZipCountryJPN" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="County" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="DefaultShipPriorityCode" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="DisableDataCleansing" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="FaxNumber" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId2" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId3" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="MainAddressFlag" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationIntegrationId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationName" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Province" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="S-SInstance" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="S-SInstanceId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="S-SKeyId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ShipAddressFlag" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="StateLen" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddress" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddress2" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddressLen" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSPointId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSShippingAddressFlag" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSInstallationAddressFlag" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSLegalAddressFlag" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSBillingAddressFlag" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSApartmentNumber" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSBillingAddressVisibilityFlag" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSEntrance" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSExistingLANAvail" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSFMOId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSFiberSmallBusinesses" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSFiberVilla" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSLeftRight" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSLocationId" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSMunicipality" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSProperty" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSPropertyType" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSStation" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSStreetAddress5" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSStreetAddress6" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSStreetNumber" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSXCoordinate" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSYCoordinate" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSHDBlockFlag" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSHDStream" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSSDStream" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSVDSLBlockFlag" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSAttentionInformation" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSCareOfField" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSFiberStatus" type="{http://www.siebel.com/SelfService/Common/Account/Query}queryType" minOccurs="0"/&gt;
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
@XmlType(name = "BusinessAddressQuery", propOrder = {
    "id",
    "created",
    "createdBy",
    "updated",
    "updatedBy",
    "conflictId",
    "modId",
    "accountId",
    "activeStatus",
    "addressLine3",
    "addressName",
    "addressNameLockedFlag",
    "addressee",
    "alignmentFlag",
    "billAddressFlag",
    "calculatedAddressComma1",
    "calculatedAddressComma2",
    "calculatedAddressName",
    "calculatedAddressNameENU",
    "calculatedAddressNameJPN",
    "city",
    "cityLen",
    "cityStateZipCountry",
    "cityStateZipCountryENU",
    "cityStateZipCountryJPN",
    "country",
    "county",
    "defaultShipPriorityCode",
    "disableDataCleansing",
    "emailAddress",
    "faxNumber",
    "integrationId",
    "integrationId2",
    "integrationId3",
    "mainAddressFlag",
    "organizationId",
    "organizationIntegrationId",
    "organizationName",
    "phoneNumber",
    "postalCode",
    "province",
    "ssInstance",
    "ssInstanceId",
    "ssKeyId",
    "shipAddressFlag",
    "state",
    "stateLen",
    "streetAddress",
    "streetAddress2",
    "streetAddressLen",
    "tsPointId",
    "tsShippingAddressFlag",
    "tsInstallationAddressFlag",
    "tsLegalAddressFlag",
    "tsBillingAddressFlag",
    "tsApartmentNumber",
    "tsBillingAddressVisibilityFlag",
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
    "tshdBlockFlag",
    "tshdStream",
    "tssdStream",
    "tsvdslBlockFlag",
    "endDate",
    "startDate",
    "tsAttentionInformation",
    "tsCareOfField",
    "tsFiberStatus"
})
public class BusinessAddressQuery {

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
    @XmlElement(name = "ActiveStatus")
    protected QueryType activeStatus;
    @XmlElement(name = "AddressLine3")
    protected QueryType addressLine3;
    @XmlElement(name = "AddressName")
    protected QueryType addressName;
    @XmlElement(name = "AddressNameLockedFlag")
    protected QueryType addressNameLockedFlag;
    @XmlElement(name = "Addressee")
    protected QueryType addressee;
    @XmlElement(name = "AlignmentFlag")
    protected QueryType alignmentFlag;
    @XmlElement(name = "BillAddressFlag")
    protected QueryType billAddressFlag;
    @XmlElement(name = "CalculatedAddressComma1")
    protected QueryType calculatedAddressComma1;
    @XmlElement(name = "CalculatedAddressComma2")
    protected QueryType calculatedAddressComma2;
    @XmlElement(name = "CalculatedAddressName")
    protected QueryType calculatedAddressName;
    @XmlElement(name = "CalculatedAddressNameENU")
    protected QueryType calculatedAddressNameENU;
    @XmlElement(name = "CalculatedAddressNameJPN")
    protected QueryType calculatedAddressNameJPN;
    @XmlElement(name = "City")
    protected QueryType city;
    @XmlElement(name = "CityLen")
    protected QueryType cityLen;
    @XmlElement(name = "CityStateZipCountry")
    protected QueryType cityStateZipCountry;
    @XmlElement(name = "CityStateZipCountryENU")
    protected QueryType cityStateZipCountryENU;
    @XmlElement(name = "CityStateZipCountryJPN")
    protected QueryType cityStateZipCountryJPN;
    @XmlElement(name = "Country")
    protected QueryType country;
    @XmlElement(name = "County")
    protected QueryType county;
    @XmlElement(name = "DefaultShipPriorityCode")
    protected QueryType defaultShipPriorityCode;
    @XmlElement(name = "DisableDataCleansing")
    protected QueryType disableDataCleansing;
    @XmlElement(name = "EmailAddress")
    protected QueryType emailAddress;
    @XmlElement(name = "FaxNumber")
    protected QueryType faxNumber;
    @XmlElement(name = "IntegrationId")
    protected QueryType integrationId;
    @XmlElement(name = "IntegrationId2")
    protected QueryType integrationId2;
    @XmlElement(name = "IntegrationId3")
    protected QueryType integrationId3;
    @XmlElement(name = "MainAddressFlag")
    protected QueryType mainAddressFlag;
    @XmlElement(name = "OrganizationId")
    protected QueryType organizationId;
    @XmlElement(name = "OrganizationIntegrationId")
    protected QueryType organizationIntegrationId;
    @XmlElement(name = "OrganizationName")
    protected QueryType organizationName;
    @XmlElement(name = "PhoneNumber")
    protected QueryType phoneNumber;
    @XmlElement(name = "PostalCode")
    protected QueryType postalCode;
    @XmlElement(name = "Province")
    protected QueryType province;
    @XmlElement(name = "S-SInstance")
    protected QueryType ssInstance;
    @XmlElement(name = "S-SInstanceId")
    protected QueryType ssInstanceId;
    @XmlElement(name = "S-SKeyId")
    protected QueryType ssKeyId;
    @XmlElement(name = "ShipAddressFlag")
    protected QueryType shipAddressFlag;
    @XmlElement(name = "State")
    protected QueryType state;
    @XmlElement(name = "StateLen")
    protected QueryType stateLen;
    @XmlElement(name = "StreetAddress")
    protected QueryType streetAddress;
    @XmlElement(name = "StreetAddress2")
    protected QueryType streetAddress2;
    @XmlElement(name = "StreetAddressLen")
    protected QueryType streetAddressLen;
    @XmlElement(name = "TSPointId")
    protected QueryType tsPointId;
    @XmlElement(name = "TSShippingAddressFlag")
    protected QueryType tsShippingAddressFlag;
    @XmlElement(name = "TSInstallationAddressFlag")
    protected QueryType tsInstallationAddressFlag;
    @XmlElement(name = "TSLegalAddressFlag")
    protected QueryType tsLegalAddressFlag;
    @XmlElement(name = "TSBillingAddressFlag")
    protected QueryType tsBillingAddressFlag;
    @XmlElement(name = "TSApartmentNumber")
    protected QueryType tsApartmentNumber;
    @XmlElement(name = "TSBillingAddressVisibilityFlag")
    protected QueryType tsBillingAddressVisibilityFlag;
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
    @XmlElement(name = "TSLeftRight")
    protected QueryType tsLeftRight;
    @XmlElement(name = "TSLocationId")
    protected QueryType tsLocationId;
    @XmlElement(name = "TSMunicipality")
    protected QueryType tsMunicipality;
    @XmlElement(name = "TSProperty")
    protected QueryType tsProperty;
    @XmlElement(name = "TSPropertyType")
    protected QueryType tsPropertyType;
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
    @XmlElement(name = "TSHDBlockFlag")
    protected QueryType tshdBlockFlag;
    @XmlElement(name = "TSHDStream")
    protected QueryType tshdStream;
    @XmlElement(name = "TSSDStream")
    protected QueryType tssdStream;
    @XmlElement(name = "TSVDSLBlockFlag")
    protected QueryType tsvdslBlockFlag;
    @XmlElement(name = "EndDate")
    protected QueryType endDate;
    @XmlElement(name = "StartDate")
    protected QueryType startDate;
    @XmlElement(name = "TSAttentionInformation")
    protected QueryType tsAttentionInformation;
    @XmlElement(name = "TSCareOfField")
    protected QueryType tsCareOfField;
    @XmlElement(name = "TSFiberStatus")
    protected QueryType tsFiberStatus;
    @XmlAttribute(name = "searchspec")
    protected String searchspec;

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
     * Gets the value of the alignmentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAlignmentFlag() {
        return alignmentFlag;
    }

    /**
     * Sets the value of the alignmentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAlignmentFlag(QueryType value) {
        this.alignmentFlag = value;
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
     * Gets the value of the calculatedAddressComma1 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedAddressComma1() {
        return calculatedAddressComma1;
    }

    /**
     * Sets the value of the calculatedAddressComma1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedAddressComma1(QueryType value) {
        this.calculatedAddressComma1 = value;
    }

    /**
     * Gets the value of the calculatedAddressComma2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedAddressComma2() {
        return calculatedAddressComma2;
    }

    /**
     * Sets the value of the calculatedAddressComma2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedAddressComma2(QueryType value) {
        this.calculatedAddressComma2 = value;
    }

    /**
     * Gets the value of the calculatedAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedAddressName() {
        return calculatedAddressName;
    }

    /**
     * Sets the value of the calculatedAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedAddressName(QueryType value) {
        this.calculatedAddressName = value;
    }

    /**
     * Gets the value of the calculatedAddressNameENU property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedAddressNameENU() {
        return calculatedAddressNameENU;
    }

    /**
     * Sets the value of the calculatedAddressNameENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedAddressNameENU(QueryType value) {
        this.calculatedAddressNameENU = value;
    }

    /**
     * Gets the value of the calculatedAddressNameJPN property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedAddressNameJPN() {
        return calculatedAddressNameJPN;
    }

    /**
     * Sets the value of the calculatedAddressNameJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedAddressNameJPN(QueryType value) {
        this.calculatedAddressNameJPN = value;
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
     * Gets the value of the cityLen property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCityLen() {
        return cityLen;
    }

    /**
     * Sets the value of the cityLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCityLen(QueryType value) {
        this.cityLen = value;
    }

    /**
     * Gets the value of the cityStateZipCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCityStateZipCountry() {
        return cityStateZipCountry;
    }

    /**
     * Sets the value of the cityStateZipCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCityStateZipCountry(QueryType value) {
        this.cityStateZipCountry = value;
    }

    /**
     * Gets the value of the cityStateZipCountryENU property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCityStateZipCountryENU() {
        return cityStateZipCountryENU;
    }

    /**
     * Sets the value of the cityStateZipCountryENU property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCityStateZipCountryENU(QueryType value) {
        this.cityStateZipCountryENU = value;
    }

    /**
     * Gets the value of the cityStateZipCountryJPN property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCityStateZipCountryJPN() {
        return cityStateZipCountryJPN;
    }

    /**
     * Sets the value of the cityStateZipCountryJPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCityStateZipCountryJPN(QueryType value) {
        this.cityStateZipCountryJPN = value;
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
     * Gets the value of the defaultShipPriorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDefaultShipPriorityCode() {
        return defaultShipPriorityCode;
    }

    /**
     * Sets the value of the defaultShipPriorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDefaultShipPriorityCode(QueryType value) {
        this.defaultShipPriorityCode = value;
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
     * Gets the value of the integrationId2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIntegrationId2() {
        return integrationId2;
    }

    /**
     * Sets the value of the integrationId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIntegrationId2(QueryType value) {
        this.integrationId2 = value;
    }

    /**
     * Gets the value of the integrationId3 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIntegrationId3() {
        return integrationId3;
    }

    /**
     * Sets the value of the integrationId3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIntegrationId3(QueryType value) {
        this.integrationId3 = value;
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
     * Gets the value of the organizationIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrganizationIntegrationId() {
        return organizationIntegrationId;
    }

    /**
     * Sets the value of the organizationIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrganizationIntegrationId(QueryType value) {
        this.organizationIntegrationId = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrganizationName(QueryType value) {
        this.organizationName = value;
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
     * Gets the value of the ssInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSSInstanceId() {
        return ssInstanceId;
    }

    /**
     * Sets the value of the ssInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSSInstanceId(QueryType value) {
        this.ssInstanceId = value;
    }

    /**
     * Gets the value of the ssKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSSKeyId() {
        return ssKeyId;
    }

    /**
     * Sets the value of the ssKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSSKeyId(QueryType value) {
        this.ssKeyId = value;
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
     * Gets the value of the stateLen property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStateLen() {
        return stateLen;
    }

    /**
     * Sets the value of the stateLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStateLen(QueryType value) {
        this.stateLen = value;
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
     * Gets the value of the streetAddressLen property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStreetAddressLen() {
        return streetAddressLen;
    }

    /**
     * Sets the value of the streetAddressLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStreetAddressLen(QueryType value) {
        this.streetAddressLen = value;
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
     * Gets the value of the tsBillingAddressVisibilityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSBillingAddressVisibilityFlag() {
        return tsBillingAddressVisibilityFlag;
    }

    /**
     * Sets the value of the tsBillingAddressVisibilityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSBillingAddressVisibilityFlag(QueryType value) {
        this.tsBillingAddressVisibilityFlag = value;
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
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEndDate(QueryType value) {
        this.endDate = value;
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
