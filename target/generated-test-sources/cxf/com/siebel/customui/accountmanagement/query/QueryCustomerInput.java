
package com.siebel.customui.accountmanagement.query;

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
 *         &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSCustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FullStructure" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "ssn",
    "tsCustomerId",
    "fullStructure"
})
@XmlRootElement(name = "QueryCustomer_Input")
public class QueryCustomerInput {

    @XmlElement(name = "SSN", required = true)
    protected String ssn;
    @XmlElement(name = "TSCustomerId", required = true)
    protected String tsCustomerId;
    @XmlElement(name = "FullStructure", required = true)
    protected String fullStructure;

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
     * Gets the value of the fullStructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullStructure() {
        return fullStructure;
    }

    /**
     * Sets the value of the fullStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullStructure(String value) {
        this.fullStructure = value;
    }

}
