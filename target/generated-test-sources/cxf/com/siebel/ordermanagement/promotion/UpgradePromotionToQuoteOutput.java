
package com.siebel.ordermanagement.promotion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.quote.data.ListOfQuote;


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
 *         &lt;element name="OrderSubType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://siebel.com/OrderManagement/Quote/Data}ListOfQuote"/&gt;
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
    "orderSubType",
    "listOfQuote"
})
@XmlRootElement(name = "UpgradePromotionToQuote_Output")
public class UpgradePromotionToQuoteOutput {

    @XmlElement(name = "ActiveDocumentId", required = true)
    protected String activeDocumentId;
    @XmlElement(name = "Error_spcCode", required = true)
    protected String errorSpcCode;
    @XmlElement(name = "Error_spcMessage", required = true)
    protected String errorSpcMessage;
    @XmlElement(name = "OrderSubType", required = true)
    protected String orderSubType;
    @XmlElement(name = "ListOfQuote", namespace = "http://siebel.com/OrderManagement/Quote/Data", required = true)
    protected ListOfQuote listOfQuote;

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
     * Gets the value of the orderSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderSubType() {
        return orderSubType;
    }

    /**
     * Sets the value of the orderSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderSubType(String value) {
        this.orderSubType = value;
    }

    /**
     * Gets the value of the listOfQuote property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfQuote }
     *     
     */
    public ListOfQuote getListOfQuote() {
        return listOfQuote;
    }

    /**
     * Sets the value of the listOfQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfQuote }
     *     
     */
    public void setListOfQuote(ListOfQuote value) {
        this.listOfQuote = value;
    }

}
