
package com.siebel.ordermanagement.order.item.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfOrderItemBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfOrderItemBO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfOrderItem" type="{http://siebel.com/OrderManagement/Order/Item/Data}ListOfOrderItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOrderItemBO", propOrder = {
    "listOfOrderItem"
})
public class ListOfOrderItemBO {

    @XmlElement(name = "ListOfOrderItem")
    protected ListOfOrderItem listOfOrderItem;

    /**
     * Gets the value of the listOfOrderItem property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderItem }
     *     
     */
    public ListOfOrderItem getListOfOrderItem() {
        return listOfOrderItem;
    }

    /**
     * Sets the value of the listOfOrderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderItem }
     *     
     */
    public void setListOfOrderItem(ListOfOrderItem value) {
        this.listOfOrderItem = value;
    }

}
