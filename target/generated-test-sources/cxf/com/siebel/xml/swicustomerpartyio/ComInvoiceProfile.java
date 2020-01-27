
package com.siebel.xml.swicustomerpartyio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComInvoiceProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComInvoiceProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillingProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankAuthorizationflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankLanguageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillAverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillCycleDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillVendorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BudgetBillingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPNIDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPNIFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CollectionsFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardBlockFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardBlockReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardExpirationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardNumberEncryptkeyReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardSecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardVerificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardVerificationNumberEncryptionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DaysToCash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailBillTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalBillingAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalBillingAccountNumber-Old" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtraCopies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InterestatInvoiceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastBillAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastBillDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MediaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingProfileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NoPayFormFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberofManualInvoices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReasonforManualOutsource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RepeatDebtorFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StandingOrderFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatementFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YearlyAdvancePaymentFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSBankId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListOfCutAddressCopy" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfCutAddressCopy" minOccurs="0"/&gt;
 *         &lt;element name="ListOfContactQuery" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfContactQuery" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComInvoiceProfile", propOrder = {
    "billingProfileId",
    "accountId",
    "addressId",
    "bankAccountName",
    "bankAccountNumber",
    "bankAccountType",
    "bankAuthorizationflag",
    "bankBranch",
    "bankLanguageCode",
    "bankLanguageId",
    "bankName",
    "billAverage",
    "billCycle",
    "billCycleDay",
    "billFrequency",
    "billSequence",
    "billSource",
    "billType",
    "billVendorId",
    "budgetBillingFlag",
    "cpniDate",
    "cpniFlag",
    "collectionsFlag",
    "contactId",
    "creditCardBlockFlag",
    "creditCardBlockReason",
    "creditCardCategory",
    "creditCardExpirationDate",
    "creditCardExpirationMonth",
    "creditCardExpirationYear",
    "creditCardName",
    "creditCardNumber",
    "creditCardNumberEncryptkeyReference",
    "creditCardSecurityCode",
    "creditCardType",
    "creditCardVerificationNumber",
    "creditCardVerificationNumberEncryptionKey",
    "daysToCash",
    "emailBillTo",
    "externalBillingAccountNumber",
    "externalBillingAccountNumberOld",
    "extraCopies",
    "interestatInvoiceFlag",
    "lastBillAmount",
    "lastBillDate",
    "mediaType",
    "billingProfileName",
    "noPayFormFlag",
    "numberofManualInvoices",
    "paymentMethod",
    "reasonforManualOutsource",
    "repeatDebtorFlag",
    "routingNumber",
    "standingOrderFlag",
    "statementFlag",
    "status",
    "yearlyAdvancePaymentFlag",
    "tsOrganizationName",
    "tsBankId",
    "listOfCutAddressCopy",
    "listOfContactQuery"
})
public class ComInvoiceProfile {

