
package com.siebel.ordermanagement.quote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.quote.data.ListOfQuote;
import com.siebel.ordermanagement.quote.productdata.ListOfData;


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
 *         &lt;element name="GetPricing" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Account_spcPrice_spcList_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://siebel.com/OrderManagement/Quote/ProductData}ListOfData"/&gt;
 *         &lt;element name="SyncQuoteFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://siebel.com/OrderManagement/Quote/Data}ListOfQuote"/&gt;
 *         &lt;element name="CheckEligibility" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "getPricing",
    "accountSpcPriceSpcListSpcId",
    "listOfData",
    "syncQuoteFlag",
    "listOfQuote",
    "checkEligibility",
    "accountId",
    "priceListId"
})
@XmlRootElement(name = "QuoteAddItems_Input")
public class QuoteAddItemsInput {

    @XmlElement(name = "GetPricing", required = true)
    protected String getPricing;
    @XmlElement(name = "Account_spcPrice_spcList_spcId", required = true)
    protected String accountSpcPriceSpcListSpcId;
    @XmlElement(name = "ListOfData", namespace = "http://siebel.com/OrderManagement/Quote/ProductData", required = true)
    protected ListOfData listOfData;
    @XmlElement(name = "SyncQuoteFlag", required = true)
    protected String syncQuoteFlag;
    @XmlElement(name = "ListOfQuote", namespace = "http://siebel.com/OrderManagement/Quote/Data", required = true)
    protected ListOfQuote listOfQuote;
    @XmlElement(name = "CheckEligibility", required = true)
    protected String checkEligibility;
    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "PriceListId", required = true)
    protected String priceListId;

    /**
     * Gets the value of the getPricing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPricing() {
        return getPricing;
    }

    /**
     * Sets the value of the getPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPricing(String value) {
        this.getPricing = value;
    }

    /**
     * Gets the value of the accountSpcPriceSpcListSpcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSpcPriceSpcListSpcId() {
        return accountSpcPriceSpcListSpcId;
    }

    /**
     * Sets the value of the accountSpcPriceSpcListSpcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSpcPriceSpcListSpcId(String value) {
        this.accountSpcPriceSpcListSpcId = value;
    }

    /**
     * Gets the value of the listOfData property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfData }
     *     
     */
    public ListOfData getListOfData() {
        return listOfData;
    }

    /**
     * Sets the value of the listOfData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfData }
     *     
     */
    public void setListOfData(ListOfData value) {
        this.listOfData = value;
    }

    /**
     * Gets the value of the syncQuoteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncQuoteFlag() {
        return syncQuoteFlag;
    }

    /**
     * Sets the value of the syncQuoteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncQuoteFlag(String value) {
        this.syncQuoteFlag = value;
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
     * Gets the value of the checkEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckEligibility() {
        return checkEligibility;
    }

    /**
     * Sets the value of the checkEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckEligibility(String value) {
        this.checkEligibility = value;
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

}
