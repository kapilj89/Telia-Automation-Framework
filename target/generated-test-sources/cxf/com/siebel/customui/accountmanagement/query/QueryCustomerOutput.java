
package com.siebel.customui.accountmanagement.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.xml.swicustomerpartyio.ListOfSwicustomerpartyio;
import com.siebel.xml.tsswicustomerpartyio_lw.ListOfSwicustomerpartyioLw;


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
 *         &lt;element ref="{http://www.siebel.com/xml/SWICustomerPartyIO}ListOfSwicustomerpartyio"/&gt;
 *         &lt;element name="Error_spcCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Error_spcMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.siebel.com/xml/TSSWICustomerPartyIO_LW}ListOfSwicustomerpartyio_lw"/&gt;
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
    "listOfSwicustomerpartyio",
    "errorSpcCode",
    "errorSpcMessage",
    "listOfSwicustomerpartyioLw"
})
@XmlRootElement(name = "QueryCustomer_Output")
public class QueryCustomerOutput {

    @XmlElement(name = "ListOfSwicustomerpartyio", namespace = "http://www.siebel.com/xml/SWICustomerPartyIO", required = true)
    protected ListOfSwicustomerpartyio listOfSwicustomerpartyio;
    @XmlElement(name = "Error_spcCode", required = true)
    protected String errorSpcCode;
    @XmlElement(name = "Error_spcMessage", required = true)
    protected String errorSpcMessage;
    @XmlElement(name = "ListOfSwicustomerpartyio_lw", namespace = "http://www.siebel.com/xml/TSSWICustomerPartyIO_LW", required = true)
    protected ListOfSwicustomerpartyioLw listOfSwicustomerpartyioLw;

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

    /**
     * Gets the value of the errorSpcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSpcCode() {
        return errorSpcCode;
    }

    /**
     * Sets the value of the errorSpcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSpcCode(String value) {
        this.errorSpcCode = value;
    }

    /**
     * Gets the value of the errorSpcMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSpcMessage() {
        return errorSpcMessage;
    }

    /**
     * Sets the value of the errorSpcMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSpcMessage(String value) {
        this.errorSpcMessage = value;
    }

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
