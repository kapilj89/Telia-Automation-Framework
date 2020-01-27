
package com.siebel.selfservice.common.address.id;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUTAddress_MVContactId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUTAddress_MVContactId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MVContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUTAddress_MVContactId", propOrder = {
    "mvContactId"
})
public class CUTAddressMVContactId {

    @XmlElement(name = "MVContactId")
    protected String mvContactId;

    /**
     * Gets the value of the mvContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVContactId() {
        return mvContactId;
    }

    /**
     * Sets the value of the mvContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVContactId(String value) {
        this.mvContactId = value;
    }

}
