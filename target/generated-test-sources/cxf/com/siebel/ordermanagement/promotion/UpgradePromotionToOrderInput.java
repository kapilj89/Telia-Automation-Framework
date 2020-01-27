
package com.siebel.ordermanagement.promotion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.order.data.ListOfOrder;


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
 *         &lt;element name="NewPromotionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OverridePenaltyAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://siebel.com/OrderManagement/Order/Data}ListOfOrder"/&gt;
 *         &lt;element name="OverrideProratePlanId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CompoundProductNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "newPromotionId",
    "assetNumber",
    "overridePenaltyAmount",
    "listOfOrder",
    "overrideProratePlanId",
    "assetIntegrationId",
    "accountId",
    "contactId",
    "compoundProductNumber",
    "activeDocumentId"
})
@XmlRootElement(name = "UpgradePromotionToOrder_Input")
public class UpgradePromotionToOrderInput {

    @XmlElement(name = "NewPromotionId", required = true)
    protected String newPromotionId;
    @XmlElement(name = "AssetNumber", required = true)
    protected String assetNumber;
    @XmlElement(name = "OverridePenaltyAmount", required = true)
    protected String overridePenaltyAmount;
    @XmlElement(name = "ListOfOrder", namespace = "http://siebel.com/OrderManagement/Order/Data", required = true)
    protected ListOfOrder listOfOrder;
    @XmlElement(name = "OverrideProratePlanId", required = true)
    protected String overrideProratePlanId;
    @XmlElement(name = "AssetIntegrationId", required = true)
    protected String assetIntegrationId;
    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "ContactId", required = true)
    protected String contactId;
    @XmlElement(name = "CompoundProductNumber", required = true)
    protected String compoundProductNumber;
    @XmlElement(name = "ActiveDocumentId", required = true)
    protected String activeDocumentId;

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
     * Gets the value of the listOfOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrder }
     *     
     */
    public ListOfOrder getListOfOrder() {
        return listOfOrder;
    }

    /**
     * Sets the value of the listOfOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrder }
     *     
     */
    public void setListOfOrder(ListOfOrder value) {
        this.listOfOrder = value;
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
