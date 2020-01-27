
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
 *         &lt;element name="Skip_spcQuery_spcOrder" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Object_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RePrice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSCarrierPriority" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "skipSpcQuerySpcOrder",
    "objectSpcId",
    "rePrice",
    "tsCarrierPriority"
})
@XmlRootElement(name = "AutoOrder_Input")
public class AutoOrderInput {

    @XmlElement(name = "Skip_spcQuery_spcOrder", required = true)
    protected String skipSpcQuerySpcOrder;
    @XmlElement(name = "Object_spcId", required = true)
    protected String objectSpcId;
    @XmlElement(name = "RePrice", required = true)
    protected String rePrice;
    @XmlElement(name = "TSCarrierPriority", required = true)
    protected String tsCarrierPriority;

    /**
     * Gets the value of the skipSpcQuerySpcOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkipSpcQuerySpcOrder() {
        return skipSpcQuerySpcOrder;
    }

    /**
     * Sets the value of the skipSpcQuerySpcOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkipSpcQuerySpcOrder(String value) {
        this.skipSpcQuerySpcOrder = value;
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

}
