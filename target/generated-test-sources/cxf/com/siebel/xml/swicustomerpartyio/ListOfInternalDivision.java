
package com.siebel.xml.swicustomerpartyio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfInternalDivision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfInternalDivision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InternalDivision" type="{http://www.siebel.com/xml/SWICustomerPartyIO}InternalDivision" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfInternalDivision", propOrder = {
    "internalDivision"
})
public class ListOfInternalDivision {

    @XmlElement(name = "InternalDivision")
    protected List<InternalDivision> internalDivision;

    /**
     * Gets the value of the internalDivision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalDivision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalDivision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalDivision }
     * 
     * 
     */
    public List<InternalDivision> getInternalDivision() {
        if (internalDivision == null) {
            internalDivision = new ArrayList<InternalDivision>();
        }
        return this.internalDivision;
    }

}
