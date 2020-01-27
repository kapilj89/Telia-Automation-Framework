
package com.siebel.ordermanagement.configurator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.configurator.webchannelobjstructure.ListOfObject;


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
 *         &lt;element ref="{http://siebel.com/OrderManagement/Configurator/WebChannelObjStructure}ListOfObject"/&gt;
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
    "listOfObject"
})
@XmlRootElement(name = "GetCfgObjectStructure_Input")
public class GetCfgObjectStructureInput {

    @XmlElement(name = "ListOfObject", namespace = "http://siebel.com/OrderManagement/Configurator/WebChannelObjStructure", required = true)
    protected ListOfObject listOfObject;

    /**
     * Gets the value of the listOfObject property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfObject }
     *     
     */
    public ListOfObject getListOfObject() {
        return listOfObject;
    }

    /**
     * Sets the value of the listOfObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfObject }
     *     
     */
    public void setListOfObject(ListOfObject value) {
        this.listOfObject = value;
    }

}
