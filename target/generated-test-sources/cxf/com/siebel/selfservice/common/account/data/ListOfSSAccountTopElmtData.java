
package com.siebel.selfservice.common.account.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSSAccountTopElmtData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSSAccountTopElmtData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfSSAccount" type="{http://www.siebel.com/SelfService/Common/Account/Data}ListOfSSAccountData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSSAccountTopElmtData", propOrder = {
    "listOfSSAccount"
})
public class ListOfSSAccountTopElmtData {

    @XmlElement(name = "ListOfSSAccount", required = true)
    protected ListOfSSAccountData listOfSSAccount;

    /**
     * Gets the value of the listOfSSAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSSAccountData }
     *     
     */
    public ListOfSSAccountData getListOfSSAccount() {
        return listOfSSAccount;
    }

    /**
     * Sets the value of the listOfSSAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSSAccountData }
     *     
     */
    public void setListOfSSAccount(ListOfSSAccountData value) {
        this.listOfSSAccount = value;
    }

}