
package com.siebel.xml.swicustomerpartyio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfCutAddressCopy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfCutAddressCopy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CutAddressCopy" type="{http://www.siebel.com/xml/SWICustomerPartyIO}CutAddressCopy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCutAddressCopy", propOrder = {
    "cutAddressCopy"
})
public class ListOfCutAddressCopy {

    @XmlElement(name = "CutAddressCopy")
    protected List<CutAddressCopy> cutAddressCopy;

    /**
     * Gets the value of the cutAddressCopy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cutAddressCopy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCutAddressCopy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CutAddressCopy }
     * 
     * 
     */
    public List<CutAddressCopy> getCutAddressCopy() {
        if (cutAddressCopy == null) {
            cutAddressCopy = new ArrayList<CutAddressCopy>();
        }
        return this.cutAddressCopy;
    }

}
