
package com.siebel.xml.swicustomerpartyio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfComInvoiceProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfComInvoiceProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComInvoiceProfile" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ComInvoiceProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfComInvoiceProfile", propOrder = {
    "comInvoiceProfile"
})
public class ListOfComInvoiceProfile {

    @XmlElement(name = "ComInvoiceProfile")
    protected List<ComInvoiceProfile> comInvoiceProfile;

    /**
     * Gets the value of the comInvoiceProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comInvoiceProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComInvoiceProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComInvoiceProfile }
     * 
     * 
     */
    public List<ComInvoiceProfile> getComInvoiceProfile() {
        if (comInvoiceProfile == null) {
            comInvoiceProfile = new ArrayList<ComInvoiceProfile>();
        }
        return this.comInvoiceProfile;
    }

}
