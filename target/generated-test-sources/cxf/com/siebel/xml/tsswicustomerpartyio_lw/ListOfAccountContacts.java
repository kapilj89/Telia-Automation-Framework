
package com.siebel.xml.tsswicustomerpartyio_lw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAccount_Contacts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAccount_Contacts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Account_Contacts" type="{http://www.siebel.com/xml/TSSWICustomerPartyIO_LW}Account_Contacts" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAccount_Contacts", propOrder = {
    "accountContacts"
})
public class ListOfAccountContacts {

    @XmlElement(name = "Account_Contacts")
    protected List<AccountContacts> accountContacts;

    /**
     * Gets the value of the accountContacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountContacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountContacts }
     * 
     * 
     */
    public List<AccountContacts> getAccountContacts() {
        if (accountContacts == null) {
            accountContacts = new ArrayList<AccountContacts>();
        }
        return this.accountContacts;
    }

}
