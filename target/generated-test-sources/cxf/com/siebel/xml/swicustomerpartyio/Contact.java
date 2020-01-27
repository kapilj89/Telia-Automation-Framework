
package com.siebel.xml.swicustomerpartyio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TSLastUpdMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSLastUpdFixed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSLastUpdEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CellularPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactPersonTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateofBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaxPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MotherMaidenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreferredCommunications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SocialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SuppressAllCalls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SuppressAllEmails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SuppressAllFaxes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SuppressAllMailings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AIAIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Temporary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListOfPersonalAddress" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfPersonalAddress" minOccurs="0"/&gt;
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
@XmlType(name = "Contact", propOrder = {
    "tsLastUpdMobile",
    "tsLastUpdFixed",
    "tsLastUpdEmail",
    "id",
    "alias",
    "cellularPhone",
    "contactPersonTitle",
    "currencyCode",
    "dateofBirth",
    "emailAddress",
    "faxPhone",
    "firstName",
    "gender",
    "homePhone",
    "integrationId",
    "jobTitle",
    "lastName",
    "mm",
    "maritalStatus",
    "middleName",
    "motherMaidenName",
    "preferredCommunications",
    "primaryOrganizationId",
    "rowId",
    "socialSecurityNumber",
    "status",
    "suppressAllCalls",
    "suppressAllEmails",
    "suppressAllFaxes",
    "suppressAllMailings",
    "workPhone",
    "aiaIntegrationId",
    "consumerLink",
    "temporary",
    "listOfPersonalAddress"
})
public class Contact {

    @XmlElement(name = "TSLastUpdMobile")
    protected String tsLastUpdMobile;
    @XmlElement(name = "TSLastUpdFixed")
    protected String tsLastUpdFixed;
    @XmlElement(name = "TSLastUpdEmail")
    protected String tsLastUpdEmail;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "CellularPhone")
    protected String cellularPhone;
    @XmlElement(name = "ContactPersonTitle")
    protected String contactPersonTitle;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "DateofBirth")
    protected String dateofBirth;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "FaxPhone")
    protected String faxPhone;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "HomePhone")
    protected String homePhone;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "MM")
    protected String mm;
    @XmlElement(name = "MaritalStatus")
    protected String maritalStatus;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "MotherMaidenName")
    protected String motherMaidenName;
    @XmlElement(name = "PreferredCommunications")
    protected String preferredCommunications;
    @XmlElement(name = "PrimaryOrganizationId")
    protected String primaryOrganizationId;
    @XmlElement(name = "RowId")
    protected String rowId;
    @XmlElement(name = "SocialSecurityNumber")
    protected String socialSecurityNumber;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "SuppressAllCalls")
    protected String suppressAllCalls;
    @XmlElement(name = "SuppressAllEmails")
    protected String suppressAllEmails;
    @XmlElement(name = "SuppressAllFaxes")
    protected String suppressAllFaxes;
    @XmlElement(name = "SuppressAllMailings")
    protected String suppressAllMailings;
    @XmlElement(name = "WorkPhone")
    protected String workPhone;
    @XmlElement(name = "AIAIntegrationId")
    protected String aiaIntegrationId;
    @XmlElement(name = "ConsumerLink")
    protected String consumerLink;
    @XmlElement(name = "Temporary")
    protected String temporary;
    @XmlElement(name = "ListOfPersonalAddress")
    protected ListOfPersonalAddress listOfPersonalAddress;
    @XmlAttribute(name = "operation")
    protected String operation;

    /**
     * Gets the value of the tsLastUpdMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLastUpdMobile() {
        return tsLastUpdMobile;
    }

    /**
     * Sets the value of the tsLastUpdMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLastUpdMobile(String value) {
        this.tsLastUpdMobile = value;
    }

    /**
     * Gets the value of the tsLastUpdFixed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLastUpdFixed() {
        return tsLastUpdFixed;
    }

    /**
     * Sets the value of the tsLastUpdFixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLastUpdFixed(String value) {
        this.tsLastUpdFixed = value;
    }

    /**
     * Gets the value of the tsLastUpdEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLastUpdEmail() {
        return tsLastUpdEmail;
    }

    /**
     * Sets the value of the tsLastUpdEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLastUpdEmail(String value) {
        this.tsLastUpdEmail = value;
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
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the cellularPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellularPhone() {
        return cellularPhone;
    }

    /**
     * Sets the value of the cellularPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellularPhone(String value) {
        this.cellularPhone = value;
    }

    /**
     * Gets the value of the contactPersonTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonTitle() {
        return contactPersonTitle;
    }

    /**
     * Sets the value of the contactPersonTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonTitle(String value) {
        this.contactPersonTitle = value;
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
     * Gets the value of the dateofBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateofBirth() {
        return dateofBirth;
    }

    /**
     * Sets the value of the dateofBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateofBirth(String value) {
        this.dateofBirth = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the faxPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxPhone() {
        return faxPhone;
    }

    /**
     * Sets the value of the faxPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxPhone(String value) {
        this.faxPhone = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
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
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the mm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMM() {
        return mm;
    }

    /**
     * Sets the value of the mm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMM(String value) {
        this.mm = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the motherMaidenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherMaidenName() {
        return motherMaidenName;
    }

    /**
     * Sets the value of the motherMaidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherMaidenName(String value) {
        this.motherMaidenName = value;
    }

    /**
     * Gets the value of the preferredCommunications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredCommunications() {
        return preferredCommunications;
    }

    /**
     * Sets the value of the preferredCommunications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredCommunications(String value) {
        this.preferredCommunications = value;
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
     * Gets the value of the socialSecurityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the value of the socialSecurityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNumber(String value) {
        this.socialSecurityNumber = value;
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
     * Gets the value of the suppressAllCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressAllCalls() {
        return suppressAllCalls;
    }

    /**
     * Sets the value of the suppressAllCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressAllCalls(String value) {
        this.suppressAllCalls = value;
    }

    /**
     * Gets the value of the suppressAllEmails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressAllEmails() {
        return suppressAllEmails;
    }

    /**
     * Sets the value of the suppressAllEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressAllEmails(String value) {
        this.suppressAllEmails = value;
    }

    /**
     * Gets the value of the suppressAllFaxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressAllFaxes() {
        return suppressAllFaxes;
    }

    /**
     * Sets the value of the suppressAllFaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressAllFaxes(String value) {
        this.suppressAllFaxes = value;
    }

    /**
     * Gets the value of the suppressAllMailings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressAllMailings() {
        return suppressAllMailings;
    }

    /**
     * Sets the value of the suppressAllMailings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressAllMailings(String value) {
        this.suppressAllMailings = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
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
     * Gets the value of the consumerLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerLink() {
        return consumerLink;
    }

    /**
     * Sets the value of the consumerLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerLink(String value) {
        this.consumerLink = value;
    }

    /**
     * Gets the value of the temporary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporary() {
        return temporary;
    }

    /**
     * Sets the value of the temporary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporary(String value) {
        this.temporary = value;
    }

    /**
     * Gets the value of the listOfPersonalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPersonalAddress }
     *     
     */
    public ListOfPersonalAddress getListOfPersonalAddress() {
        return listOfPersonalAddress;
    }

    /**
     * Sets the value of the listOfPersonalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPersonalAddress }
     *     
     */
    public void setListOfPersonalAddress(ListOfPersonalAddress value) {
        this.listOfPersonalAddress = value;
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
