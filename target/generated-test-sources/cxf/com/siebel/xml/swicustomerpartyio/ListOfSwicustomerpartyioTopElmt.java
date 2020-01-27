
package com.siebel.xml.swicustomerpartyio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSwicustomerpartyioTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSwicustomerpartyioTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfSwicustomerpartyio" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfSwicustomerpartyio"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSwicustomerpartyioTopElmt", propOrder = {
    "listOfSwicustomerpartyio"
})
public class ListOfSwicustomerpartyioTopElmt {

    @XmlElement(name = "ListOfSwicustomerpartyio", required = true)
    protected ListOfSwicustomerpartyio listOfSwicustomerpartyio;

    /**
     * Gets the value of the listOfSwicustomerpartyio property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSwicustomerpartyio }
     *     
     */
    public ListOfSwicustomerpartyio getListOfSwicustomerpartyio() {
        return listOfSwicustomerpartyio;
    }

    /**
     * Sets the value of the listOfSwicustomerpartyio property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSwicustomerpartyio }
     *     
     */
    public void setListOfSwicustomerpartyio(ListOfSwicustomerpartyio value) {
        this.listOfSwicustomerpartyio = value;
    }

}
