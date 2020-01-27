
package com.siebel.ordermanagement.configurator.webchannelobjgroupitems;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfObjectTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfObjectTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfObject" type="{http://siebel.com/OrderManagement/Configurator/WebChannelObjGroupItems}ListOfObject"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfObjectTopElmt", propOrder = {
    "listOfObject"
})
public class ListOfObjectTopElmt {

    @XmlElement(name = "ListOfObject", required = true)
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
