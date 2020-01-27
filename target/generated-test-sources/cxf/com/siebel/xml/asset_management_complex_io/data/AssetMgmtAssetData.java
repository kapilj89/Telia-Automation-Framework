
package com.siebel.xml.asset_management_complex_io.data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AssetMgmt-AssetData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetMgmt-AssetData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TSAtrributeAccessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSDeliveryContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSMDUDeliveryContractRevNum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TSMDUServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSVoIPDeviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSMDUActivationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSMDUDeliveryContractNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPlayPlusLoginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSTVAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSAgreementItemEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TSAgreementItemStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TSAgreementLineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSAgreementLineStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssetSubStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FulfillmentItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NRCCxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MRCCxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AssetCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompoundProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="InstallDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MfgDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentAssetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdPromId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductDefTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Quantity2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RegisteredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RootAssetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RootIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SmartPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitofMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSKeyExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TSOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSVASActivationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSVASRegistrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProductShipFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TSSAPrimaryAddresId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSSAPrimaryAddrPointId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProductLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProductSubCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProductCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConnectivityReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPSTNNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ListOfAssetMgmt-AssetXa" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Data}ListOfAssetMgmt-AssetXaData" minOccurs="0"/&gt;
 *         &lt;element name="AssetMgmt-Asset" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Data}AssetMgmt-AssetData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetMgmt-AssetData", propOrder = {
    "tsAtrributeAccessType",
    "tsCustomerId",
    "tsDeliveryContractId",
    "tsmduDeliveryContractRevNum",
    "tsmduServiceType",
    "tsVoIPDeviceType",
    "tsmduActivationType",
    "tsmduDeliveryContractNum",
    "tsPlayPlusLoginName",
    "tstvAccountId",
    "tsAgreementId",
    "tsAgreementItemEndDate",
    "tsAgreementItemStartDate",
    "tsAgreementLineId",
    "tsAgreementLineStatus",
    "assetSubStatus",
    "fulfillmentItemCode",
    "nrcCxTotal",
    "mrcCxTotal",
    "id",
    "created",
    "updated",
    "adjustedListPrice",
    "assetCurrencyCode",
    "assetDescription",
    "assetId",
    "assetNumber",
    "billingAccount",
    "billingAccountId",
    "comments",
    "compoundProductNumber",
    "effectiveEndDate",
    "installDate",
    "integrationId",
    "mfgDate",
    "name",
    "parentAssetId",
    "priceType",
    "prodPromId",
    "productDefTypeCode",
    "productDescription",
    "productId",
    "productName",
    "productPartNumber",
    "productType",
    "purchaseDate",
    "quantity2",
    "registeredDate",
    "rootAssetId",
    "rootIntegrationId",
    "serialNumber",
    "serviceAccount",
    "shipDate",
    "smartPartNumber",
    "startDate",
    "status",
    "unitofMeasure",
    "version",
    "tsKeyExpiryDate",
    "tsOrganizationId",
    "tsvasActivationKey",
    "tsvasRegistrationStatus",
    "tsProductShipFlag",
    "tssaPrimaryAddresId",
    "tssaPrimaryAddrPointId",
    "tsProductLine",
    "billingProfileId",
    "tsReasonCode",
    "tsProductSubCategory",
    "tsProductCategory",
    "connectivityReferenceNumber",
    "tspstnNumber",
    "listOfAssetMgmtAssetXa",
    "assetMgmtAsset"
})
public class AssetMgmtAssetData {

