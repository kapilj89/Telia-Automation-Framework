
package com.siebel.ordermanagement.abo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.order.data.ListOfOrder;


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
 *         &lt;element name="ActiveOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ActiveOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Error_spcCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Error_spcMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RePrice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://siebel.com/OrderManagement/Order/Data}ListOfOrder"/&gt;
 *         &lt;element name="TSCarrierPriority" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSChannelName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "activeOrderId",
    "activeOrderNumber",
    "errorSpcCode",
    "errorSpcMessage",
    "rePrice",
    "listOfOrder",
    "tsCarrierPriority",
    "tsChannelName"
})
@XmlRootElement(name = "AutoOrder_Output")
public class AutoOrderOutput {

    @XmlElement(name = "ActiveOrderId", required = true)
    protected String activeOrderId;
    @XmlElement(name = "ActiveOrderNumber", required = true)
    protected String activeOrderNumber;
    @XmlElement(name = "Error_spcCode", required = true)
    protected String errorSpcCode;
    @XmlElement(name = "Error_spcMessage", required = true)
    protected String errorSpcMessage;
    @XmlElement(name = "RePrice", required = true)
    protected String rePrice;
    @XmlElement(name = "ListOfOrder", namespace = "http://siebel.com/OrderManagement/Order/Data", required = true)
    protected ListOfOrder listOfOrder;
    @XmlElement(name = "TSCarrierPriority", required = true)
    protected String tsCarrierPriority;
    @XmlElement(name = "TSChannelName", required = true)
    protected String tsChannelName;

    /**
     * Gets the value of the activeOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveOrderId() {
        return activeOrderId;
    }

    /**
     * Sets the value of the activeOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveOrderId(String value) {
        this.activeOrderId = value;
    }

    /**
     * Gets the value of the activeOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveOrderNumber() {
        return activeOrderNumber;
    }

    /**
     * Sets the value of the activeOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveOrderNumber(String value) {
        this.activeOrderNumber = value;
    }

    /**
     * Gets the value of the errorSpcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSpcCode() {
        return errorSpcCode;
    }

    /**
     * Sets the value of the errorSpcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSpcCode(String value) {
        this.errorSpcCode = value;
    }

    /**
     * Gets the value of the errorSpcMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSpcMessage() {
        return errorSpcMessage;
    }

    /**
     * Sets the value of the errorSpcMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSpcMessage(String value) {
        this.errorSpcMessage = value;
    }

    /**
     * Gets the value of the rePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRePrice() {
        return rePrice;
    }

    /**
     * Sets the value of the rePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRePrice(String value) {
        this.rePrice = value;
    }

    /**
     * Gets the value of the listOfOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrder }
     *     
     */
    public ListOfOrder getListOfOrder() {
        return listOfOrder;
    }

    /**
     * Sets the value of the listOfOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrder }
     *     
     */
    public void setListOfOrder(ListOfOrder value) {
        this.listOfOrder = value;
    }

    /**
     * Gets the value of the tsCarrierPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCarrierPriority() {
        return tsCarrierPriority;
    }

    /**
     * Sets the value of the tsCarrierPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCarrierPriority(String value) {
        this.tsCarrierPriority = value;
    }

    /**
     * Gets the value of the tsChannelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSChannelName() {
        return tsChannelName;
    }

    /**
     * Sets the value of the tsChannelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSChannelName(String value) {
        this.tsChannelName = value;
    }

}
