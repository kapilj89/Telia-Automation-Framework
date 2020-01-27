
package com.siebel.ordermanagement.configurator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.configurator.cfginteractdata.ListOfData;
import com.siebel.ordermanagement.configurator.cfglinkeditems.ListOfLinkedItems;
import com.siebel.ordermanagement.configurator.cfgproperties.ListOfProperties;
import com.siebel.ordermanagement.quote.data.ListOfQuote;


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
 *         &lt;element name="RootId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://siebel.com/OrderManagement/Configurator/CfgProperties}ListOfProperties"/&gt;
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SkipCfgEligibilityCheck" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://siebel.com/OrderManagement/Configurator/CfgInteractData}ListOfData"/&gt;
 *         &lt;element ref="{http://siebel.com/OrderManagement/Configurator/CfgLinkedItems}ListOfLinkedItems"/&gt;
 *         &lt;element name="HeaderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://siebel.com/OrderManagement/Quote/Data}ListOfQuote"/&gt;
 *         &lt;element name="GetExplanation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InitInstanceOperation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReturnFullInstance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SkipLoadingDefaultInstance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderableCheckFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "rootId",
    "listOfProperties",
    "productId",
    "skipCfgEligibilityCheck",
    "listOfData",
    "listOfLinkedItems",
    "headerId",
    "listOfQuote",
    "getExplanation",
    "initInstanceOperation",
    "returnFullInstance",
    "skipLoadingDefaultInstance",
    "orderableCheckFlag"
})
@XmlRootElement(name = "BeginConfiguration_Input")
public class BeginConfigurationInput {

    @XmlElement(name = "RootId", required = true)
    protected String rootId;
    @XmlElement(name = "ListOfProperties", namespace = "http://siebel.com/OrderManagement/Configurator/CfgProperties", required = true)
    protected ListOfProperties listOfProperties;
    @XmlElement(name = "ProductId", required = true)
    protected String productId;
    @XmlElement(name = "SkipCfgEligibilityCheck", required = true)
    protected String skipCfgEligibilityCheck;
    @XmlElement(name = "ListOfData", namespace = "http://siebel.com/OrderManagement/Configurator/CfgInteractData", required = true)
    protected ListOfData listOfData;
    @XmlElement(name = "ListOfLinkedItems", namespace = "http://siebel.com/OrderManagement/Configurator/CfgLinkedItems", required = true)
    protected ListOfLinkedItems listOfLinkedItems;
    @XmlElement(name = "HeaderId", required = true)
    protected String headerId;
    @XmlElement(name = "ListOfQuote", namespace = "http://siebel.com/OrderManagement/Quote/Data", required = true)
    protected ListOfQuote listOfQuote;
    @XmlElement(name = "GetExplanation", required = true)
    protected String getExplanation;
    @XmlElement(name = "InitInstanceOperation", required = true)
    protected String initInstanceOperation;
    @XmlElement(name = "ReturnFullInstance", required = true)
    protected String returnFullInstance;
    @XmlElement(name = "SkipLoadingDefaultInstance", required = true)
    protected String skipLoadingDefaultInstance;
    @XmlElement(name = "OrderableCheckFlag", required = true)
    protected String orderableCheckFlag;

    /**
     * Gets the value of the rootId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootId() {
        return rootId;
    }

    /**
     * Sets the value of the rootId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootId(String value) {
        this.rootId = value;
    }

    /**
     * Gets the value of the listOfProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProperties }
     *     
     */
    public ListOfProperties getListOfProperties() {
        return listOfProperties;
    }

    /**
     * Sets the value of the listOfProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProperties }
     *     
     */
    public void setListOfProperties(ListOfProperties value) {
        this.listOfProperties = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the skipCfgEligibilityCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkipCfgEligibilityCheck() {
        return skipCfgEligibilityCheck;
    }

    /**
     * Sets the value of the skipCfgEligibilityCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkipCfgEligibilityCheck(String value) {
        this.skipCfgEligibilityCheck = value;
    }

    /**
     * Gets the value of the listOfData property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfData }
     *     
     */
    public ListOfData getListOfData() {
        return listOfData;
    }

    /**
     * Sets the value of the listOfData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfData }
     *     
     */
    public void setListOfData(ListOfData value) {
        this.listOfData = value;
    }

    /**
     * Gets the value of the listOfLinkedItems property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfLinkedItems }
     *     
     */
    public ListOfLinkedItems getListOfLinkedItems() {
        return listOfLinkedItems;
    }

    /**
     * Sets the value of the listOfLinkedItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfLinkedItems }
     *     
     */
    public void setListOfLinkedItems(ListOfLinkedItems value) {
        this.listOfLinkedItems = value;
    }

    /**
     * Gets the value of the headerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderId() {
        return headerId;
    }

    /**
     * Sets the value of the headerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderId(String value) {
        this.headerId = value;
    }

    /**
     * Gets the value of the listOfQuote property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfQuote }
     *     
     */
    public ListOfQuote getListOfQuote() {
        return listOfQuote;
    }

    /**
     * Sets the value of the listOfQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfQuote }
     *     
     */
    public void setListOfQuote(ListOfQuote value) {
        this.listOfQuote = value;
    }

    /**
     * Gets the value of the getExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetExplanation() {
        return getExplanation;
    }

    /**
     * Sets the value of the getExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetExplanation(String value) {
        this.getExplanation = value;
    }

    /**
     * Gets the value of the initInstanceOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitInstanceOperation() {
        return initInstanceOperation;
    }

    /**
     * Sets the value of the initInstanceOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitInstanceOperation(String value) {
        this.initInstanceOperation = value;
    }

    /**
     * Gets the value of the returnFullInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnFullInstance() {
        return returnFullInstance;
    }

    /**
     * Sets the value of the returnFullInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnFullInstance(String value) {
        this.returnFullInstance = value;
    }

    /**
     * Gets the value of the skipLoadingDefaultInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkipLoadingDefaultInstance() {
        return skipLoadingDefaultInstance;
    }

    /**
     * Sets the value of the skipLoadingDefaultInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkipLoadingDefaultInstance(String value) {
        this.skipLoadingDefaultInstance = value;
    }

    /**
     * Gets the value of the orderableCheckFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderableCheckFlag() {
        return orderableCheckFlag;
    }

    /**
     * Sets the value of the orderableCheckFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderableCheckFlag(String value) {
        this.orderableCheckFlag = value;
    }

}