    @XmlElement(name = "BillingProfileId")
    protected String billingProfileId;
    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "AddressId")
    protected String addressId;
    @XmlElement(name = "BankAccountName")
    protected String bankAccountName;
    @XmlElement(name = "BankAccountNumber")
    protected String bankAccountNumber;
    @XmlElement(name = "BankAccountType")
    protected String bankAccountType;
    @XmlElement(name = "BankAuthorizationflag")
    protected String bankAuthorizationflag;
    @XmlElement(name = "BankBranch")
    protected String bankBranch;
    @XmlElement(name = "BankLanguageCode")
    protected String bankLanguageCode;
    @XmlElement(name = "BankLanguageId")
    protected String bankLanguageId;
    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "BillAverage")
    protected String billAverage;
    @XmlElement(name = "BillCycle")
    protected String billCycle;
    @XmlElement(name = "BillCycleDay")
    protected String billCycleDay;
    @XmlElement(name = "BillFrequency")
    protected String billFrequency;
    @XmlElement(name = "BillSequence")
    protected String billSequence;
    @XmlElement(name = "BillSource")
    protected String billSource;
    @XmlElement(name = "BillType")
    protected String billType;
    @XmlElement(name = "BillVendorId")
    protected String billVendorId;
    @XmlElement(name = "BudgetBillingFlag")
    protected String budgetBillingFlag;
    @XmlElement(name = "CPNIDate")
    protected String cpniDate;
    @XmlElement(name = "CPNIFlag")
    protected String cpniFlag;
    @XmlElement(name = "CollectionsFlag", required = true)
    protected String collectionsFlag;
    @XmlElement(name = "ContactId")
    protected String contactId;
    @XmlElement(name = "CreditCardBlockFlag")
    protected String creditCardBlockFlag;
    @XmlElement(name = "CreditCardBlockReason")
    protected String creditCardBlockReason;
    @XmlElement(name = "CreditCardCategory")
    protected String creditCardCategory;
    @XmlElement(name = "CreditCardExpirationDate")
    protected String creditCardExpirationDate;
    @XmlElement(name = "CreditCardExpirationMonth")
    protected String creditCardExpirationMonth;
    @XmlElement(name = "CreditCardExpirationYear")
    protected String creditCardExpirationYear;
    @XmlElement(name = "CreditCardName")
    protected String creditCardName;
    @XmlElement(name = "CreditCardNumber")
    protected String creditCardNumber;
    @XmlElement(name = "CreditCardNumberEncryptkeyReference")
    protected String creditCardNumberEncryptkeyReference;
    @XmlElement(name = "CreditCardSecurityCode")
    protected String creditCardSecurityCode;
    @XmlElement(name = "CreditCardType")
    protected String creditCardType;
    @XmlElement(name = "CreditCardVerificationNumber")
    protected String creditCardVerificationNumber;
    @XmlElement(name = "CreditCardVerificationNumberEncryptionKey")
    protected String creditCardVerificationNumberEncryptionKey;
    @XmlElement(name = "DaysToCash")
    protected String daysToCash;
    @XmlElement(name = "EmailBillTo")
    protected String emailBillTo;
    @XmlElement(name = "ExternalBillingAccountNumber")
    protected String externalBillingAccountNumber;
    @XmlElement(name = "ExternalBillingAccountNumber-Old")
    protected String externalBillingAccountNumberOld;
    @XmlElement(name = "ExtraCopies")
    protected String extraCopies;
    @XmlElement(name = "InterestatInvoiceFlag")
    protected String interestatInvoiceFlag;
    @XmlElement(name = "LastBillAmount")
    protected String lastBillAmount;
    @XmlElement(name = "LastBillDate")
    protected String lastBillDate;
    @XmlElement(name = "MediaType")
    protected String mediaType;
    @XmlElement(name = "BillingProfileName", required = true)
    protected String billingProfileName;
    @XmlElement(name = "NoPayFormFlag")
    protected String noPayFormFlag;
    @XmlElement(name = "NumberofManualInvoices")
    protected String numberofManualInvoices;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElement(name = "ReasonforManualOutsource")
    protected String reasonforManualOutsource;
    @XmlElement(name = "RepeatDebtorFlag", required = true)
    protected String repeatDebtorFlag;
    @XmlElement(name = "RoutingNumber")
    protected String routingNumber;
    @XmlElement(name = "StandingOrderFlag")
    protected String standingOrderFlag;
    @XmlElement(name = "StatementFlag")
    protected String statementFlag;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "YearlyAdvancePaymentFlag")
    protected String yearlyAdvancePaymentFlag;
    @XmlElement(name = "TSOrganizationName")
    protected String tsOrganizationName;
    @XmlElement(name = "TSBankId")
    protected String tsBankId;
    @XmlElement(name = "ListOfCutAddressCopy")
    protected ListOfCutAddressCopy listOfCutAddressCopy;
    @XmlElement(name = "ListOfContactQuery")
    protected ListOfContactQuery listOfContactQuery;

    /**
     * Gets the value of the billingProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingProfileId() {
        return billingProfileId;
    }

    /**
     * Sets the value of the billingProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingProfileId(String value) {
        this.billingProfileId = value;
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
     * Gets the value of the bankAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * Sets the value of the bankAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountName(String value) {
        this.bankAccountName = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the bankAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountType() {
        return bankAccountType;
    }

    /**
     * Sets the value of the bankAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountType(String value) {
        this.bankAccountType = value;
    }

    /**
     * Gets the value of the bankAuthorizationflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAuthorizationflag() {
        return bankAuthorizationflag;
    }

    /**
     * Sets the value of the bankAuthorizationflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAuthorizationflag(String value) {
        this.bankAuthorizationflag = value;
    }

    /**
     * Gets the value of the bankBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranch() {
        return bankBranch;
    }

    /**
     * Sets the value of the bankBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranch(String value) {
        this.bankBranch = value;
    }

    /**
     * Gets the value of the bankLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankLanguageCode() {
        return bankLanguageCode;
    }

    /**
     * Sets the value of the bankLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankLanguageCode(String value) {
        this.bankLanguageCode = value;
    }

    /**
     * Gets the value of the bankLanguageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankLanguageId() {
        return bankLanguageId;
    }

    /**
     * Sets the value of the bankLanguageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankLanguageId(String value) {
        this.bankLanguageId = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the billAverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAverage() {
        return billAverage;
    }

    /**
     * Sets the value of the billAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAverage(String value) {
        this.billAverage = value;
    }

    /**
     * Gets the value of the billCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycle() {
        return billCycle;
    }

    /**
     * Sets the value of the billCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycle(String value) {
        this.billCycle = value;
    }

    /**
     * Gets the value of the billCycleDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleDay() {
        return billCycleDay;
    }

    /**
     * Sets the value of the billCycleDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleDay(String value) {
        this.billCycleDay = value;
    }

    /**
     * Gets the value of the billFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillFrequency() {
        return billFrequency;
    }

    /**
     * Sets the value of the billFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillFrequency(String value) {
        this.billFrequency = value;
    }

    /**
     * Gets the value of the billSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillSequence() {
        return billSequence;
    }

    /**
     * Sets the value of the billSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillSequence(String value) {
        this.billSequence = value;
    }

    /**
     * Gets the value of the billSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillSource() {
        return billSource;
    }

    /**
     * Sets the value of the billSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillSource(String value) {
        this.billSource = value;
    }

    /**
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillType(String value) {
        this.billType = value;
    }

    /**
     * Gets the value of the billVendorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillVendorId() {
        return billVendorId;
    }

    /**
     * Sets the value of the billVendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillVendorId(String value) {
        this.billVendorId = value;
    }

    /**
     * Gets the value of the budgetBillingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetBillingFlag() {
        return budgetBillingFlag;
    }

    /**
     * Sets the value of the budgetBillingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetBillingFlag(String value) {
        this.budgetBillingFlag = value;
    }

    /**
     * Gets the value of the cpniDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPNIDate() {
        return cpniDate;
    }

    /**
     * Sets the value of the cpniDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPNIDate(String value) {
        this.cpniDate = value;
    }

    /**
     * Gets the value of the cpniFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPNIFlag() {
        return cpniFlag;
    }

    /**
     * Sets the value of the cpniFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPNIFlag(String value) {
        this.cpniFlag = value;
    }

    /**
     * Gets the value of the collectionsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionsFlag() {
        return collectionsFlag;
    }

    /**
     * Sets the value of the collectionsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionsFlag(String value) {
        this.collectionsFlag = value;
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
     * Gets the value of the creditCardBlockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardBlockFlag() {
        return creditCardBlockFlag;
    }

    /**
     * Sets the value of the creditCardBlockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardBlockFlag(String value) {
        this.creditCardBlockFlag = value;
    }

    /**
     * Gets the value of the creditCardBlockReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardBlockReason() {
        return creditCardBlockReason;
    }

    /**
     * Sets the value of the creditCardBlockReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardBlockReason(String value) {
        this.creditCardBlockReason = value;
    }

    /**
     * Gets the value of the creditCardCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardCategory() {
        return creditCardCategory;
    }

    /**
     * Sets the value of the creditCardCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardCategory(String value) {
        this.creditCardCategory = value;
    }

    /**
     * Gets the value of the creditCardExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpirationDate() {
        return creditCardExpirationDate;
    }

    /**
     * Sets the value of the creditCardExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpirationDate(String value) {
        this.creditCardExpirationDate = value;
    }

    /**
     * Gets the value of the creditCardExpirationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpirationMonth() {
        return creditCardExpirationMonth;
    }

    /**
     * Sets the value of the creditCardExpirationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpirationMonth(String value) {
        this.creditCardExpirationMonth = value;
    }

    /**
     * Gets the value of the creditCardExpirationYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpirationYear() {
        return creditCardExpirationYear;
    }

    /**
     * Sets the value of the creditCardExpirationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpirationYear(String value) {
        this.creditCardExpirationYear = value;
    }

    /**
     * Gets the value of the creditCardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardName() {
        return creditCardName;
    }

    /**
     * Sets the value of the creditCardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardName(String value) {
        this.creditCardName = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardNumberEncryptkeyReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumberEncryptkeyReference() {
        return creditCardNumberEncryptkeyReference;
    }

    /**
     * Sets the value of the creditCardNumberEncryptkeyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumberEncryptkeyReference(String value) {
        this.creditCardNumberEncryptkeyReference = value;
    }

    /**
     * Gets the value of the creditCardSecurityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardSecurityCode() {
        return creditCardSecurityCode;
    }

    /**
     * Sets the value of the creditCardSecurityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardSecurityCode(String value) {
        this.creditCardSecurityCode = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the creditCardVerificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardVerificationNumber() {
        return creditCardVerificationNumber;
    }

    /**
     * Sets the value of the creditCardVerificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardVerificationNumber(String value) {
        this.creditCardVerificationNumber = value;
    }

    /**
     * Gets the value of the creditCardVerificationNumberEncryptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardVerificationNumberEncryptionKey() {
        return creditCardVerificationNumberEncryptionKey;
    }

    /**
     * Sets the value of the creditCardVerificationNumberEncryptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardVerificationNumberEncryptionKey(String value) {
        this.creditCardVerificationNumberEncryptionKey = value;
    }

    /**
     * Gets the value of the daysToCash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysToCash() {
        return daysToCash;
    }

    /**
     * Sets the value of the daysToCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysToCash(String value) {
        this.daysToCash = value;
    }

    /**
     * Gets the value of the emailBillTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailBillTo() {
        return emailBillTo;
    }

    /**
     * Sets the value of the emailBillTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailBillTo(String value) {
        this.emailBillTo = value;
    }

    /**
     * Gets the value of the externalBillingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalBillingAccountNumber() {
        return externalBillingAccountNumber;
    }

    /**
     * Sets the value of the externalBillingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalBillingAccountNumber(String value) {
        this.externalBillingAccountNumber = value;
    }

    /**
     * Gets the value of the externalBillingAccountNumberOld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalBillingAccountNumberOld() {
        return externalBillingAccountNumberOld;
    }

    /**
     * Sets the value of the externalBillingAccountNumberOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalBillingAccountNumberOld(String value) {
        this.externalBillingAccountNumberOld = value;
    }

    /**
     * Gets the value of the extraCopies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraCopies() {
        return extraCopies;
    }

    /**
     * Sets the value of the extraCopies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraCopies(String value) {
        this.extraCopies = value;
    }

    /**
     * Gets the value of the interestatInvoiceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestatInvoiceFlag() {
        return interestatInvoiceFlag;
    }

    /**
     * Sets the value of the interestatInvoiceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestatInvoiceFlag(String value) {
        this.interestatInvoiceFlag = value;
    }

    /**
     * Gets the value of the lastBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastBillAmount() {
        return lastBillAmount;
    }

    /**
     * Sets the value of the lastBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastBillAmount(String value) {
        this.lastBillAmount = value;
    }

    /**
     * Gets the value of the lastBillDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastBillDate() {
        return lastBillDate;
    }

    /**
     * Sets the value of the lastBillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastBillDate(String value) {
        this.lastBillDate = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the billingProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingProfileName() {
        return billingProfileName;
    }

    /**
     * Sets the value of the billingProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingProfileName(String value) {
        this.billingProfileName = value;
    }

    /**
     * Gets the value of the noPayFormFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoPayFormFlag() {
        return noPayFormFlag;
    }

    /**
     * Sets the value of the noPayFormFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoPayFormFlag(String value) {
        this.noPayFormFlag = value;
    }

    /**
     * Gets the value of the numberofManualInvoices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberofManualInvoices() {
        return numberofManualInvoices;
    }

    /**
     * Sets the value of the numberofManualInvoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberofManualInvoices(String value) {
        this.numberofManualInvoices = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the reasonforManualOutsource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonforManualOutsource() {
        return reasonforManualOutsource;
    }

    /**
     * Sets the value of the reasonforManualOutsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonforManualOutsource(String value) {
        this.reasonforManualOutsource = value;
    }

    /**
     * Gets the value of the repeatDebtorFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatDebtorFlag() {
        return repeatDebtorFlag;
    }

    /**
     * Sets the value of the repeatDebtorFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatDebtorFlag(String value) {
        this.repeatDebtorFlag = value;
    }

    /**
     * Gets the value of the routingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Sets the value of the routingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingNumber(String value) {
        this.routingNumber = value;
    }

    /**
     * Gets the value of the standingOrderFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandingOrderFlag() {
        return standingOrderFlag;
    }

    /**
     * Sets the value of the standingOrderFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandingOrderFlag(String value) {
        this.standingOrderFlag = value;
    }

    /**
     * Gets the value of the statementFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementFlag() {
        return statementFlag;
    }

    /**
     * Sets the value of the statementFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementFlag(String value) {
        this.statementFlag = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the yearlyAdvancePaymentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearlyAdvancePaymentFlag() {
        return yearlyAdvancePaymentFlag;
    }

    /**
     * Sets the value of the yearlyAdvancePaymentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearlyAdvancePaymentFlag(String value) {
        this.yearlyAdvancePaymentFlag = value;
    }

    /**
     * Gets the value of the tsOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSOrganizationName() {
        return tsOrganizationName;
    }

    /**
     * Sets the value of the tsOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSOrganizationName(String value) {
        this.tsOrganizationName = value;
    }

    /**
     * Gets the value of the tsBankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSBankId() {
        return tsBankId;
    }

    /**
     * Sets the value of the tsBankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSBankId(String value) {
        this.tsBankId = value;
    }

    /**
     * Gets the value of the listOfCutAddressCopy property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCutAddressCopy }
     *     
     */
    public ListOfCutAddressCopy getListOfCutAddressCopy() {
        return listOfCutAddressCopy;
    }

    /**
     * Sets the value of the listOfCutAddressCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCutAddressCopy }
     *     
     */
    public void setListOfCutAddressCopy(ListOfCutAddressCopy value) {
        this.listOfCutAddressCopy = value;
    }

    /**
     * Gets the value of the listOfContactQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactQuery }
     *     
     */
    public ListOfContactQuery getListOfContactQuery() {
        return listOfContactQuery;
    }

    /**
     * Sets the value of the listOfContactQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactQuery }
     *     
     */
    public void setListOfContactQuery(ListOfContactQuery value) {
        this.listOfContactQuery = value;
    }

}
