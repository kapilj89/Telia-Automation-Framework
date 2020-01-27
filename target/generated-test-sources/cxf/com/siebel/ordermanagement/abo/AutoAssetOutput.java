
package com.siebel.ordermanagement.abo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.asset.data.ListOfAsset;


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
 *         &lt;element name="Error_spcCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Error_spcMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://siebel.com/OrderManagement/Asset/Data}ListOfAsset"/&gt;
 *         &lt;element name="TSOrderSubType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSPromotionIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSSubAction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "errorSpcCode",
    "errorSpcMessage",
    "listOfAsset",
    "tsOrderSubType",
    "tsPromotionIntegrationId",
    "tsShipToAddressId",
    "tsSubAction"
})
@XmlRootElement(name = "AutoAsset_Output")
public class AutoAssetOutput {

    @XmlElement(name = "Error_spcCode", required = true)
    protected String errorSpcCode;
    @XmlElement(name = "Error_spcMessage", required = true)
    protected String errorSpcMessage;
    @XmlElement(name = "ListOfAsset", namespace = "http://siebel.com/OrderManagement/Asset/Data", required = true)
    protected ListOfAsset listOfAsset;
    @XmlElement(name = "TSOrderSubType", required = true)
    protected String tsOrderSubType;
    @XmlElement(name = "TSPromotionIntegrationId", required = true)
    protected String tsPromotionIntegrationId;
    @XmlElement(name = "TSShipToAddressId", required = true)
    protected String tsShipToAddressId;
    @XmlElement(name = "TSSubAction", required = true)
    protected String tsSubAction;

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
     * Gets the value of the listOfAsset property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAsset }
     *     
     */
    public ListOfAsset getListOfAsset() {
        return listOfAsset;
    }

    /**
     * Sets the value of the listOfAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAsset }
     *     
     */
    public void setListOfAsset(ListOfAsset value) {
        this.listOfAsset = value;
    }

    /**
     * Gets the value of the tsOrderSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSOrderSubType() {
        return tsOrderSubType;
    }

    /**
     * Sets the value of the tsOrderSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSOrderSubType(String value) {
        this.tsOrderSubType = value;
    }

    /**
     * Gets the value of the tsPromotionIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPromotionIntegrationId() {
        return tsPromotionIntegrationId;
    }

    /**
     * Sets the value of the tsPromotionIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPromotionIntegrationId(String value) {
        this.tsPromotionIntegrationId = value;
    }

    /**
     * Gets the value of the tsShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSShipToAddressId() {
        return tsShipToAddressId;
    }

    /**
     * Sets the value of the tsShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSShipToAddressId(String value) {
        this.tsShipToAddressId = value;
    }

    /**
     * Gets the value of the tsSubAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSubAction() {
        return tsSubAction;
    }

    /**
     * Sets the value of the tsSubAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSubAction(String value) {
        this.tsSubAction = value;
    }

}
