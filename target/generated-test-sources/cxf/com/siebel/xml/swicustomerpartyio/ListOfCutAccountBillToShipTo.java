
package com.siebel.xml.swicustomerpartyio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfCutAccount-BillToShipTo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfCutAccount-BillToShipTo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CutAccount-BillToShipTo" type="{http://www.siebel.com/xml/SWICustomerPartyIO}CutAccount-BillToShipTo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCutAccount-BillToShipTo", propOrder = {
    "cutAccountBillToShipTo"
})
public class ListOfCutAccountBillToShipTo {

    @XmlElement(name = "CutAccount-BillToShipTo")
    protected List<CutAccountBillToShipTo> cutAccountBillToShipTo;

    /**
     * Gets the value of the cutAccountBillToShipTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cutAccountBillToShipTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCutAccountBillToShipTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CutAccountBillToShipTo }
     * 
     * 
     */
    public List<CutAccountBillToShipTo> getCutAccountBillToShipTo() {
        if (cutAccountBillToShipTo == null) {
            cutAccountBillToShipTo = new ArrayList<CutAccountBillToShipTo>();
        }
        return this.cutAccountBillToShipTo;
    }

}
