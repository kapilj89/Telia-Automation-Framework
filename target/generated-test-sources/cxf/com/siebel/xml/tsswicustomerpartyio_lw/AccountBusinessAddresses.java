
package com.siebel.xml.tsswicustomerpartyio_lw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Account_BusinessAddresses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account_BusinessAddresses"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TSVDSLBlockFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSSDStream" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSHDStream" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSHDBlockFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPointId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSBillingAddressFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSInstallationAddressFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSLegalAddressFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSShippingAddressFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IsPrimaryMVG" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="searchspec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account_BusinessAddresses", propOrder = {
    "tsvdslBlockFlag",
    "tssdStream",
    "tshdStream",
    "tshdBlockFlag",
    "tsPointId",
    "addressId",
    "tsBillingAddressFlag",
    "tsInstallationAddressFlag",
    "tsLegalAddressFlag",
    "tsShippingAddressFlag",
    "id"
})
public class AccountBusinessAddresses {

    @XmlElement(name = "TSVDSLBlockFlag")
    protected String tsvdslBlockFlag;
    @XmlElement(name = "TSSDStream")
    protected String tssdStream;
    @XmlElement(name = "TSHDStream")
    protected String tshdStream;
    @XmlElement(name = "TSHDBlockFlag")
    protected String tshdBlockFlag;
    @XmlElement(name = "TSPointId")
    protected String tsPointId;
    @XmlElement(name = "AddressId")
    protected String addressId;
    @XmlElement(name = "TSBillingAddressFlag")
    protected String tsBillingAddressFlag;
    @XmlElement(name = "TSInstallationAddressFlag")
    protected String tsInstallationAddressFlag;
    @XmlElement(name = "TSLegalAddressFlag")
    protected String tsLegalAddressFlag;
    @XmlElement(name = "TSShippingAddressFlag")
    protected String tsShippingAddressFlag;
    @XmlElement(name = "Id")
    protected String id;
    @XmlAttribute(name = "IsPrimaryMVG")
    protected String isPrimaryMVG;
    @XmlAttribute(name = "operation")
    protected String operation;
    @XmlAttribute(name = "searchspec")
    protected String searchspec;

    /**
     * Gets the value of the tsvdslBlockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSVDSLBlockFlag() {
        return tsvdslBlockFlag;
    }

    /**
     * Sets the value of the tsvdslBlockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSVDSLBlockFlag(String value) {
        this.tsvdslBlockFlag = value;
    }

    /**
     * Gets the value of the tssdStream property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSDStream() {
        return tssdStream;
    }

    /**
     * Sets the value of the tssdStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSDStream(String value) {
        this.tssdStream = value;
    }

    /**
     * Gets the value of the tshdStream property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSHDStream() {
        return tshdStream;
    }

    /**
     * Sets the value of the tshdStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSHDStream(String value) {
        this.tshdStream = value;
    }

    /**
     * Gets the value of the tshdBlockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSHDBlockFlag() {
        return tshdBlockFlag;
    }

    /**
     * Sets the value of the tshdBlockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSHDBlockFlag(String value) {
        this.tshdBlockFlag = value;
    }

    /**
     * Gets the value of the tsPointId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPointId() {
        return tsPointId;
    }

    /**
     * Sets the value of the tsPointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPointId(String value) {
        this.tsPointId = value;
    }

    /**
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressId(String value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the tsBillingAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSBillingAddressFlag() {
        return tsBillingAddressFlag;
    }

    /**
     * Sets the value of the tsBillingAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSBillingAddressFlag(String value) {
        this.tsBillingAddressFlag = value;
    }

    /**
     * Gets the value of the tsInstallationAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSInstallationAddressFlag() {
        return tsInstallationAddressFlag;
    }

    /**
     * Sets the value of the tsInstallationAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSInstallationAddressFlag(String value) {
        this.tsInstallationAddressFlag = value;
    }

    /**
     * Gets the value of the tsLegalAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLegalAddressFlag() {
        return tsLegalAddressFlag;
    }

    /**
     * Sets the value of the tsLegalAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLegalAddressFlag(String value) {
        this.tsLegalAddressFlag = value;
    }

    /**
     * Gets the value of the tsShippingAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSShippingAddressFlag() {
        return tsShippingAddressFlag;
    }

    /**
     * Sets the value of the tsShippingAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSShippingAddressFlag(String value) {
        this.tsShippingAddressFlag = value;
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
     * Gets the value of the isPrimaryMVG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrimaryMVG() {
        return isPrimaryMVG;
    }

    /**
     * Sets the value of the isPrimaryMVG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrimaryMVG(String value) {
        this.isPrimaryMVG = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
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
