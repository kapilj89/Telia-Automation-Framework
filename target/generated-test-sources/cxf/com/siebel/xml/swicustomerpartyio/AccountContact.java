
package com.siebel.xml.swicustomerpartyio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Account_Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account_Contact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MVGContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonalContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryOrganization2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdFixed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreferredCommunications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Temporary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IsPrimaryMVG" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Operation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Searchspec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account_Contact", propOrder = {
    "mvgContactId",
    "personalContact",
    "employeeNumber",
    "accountIntegrationId",
    "primaryAccountName",
    "primaryOrganization2",
    "mobilePhone",
    "emailAddress",
    "firstName",
    "homePhone",
    "lastName",
    "middleName",
    "lastUpdEmail",
    "lastUpdFixed",
    "lastUpdMobile",
    "preferredCommunications",
    "alias",
    "temporary"
})
public class AccountContact {

    @XmlElement(name = "MVGContactId")
    protected String mvgContactId;
    @XmlElement(name = "PersonalContact")
    protected String personalContact;
    @XmlElement(name = "EmployeeNumber")
    protected String employeeNumber;
    @XmlElement(name = "AccountIntegrationId")
    protected String accountIntegrationId;
    @XmlElement(name = "PrimaryAccountName")
    protected String primaryAccountName;
    @XmlElement(name = "PrimaryOrganization2")
    protected String primaryOrganization2;
    @XmlElement(name = "MobilePhone")
    protected String mobilePhone;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "HomePhone")
    protected String homePhone;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastUpdEmail")
    protected String lastUpdEmail;
    @XmlElement(name = "LastUpdFixed")
    protected String lastUpdFixed;
    @XmlElement(name = "LastUpdMobile")
    protected String lastUpdMobile;
    @XmlElement(name = "PreferredCommunications")
    protected String preferredCommunications;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "Temporary")
    protected String temporary;
    @XmlAttribute(name = "IsPrimaryMVG")
    protected String isPrimaryMVG;
    @XmlAttribute(name = "Operation")
    protected String operation;
    @XmlAttribute(name = "Searchspec")
    protected String searchspec;

    /**
     * Gets the value of the mvgContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGContactId() {
        return mvgContactId;
    }

    /**
     * Sets the value of the mvgContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGContactId(String value) {
        this.mvgContactId = value;
    }

    /**
     * Gets the value of the personalContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalContact() {
        return personalContact;
    }

    /**
     * Sets the value of the personalContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalContact(String value) {
        this.personalContact = value;
    }

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
    }

    /**
     * Gets the value of the accountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountIntegrationId() {
        return accountIntegrationId;
    }

    /**
     * Sets the value of the accountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountIntegrationId(String value) {
        this.accountIntegrationId = value;
    }

    /**
     * Gets the value of the primaryAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountName() {
        return primaryAccountName;
    }

    /**
     * Sets the value of the primaryAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountName(String value) {
        this.primaryAccountName = value;
    }

    /**
     * Gets the value of the primaryOrganization2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrganization2() {
        return primaryOrganization2;
    }

    /**
     * Sets the value of the primaryOrganization2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrganization2(String value) {
        this.primaryOrganization2 = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
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
     * Gets the value of the lastUpdEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdEmail() {
        return lastUpdEmail;
    }

    /**
     * Sets the value of the lastUpdEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdEmail(String value) {
        this.lastUpdEmail = value;
    }

    /**
     * Gets the value of the lastUpdFixed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdFixed() {
        return lastUpdFixed;
    }

    /**
     * Sets the value of the lastUpdFixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdFixed(String value) {
        this.lastUpdFixed = value;
    }

    /**
     * Gets the value of the lastUpdMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdMobile() {
        return lastUpdMobile;
    }

    /**
     * Sets the value of the lastUpdMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdMobile(String value) {
        this.lastUpdMobile = value;
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
