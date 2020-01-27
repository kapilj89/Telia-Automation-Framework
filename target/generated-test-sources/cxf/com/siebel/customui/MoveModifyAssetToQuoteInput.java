
package com.siebel.customui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="QuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSCSRId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NewPromotionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSChannelName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Object_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RequestType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderSubType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PriceOnSync" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "quoteNumber",
    "dueDate",
    "tscsrId",
    "newPromotionId",
    "assetNumber",
    "tsChannelName",
    "objectSpcId",
    "requestType",
    "orderSubType",
    "priceOnSync",
    "assetIntegrationId",
    "accountId",
    "contactId",
    "priceListId",
    "tsReasonCode",
    "activeDocumentId"
})
@XmlRootElement(name = "MoveModifyAssetToQuote_Input")
public class MoveModifyAssetToQuoteInput {

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
    @XmlElement(name = "Object_spcId", required = true)
    protected String objectSpcId;
    @XmlElement(name = "RequestType", required = true)
    protected String requestType;
    @XmlElement(name = "OrderSubType", required = true)
    protected String orderSubType;
    @XmlElement(name = "PriceOnSync", required = true)
    protected String priceOnSync;
    @XmlElement(name = "AssetIntegrationId", required = true)
    protected String assetIntegrationId;
    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "ContactId", required = true)
    protected String contactId;
    @XmlElement(name = "PriceListId", required = true)
    protected String priceListId;
    @XmlElement(name = "TSReasonCode", required = true)
    protected String tsReasonCode;
    @XmlElement(name = "ActiveDocumentId", required = true)
    protected String activeDocumentId;

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
     * Gets the value of the objectSpcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectSpcId() {
        return objectSpcId;
    }

    /**
     * Sets the value of the objectSpcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectSpcId(String value) {
        this.objectSpcId = value;
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
     * Gets the value of the priceOnSync property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceOnSync() {
        return priceOnSync;
    }

    /**
     * Sets the value of the priceOnSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceOnSync(String value) {
        this.priceOnSync = value;
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
