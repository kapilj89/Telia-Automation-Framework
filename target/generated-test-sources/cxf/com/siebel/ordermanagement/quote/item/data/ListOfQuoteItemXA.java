
package com.siebel.ordermanagement.quote.item.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfQuoteItemXA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfQuoteItemXA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuoteItemXA" type="{http://siebel.com/OrderManagement/Quote/Item/Data}QuoteItemXA" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfQuoteItemXA", propOrder = {
    "quoteItemXA"
})
public class ListOfQuoteItemXA {

    @XmlElement(name = "QuoteItemXA")
    protected List<QuoteItemXA> quoteItemXA;

    /**
     * Gets the value of the quoteItemXA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteItemXA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteItemXA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteItemXA }
     * 
     * 
     */
    public List<QuoteItemXA> getQuoteItemXA() {
        if (quoteItemXA == null) {
            quoteItemXA = new ArrayList<QuoteItemXA>();
        }
        return this.quoteItemXA;
    }

}
