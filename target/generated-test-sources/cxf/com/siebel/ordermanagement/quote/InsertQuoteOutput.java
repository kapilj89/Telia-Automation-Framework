
package com.siebel.ordermanagement.quote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.quote.data.ListOfQuote;


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
 *         &lt;element ref="{http://siebel.com/OrderManagement/Quote/Data}ListOfQuote"/&gt;
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
    "listOfQuote"
})
@XmlRootElement(name = "InsertQuote_Output")
public class InsertQuoteOutput {

    @XmlElement(name = "ListOfQuote", namespace = "http://siebel.com/OrderManagement/Quote/Data", required = true)
    protected ListOfQuote listOfQuote;

    /**
     * Gets the value of the listOfQuote property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfQuote }
     *     
     */
    public ListOfQuote getListOfQuote() {
        return listOfQuote;
    }

    /**
     * Sets the value of the listOfQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfQuote }
     *     
     */
    public void setListOfQuote(ListOfQuote value) {
        this.listOfQuote = value;
    }

}