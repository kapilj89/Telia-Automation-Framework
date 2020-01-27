
package com.siebel.xml.swicustomerpartyio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAccount_Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAccount_Contact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Account_Contact" type="{http://www.siebel.com/xml/SWICustomerPartyIO}Account_Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAccount_Contact", propOrder = {
    "accountContact"
})
public class ListOfAccountContact {

    @XmlElement(name = "Account_Contact")
    protected List<AccountContact> accountContact;

    /**
     * Gets the value of the accountContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountContact }
     * 
     * 
     */
    public List<AccountContact> getAccountContact() {
        if (accountContact == null) {
            accountContact = new ArrayList<AccountContact>();
        }
        return this.accountContact;
    }

}
