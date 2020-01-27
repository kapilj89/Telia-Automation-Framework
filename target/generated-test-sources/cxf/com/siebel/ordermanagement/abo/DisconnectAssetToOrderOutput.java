
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
 *         &lt;element name="ActiveDocumentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Error_spcCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Error_spcMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MDU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MDUExpireContract" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SALineId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://siebel.com/OrderManagement/Order/Data}ListOfOrder"/&gt;
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
    "activeDocumentId",
    "errorSpcCode",
    "errorSpcMessage",
    "mdu",
    "mduExpireContract",
    "orderId",
    "saLineId",
    "listOfOrder"
})
@XmlRootElement(name = "DisconnectAssetToOrder_Output")
public class DisconnectAssetToOrderOutput {

    @XmlElement(name = "ActiveDocumentId", required = true)
    protected String activeDocumentId;
    @XmlElement(name = "Error_spcCode", required = true)
    protected String errorSpcCode;
    @XmlElement(name = "Error_spcMessage", required = true)
    protected String errorSpcMessage;
    @XmlElement(name = "MDU", required = true)
    protected String mdu;
    @XmlElement(name = "MDUExpireContract", required = true)
    protected String mduExpireContract;
    @XmlElement(name = "OrderId", required = true)
    protected String orderId;
    @XmlElement(name = "SALineId", required = true)
    protected String saLineId;
    @XmlElement(name = "ListOfOrder", namespace = "http://siebel.com/OrderManagement/Order/Data", required = true)
    protected ListOfOrder listOfOrder;

    /**
     * Gets the value of the activeDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveDocumentId() {
        return activeDocumentId;
    }

    /**
     * Sets the value of the activeDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveDocumentId(String value) {
        this.activeDocumentId = value;
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
     * Gets the value of the mdu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDU() {
        return mdu;
    }

    /**
     * Sets the value of the mdu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDU(String value) {
        this.mdu = value;
    }

    /**
     * Gets the value of the mduExpireContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDUExpireContract() {
        return mduExpireContract;
    }

    /**
     * Sets the value of the mduExpireContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDUExpireContract(String value) {
        this.mduExpireContract = value;
    }

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
     * Gets the value of the saLineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALineId() {
        return saLineId;
    }

    /**
     * Sets the value of the saLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALineId(String value) {
        this.saLineId = value;
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

}
