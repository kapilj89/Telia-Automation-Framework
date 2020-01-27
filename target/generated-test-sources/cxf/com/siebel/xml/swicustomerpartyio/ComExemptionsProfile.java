
package com.siebel.xml.swicustomerpartyio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComExemptionsProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComExemptionsProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LifeSupportFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComExemptionsProfile", propOrder = {
    "lifeSupportFlag",
    "specialDescription"
})
public class ComExemptionsProfile {

    @XmlElement(name = "LifeSupportFlag")
    protected String lifeSupportFlag;
    @XmlElement(name = "SpecialDescription")
    protected String specialDescription;

    /**
     * Gets the value of the lifeSupportFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeSupportFlag() {
        return lifeSupportFlag;
    }

    /**
     * Sets the value of the lifeSupportFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeSupportFlag(String value) {
        this.lifeSupportFlag = value;
    }

    /**
     * Gets the value of the specialDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialDescription() {
        return specialDescription;
    }

    /**
     * Sets the value of the specialDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialDescription(String value) {
        this.specialDescription = value;
    }

}
