
package com.siebel.customui;

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
 *         &lt;element name="OrderRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FulfillmentMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Object_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ParentOrderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "orderRevisionNumber",
    "fulfillmentMode",
    "objectSpcId",
    "orderNumber",
    "parentOrderStatus"
})
@XmlRootElement(name = "TSChannelSubmitOrder_Input")
public class TSChannelSubmitOrderInput {

    @XmlElement(name = "OrderRevisionNumber", required = true)
    protected String orderRevisionNumber;
    @XmlElement(name = "FulfillmentMode", required = true)
    protected String fulfillmentMode;
    @XmlElement(name = "Object_spcId", required = true)
    protected String objectSpcId;
    @XmlElement(name = "OrderNumber", required = true)
    protected String orderNumber;
    @XmlElement(name = "ParentOrderStatus", required = true)
    protected String parentOrderStatus;

    /**
     * Gets the value of the orderRevisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderRevisionNumber() {
        return orderRevisionNumber;
    }

    /**
     * Sets the value of the orderRevisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderRevisionNumber(String value) {
        this.orderRevisionNumber = value;
    }

    /**
     * Gets the value of the fulfillmentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentMode() {
        return fulfillmentMode;
    }

    /**
     * Sets the value of the fulfillmentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentMode(String value) {
        this.fulfillmentMode = value;
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
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the parentOrderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrderStatus() {
        return parentOrderStatus;
    }

    /**
     * Sets the value of the parentOrderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrderStatus(String value) {
        this.parentOrderStatus = value;
    }

}
