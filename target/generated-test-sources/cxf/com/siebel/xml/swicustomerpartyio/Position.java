
package com.siebel.xml.swicustomerpartyio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Position complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Position"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActiveEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActiveFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActiveJobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActiveLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LoginId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PositionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
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
@XmlType(name = "Position", propOrder = {
    "accountId",
    "activeEmail",
    "activeFirstName",
    "activeJobTitle",
    "activeLastName",
    "loginId",
    "positionId"
})
public class Position {

    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "ActiveEmail")
    protected String activeEmail;
    @XmlElement(name = "ActiveFirstName")
    protected String activeFirstName;
    @XmlElement(name = "ActiveJobTitle")
    protected String activeJobTitle;
    @XmlElement(name = "ActiveLastName")
    protected String activeLastName;
    @XmlElement(name = "LoginId")
    protected String loginId;
    @XmlElement(name = "PositionId")
    protected String positionId;
    @XmlAttribute(name = "operation")
    protected String operation;
    @XmlAttribute(name = "searchspec")
    protected String searchspec;

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
     * Gets the value of the activeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveEmail() {
        return activeEmail;
    }

    /**
     * Sets the value of the activeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveEmail(String value) {
        this.activeEmail = value;
    }

    /**
     * Gets the value of the activeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveFirstName() {
        return activeFirstName;
    }

    /**
     * Sets the value of the activeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveFirstName(String value) {
        this.activeFirstName = value;
    }

    /**
     * Gets the value of the activeJobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveJobTitle() {
        return activeJobTitle;
    }

    /**
     * Sets the value of the activeJobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveJobTitle(String value) {
        this.activeJobTitle = value;
    }

    /**
     * Gets the value of the activeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveLastName() {
        return activeLastName;
    }

    /**
     * Sets the value of the activeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveLastName(String value) {
        this.activeLastName = value;
    }

    /**
     * Gets the value of the loginId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * Sets the value of the loginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginId(String value) {
        this.loginId = value;
    }

    /**
     * Gets the value of the positionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionId() {
        return positionId;
    }

    /**
     * Sets the value of the positionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionId(String value) {
        this.positionId = value;
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
