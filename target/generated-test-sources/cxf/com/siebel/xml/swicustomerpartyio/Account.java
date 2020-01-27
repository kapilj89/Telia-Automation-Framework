
package com.siebel.xml.swicustomerpartyio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HomePage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainFaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MasterAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ParentAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryBillToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AIAIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryBillingProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSCreditCheckExcept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSDateOfExpiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPartyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPrimaryAccountPointId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSSparLastUpd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSSparCustomerCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSParentSubSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSSubSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListOfAccount_Contact" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfAccount_Contact" minOccurs="0"/&gt;
 *         &lt;element name="ListOfCutAddress" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfCutAddress" minOccurs="0"/&gt;
 *         &lt;element name="ListOfContact" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfContact" minOccurs="0"/&gt;
 *         &lt;element name="ListOfInternalDivision" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfInternalDivision" minOccurs="0"/&gt;
 *         &lt;element name="ListOfComInvoiceProfile" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfComInvoiceProfile" minOccurs="0"/&gt;
 *         &lt;element name="ListOfComExemptionsProfile" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfComExemptionsProfile" minOccurs="0"/&gt;
 *         &lt;element name="ListOfComStatementProfile" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfComStatementProfile" minOccurs="0"/&gt;
 *         &lt;element name="ListOfPosition" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfPosition" minOccurs="0"/&gt;
 *         &lt;element name="ListOfAccountNote" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfAccountNote" minOccurs="0"/&gt;
 *         &lt;element name="ListOfCutAccount-BillToShipTo" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfCutAccount-BillToShipTo" minOccurs="0"/&gt;
 *         &lt;element name="ListOfAccount_BusinessAddress" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfAccount_BusinessAddress" minOccurs="0"/&gt;
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
@XmlType(name = "Account", propOrder = {
    "id",
    "created",
    "accountNumber",
    "accountStatus",
    "accountTypeCode",
    "currencyCode",
    "dunsNumber",
    "homePage",
    "integrationId",
    "ssn",
    "mainFaxNumber",
    "mainPhoneNumber",
    "masterAccountId",
    "name",
    "parentAccountId",
    "priceList",
    "priceListId",
    "primaryAddressId",
    "primaryBillToAddressId",
    "primaryContactId",
    "primaryOrganizationId",
    "primaryShipToAddressId",
    "rowId",
    "type",
    "aiaIntegrationId",
    "tsChannel",
    "primaryBillingProfileId",
    "tsCustomerId",
    "tsCategory",
    "tsCreditCheckExcept",
    "tsDateOfExpiry",
    "tsPartyStatus",
    "tsPrimaryAccountPointId",
    "tsSparLastUpd",
    "tsSparCustomerCategory",
    "organization",
    "tsParentSubSegment",
    "tsSubSegment",
    "listOfAccountContact",
    "listOfCutAddress",
    "listOfContact",
    "listOfInternalDivision",
    "listOfComInvoiceProfile",
    "listOfComExemptionsProfile",
    "listOfComStatementProfile",
    "listOfPosition",
    "listOfAccountNote",
    "listOfCutAccountBillToShipTo",
    "listOfAccountBusinessAddress"
})
public class Account {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Created")
    protected String created;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "AccountStatus")
    protected String accountStatus;
    @XmlElement(name = "AccountTypeCode", required = true)
    protected String accountTypeCode;
    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "HomePage")
    protected String homePage;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "SSN")
    protected String ssn;
    @XmlElement(name = "MainFaxNumber")
    protected String mainFaxNumber;
    @XmlElement(name = "MainPhoneNumber")
    protected String mainPhoneNumber;
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
    @XmlElement(name = "PrimaryBillToAddressId")
    protected String primaryBillToAddressId;
    @XmlElement(name = "PrimaryContactId")
    protected String primaryContactId;
    @XmlElement(name = "PrimaryOrganizationId")
    protected String primaryOrganizationId;
    @XmlElement(name = "PrimaryShipToAddressId")
    protected String primaryShipToAddressId;
    @XmlElement(name = "RowId")
    protected String rowId;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "AIAIntegrationId")
    protected String aiaIntegrationId;
    @XmlElement(name = "TSChannel")
    protected String tsChannel;
    @XmlElement(name = "PrimaryBillingProfileId")
    protected String primaryBillingProfileId;
    @XmlElement(name = "TSCustomerId")
    protected String tsCustomerId;
    @XmlElement(name = "TSCategory")
    protected String tsCategory;
    @XmlElement(name = "TSCreditCheckExcept")
    protected String tsCreditCheckExcept;
    @XmlElement(name = "TSDateOfExpiry")
    protected String tsDateOfExpiry;
    @XmlElement(name = "TSPartyStatus")
    protected String tsPartyStatus;
    @XmlElement(name = "TSPrimaryAccountPointId")
    protected String tsPrimaryAccountPointId;
    @XmlElement(name = "TSSparLastUpd")
    protected String tsSparLastUpd;
    @XmlElement(name = "TSSparCustomerCategory")
    protected String tsSparCustomerCategory;
    @XmlElement(name = "Organization")
    protected String organization;
    @XmlElement(name = "TSParentSubSegment")
    protected String tsParentSubSegment;
    @XmlElement(name = "TSSubSegment")
    protected String tsSubSegment;
    @XmlElement(name = "ListOfAccount_Contact")
    protected ListOfAccountContact listOfAccountContact;
    @XmlElement(name = "ListOfCutAddress")
    protected ListOfCutAddress listOfCutAddress;
    @XmlElement(name = "ListOfContact")
    protected ListOfContact listOfContact;
    @XmlElement(name = "ListOfInternalDivision")
    protected ListOfInternalDivision listOfInternalDivision;
    @XmlElement(name = "ListOfComInvoiceProfile")
    protected ListOfComInvoiceProfile listOfComInvoiceProfile;
    @XmlElement(name = "ListOfComExemptionsProfile")
    protected ListOfComExemptionsProfile listOfComExemptionsProfile;
    @XmlElement(name = "ListOfComStatementProfile")
    protected ListOfComStatementProfile listOfComStatementProfile;
    @XmlElement(name = "ListOfPosition")
    protected ListOfPosition listOfPosition;
    @XmlElement(name = "ListOfAccountNote")
    protected ListOfAccountNote listOfAccountNote;
    @XmlElement(name = "ListOfCutAccount-BillToShipTo")
    protected ListOfCutAccountBillToShipTo listOfCutAccountBillToShipTo;
    @XmlElement(name = "ListOfAccount_BusinessAddress")
    protected ListOfAccountBusinessAddress listOfAccountBusinessAddress;
    @XmlAttribute(name = "operation")
    protected String operation;

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
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
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
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the homePage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePage() {
        return homePage;
    }

    /**
     * Sets the value of the homePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePage(String value) {
        this.homePage = value;
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
     * Gets the value of the mainFaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainFaxNumber() {
        return mainFaxNumber;
    }

    /**
     * Sets the value of the mainFaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainFaxNumber(String value) {
        this.mainFaxNumber = value;
    }

    /**
     * Gets the value of the mainPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainPhoneNumber() {
        return mainPhoneNumber;
    }

    /**
     * Sets the value of the mainPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainPhoneNumber(String value) {
        this.mainPhoneNumber = value;
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
     * Gets the value of the primaryBillToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToAddressId() {
        return primaryBillToAddressId;
    }

    /**
     * Sets the value of the primaryBillToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToAddressId(String value) {
        this.primaryBillToAddressId = value;
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
     * Gets the value of the primaryShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToAddressId() {
        return primaryShipToAddressId;
    }

    /**
     * Sets the value of the primaryShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToAddressId(String value) {
        this.primaryShipToAddressId = value;
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
     * Gets the value of the aiaIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIAIntegrationId() {
        return aiaIntegrationId;
    }

    /**
     * Sets the value of the aiaIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIAIntegrationId(String value) {
        this.aiaIntegrationId = value;
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
     * Gets the value of the tsCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCategory() {
        return tsCategory;
    }

    /**
     * Sets the value of the tsCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCategory(String value) {
        this.tsCategory = value;
    }

    /**
     * Gets the value of the tsCreditCheckExcept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCreditCheckExcept() {
        return tsCreditCheckExcept;
    }

    /**
     * Sets the value of the tsCreditCheckExcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCreditCheckExcept(String value) {
        this.tsCreditCheckExcept = value;
    }

    /**
     * Gets the value of the tsDateOfExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSDateOfExpiry() {
        return tsDateOfExpiry;
    }

    /**
     * Sets the value of the tsDateOfExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSDateOfExpiry(String value) {
        this.tsDateOfExpiry = value;
    }

    /**
     * Gets the value of the tsPartyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPartyStatus() {
        return tsPartyStatus;
    }

    /**
     * Sets the value of the tsPartyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPartyStatus(String value) {
        this.tsPartyStatus = value;
    }

    /**
     * Gets the value of the tsPrimaryAccountPointId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPrimaryAccountPointId() {
        return tsPrimaryAccountPointId;
    }

    /**
     * Sets the value of the tsPrimaryAccountPointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPrimaryAccountPointId(String value) {
        this.tsPrimaryAccountPointId = value;
    }

    /**
     * Gets the value of the tsSparLastUpd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSparLastUpd() {
        return tsSparLastUpd;
    }

    /**
     * Sets the value of the tsSparLastUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSparLastUpd(String value) {
        this.tsSparLastUpd = value;
    }

    /**
     * Gets the value of the tsSparCustomerCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSparCustomerCategory() {
        return tsSparCustomerCategory;
    }

    /**
     * Sets the value of the tsSparCustomerCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSparCustomerCategory(String value) {
        this.tsSparCustomerCategory = value;
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
     * Gets the value of the listOfAccountContact property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccountContact }
     *     
     */
    public ListOfAccountContact getListOfAccountContact() {
        return listOfAccountContact;
    }

    /**
     * Sets the value of the listOfAccountContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccountContact }
     *     
     */
    public void setListOfAccountContact(ListOfAccountContact value) {
        this.listOfAccountContact = value;
    }

    /**
     * Gets the value of the listOfCutAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCutAddress }
     *     
     */
    public ListOfCutAddress getListOfCutAddress() {
        return listOfCutAddress;
    }

    /**
     * Sets the value of the listOfCutAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCutAddress }
     *     
     */
    public void setListOfCutAddress(ListOfCutAddress value) {
        this.listOfCutAddress = value;
    }

    /**
     * Gets the value of the listOfContact property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContact }
     *     
     */
    public ListOfContact getListOfContact() {
        return listOfContact;
    }

    /**
     * Sets the value of the listOfContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContact }
     *     
     */
    public void setListOfContact(ListOfContact value) {
        this.listOfContact = value;
    }

    /**
     * Gets the value of the listOfInternalDivision property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfInternalDivision }
     *     
     */
    public ListOfInternalDivision getListOfInternalDivision() {
        return listOfInternalDivision;
    }

    /**
     * Sets the value of the listOfInternalDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfInternalDivision }
     *     
     */
    public void setListOfInternalDivision(ListOfInternalDivision value) {
        this.listOfInternalDivision = value;
    }

    /**
     * Gets the value of the listOfComInvoiceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfComInvoiceProfile }
     *     
     */
    public ListOfComInvoiceProfile getListOfComInvoiceProfile() {
        return listOfComInvoiceProfile;
    }

    /**
     * Sets the value of the listOfComInvoiceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfComInvoiceProfile }
     *     
     */
    public void setListOfComInvoiceProfile(ListOfComInvoiceProfile value) {
        this.listOfComInvoiceProfile = value;
    }

    /**
     * Gets the value of the listOfComExemptionsProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfComExemptionsProfile }
     *     
     */
    public ListOfComExemptionsProfile getListOfComExemptionsProfile() {
        return listOfComExemptionsProfile;
    }

    /**
     * Sets the value of the listOfComExemptionsProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfComExemptionsProfile }
     *     
     */
    public void setListOfComExemptionsProfile(ListOfComExemptionsProfile value) {
        this.listOfComExemptionsProfile = value;
    }

    /**
     * Gets the value of the listOfComStatementProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfComStatementProfile }
     *     
     */
    public ListOfComStatementProfile getListOfComStatementProfile() {
        return listOfComStatementProfile;
    }

    /**
     * Sets the value of the listOfComStatementProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfComStatementProfile }
     *     
     */
    public void setListOfComStatementProfile(ListOfComStatementProfile value) {
        this.listOfComStatementProfile = value;
    }

    /**
     * Gets the value of the listOfPosition property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPosition }
     *     
     */
    public ListOfPosition getListOfPosition() {
        return listOfPosition;
    }

    /**
     * Sets the value of the listOfPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPosition }
     *     
     */
    public void setListOfPosition(ListOfPosition value) {
        this.listOfPosition = value;
    }

    /**
     * Gets the value of the listOfAccountNote property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccountNote }
     *     
     */
    public ListOfAccountNote getListOfAccountNote() {
        return listOfAccountNote;
    }

    /**
     * Sets the value of the listOfAccountNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccountNote }
     *     
     */
    public void setListOfAccountNote(ListOfAccountNote value) {
        this.listOfAccountNote = value;
    }

    /**
     * Gets the value of the listOfCutAccountBillToShipTo property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCutAccountBillToShipTo }
     *     
     */
    public ListOfCutAccountBillToShipTo getListOfCutAccountBillToShipTo() {
        return listOfCutAccountBillToShipTo;
    }

    /**
     * Sets the value of the listOfCutAccountBillToShipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCutAccountBillToShipTo }
     *     
     */
    public void setListOfCutAccountBillToShipTo(ListOfCutAccountBillToShipTo value) {
        this.listOfCutAccountBillToShipTo = value;
    }

    /**
     * Gets the value of the listOfAccountBusinessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccountBusinessAddress }
     *     
     */
    public ListOfAccountBusinessAddress getListOfAccountBusinessAddress() {
        return listOfAccountBusinessAddress;
    }

    /**
     * Sets the value of the listOfAccountBusinessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccountBusinessAddress }
     *     
     */
    public void setListOfAccountBusinessAddress(ListOfAccountBusinessAddress value) {
        this.listOfAccountBusinessAddress = value;
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
