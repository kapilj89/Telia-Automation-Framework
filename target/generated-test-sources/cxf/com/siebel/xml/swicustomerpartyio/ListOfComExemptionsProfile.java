
package com.siebel.xml.swicustomerpartyio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfComExemptionsProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfComExemptionsProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComExemptionsProfile" type="{http://www.siebel.com/xml/SWICustomerPartyIO}ComExemptionsProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfComExemptionsProfile", propOrder = {
    "comExemptionsProfile"
})
public class ListOfComExemptionsProfile {

    @XmlElement(name = "ComExemptionsProfile")
    protected List<ComExemptionsProfile> comExemptionsProfile;

    /**
     * Gets the value of the comExemptionsProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comExemptionsProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComExemptionsProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComExemptionsProfile }
     * 
     * 
     */
    public List<ComExemptionsProfile> getComExemptionsProfile() {
        if (comExemptionsProfile == null) {
            comExemptionsProfile = new ArrayList<ComExemptionsProfile>();
        }
        return this.comExemptionsProfile;
    }

}
