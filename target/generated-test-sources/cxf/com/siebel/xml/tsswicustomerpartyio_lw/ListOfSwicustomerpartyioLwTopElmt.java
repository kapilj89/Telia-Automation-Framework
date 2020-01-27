
package com.siebel.xml.tsswicustomerpartyio_lw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSwicustomerpartyio_lwTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSwicustomerpartyio_lwTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfSwicustomerpartyio_lw" type="{http://www.siebel.com/xml/TSSWICustomerPartyIO_LW}ListOfSwicustomerpartyio_lw"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSwicustomerpartyio_lwTopElmt", propOrder = {
    "listOfSwicustomerpartyioLw"
})
public class ListOfSwicustomerpartyioLwTopElmt {

    @XmlElement(name = "ListOfSwicustomerpartyio_lw", required = true)
    protected ListOfSwicustomerpartyioLw listOfSwicustomerpartyioLw;

    /**
     * Gets the value of the listOfSwicustomerpartyioLw property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSwicustomerpartyioLw }
     *     
     */
    public ListOfSwicustomerpartyioLw getListOfSwicustomerpartyioLw() {
        return listOfSwicustomerpartyioLw;
    }

    /**
     * Sets the value of the listOfSwicustomerpartyioLw property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSwicustomerpartyioLw }
     *     
     */
    public void setListOfSwicustomerpartyioLw(ListOfSwicustomerpartyioLw value) {
        this.listOfSwicustomerpartyioLw = value;
    }

}
