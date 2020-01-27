
package com.siebel.selfservice.common.user.id;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSSUserTopElmtId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSSUserTopElmtId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfSSUser" type="{http://www.siebel.com/SelfService/Common/User/Id}ListOfSSUserId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSSUserTopElmtId", propOrder = {
    "listOfSSUser"
})
public class ListOfSSUserTopElmtId {

    @XmlElement(name = "ListOfSSUser", required = true)
    protected ListOfSSUserId listOfSSUser;

    /**
     * Gets the value of the listOfSSUser property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSSUserId }
     *     
     */
    public ListOfSSUserId getListOfSSUser() {
        return listOfSSUser;
    }

    /**
     * Sets the value of the listOfSSUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSSUserId }
     *     
     */
    public void setListOfSSUser(ListOfSSUserId value) {
        this.listOfSSUser = value;
    }

}
