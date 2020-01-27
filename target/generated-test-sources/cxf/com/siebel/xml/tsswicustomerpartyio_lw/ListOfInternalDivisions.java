
package com.siebel.xml.tsswicustomerpartyio_lw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfInternalDivisions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfInternalDivisions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InternalDivisions" type="{http://www.siebel.com/xml/TSSWICustomerPartyIO_LW}InternalDivisions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfInternalDivisions", propOrder = {
    "internalDivisions"
})
public class ListOfInternalDivisions {

    @XmlElement(name = "InternalDivisions")
    protected List<InternalDivisions> internalDivisions;

    /**
     * Gets the value of the internalDivisions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalDivisions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalDivisions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalDivisions }
     * 
     * 
     */
    public List<InternalDivisions> getInternalDivisions() {
        if (internalDivisions == null) {
            internalDivisions = new ArrayList<InternalDivisions>();
        }
        return this.internalDivisions;
    }

}
