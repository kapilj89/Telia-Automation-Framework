
package com.siebel.ordermanagement.abo;

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
 *         &lt;element name="TSSubAction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSPromotionIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Object_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LineItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSOrderSubType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "tsSubAction",
    "tsPromotionIntegrationId",
    "objectSpcId",
    "lineItemId",
    "tsShipToAddressId",
    "tsOrderSubType"
})
@XmlRootElement(name = "AutoAsset_Input")
public class AutoAssetInput {

    @XmlElement(name = "TSSubAction", required = true)
    protected String tsSubAction;
    @XmlElement(name = "TSPromotionIntegrationId", required = true)
    protected String tsPromotionIntegrationId;
    @XmlElement(name = "Object_spcId", required = true)
    protected String objectSpcId;
    @XmlElement(name = "LineItemId", required = true)
    protected String lineItemId;
    @XmlElement(name = "TSShipToAddressId", required = true)
    protected String tsShipToAddressId;
    @XmlElement(name = "TSOrderSubType", required = true)
    protected String tsOrderSubType;

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
     * Gets the value of the lineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemId() {
        return lineItemId;
    }

    /**
     * Sets the value of the lineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemId(String value) {
        this.lineItemId = value;
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

}
