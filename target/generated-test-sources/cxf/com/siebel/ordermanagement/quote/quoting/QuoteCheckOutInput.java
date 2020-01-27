
package com.siebel.ordermanagement.quote.quoting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CreditCardAuthorizationFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Object_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AutoOrderFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InvokeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "creditCardAuthorizationFlag",
    "objectSpcId",
    "autoOrderFlag",
    "invokeId"
})
@XmlRootElement(name = "QuoteCheckOut_Input")
public class QuoteCheckOutInput {

    @XmlElement(name = "CreditCardAuthorizationFlag", required = true)
    protected String creditCardAuthorizationFlag;
    @XmlElement(name = "Object_spcId", required = true)
    protected String objectSpcId;
    @XmlElement(name = "AutoOrderFlag", required = true)
    protected String autoOrderFlag;
    @XmlElement(name = "InvokeId", required = true)
    protected String invokeId;

    /**
     * Gets the value of the creditCardAuthorizationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardAuthorizationFlag() {
        return creditCardAuthorizationFlag;
    }

    /**
     * Sets the value of the creditCardAuthorizationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardAuthorizationFlag(String value) {
        this.creditCardAuthorizationFlag = value;
    }

    /**
     * Gets the value of the objectSpcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectSpcId() {
        return objectSpcId;
    }

    /**
     * Sets the value of the objectSpcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectSpcId(String value) {
        this.objectSpcId = value;
    }

    /**
     * Gets the value of the autoOrderFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoOrderFlag() {
        return autoOrderFlag;
    }

    /**
     * Sets the value of the autoOrderFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoOrderFlag(String value) {
        this.autoOrderFlag = value;
    }

    /**
     * Gets the value of the invokeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvokeId() {
        return invokeId;
    }

    /**
     * Sets the value of the invokeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvokeId(String value) {
        this.invokeId = value;
    }

}
