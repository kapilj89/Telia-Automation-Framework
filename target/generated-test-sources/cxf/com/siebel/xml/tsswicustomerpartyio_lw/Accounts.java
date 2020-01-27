
package com.siebel.xml.tsswicustomerpartyio_lw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Accounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Accounts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MasterAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ParentAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryBillingProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSParentSubSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSSubSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListOfAccount_Contacts" type="{http://www.siebel.com/xml/TSSWICustomerPartyIO_LW}ListOfAccount_Contacts" minOccurs="0"/&gt;
 *         &lt;element name="ListOfCutAddresses" type="{http://www.siebel.com/xml/TSSWICustomerPartyIO_LW}ListOfCutAddresses" minOccurs="0"/&gt;
 *         &lt;element name="ListOfContacts" type="{http://www.siebel.com/xml/TSSWICustomerPartyIO_LW}ListOfContacts" minOccurs="0"/&gt;
 *         &lt;element name="ListOfInternalDivisions" type="{http://www.siebel.com/xml/TSSWICustomerPartyIO_LW}ListOfInternalDivisions" minOccurs="0"/&gt;
 *         &lt;element name="ListOfComInvoiceProfiles" type="{http://www.siebel.com/xml/TSSWICustomerPartyIO_LW}ListOfComInvoiceProfiles" minOccurs="0"/&gt;
 *         &lt;element name="ListOfAccount_BusinessAddresses" type="{http://www.siebel.com/xml/TSSWICustomerPartyIO_LW}ListOfAccount_BusinessAddresses" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Accounts", propOrder = {
    "accountNumber",
    "accountTypeCode",
    "ssn",
    "masterAccountId",
    "name",
    "parentAccountId",
    "priceList",
    "priceListId",
    "primaryAddressId",
    "primaryContactId",
    "primaryOrganizationId",
    "rowId",
    "type",
    "tsChannel",
    "primaryBillingProfileId",
    "tsCustomerId",
    "organization",
    "tsParentSubSegment",
    "tsSubSegment",
    "listOfAccountContacts",
    "listOfCutAddresses",
    "listOfContacts",
    "listOfInternalDivisions",
    "listOfComInvoiceProfiles",
    "listOfAccountBusinessAddresses"
})
public class Accounts {

    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "AccountTypeCode", required = true)
    protected String accountTypeCode;
    @XmlElement(name = "SSN")
    protected String ssn;
    @XmlElement(name = "MasterAccountId")
    protected String masterAccountId;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ParentAccountId")
    protected String parentAccountId;
    @XmlElement(name = "PriceList")
    protected String priceList;
    @XmlElement(name = "PriceListId")
    protected String priceListId;
    @XmlElement(name = "PrimaryAddressId")
    protected String primaryAddressId;
    @XmlElement(name = "PrimaryContactId")
    protected String primaryContactId;
    @XmlElement(name = "PrimaryOrganizationId")
    protected String primaryOrganizationId;
    @XmlElement(name = "RowId")
    protected String rowId;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "TSChannel")
    protected String tsChannel;
    @XmlElement(name = "PrimaryBillingProfileId")
    protected String primaryBillingProfileId;
    @XmlElement(name = "TSCustomerId")
    protected String tsCustomerId;
    @XmlElement(name = "Organization")
    protected String organization;
    @XmlElement(name = "TSParentSubSegment")
    protected String tsParentSubSegment;
    @XmlElement(name = "TSSubSegment")
    protected String tsSubSegment;
    @XmlElement(name = "ListOfAccount_Contacts")
    protected ListOfAccountContacts listOfAccountContacts;
    @XmlElement(name = "ListOfCutAddresses")
    protected ListOfCutAddresses listOfCutAddresses;
    @XmlElement(name = "ListOfContacts")
    protected ListOfContacts listOfContacts;
    @XmlElement(name = "ListOfInternalDivisions")
    protected ListOfInternalDivisions listOfInternalDivisions;
    @XmlElement(name = "ListOfComInvoiceProfiles")
    protected ListOfComInvoiceProfiles listOfComInvoiceProfiles;
    @XmlElement(name = "ListOfAccount_BusinessAddresses")
    protected ListOfAccountBusinessAddresses listOfAccountBusinessAddresses;
    @XmlAttribute(name = "operation")
    protected String operation;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeCode() {
        return accountTypeCode;
    }

    /**
     * Sets the value of the accountTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeCode(String value) {
        this.accountTypeCode = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the masterAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterAccountId() {
        return masterAccountId;
    }

    /**
     * Sets the value of the masterAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterAccountId(String value) {
        this.masterAccountId = value;
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
     * Gets the value of the parentAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAccountId() {
        return parentAccountId;
    }

    /**
     * Sets the value of the parentAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAccountId(String value) {
        this.parentAccountId = value;
    }

    /**
     * Gets the value of the priceList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceList() {
        return priceList;
    }

    /**
     * Sets the value of the priceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceList(String value) {
        this.priceList = value;
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
     * Gets the value of the primaryAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAddressId() {
        return primaryAddressId;
    }

    /**
     * Sets the value of the primaryAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAddressId(String value) {
        this.primaryAddressId = value;
    }

    /**
     * Gets the value of the primaryContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryContactId() {
        return primaryContactId;
    }

    /**
     * Sets the value of the primaryContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryContactId(String value) {
        this.primaryContactId = value;
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
     * Gets the value of the rowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowId(String value) {
        this.rowId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the tsChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSChannel() {
        return tsChannel;
    }

    /**
     * Sets the value of the tsChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSChannel(String value) {
        this.tsChannel = value;
    }

    /**
     * Gets the value of the primaryBillingProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillingProfileId() {
        return primaryBillingProfileId;
    }

    /**
     * Sets the value of the primaryBillingProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillingProfileId(String value) {
        this.primaryBillingProfileId = value;
    }

    /**
     * Gets the value of the tsCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCustomerId() {
        return tsCustomerId;
    }

    /**
     * Sets the value of the tsCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCustomerId(String value) {
        this.tsCustomerId = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the tsParentSubSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSParentSubSegment() {
        return tsParentSubSegment;
    }

    /**
     * Sets the value of the tsParentSubSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSParentSubSegment(String value) {
        this.tsParentSubSegment = value;
    }

    /**
     * Gets the value of the tsSubSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSubSegment() {
        return tsSubSegment;
    }

    /**
     * Sets the value of the tsSubSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSubSegment(String value) {
        this.tsSubSegment = value;
    }

    /**
     * Gets the value of the listOfAccountContacts property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccountContacts }
     *     
     */
    public ListOfAccountContacts getListOfAccountContacts() {
        return listOfAccountContacts;
    }

    /**
     * Sets the value of the listOfAccountContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccountContacts }
     *     
     */
    public void setListOfAccountContacts(ListOfAccountContacts value) {
        this.listOfAccountContacts = value;
    }

    /**
     * Gets the value of the listOfCutAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCutAddresses }
     *     
     */
    public ListOfCutAddresses getListOfCutAddresses() {
        return listOfCutAddresses;
    }

    /**
     * Sets the value of the listOfCutAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCutAddresses }
     *     
     */
    public void setListOfCutAddresses(ListOfCutAddresses value) {
        this.listOfCutAddresses = value;
    }

    /**
     * Gets the value of the listOfContacts property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContacts }
     *     
     */
    public ListOfContacts getListOfContacts() {
        return listOfContacts;
    }

    /**
     * Sets the value of the listOfContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContacts }
     *     
     */
    public void setListOfContacts(ListOfContacts value) {
        this.listOfContacts = value;
    }

    /**
     * Gets the value of the listOfInternalDivisions property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfInternalDivisions }
     *     
     */
    public ListOfInternalDivisions getListOfInternalDivisions() {
        return listOfInternalDivisions;
    }

    /**
     * Sets the value of the listOfInternalDivisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfInternalDivisions }
     *     
     */
    public void setListOfInternalDivisions(ListOfInternalDivisions value) {
        this.listOfInternalDivisions = value;
    }

    /**
     * Gets the value of the listOfComInvoiceProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfComInvoiceProfiles }
     *     
     */
    public ListOfComInvoiceProfiles getListOfComInvoiceProfiles() {
        return listOfComInvoiceProfiles;
    }

    /**
     * Sets the value of the listOfComInvoiceProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfComInvoiceProfiles }
     *     
     */
    public void setListOfComInvoiceProfiles(ListOfComInvoiceProfiles value) {
        this.listOfComInvoiceProfiles = value;
    }

    /**
     * Gets the value of the listOfAccountBusinessAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccountBusinessAddresses }
     *     
     */
    public ListOfAccountBusinessAddresses getListOfAccountBusinessAddresses() {
        return listOfAccountBusinessAddresses;
    }

    /**
     * Sets the value of the listOfAccountBusinessAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccountBusinessAddresses }
     *     
     */
    public void setListOfAccountBusinessAddresses(ListOfAccountBusinessAddresses value) {
        this.listOfAccountBusinessAddresses = value;
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

}
