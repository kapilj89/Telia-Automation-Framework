
package com.siebel.ordermanagement.configurator;

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
 *         &lt;element name="SaveInstanceFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "saveInstanceFlag"
})
@XmlRootElement(name = "EndConfiguration_Input")
public class EndConfigurationInput {

    @XmlElement(name = "SaveInstanceFlag", required = true)
    protected String saveInstanceFlag;

    /**
     * Gets the value of the saveInstanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaveInstanceFlag() {
        return saveInstanceFlag;
    }

    /**
     * Sets the value of the saveInstanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaveInstanceFlag(String value) {
        this.saveInstanceFlag = value;
    }

}
