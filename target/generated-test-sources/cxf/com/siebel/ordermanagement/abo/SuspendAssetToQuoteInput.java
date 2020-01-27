
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
 *         &lt;element name="TSC2BContainerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSChannelName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CompoundProductNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "tsc2BContainerName",
    "dueDate",
    "assetNumber",
    "tsChannelName",
    "assetIntegrationId",
    "accountId",
    "contactId",
    "compoundProductNumber",
    "priceListId",
    "activeDocumentId"
})
@XmlRootElement(name = "SuspendAssetToQuote_Input")
public class SuspendAssetToQuoteInput {

    @XmlElement(name = "TSC2BContainerName", required = true)
    protected String tsc2BContainerName;
    @XmlElement(name = "DueDate", required = true)
    protected String dueDate;
    @XmlElement(name = "AssetNumber", required = true)
    protected String assetNumber;
    @XmlElement(name = "TSChannelName", required = true)
    protected String tsChannelName;
    @XmlElement(name = "AssetIntegrationId", required = true)
    protected String assetIntegrationId;
    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "ContactId", required = true)
    protected String contactId;
    @XmlElement(name = "CompoundProductNumber", required = true)
    protected String compoundProductNumber;
    @XmlElement(name = "PriceListId", required = true)
    protected String priceListId;
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
