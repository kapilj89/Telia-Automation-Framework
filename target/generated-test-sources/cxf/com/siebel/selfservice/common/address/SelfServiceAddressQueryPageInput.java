
package com.siebel.selfservice.common.address;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.selfservice.common.address.query.ListOfSsAddressIoQuery;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NamedSearchSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://siebel.com/SelfService/Common/Address/Query}ListOfSs_Address_Io" minOccurs="0"/&gt;
 *         &lt;element name="LOVLanguageMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExecutionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ViewMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "namedSearchSpec",
    "listOfSsAddressIo",
    "lovLanguageMode",
    "executionMode",
    "viewMode",
    "pickListName"
})
@XmlRootElement(name = "SelfServiceAddressQueryPage_Input")
public class SelfServiceAddressQueryPageInput {

    @XmlElement(name = "NamedSearchSpec")
    protected String namedSearchSpec;
    @XmlElement(name = "ListOfSs_Address_Io", namespace = "http://siebel.com/SelfService/Common/Address/Query")
    protected ListOfSsAddressIoQuery listOfSsAddressIo;
    @XmlElement(name = "LOVLanguageMode", required = true)
    protected String lovLanguageMode;
    @XmlElement(name = "ExecutionMode")
    protected String executionMode;
    @XmlElement(name = "ViewMode")
    protected String viewMode;
    @XmlElement(name = "PickListName")
    protected String pickListName;

    /**
     * Gets the value of the namedSearchSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamedSearchSpec() {
        return namedSearchSpec;
    }

    /**
     * Sets the value of the namedSearchSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamedSearchSpec(String value) {
        this.namedSearchSpec = value;
    }

    /**
     * Gets the value of the listOfSsAddressIo property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSsAddressIoQuery }
     *     
     */
    public ListOfSsAddressIoQuery getListOfSsAddressIo() {
        return listOfSsAddressIo;
    }

    /**
     * Sets the value of the listOfSsAddressIo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSsAddressIoQuery }
     *     
     */
    public void setListOfSsAddressIo(ListOfSsAddressIoQuery value) {
        this.listOfSsAddressIo = value;
    }

    /**
     * Gets the value of the lovLanguageMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOVLanguageMode() {
        return lovLanguageMode;
    }

    /**
     * Sets the value of the lovLanguageMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOVLanguageMode(String value) {
        this.lovLanguageMode = value;
    }

    /**
     * Gets the value of the executionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionMode() {
        return executionMode;
    }

    /**
     * Sets the value of the executionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionMode(String value) {
        this.executionMode = value;
    }

    /**
     * Gets the value of the viewMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewMode() {
        return viewMode;
    }

    /**
     * Sets the value of the viewMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewMode(String value) {
        this.viewMode = value;
    }

    /**
     * Gets the value of the pickListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickListName() {
        return pickListName;
    }

    /**
     * Sets the value of the pickListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickListName(String value) {
        this.pickListName = value;
    }

}
