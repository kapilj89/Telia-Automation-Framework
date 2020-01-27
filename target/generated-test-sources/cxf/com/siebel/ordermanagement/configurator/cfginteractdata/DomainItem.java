
package com.siebel.ordermanagement.configurator.cfginteractdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomainItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExcludedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Excluded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CanDrilldown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainItem", propOrder = {
    "exchangeDate",
    "excludedBy",
    "excluded",
    "canDrilldown",
    "priceType",
    "name",
    "listPrice",
    "id",
    "currencyCode"
})
public class DomainItem {

    @XmlElement(name = "ExchangeDate")
    protected String exchangeDate;
    @XmlElement(name = "ExcludedBy")
    protected String excludedBy;
    @XmlElement(name = "Excluded")
    protected String excluded;
    @XmlElement(name = "CanDrilldown")
    protected String canDrilldown;
    @XmlElement(name = "PriceType")
    protected String priceType;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ListPrice")
    protected String listPrice;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;

    /**
     * Gets the value of the exchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeDate() {
        return exchangeDate;
    }

    /**
     * Sets the value of the exchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeDate(String value) {
        this.exchangeDate = value;
    }

    /**
     * Gets the value of the excludedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludedBy() {
        return excludedBy;
    }

    /**
     * Sets the value of the excludedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludedBy(String value) {
        this.excludedBy = value;
    }

    /**
     * Gets the value of the excluded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcluded() {
        return excluded;
    }

    /**
     * Sets the value of the excluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcluded(String value) {
        this.excluded = value;
    }

    /**
     * Gets the value of the canDrilldown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanDrilldown() {
        return canDrilldown;
    }

    /**
     * Sets the value of the canDrilldown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanDrilldown(String value) {
        this.canDrilldown = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the listPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListPrice() {
        return listPrice;
    }

    /**
     * Sets the value of the listPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListPrice(String value) {
        this.listPrice = value;
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

}