    @XmlElement(name = "TSAtrributeAccessType")
    protected String tsAtrributeAccessType;
    @XmlElement(name = "TSCustomerId")
    protected String tsCustomerId;
    @XmlElement(name = "TSDeliveryContractId")
    protected String tsDeliveryContractId;
    @XmlElement(name = "TSMDUDeliveryContractRevNum")
    protected BigDecimal tsmduDeliveryContractRevNum;
    @XmlElement(name = "TSMDUServiceType")
    protected String tsmduServiceType;
    @XmlElement(name = "TSVoIPDeviceType")
    protected String tsVoIPDeviceType;
    @XmlElement(name = "TSMDUActivationType")
    protected String tsmduActivationType;
    @XmlElement(name = "TSMDUDeliveryContractNum")
    protected String tsmduDeliveryContractNum;
    @XmlElement(name = "TSPlayPlusLoginName")
    protected String tsPlayPlusLoginName;
    @XmlElement(name = "TSTVAccountId")
    protected String tstvAccountId;
    @XmlElement(name = "TSAgreementId")
    protected String tsAgreementId;
    @XmlElement(name = "TSAgreementItemEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tsAgreementItemEndDate;
    @XmlElement(name = "TSAgreementItemStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tsAgreementItemStartDate;
    @XmlElement(name = "TSAgreementLineId")
    protected String tsAgreementLineId;
    @XmlElement(name = "TSAgreementLineStatus")
    protected String tsAgreementLineStatus;
    @XmlElement(name = "AssetSubStatus")
    protected String assetSubStatus;
    @XmlElement(name = "FulfillmentItemCode")
    protected String fulfillmentItemCode;
    @XmlElement(name = "NRCCxTotal")
    protected BigDecimal nrcCxTotal;
    @XmlElement(name = "MRCCxTotal")
    protected BigDecimal mrcCxTotal;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Created")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "Updated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updated;
    @XmlElement(name = "AdjustedListPrice")
    protected BigDecimal adjustedListPrice;
    @XmlElement(name = "AssetCurrencyCode")
    protected String assetCurrencyCode;
    @XmlElement(name = "AssetDescription")
    protected String assetDescription;
    @XmlElement(name = "AssetId")
    protected String assetId;
    @XmlElement(name = "AssetNumber")
    protected String assetNumber;
    @XmlElement(name = "BillingAccount")
    protected String billingAccount;
    @XmlElement(name = "BillingAccountId")
    protected String billingAccountId;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "CompoundProductNumber")
    protected String compoundProductNumber;
    @XmlElement(name = "EffectiveEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveEndDate;
    @XmlElement(name = "InstallDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar installDate;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "MfgDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mfgDate;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ParentAssetId")
    protected String parentAssetId;
    @XmlElement(name = "PriceType")
    protected String priceType;
    @XmlElement(name = "ProdPromId")
    protected String prodPromId;
    @XmlElement(name = "ProductDefTypeCode")
    protected String productDefTypeCode;
    @XmlElement(name = "ProductDescription")
    protected String productDescription;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "ProductPartNumber")
    protected String productPartNumber;
    @XmlElement(name = "ProductType")
    protected String productType;
    @XmlElement(name = "PurchaseDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar purchaseDate;
    @XmlElement(name = "Quantity2")
    protected Integer quantity2;
    @XmlElement(name = "RegisteredDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registeredDate;
    @XmlElement(name = "RootAssetId")
    protected String rootAssetId;
    @XmlElement(name = "RootIntegrationId")
    protected String rootIntegrationId;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "ServiceAccount")
    protected String serviceAccount;
    @XmlElement(name = "ShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDate;
    @XmlElement(name = "SmartPartNumber")
    protected String smartPartNumber;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "UnitofMeasure")
    protected String unitofMeasure;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "TSKeyExpiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tsKeyExpiryDate;
    @XmlElement(name = "TSOrganizationId")
    protected String tsOrganizationId;
    @XmlElement(name = "TSVASActivationKey")
    protected String tsvasActivationKey;
    @XmlElement(name = "TSVASRegistrationStatus")
    protected String tsvasRegistrationStatus;
    @XmlElement(name = "TSProductShipFlag")
    protected Boolean tsProductShipFlag;
    @XmlElement(name = "TSSAPrimaryAddresId")
    protected String tssaPrimaryAddresId;
    @XmlElement(name = "TSSAPrimaryAddrPointId")
    protected String tssaPrimaryAddrPointId;
    @XmlElement(name = "TSProductLine")
    protected String tsProductLine;
    @XmlElement(name = "BillingProfileId")
    protected String billingProfileId;
    @XmlElement(name = "TSReasonCode")
    protected String tsReasonCode;
    @XmlElement(name = "TSProductSubCategory")
    protected String tsProductSubCategory;
    @XmlElement(name = "TSProductCategory")
    protected String tsProductCategory;
    @XmlElement(name = "ConnectivityReferenceNumber")
    protected String connectivityReferenceNumber;
    @XmlElement(name = "TSPSTNNumber")
    protected BigDecimal tspstnNumber;
    @XmlElement(name = "ListOfAssetMgmt-AssetXa")
    protected ListOfAssetMgmtAssetXaData listOfAssetMgmtAssetXa;
    @XmlElement(name = "AssetMgmt-Asset")
    protected List<AssetMgmtAssetData> assetMgmtAsset;
    @XmlAttribute(name = "operation")
    protected String operation;

    /**
     * Gets the value of the tsAtrributeAccessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSAtrributeAccessType() {
        return tsAtrributeAccessType;
    }

    /**
     * Sets the value of the tsAtrributeAccessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSAtrributeAccessType(String value) {
        this.tsAtrributeAccessType = value;
    }

    /**
     * Gets the value of the tsCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCustomerId() {
        return tsCustomerId;
    }

    /**
     * Sets the value of the tsCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCustomerId(String value) {
        this.tsCustomerId = value;
    }

    /**
     * Gets the value of the tsDeliveryContractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSDeliveryContractId() {
        return tsDeliveryContractId;
    }

    /**
     * Sets the value of the tsDeliveryContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSDeliveryContractId(String value) {
        this.tsDeliveryContractId = value;
    }

    /**
     * Gets the value of the tsmduDeliveryContractRevNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTSMDUDeliveryContractRevNum() {
        return tsmduDeliveryContractRevNum;
    }

    /**
     * Sets the value of the tsmduDeliveryContractRevNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTSMDUDeliveryContractRevNum(BigDecimal value) {
        this.tsmduDeliveryContractRevNum = value;
    }

    /**
     * Gets the value of the tsmduServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSMDUServiceType() {
        return tsmduServiceType;
    }

    /**
     * Sets the value of the tsmduServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSMDUServiceType(String value) {
        this.tsmduServiceType = value;
    }

    /**
     * Gets the value of the tsVoIPDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSVoIPDeviceType() {
        return tsVoIPDeviceType;
    }

    /**
     * Sets the value of the tsVoIPDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSVoIPDeviceType(String value) {
        this.tsVoIPDeviceType = value;
    }

    /**
     * Gets the value of the tsmduActivationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSMDUActivationType() {
        return tsmduActivationType;
    }

    /**
     * Sets the value of the tsmduActivationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSMDUActivationType(String value) {
        this.tsmduActivationType = value;
    }

    /**
     * Gets the value of the tsmduDeliveryContractNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSMDUDeliveryContractNum() {
        return tsmduDeliveryContractNum;
    }

    /**
     * Sets the value of the tsmduDeliveryContractNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSMDUDeliveryContractNum(String value) {
        this.tsmduDeliveryContractNum = value;
    }

    /**
     * Gets the value of the tsPlayPlusLoginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPlayPlusLoginName() {
        return tsPlayPlusLoginName;
    }

    /**
     * Sets the value of the tsPlayPlusLoginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPlayPlusLoginName(String value) {
        this.tsPlayPlusLoginName = value;
    }

    /**
     * Gets the value of the tstvAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSTVAccountId() {
        return tstvAccountId;
    }

    /**
     * Sets the value of the tstvAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSTVAccountId(String value) {
        this.tstvAccountId = value;
    }

    /**
     * Gets the value of the tsAgreementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSAgreementId() {
        return tsAgreementId;
    }

    /**
     * Sets the value of the tsAgreementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSAgreementId(String value) {
        this.tsAgreementId = value;
    }

    /**
     * Gets the value of the tsAgreementItemEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTSAgreementItemEndDate() {
        return tsAgreementItemEndDate;
    }

    /**
     * Sets the value of the tsAgreementItemEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTSAgreementItemEndDate(XMLGregorianCalendar value) {
        this.tsAgreementItemEndDate = value;
    }

    /**
     * Gets the value of the tsAgreementItemStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTSAgreementItemStartDate() {
        return tsAgreementItemStartDate;
    }

    /**
     * Sets the value of the tsAgreementItemStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTSAgreementItemStartDate(XMLGregorianCalendar value) {
        this.tsAgreementItemStartDate = value;
    }

    /**
     * Gets the value of the tsAgreementLineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSAgreementLineId() {
        return tsAgreementLineId;
    }

    /**
     * Sets the value of the tsAgreementLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSAgreementLineId(String value) {
        this.tsAgreementLineId = value;
    }

    /**
     * Gets the value of the tsAgreementLineStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSAgreementLineStatus() {
        return tsAgreementLineStatus;
    }

    /**
     * Sets the value of the tsAgreementLineStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSAgreementLineStatus(String value) {
        this.tsAgreementLineStatus = value;
    }

    /**
     * Gets the value of the assetSubStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetSubStatus() {
        return assetSubStatus;
    }

    /**
     * Sets the value of the assetSubStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetSubStatus(String value) {
        this.assetSubStatus = value;
    }

    /**
     * Gets the value of the fulfillmentItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentItemCode() {
        return fulfillmentItemCode;
    }

    /**
     * Sets the value of the fulfillmentItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentItemCode(String value) {
        this.fulfillmentItemCode = value;
    }

    /**
     * Gets the value of the nrcCxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNRCCxTotal() {
        return nrcCxTotal;
    }

    /**
     * Sets the value of the nrcCxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNRCCxTotal(BigDecimal value) {
        this.nrcCxTotal = value;
    }

    /**
     * Gets the value of the mrcCxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRCCxTotal() {
        return mrcCxTotal;
    }

    /**
     * Sets the value of the mrcCxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRCCxTotal(BigDecimal value) {
        this.mrcCxTotal = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdated(XMLGregorianCalendar value) {
        this.updated = value;
    }

    /**
     * Gets the value of the adjustedListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustedListPrice() {
        return adjustedListPrice;
    }

    /**
     * Sets the value of the adjustedListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustedListPrice(BigDecimal value) {
        this.adjustedListPrice = value;
    }

    /**
     * Gets the value of the assetCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetCurrencyCode() {
        return assetCurrencyCode;
    }

    /**
     * Sets the value of the assetCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetCurrencyCode(String value) {
        this.assetCurrencyCode = value;
    }

    /**
     * Gets the value of the assetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetDescription() {
        return assetDescription;
    }

    /**
     * Sets the value of the assetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetDescription(String value) {
        this.assetDescription = value;
    }

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetId(String value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the assetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetNumber() {
        return assetNumber;
    }

    /**
     * Sets the value of the assetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetNumber(String value) {
        this.assetNumber = value;
    }

    /**
     * Gets the value of the billingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccount() {
        return billingAccount;
    }

    /**
     * Sets the value of the billingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccount(String value) {
        this.billingAccount = value;
    }

    /**
     * Gets the value of the billingAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountId() {
        return billingAccountId;
    }

    /**
     * Sets the value of the billingAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountId(String value) {
        this.billingAccountId = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the compoundProductNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompoundProductNumber() {
        return compoundProductNumber;
    }

    /**
     * Sets the value of the compoundProductNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompoundProductNumber(String value) {
        this.compoundProductNumber = value;
    }

    /**
     * Gets the value of the effectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * Sets the value of the effectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveEndDate(XMLGregorianCalendar value) {
        this.effectiveEndDate = value;
    }

    /**
     * Gets the value of the installDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstallDate() {
        return installDate;
    }

    /**
     * Sets the value of the installDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInstallDate(XMLGregorianCalendar value) {
        this.installDate = value;
    }

    /**
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationId(String value) {
        this.integrationId = value;
    }

    /**
     * Gets the value of the mfgDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMfgDate() {
        return mfgDate;
    }

    /**
     * Sets the value of the mfgDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMfgDate(XMLGregorianCalendar value) {
        this.mfgDate = value;
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
     * Gets the value of the parentAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAssetId() {
        return parentAssetId;
    }

    /**
     * Sets the value of the parentAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAssetId(String value) {
        this.parentAssetId = value;
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
     * Gets the value of the prodPromId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromId() {
        return prodPromId;
    }

    /**
     * Sets the value of the prodPromId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromId(String value) {
        this.prodPromId = value;
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
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
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
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductPartNumber() {
        return productPartNumber;
    }

    /**
     * Sets the value of the productPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductPartNumber(String value) {
        this.productPartNumber = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseDate(XMLGregorianCalendar value) {
        this.purchaseDate = value;
    }

    /**
     * Gets the value of the quantity2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity2() {
        return quantity2;
    }

    /**
     * Sets the value of the quantity2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity2(Integer value) {
        this.quantity2 = value;
    }

    /**
     * Gets the value of the registeredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegisteredDate() {
        return registeredDate;
    }

    /**
     * Sets the value of the registeredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegisteredDate(XMLGregorianCalendar value) {
        this.registeredDate = value;
    }

    /**
     * Gets the value of the rootAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootAssetId() {
        return rootAssetId;
    }

    /**
     * Sets the value of the rootAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootAssetId(String value) {
        this.rootAssetId = value;
    }

    /**
     * Gets the value of the rootIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootIntegrationId() {
        return rootIntegrationId;
    }

    /**
     * Sets the value of the rootIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootIntegrationId(String value) {
        this.rootIntegrationId = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the serviceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccount() {
        return serviceAccount;
    }

    /**
     * Sets the value of the serviceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccount(String value) {
        this.serviceAccount = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDate(XMLGregorianCalendar value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the smartPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartPartNumber() {
        return smartPartNumber;
    }

    /**
     * Sets the value of the smartPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartPartNumber(String value) {
        this.smartPartNumber = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the unitofMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitofMeasure() {
        return unitofMeasure;
    }

    /**
     * Sets the value of the unitofMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitofMeasure(String value) {
        this.unitofMeasure = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the tsKeyExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTSKeyExpiryDate() {
        return tsKeyExpiryDate;
    }

    /**
     * Sets the value of the tsKeyExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTSKeyExpiryDate(XMLGregorianCalendar value) {
        this.tsKeyExpiryDate = value;
    }

    /**
     * Gets the value of the tsOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSOrganizationId() {
        return tsOrganizationId;
    }

    /**
     * Sets the value of the tsOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSOrganizationId(String value) {
        this.tsOrganizationId = value;
    }

    /**
     * Gets the value of the tsvasActivationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSVASActivationKey() {
        return tsvasActivationKey;
    }

    /**
     * Sets the value of the tsvasActivationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSVASActivationKey(String value) {
        this.tsvasActivationKey = value;
    }

    /**
     * Gets the value of the tsvasRegistrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSVASRegistrationStatus() {
        return tsvasRegistrationStatus;
    }

    /**
     * Sets the value of the tsvasRegistrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSVASRegistrationStatus(String value) {
        this.tsvasRegistrationStatus = value;
    }

    /**
     * Gets the value of the tsProductShipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTSProductShipFlag() {
        return tsProductShipFlag;
    }

    /**
     * Sets the value of the tsProductShipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTSProductShipFlag(Boolean value) {
        this.tsProductShipFlag = value;
    }

    /**
     * Gets the value of the tssaPrimaryAddresId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSAPrimaryAddresId() {
        return tssaPrimaryAddresId;
    }

    /**
     * Sets the value of the tssaPrimaryAddresId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSAPrimaryAddresId(String value) {
        this.tssaPrimaryAddresId = value;
    }

    /**
     * Gets the value of the tssaPrimaryAddrPointId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSAPrimaryAddrPointId() {
        return tssaPrimaryAddrPointId;
    }

    /**
     * Sets the value of the tssaPrimaryAddrPointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSAPrimaryAddrPointId(String value) {
        this.tssaPrimaryAddrPointId = value;
    }

    /**
     * Gets the value of the tsProductLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSProductLine() {
        return tsProductLine;
    }

    /**
     * Sets the value of the tsProductLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSProductLine(String value) {
        this.tsProductLine = value;
    }

    /**
     * Gets the value of the billingProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingProfileId() {
        return billingProfileId;
    }

    /**
     * Sets the value of the billingProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingProfileId(String value) {
        this.billingProfileId = value;
    }

    /**
     * Gets the value of the tsReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSReasonCode() {
        return tsReasonCode;
    }

    /**
     * Sets the value of the tsReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSReasonCode(String value) {
        this.tsReasonCode = value;
    }

    /**
     * Gets the value of the tsProductSubCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSProductSubCategory() {
        return tsProductSubCategory;
    }

    /**
     * Sets the value of the tsProductSubCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSProductSubCategory(String value) {
        this.tsProductSubCategory = value;
    }

    /**
     * Gets the value of the tsProductCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSProductCategory() {
        return tsProductCategory;
    }

    /**
     * Sets the value of the tsProductCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSProductCategory(String value) {
        this.tsProductCategory = value;
    }

    /**
     * Gets the value of the connectivityReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectivityReferenceNumber() {
        return connectivityReferenceNumber;
    }

    /**
     * Sets the value of the connectivityReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectivityReferenceNumber(String value) {
        this.connectivityReferenceNumber = value;
    }

    /**
     * Gets the value of the tspstnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTSPSTNNumber() {
        return tspstnNumber;
    }

    /**
     * Sets the value of the tspstnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTSPSTNNumber(BigDecimal value) {
        this.tspstnNumber = value;
    }

    /**
     * Gets the value of the listOfAssetMgmtAssetXa property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAssetMgmtAssetXaData }
     *     
     */
    public ListOfAssetMgmtAssetXaData getListOfAssetMgmtAssetXa() {
        return listOfAssetMgmtAssetXa;
    }

    /**
     * Sets the value of the listOfAssetMgmtAssetXa property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAssetMgmtAssetXaData }
     *     
     */
    public void setListOfAssetMgmtAssetXa(ListOfAssetMgmtAssetXaData value) {
        this.listOfAssetMgmtAssetXa = value;
    }

    /**
     * Gets the value of the assetMgmtAsset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetMgmtAsset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetMgmtAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetMgmtAssetData }
     * 
     * 
     */
    public List<AssetMgmtAssetData> getAssetMgmtAsset() {
        if (assetMgmtAsset == null) {
            assetMgmtAsset = new ArrayList<AssetMgmtAssetData>();
        }
        return this.assetMgmtAsset;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

}
