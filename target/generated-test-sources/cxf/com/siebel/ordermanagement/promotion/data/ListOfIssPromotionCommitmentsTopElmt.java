
package com.siebel.ordermanagement.promotion.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfIssPromotionCommitmentsTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfIssPromotionCommitmentsTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfIssPromotionCommitments" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfIssPromotionCommitments"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfIssPromotionCommitmentsTopElmt", propOrder = {
    "listOfIssPromotionCommitments"
})
public class ListOfIssPromotionCommitmentsTopElmt {

    @XmlElement(name = "ListOfIssPromotionCommitments", required = true)
    protected ListOfIssPromotionCommitments listOfIssPromotionCommitments;

    /**
     * Gets the value of the listOfIssPromotionCommitments property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfIssPromotionCommitments }
     *     
     */
    public ListOfIssPromotionCommitments getListOfIssPromotionCommitments() {
        return listOfIssPromotionCommitments;
    }

    /**
     * Sets the value of the listOfIssPromotionCommitments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfIssPromotionCommitments }
     *     
     */
    public void setListOfIssPromotionCommitments(ListOfIssPromotionCommitments value) {
        this.listOfIssPromotionCommitments = value;
    }

}
