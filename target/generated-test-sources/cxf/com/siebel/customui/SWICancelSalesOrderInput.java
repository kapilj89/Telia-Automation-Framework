
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
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Process_spcInstance_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sAgreement_spcType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Enable_spcLog" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HT_spcCount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Return_spcMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BundleCount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Object_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sOrderConfirmation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sAgreementStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Siebel_spcOperation_spcObject_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TroubleTicketId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DueDateDiff" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Return_spcCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ActiveViewName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RecCount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MethodNameforVoIP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Error_spcCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderChangeReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Error_spcMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "orderId",
    "processSpcInstanceSpcId",
    "sAgreementSpcType",
    "enableSpcLog",
    "htSpcCount",
    "returnSpcMessage",
    "bundleCount",
    "objectSpcId",
    "serviceId",
    "sOrderConfirmation",
    "sAgreementStatus",
    "siebelSpcOperationSpcObjectSpcId",
    "troubleTicketId",
    "orderStatus",
    "dueDateDiff",
    "returnSpcCode",
    "activeViewName",
    "recCount",
    "methodNameforVoIP",
    "errorSpcCode",
    "orderChangeReason",
    "errorSpcMessage"
})
@XmlRootElement(name = "SWICancelSalesOrder_Input")
public class SWICancelSalesOrderInput {

    @XmlElement(name = "OrderId", required = true)
    protected String orderId;
    @XmlElement(name = "Process_spcInstance_spcId", required = true)
    protected String processSpcInstanceSpcId;
    @XmlElement(name = "sAgreement_spcType", required = true)
    protected String sAgreementSpcType;
    @XmlElement(name = "Enable_spcLog", required = true)
    protected String enableSpcLog;
    @XmlElement(name = "HT_spcCount", required = true)
    protected String htSpcCount;
    @XmlElement(name = "Return_spcMessage", required = true)
    protected String returnSpcMessage;
    @XmlElement(name = "BundleCount", required = true)
    protected String bundleCount;
    @XmlElement(name = "Object_spcId", required = true)
    protected String objectSpcId;
    @XmlElement(name = "ServiceId", required = true)
    protected String serviceId;
    @XmlElement(required = true)
    protected String sOrderConfirmation;
    @XmlElement(required = true)
    protected String sAgreementStatus;
    @XmlElement(name = "Siebel_spcOperation_spcObject_spcId", required = true)
    protected String siebelSpcOperationSpcObjectSpcId;
    @XmlElement(name = "TroubleTicketId", required = true)
    protected String troubleTicketId;
    @XmlElement(name = "OrderStatus", required = true)
    protected String orderStatus;
    @XmlElement(name = "DueDateDiff", required = true)
    protected String dueDateDiff;
    @XmlElement(name = "Return_spcCode", required = true)
    protected String returnSpcCode;
    @XmlElement(name = "ActiveViewName", required = true)
    protected String activeViewName;
    @XmlElement(name = "RecCount", required = true)
    protected String recCount;
    @XmlElement(name = "MethodNameforVoIP", required = true)
    protected String methodNameforVoIP;
    @XmlElement(name = "Error_spcCode", required = true)
    protected String errorSpcCode;
    @XmlElement(name = "OrderChangeReason", required = true)
    protected String orderChangeReason;
    @XmlElement(name = "Error_spcMessage", required = true)
    protected String errorSpcMessage;

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the processSpcInstanceSpcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessSpcInstanceSpcId() {
        return processSpcInstanceSpcId;
    }

    /**
     * Sets the value of the processSpcInstanceSpcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessSpcInstanceSpcId(String value) {
        this.processSpcInstanceSpcId = value;
    }

    /**
     * Gets the value of the sAgreementSpcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAgreementSpcType() {
        return sAgreementSpcType;
    }

    /**
     * Sets the value of the sAgreementSpcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAgreementSpcType(String value) {
        this.sAgreementSpcType = value;
    }

    /**
     * Gets the value of the enableSpcLog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableSpcLog() {
        return enableSpcLog;
    }

    /**
     * Sets the value of the enableSpcLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableSpcLog(String value) {
        this.enableSpcLog = value;
    }

    /**
     * Gets the value of the htSpcCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHTSpcCount() {
        return htSpcCount;
    }

    /**
     * Sets the value of the htSpcCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHTSpcCount(String value) {
        this.htSpcCount = value;
    }

    /**
     * Gets the value of the returnSpcMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnSpcMessage() {
        return returnSpcMessage;
    }

    /**
     * Sets the value of the returnSpcMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnSpcMessage(String value) {
        this.returnSpcMessage = value;
    }

    /**
     * Gets the value of the bundleCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleCount() {
        return bundleCount;
    }

    /**
     * Sets the value of the bundleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleCount(String value) {
        this.bundleCount = value;
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
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the sOrderConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOrderConfirmation() {
        return sOrderConfirmation;
    }

    /**
     * Sets the value of the sOrderConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOrderConfirmation(String value) {
        this.sOrderConfirmation = value;
    }

    /**
     * Gets the value of the sAgreementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAgreementStatus() {
        return sAgreementStatus;
    }

    /**
     * Sets the value of the sAgreementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAgreementStatus(String value) {
        this.sAgreementStatus = value;
    }

    /**
     * Gets the value of the siebelSpcOperationSpcObjectSpcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiebelSpcOperationSpcObjectSpcId() {
        return siebelSpcOperationSpcObjectSpcId;
    }

    /**
     * Sets the value of the siebelSpcOperationSpcObjectSpcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiebelSpcOperationSpcObjectSpcId(String value) {
        this.siebelSpcOperationSpcObjectSpcId = value;
    }

    /**
     * Gets the value of the troubleTicketId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTroubleTicketId() {
        return troubleTicketId;
    }

    /**
     * Sets the value of the troubleTicketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTroubleTicketId(String value) {
        this.troubleTicketId = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the dueDateDiff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDateDiff() {
        return dueDateDiff;
    }

    /**
     * Sets the value of the dueDateDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDateDiff(String value) {
        this.dueDateDiff = value;
    }

    /**
     * Gets the value of the returnSpcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnSpcCode() {
        return returnSpcCode;
    }

    /**
     * Sets the value of the returnSpcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnSpcCode(String value) {
        this.returnSpcCode = value;
    }

    /**
     * Gets the value of the activeViewName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveViewName() {
        return activeViewName;
    }

    /**
     * Sets the value of the activeViewName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveViewName(String value) {
        this.activeViewName = value;
    }

    /**
     * Gets the value of the recCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecCount() {
        return recCount;
    }

    /**
     * Sets the value of the recCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecCount(String value) {
        this.recCount = value;
    }

    /**
     * Gets the value of the methodNameforVoIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodNameforVoIP() {
        return methodNameforVoIP;
    }

    /**
     * Sets the value of the methodNameforVoIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodNameforVoIP(String value) {
        this.methodNameforVoIP = value;
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
     * Gets the value of the orderChangeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderChangeReason() {
        return orderChangeReason;
    }

    /**
     * Sets the value of the orderChangeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderChangeReason(String value) {
        this.orderChangeReason = value;
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

}
