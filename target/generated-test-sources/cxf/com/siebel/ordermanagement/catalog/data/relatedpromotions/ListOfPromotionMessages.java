
package com.siebel.ordermanagement.catalog.data.relatedpromotions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfPromotionMessages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfPromotionMessages"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PromotionMessages" type="{http://siebel.com/OrderManagement/Catalog/Data/RelatedPromotions}PromotionMessages" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPromotionMessages", propOrder = {
    "promotionMessages"
})
public class ListOfPromotionMessages {

    @XmlElement(name = "PromotionMessages")
    protected List<PromotionMessages> promotionMessages;

    /**
     * Gets the value of the promotionMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionMessages }
     * 
     * 
     */
    public List<PromotionMessages> getPromotionMessages() {
        if (promotionMessages == null) {
            promotionMessages = new ArrayList<PromotionMessages>();
        }
        return this.promotionMessages;
    }

}
