
package com.siebel.ordermanagement.catalog.data.publishcatalog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrePick" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InclusiveEligibilityFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductConfigurationModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CostListItemCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefectiveProductState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EligibilityReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EligibilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Orderable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductLineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductDefTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClassId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActiveFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListOfIssProductAttributeVbc" type="{http://siebel.com/OrderManagement/Catalog/Data/PublishCatalog}ListOfIssProductAttributeVbc" minOccurs="0"/&gt;
 *         &lt;element name="ListOfNetPriceWaterfall" type="{http://siebel.com/OrderManagement/Catalog/Data/PublishCatalog}ListOfNetPriceWaterfall" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "quantity",
    "parentItemId",
    "prePick",
    "inclusiveEligibilityFlag",
    "id",
    "productConfigurationModelId",
    "costListItemCurrencyCode",
    "defectiveProductState",
    "eligibilityReason",
    "eligibilityStatus",
    "effectiveTo",
    "netPrice",
    "listPrice",
    "name",
    "orderable",
    "priceType",
    "productLineId",
    "productDefTypeCode",
    "productId",
    "effectiveFrom",
    "classId",
    "sequenceNumber",
    "activeFlag",
    "listOfIssProductAttributeVbc",
    "listOfNetPriceWaterfall"
})
public class Product {

    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "ParentItemId")
    protected String parentItemId;
    @XmlElement(name = "PrePick")
    protected String prePick;
    @XmlElement(name = "InclusiveEligibilityFlag")
    protected String inclusiveEligibilityFlag;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "ProductConfigurationModelId")
    protected String productConfigurationModelId;
    @XmlElement(name = "CostListItemCurrencyCode")
    protected String costListItemCurrencyCode;
    @XmlElement(name = "DefectiveProductState")
    protected String defectiveProductState;
    @XmlElement(name = "EligibilityReason")
    protected String eligibilityReason;
    @XmlElement(name = "EligibilityStatus")
    protected String eligibilityStatus;
    @XmlElement(name = "EffectiveTo")
    protected String effectiveTo;
    @XmlElement(name = "NetPrice")
    protected String netPrice;
    @XmlElement(name = "ListPrice")
    protected String listPrice;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Orderable")
    protected String orderable;
    @XmlElement(name = "PriceType")
    protected String priceType;
    @XmlElement(name = "ProductLineId")
    protected String productLineId;
    @XmlElement(name = "ProductDefTypeCode")
    protected String productDefTypeCode;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "EffectiveFrom")
    protected String effectiveFrom;
    @XmlElement(name = "ClassId")
    protected String classId;
    @XmlElement(name = "SequenceNumber")
    protected String sequenceNumber;
    @XmlElement(name = "ActiveFlag")
    protected String activeFlag;
    @XmlElement(name = "ListOfIssProductAttributeVbc")
    protected ListOfIssProductAttributeVbc listOfIssProductAttributeVbc;
    @XmlElement(name = "ListOfNetPriceWaterfall")
    protected ListOfNetPriceWaterfall listOfNetPriceWaterfall;

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the parentItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentItemId() {
        return parentItemId;
    }

    /**
     * Sets the value of the parentItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentItemId(String value) {
        this.parentItemId = value;
    }

    /**
     * Gets the value of the prePick property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrePick() {
        return prePick;
    }

    /**
     * Sets the value of the prePick property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrePick(String value) {
        this.prePick = value;
    }

    /**
     * Gets the value of the inclusiveEligibilityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInclusiveEligibilityFlag() {
        return inclusiveEligibilityFlag;
    }

    /**
     * Sets the value of the inclusiveEligibilityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInclusiveEligibilityFlag(String value) {
        this.inclusiveEligibilityFlag = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the productConfigurationModelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductConfigurationModelId() {
        return productConfigurationModelId;
    }

    /**
     * Sets the value of the productConfigurationModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductConfigurationModelId(String value) {
        this.productConfigurationModelId = value;
    }

    /**
     * Gets the value of the costListItemCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostListItemCurrencyCode() {
        return costListItemCurrencyCode;
    }

    /**
     * Sets the value of the costListItemCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostListItemCurrencyCode(String value) {
        this.costListItemCurrencyCode = value;
    }

    /**
     * Gets the value of the defectiveProductState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefectiveProductState() {
        return defectiveProductState;
    }

    /**
     * Sets the value of the defectiveProductState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefectiveProductState(String value) {
        this.defectiveProductState = value;
    }

    /**
     * Gets the value of the eligibilityReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityReason() {
        return eligibilityReason;
    }

    /**
     * Sets the value of the eligibilityReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityReason(String value) {
        this.eligibilityReason = value;
    }

    /**
     * Gets the value of the eligibilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityStatus() {
        return eligibilityStatus;
    }

    /**
     * Sets the value of the eligibilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityStatus(String value) {
        this.eligibilityStatus = value;
    }

    /**
     * Gets the value of the effectiveTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveTo() {
        return effectiveTo;
    }

    /**
     * Sets the value of the effectiveTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveTo(String value) {
        this.effectiveTo = value;
    }

    /**
     * Gets the value of the netPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPrice() {
        return netPrice;
    }

    /**
     * Sets the value of the netPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetPrice(String value) {
        this.netPrice = value;
    }

    /**
     * Gets the value of the listPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListPrice() {
        return listPrice;
    }

    /**
     * Sets the value of the listPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListPrice(String value) {
        this.listPrice = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the orderable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderable() {
        return orderable;
    }

    /**
     * Sets the value of the orderable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderable(String value) {
        this.orderable = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the productLineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLineId() {
        return productLineId;
    }

    /**
     * Sets the value of the productLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLineId(String value) {
        this.productLineId = value;
    }

    /**
     * Gets the value of the productDefTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDefTypeCode() {
        return productDefTypeCode;
    }

    /**
     * Sets the value of the productDefTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDefTypeCode(String value) {
        this.productDefTypeCode = value;
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
     * Gets the value of the effectiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveFrom() {
        return effectiveFrom;
    }

    /**
     * Sets the value of the effectiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveFrom(String value) {
        this.effectiveFrom = value;
    }

    /**
     * Gets the value of the classId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassId(String value) {
        this.classId = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the activeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveFlag(String value) {
        this.activeFlag = value;
    }

    /**
     * Gets the value of the listOfIssProductAttributeVbc property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfIssProductAttributeVbc }
     *     
     */
    public ListOfIssProductAttributeVbc getListOfIssProductAttributeVbc() {
        return listOfIssProductAttributeVbc;
    }

    /**
     * Sets the value of the listOfIssProductAttributeVbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfIssProductAttributeVbc }
     *     
     */
    public void setListOfIssProductAttributeVbc(ListOfIssProductAttributeVbc value) {
        this.listOfIssProductAttributeVbc = value;
    }

    /**
     * Gets the value of the listOfNetPriceWaterfall property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfNetPriceWaterfall }
     *     
     */
    public ListOfNetPriceWaterfall getListOfNetPriceWaterfall() {
        return listOfNetPriceWaterfall;
    }

    /**
     * Sets the value of the listOfNetPriceWaterfall property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfNetPriceWaterfall }
     *     
     */
    public void setListOfNetPriceWaterfall(ListOfNetPriceWaterfall value) {
        this.listOfNetPriceWaterfall = value;
    }

}
