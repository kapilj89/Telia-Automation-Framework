
package com.siebel.selfservice.common.account.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfContactAlternatePhoneData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfContactAlternatePhoneData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactAlternatePhone" type="{http://www.siebel.com/SelfService/Common/Account/Data}ContactAlternatePhoneData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lastpage" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="recordcount" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfContactAlternatePhoneData", propOrder = {
    "contactAlternatePhone"
})
public class ListOfContactAlternatePhoneData {

    @XmlElement(name = "ContactAlternatePhone")
    protected List<ContactAlternatePhoneData> contactAlternatePhone;
    @XmlAttribute(name = "lastpage")
    protected Boolean lastpage;
    @XmlAttribute(name = "recordcount")
    protected BigInteger recordcount;

    /**
     * Gets the value of the contactAlternatePhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactAlternatePhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactAlternatePhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactAlternatePhoneData }
     * 
     * 
     */
    public List<ContactAlternatePhoneData> getContactAlternatePhone() {
        if (contactAlternatePhone == null) {
            contactAlternatePhone = new ArrayList<ContactAlternatePhoneData>();
        }
        return this.contactAlternatePhone;
    }

    /**
     * Gets the value of the lastpage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastpage() {
        return lastpage;
    }

    /**
     * Sets the value of the lastpage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastpage(Boolean value) {
        this.lastpage = value;
    }

    /**
     * Gets the value of the recordcount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordcount() {
        return recordcount;
    }

    /**
     * Sets the value of the recordcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordcount(BigInteger value) {
        this.recordcount = value;
    }

}