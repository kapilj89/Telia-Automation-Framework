
package com.siebel.ordermanagement.order.item.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfOrderItemBOTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfOrderItemBOTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfOrderItemBO" type="{http://siebel.com/OrderManagement/Order/Item/Data}ListOfOrderItemBO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOrderItemBOTopElmt", propOrder = {
    "listOfOrderItemBO"
})
public class ListOfOrderItemBOTopElmt {

    @XmlElement(name = "ListOfOrderItemBO", required = true)
    protected ListOfOrderItemBO listOfOrderItemBO;

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
