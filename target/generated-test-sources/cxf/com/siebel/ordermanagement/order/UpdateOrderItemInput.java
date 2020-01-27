
package com.siebel.ordermanagement.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.order.item.data.ListOfOrderItemBO;


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
 *         &lt;element name="StatusObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://siebel.com/OrderManagement/Order/Item/Data}ListOfOrderItemBO"/&gt;
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
    "statusObject",
    "listOfOrderItemBO"
})
@XmlRootElement(name = "UpdateOrderItem_Input")
public class UpdateOrderItemInput {

    @XmlElement(name = "StatusObject")
    protected String statusObject;
    @XmlElement(name = "ListOfOrderItemBO", namespace = "http://siebel.com/OrderManagement/Order/Item/Data", required = true)
    protected ListOfOrderItemBO listOfOrderItemBO;

    /**
     * Gets the value of the statusObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusObject() {
        return statusObject;
    }

    /**
     * Sets the value of the statusObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusObject(String value) {
        this.statusObject = value;
    }

    /**
     * Gets the value of the listOfOrderItemBO property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderItemBO }
     *     
     */
    public ListOfOrderItemBO getListOfOrderItemBO() {
        return listOfOrderItemBO;
    }

    /**
     * Sets the value of the listOfOrderItemBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderItemBO }
     *     
     */
    public void setListOfOrderItemBO(ListOfOrderItemBO value) {
        this.listOfOrderItemBO = value;
    }

}
