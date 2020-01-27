
package com.siebel.ordermanagement.promotion.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfPromotionTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfPromotionTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfPromotion" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfPromotion"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPromotionTopElmt", propOrder = {
    "listOfPromotion"
})
public class ListOfPromotionTopElmt {

    @XmlElement(name = "ListOfPromotion", required = true)
    protected ListOfPromotion listOfPromotion;

    /**
     * Gets the value of the listOfPromotion property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPromotion }
     *     
     */
    public ListOfPromotion getListOfPromotion() {
        return listOfPromotion;
    }

    /**
     * Sets the value of the listOfPromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPromotion }
     *     
     */
    public void setListOfPromotion(ListOfPromotion value) {
        this.listOfPromotion = value;
    }

}
