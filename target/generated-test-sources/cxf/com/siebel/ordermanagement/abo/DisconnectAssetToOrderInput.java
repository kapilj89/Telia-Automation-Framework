
package com.siebel.ordermanagement.abo;

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
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BulkDisconnectOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MDUExpireContract" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MDUContractEnddate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MDUDelContractNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BulkDiscntTrigger" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CompoundProductNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MDU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SALineId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="QuoteId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "orderId",
    "dueDate",
    "bulkDisconnectOrderId",
    "assetNumber",
    "mduExpireContract",
    "mduContractEnddate",
    "mduDelContractNum",
    "bulkDiscntTrigger",
    "assetIntegrationId",
    "accountId",
    "contactId",
    "compoundProductNumber",
    "mdu",
    "saLineId",
    "quoteId",
    "priceListId",
    "activeDocumentId"
})
@XmlRootElement(name = "DisconnectAssetToOrder_Input")
public class DisconnectAssetToOrderInput {

    @XmlElement(name = "OrderId", required = true)
    protected String orderId;
    @XmlElement(name = "DueDate", required = true)
    protected String dueDate;
    @XmlElement(name = "BulkDisconnectOrderId", required = true)
    protected String bulkDisconnectOrderId;
    @XmlElement(name = "AssetNumber", required = true)
    protected String assetNumber;
    @XmlElement(name = "MDUExpireContract", required = true)
    protected String mduExpireContract;
    @XmlElement(name = "MDUContractEnddate", required = true)
    protected String mduContractEnddate;
    @XmlElement(name = "MDUDelContractNum", required = true)
    protected String mduDelContractNum;
    @XmlElement(name = "BulkDiscntTrigger", required = true)
    protected String bulkDiscntTrigger;
    @XmlElement(name = "AssetIntegrationId", required = true)
    protected String assetIntegrationId;
    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "ContactId", required = true)
    protected String contactId;
    @XmlElement(name = "CompoundProductNumber", required = true)
    protected String compoundProductNumber;
    @XmlElement(name = "MDU", required = true)
    protected String mdu;
    @XmlElement(name = "SALineId", required = true)
    protected String saLineId;
    @XmlElement(name = "QuoteId", required = true)
    protected String quoteId;
    @XmlElement(name = "PriceListId", required = true)
    protected String priceListId;
    @XmlElement(name = "ActiveDocumentId", required = true)
    protected String activeDocumentId;

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
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
     * Gets the value of the bulkDisconnectOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulkDisconnectOrderId() {
        return bulkDisconnectOrderId;
    }

    /**
     * Sets the value of the bulkDisconnectOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulkDisconnectOrderId(String value) {
        this.bulkDisconnectOrderId = value;
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
     * Gets the value of the mduExpireContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDUExpireContract() {
        return mduExpireContract;
    }

    /**
     * Sets the value of the mduExpireContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDUExpireContract(String value) {
        this.mduExpireContract = value;
    }

    /**
     * Gets the value of the mduContractEnddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDUContractEnddate() {
        return mduContractEnddate;
    }

    /**
     * Sets the value of the mduContractEnddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDUContractEnddate(String value) {
        this.mduContractEnddate = value;
    }

    /**
     * Gets the value of the mduDelContractNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDUDelContractNum() {
        return mduDelContractNum;
    }

    /**
     * Sets the value of the mduDelContractNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDUDelContractNum(String value) {
        this.mduDelContractNum = value;
    }

    /**
     * Gets the value of the bulkDiscntTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulkDiscntTrigger() {
        return bulkDiscntTrigger;
    }

    /**
     * Sets the value of the bulkDiscntTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulkDiscntTrigger(String value) {
        this.bulkDiscntTrigger = value;
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
     * Gets the value of the mdu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDU() {
        return mdu;
    }

    /**
     * Sets the value of the mdu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDU(String value) {
        this.mdu = value;
    }

    /**
     * Gets the value of the saLineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALineId() {
        return saLineId;
    }

    /**
     * Sets the value of the saLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALineId(String value) {
        this.saLineId = value;
    }

    /**
     * Gets the value of the quoteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteId() {
        return quoteId;
    }

    /**
     * Sets the value of the quoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteId(String value) {
        this.quoteId = value;
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
