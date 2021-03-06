
package com.siebel.ordermanagement.quote.item.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfQuoteItemBOTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfQuoteItemBOTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfQuoteItemBO" type="{http://siebel.com/OrderManagement/Quote/Item/Data}ListOfQuoteItemBO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfQuoteItemBOTopElmt", propOrder = {
    "listOfQuoteItemBO"
})
public class ListOfQuoteItemBOTopElmt {

    @XmlElement(name = "ListOfQuoteItemBO", required = true)
    protected ListOfQuoteItemBO listOfQuoteItemBO;

    /**
     * Gets the value of the listOfQuoteItemBO property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfQuoteItemBO }
     *     
     */
    public ListOfQuoteItemBO getListOfQuoteItemBO() {
        return listOfQuoteItemBO;
    }

    /**
     * Sets the value of the listOfQuoteItemBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfQuoteItemBO }
     *     
     */
    public void setListOfQuoteItemBO(ListOfQuoteItemBO value) {
        this.listOfQuoteItemBO = value;
    }

}
