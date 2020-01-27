
package com.siebel.xml.swicustomerpartyio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAccount_BusinessAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAccount_BusinessAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Account_BusinessAddress" type="{http://www.siebel.com/xml/SWICustomerPartyIO}Account_BusinessAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAccount_BusinessAddress", propOrder = {
    "accountBusinessAddress"
})
public class ListOfAccountBusinessAddress {

    @XmlElement(name = "Account_BusinessAddress")
    protected List<AccountBusinessAddress> accountBusinessAddress;

    /**
     * Gets the value of the accountBusinessAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountBusinessAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountBusinessAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountBusinessAddress }
     * 
     * 
     */
    public List<AccountBusinessAddress> getAccountBusinessAddress() {
        if (accountBusinessAddress == null) {
            accountBusinessAddress = new ArrayList<AccountBusinessAddress>();
        }
        return this.accountBusinessAddress;
    }

}
