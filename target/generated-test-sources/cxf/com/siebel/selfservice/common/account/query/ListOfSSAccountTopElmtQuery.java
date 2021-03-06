
package com.siebel.selfservice.common.account.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSSAccountTopElmtQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSSAccountTopElmtQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfSSAccount" type="{http://www.siebel.com/SelfService/Common/Account/Query}ListOfSSAccountQuery" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSSAccountTopElmtQuery", propOrder = {
    "listOfSSAccount"
})
public class ListOfSSAccountTopElmtQuery {

    @XmlElement(name = "ListOfSSAccount")
    protected ListOfSSAccountQuery listOfSSAccount;

    /**
     * Gets the value of the listOfSSAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSSAccountQuery }
     *     
     */
    public ListOfSSAccountQuery getListOfSSAccount() {
        return listOfSSAccount;
    }

    /**
     * Sets the value of the listOfSSAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSSAccountQuery }
     *     
     */
    public void setListOfSSAccount(ListOfSSAccountQuery value) {
        this.listOfSSAccount = value;
    }

}
