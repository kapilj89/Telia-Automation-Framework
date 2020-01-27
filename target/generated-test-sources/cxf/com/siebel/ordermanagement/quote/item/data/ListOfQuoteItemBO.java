
package com.siebel.ordermanagement.quote.item.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfQuoteItemBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfQuoteItemBO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfQuoteItem" type="{http://siebel.com/OrderManagement/Quote/Item/Data}ListOfQuoteItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfQuoteItemBO", propOrder = {
    "listOfQuoteItem"
})
public class ListOfQuoteItemBO {

    @XmlElement(name = "ListOfQuoteItem")
    protected ListOfQuoteItem listOfQuoteItem;

    /**
     * Gets the value of the listOfQuoteItem property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfQuoteItem }
     *     
     */
    public ListOfQuoteItem getListOfQuoteItem() {
        return listOfQuoteItem;
    }

    /**
     * Sets the value of the listOfQuoteItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfQuoteItem }
     *     
     */
    public void setListOfQuoteItem(ListOfQuoteItem value) {
        this.listOfQuoteItem = value;
    }

}
