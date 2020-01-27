
package com.siebel.ordermanagement.order.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FulfillmentStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OptyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CancelReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSSkipCreditCheckflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSChannelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSCSRId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSScoringResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSScoringReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSReCalDeliveryDateFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSAcceptEmailFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TScalDeliverDateFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSCustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedShipDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Revision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSOrderSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSC2BDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListOfOrderItem" type="{http://siebel.com/OrderManagement/Order/Data}ListOfOrderItem" minOccurs="0"/&gt;
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
@XmlType(name = "Order", propOrder = {
    "fulfillmentStatusCode",
    "discount",
    "currencyCode",
    "orderType",
    "orderNumber",
    "optyId",
    "parentOrderNumber",
    "cancelReason",
    "accountId",
    "active",
    "priceListId",
    "primaryOrganization",
    "primaryOrganizationId",
    "tsSkipCreditCheckflag",
    "tsChannelName",
    "tscsrId",
    "integrationId",
    "tsScoringResponse",
    "tsScoringReason",
    "tsReCalDeliveryDateFlag",
    "tsAcceptEmailFlag",
    "tScalDeliverDateFlag",
    "tsCustomerID",
    "requestedShipDate",
    "revision",
    "status",
    "contactId",
    "billingProfileId",
    "tsOrderSubType",
    "tsc2BDeliveryDate",
    "comments",
    "created",
    "id",
    "account",
    "updated",
    "modId",
    "billingProfileName",
    "conflictId",
    "accountLoc",
    "listOfOrderItem"
})
public class Order {

    @XmlElement(name = "FulfillmentStatusCode")
    protected String fulfillmentStatusCode;
    @XmlElement(name = "Discount")
    protected String discount;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "OrderType")
    protected String orderType;
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "OptyId")
    protected String optyId;
    @XmlElement(name = "ParentOrderNumber")
    protected String parentOrderNumber;
    @XmlElement(name = "CancelReason")
    protected String cancelReason;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "Active")
    protected String active;
    @XmlElement(name = "PriceListId")
    protected String priceListId;
    @XmlElement(name = "PrimaryOrganization")
    protected String primaryOrganization;
    @XmlElement(name = "PrimaryOrganizationId")
    protected String primaryOrganizationId;
    @XmlElement(name = "TSSkipCreditCheckflag")
    protected String tsSkipCreditCheckflag;
    @XmlElement(name = "TSChannelName")
    protected String tsChannelName;
    @XmlElement(name = "TSCSRId")
    protected String tscsrId;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "TSScoringResponse")
    protected String tsScoringResponse;
    @XmlElement(name = "TSScoringReason")
    protected String tsScoringReason;
    @XmlElement(name = "TSReCalDeliveryDateFlag")
    protected String tsReCalDeliveryDateFlag;
    @XmlElement(name = "TSAcceptEmailFlag")
    protected String tsAcceptEmailFlag;
    @XmlElement(name = "TScalDeliverDateFlag")
    protected String tScalDeliverDateFlag;
    @XmlElement(name = "TSCustomerID")
    protected String tsCustomerID;
    @XmlElement(name = "RequestedShipDate")
    protected String requestedShipDate;
    @XmlElement(name = "Revision")
    protected String revision;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "ContactId")
    protected String contactId;
    @XmlElement(name = "BillingProfileId")
    protected String billingProfileId;
    @XmlElement(name = "TSOrderSubType")
    protected String tsOrderSubType;
    @XmlElement(name = "TSC2BDeliveryDate")
    protected String tsc2BDeliveryDate;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "Created")
    protected String created;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "Updated")
    protected String updated;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "BillingProfileName")
    protected String billingProfileName;
    @XmlElement(name = "ConflictId")
    protected String conflictId;
    @XmlElement(name = "AccountLoc")
    protected String accountLoc;
    @XmlElement(name = "ListOfOrderItem")
    protected ListOfOrderItem listOfOrderItem;
    @XmlAttribute(name = "searchspec")
    protected String searchspec;

    /**
     * Gets the value of the fulfillmentStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentStatusCode() {
        return fulfillmentStatusCode;
    }

    /**
     * Sets the value of the fulfillmentStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentStatusCode(String value) {
        this.fulfillmentStatusCode = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount(String value) {
        this.discount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the optyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptyId() {
        return optyId;
    }

    /**
     * Sets the value of the optyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptyId(String value) {
        this.optyId = value;
    }

    /**
     * Gets the value of the parentOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrderNumber() {
        return parentOrderNumber;
    }

    /**
     * Sets the value of the parentOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrderNumber(String value) {
        this.parentOrderNumber = value;
    }

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
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
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
    }

    /**
     * Gets the value of the priceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListId() {
        return priceListId;
    }

    /**
     * Sets the value of the priceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListId(String value) {
        this.priceListId = value;
    }

    /**
     * Gets the value of the primaryOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrganization() {
        return primaryOrganization;
    }

    /**
     * Sets the value of the primaryOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrganization(String value) {
        this.primaryOrganization = value;
    }

    /**
     * Gets the value of the primaryOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrganizationId() {
        return primaryOrganizationId;
    }

    /**
     * Sets the value of the primaryOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrganizationId(String value) {
        this.primaryOrganizationId = value;
    }

    /**
     * Gets the value of the tsSkipCreditCheckflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSkipCreditCheckflag() {
        return tsSkipCreditCheckflag;
    }

    /**
     * Sets the value of the tsSkipCreditCheckflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSkipCreditCheckflag(String value) {
        this.tsSkipCreditCheckflag = value;
    }

    /**
     * Gets the value of the tsChannelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSChannelName() {
        return tsChannelName;
    }

    /**
     * Sets the value of the tsChannelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSChannelName(String value) {
        this.tsChannelName = value;
    }

    /**
     * Gets the value of the tscsrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCSRId() {
        return tscsrId;
    }

    /**
     * Sets the value of the tscsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCSRId(String value) {
        this.tscsrId = value;
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
     * Gets the value of the tsScoringResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSScoringResponse() {
        return tsScoringResponse;
    }

    /**
     * Sets the value of the tsScoringResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSScoringResponse(String value) {
        this.tsScoringResponse = value;
    }

    /**
     * Gets the value of the tsScoringReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSScoringReason() {
        return tsScoringReason;
    }

    /**
     * Sets the value of the tsScoringReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSScoringReason(String value) {
        this.tsScoringReason = value;
    }

    /**
     * Gets the value of the tsReCalDeliveryDateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSReCalDeliveryDateFlag() {
        return tsReCalDeliveryDateFlag;
    }

    /**
     * Sets the value of the tsReCalDeliveryDateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSReCalDeliveryDateFlag(String value) {
        this.tsReCalDeliveryDateFlag = value;
    }

    /**
     * Gets the value of the tsAcceptEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSAcceptEmailFlag() {
        return tsAcceptEmailFlag;
    }

    /**
     * Sets the value of the tsAcceptEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSAcceptEmailFlag(String value) {
        this.tsAcceptEmailFlag = value;
    }

    /**
     * Gets the value of the tScalDeliverDateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTScalDeliverDateFlag() {
        return tScalDeliverDateFlag;
    }

    /**
     * Sets the value of the tScalDeliverDateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTScalDeliverDateFlag(String value) {
        this.tScalDeliverDateFlag = value;
    }

    /**
     * Gets the value of the tsCustomerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCustomerID() {
        return tsCustomerID;
    }

    /**
     * Sets the value of the tsCustomerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCustomerID(String value) {
        this.tsCustomerID = value;
    }

    /**
     * Gets the value of the requestedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedShipDate() {
        return requestedShipDate;
    }

    /**
     * Sets the value of the requestedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedShipDate(String value) {
        this.requestedShipDate = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the billingProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingProfileId() {
        return billingProfileId;
    }

    /**
     * Sets the value of the billingProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingProfileId(String value) {
        this.billingProfileId = value;
    }

    /**
     * Gets the value of the tsOrderSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSOrderSubType() {
        return tsOrderSubType;
    }

    /**
     * Sets the value of the tsOrderSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSOrderSubType(String value) {
        this.tsOrderSubType = value;
    }

    /**
     * Gets the value of the tsc2BDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSC2BDeliveryDate() {
        return tsc2BDeliveryDate;
    }

    /**
     * Sets the value of the tsc2BDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSC2BDeliveryDate(String value) {
        this.tsc2BDeliveryDate = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
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
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdated(String value) {
        this.updated = value;
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
     * Gets the value of the billingProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingProfileName() {
        return billingProfileName;
    }

    /**
     * Sets the value of the billingProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingProfileName(String value) {
        this.billingProfileName = value;
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
     * Gets the value of the listOfOrderItem property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderItem }
     *     
     */
    public ListOfOrderItem getListOfOrderItem() {
        return listOfOrderItem;
    }

    /**
     * Sets the value of the listOfOrderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderItem }
     *     
     */
    public void setListOfOrderItem(ListOfOrderItem value) {
        this.listOfOrderItem = value;
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
