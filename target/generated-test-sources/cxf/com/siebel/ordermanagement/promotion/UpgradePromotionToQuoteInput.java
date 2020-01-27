
package com.siebel.ordermanagement.promotion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.quote.data.ListOfQuote;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TSC2BContainerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="QuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSCSRId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NewPromotionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSChannelName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OverridePenaltyAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RequestType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://siebel.com/OrderManagement/Quote/Data}ListOfQuote"/&gt;
 *         &lt;element name="OverrideProratePlanId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderSubType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CompoundProductNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ActiveDocumentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tsc2BContainerName",
    "quoteNumber",
    "dueDate",
    "tscsrId",
    "newPromotionId",
    "assetNumber",
    "tsChannelName",
    "overridePenaltyAmount",
    "requestType",
    "listOfQuote",
    "overrideProratePlanId",
    "orderSubType",
    "assetIntegrationId",
    "accountId",
    "contactId",
    "compoundProductNumber",
    "tsReasonCode",
    "activeDocumentId"
})
@XmlRootElement(name = "UpgradePromotionToQuote_Input")
public class UpgradePromotionToQuoteInput {

    @XmlElement(name = "TSC2BContainerName", required = true)
    protected String tsc2BContainerName;
    @XmlElement(name = "QuoteNumber", required = true)
    protected String quoteNumber;
    @XmlElement(name = "DueDate", required = true)
    protected String dueDate;
    @XmlElement(name = "TSCSRId", required = true)
    protected String tscsrId;
    @XmlElement(name = "NewPromotionId", required = true)
    protected String newPromotionId;
    @XmlElement(name = "AssetNumber", required = true)
    protected String assetNumber;
    @XmlElement(name = "TSChannelName", required = true)
    protected String tsChannelName;
    @XmlElement(name = "OverridePenaltyAmount", required = true)
    protected String overridePenaltyAmount;
    @XmlElement(name = "RequestType", required = true)
    protected String requestType;
    @XmlElement(name = "ListOfQuote", namespace = "http://siebel.com/OrderManagement/Quote/Data", required = true)
    protected ListOfQuote listOfQuote;
    @XmlElement(name = "OverrideProratePlanId", required = true)
    protected String overrideProratePlanId;
    @XmlElement(name = "OrderSubType", required = true)
    protected String orderSubType;
    @XmlElement(name = "AssetIntegrationId", required = true)
    protected String assetIntegrationId;
    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "ContactId", required = true)
    protected String contactId;
    @XmlElement(name = "CompoundProductNumber", required = true)
    protected String compoundProductNumber;
    @XmlElement(name = "TSReasonCode", required = true)
    protected String tsReasonCode;
    @XmlElement(name = "ActiveDocumentId", required = true)
    protected String activeDocumentId;

    /**
     * Gets the value of the tsc2BContainerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSC2BContainerName() {
        return tsc2BContainerName;
    }

    /**
     * Sets the value of the tsc2BContainerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSC2BContainerName(String value) {
        this.tsc2BContainerName = value;
    }

    /**
     * Gets the value of the quoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteNumber() {
        return quoteNumber;
    }

    /**
     * Sets the value of the quoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteNumber(String value) {
        this.quoteNumber = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
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
     * Gets the value of the newPromotionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPromotionId() {
        return newPromotionId;
    }

    /**
     * Sets the value of the newPromotionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPromotionId(String value) {
        this.newPromotionId = value;
    }

    /**
     * Gets the value of the assetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetNumber() {
        return assetNumber;
    }

    /**
     * Sets the value of the assetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetNumber(String value) {
        this.assetNumber = value;
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
     * Gets the value of the overridePenaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverridePenaltyAmount() {
        return overridePenaltyAmount;
    }

    /**
     * Sets the value of the overridePenaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverridePenaltyAmount(String value) {
        this.overridePenaltyAmount = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the listOfQuote property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfQuote }
     *     
     */
    public ListOfQuote getListOfQuote() {
        return listOfQuote;
    }

    /**
     * Sets the value of the listOfQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfQuote }
     *     
     */
    public void setListOfQuote(ListOfQuote value) {
        this.listOfQuote = value;
    }

    /**
     * Gets the value of the overrideProratePlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideProratePlanId() {
        return overrideProratePlanId;
    }

    /**
     * Sets the value of the overrideProratePlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideProratePlanId(String value) {
        this.overrideProratePlanId = value;
    }

    /**
     * Gets the value of the orderSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderSubType() {
        return orderSubType;
    }

    /**
     * Sets the value of the orderSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderSubType(String value) {
        this.orderSubType = value;
    }

    /**
     * Gets the value of the assetIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetIntegrationId() {
        return assetIntegrationId;
    }

    /**
     * Sets the value of the assetIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetIntegrationId(String value) {
        this.assetIntegrationId = value;
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
     * Gets the value of the compoundProductNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompoundProductNumber() {
        return compoundProductNumber;
    }

    /**
     * Sets the value of the compoundProductNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompoundProductNumber(String value) {
        this.compoundProductNumber = value;
    }

    /**
     * Gets the value of the tsReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSReasonCode() {
        return tsReasonCode;
    }

    /**
     * Sets the value of the tsReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSReasonCode(String value) {
        this.tsReasonCode = value;
    }

    /**
     * Gets the value of the activeDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveDocumentId() {
        return activeDocumentId;
    }

    /**
     * Sets the value of the activeDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveDocumentId(String value) {
        this.activeDocumentId = value;
    }

}
