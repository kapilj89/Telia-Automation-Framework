
package com.siebel.xml.swicustomerpartyio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfCUTAccount-BillToShipTo_BillToBusinessAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfCUTAccount-BillToShipTo_BillToBusinessAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUTAccount-BillToShipTo_BillToBusinessAddress" type="{http://www.siebel.com/xml/SWICustomerPartyIO}CUTAccount-BillToShipTo_BillToBusinessAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCUTAccount-BillToShipTo_BillToBusinessAddress", propOrder = {
    "cutAccountBillToShipToBillToBusinessAddress"
})
public class ListOfCUTAccountBillToShipToBillToBusinessAddress {

    @XmlElement(name = "CUTAccount-BillToShipTo_BillToBusinessAddress")
    protected List<CUTAccountBillToShipToBillToBusinessAddress> cutAccountBillToShipToBillToBusinessAddress;

    /**
     * Gets the value of the cutAccountBillToShipToBillToBusinessAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cutAccountBillToShipToBillToBusinessAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCUTAccountBillToShipToBillToBusinessAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CUTAccountBillToShipToBillToBusinessAddress }
     * 
     * 
     */
    public List<CUTAccountBillToShipToBillToBusinessAddress> getCUTAccountBillToShipToBillToBusinessAddress() {
        if (cutAccountBillToShipToBillToBusinessAddress == null) {
            cutAccountBillToShipToBillToBusinessAddress = new ArrayList<CUTAccountBillToShipToBillToBusinessAddress>();
        }
        return this.cutAccountBillToShipToBillToBusinessAddress;
    }

}
