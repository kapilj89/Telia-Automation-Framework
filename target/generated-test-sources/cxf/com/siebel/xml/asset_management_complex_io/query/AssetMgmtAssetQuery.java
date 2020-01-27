
package com.siebel.xml.asset_management_complex_io.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetMgmt-AssetQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetMgmt-AssetQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TSAtrributeAccessType" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSCustomerId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSDeliveryContractId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSMDUDeliveryContractRevNum" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSMDUServiceType" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSVoIPDeviceType" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSMDUActivationType" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSMDUDeliveryContractNum" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSPlayPlusLoginName" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSTVAccountId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSAgreementId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSAgreementItemEndDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSAgreementItemStartDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSAgreementLineId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSAgreementLineStatus" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AssetSubStatus" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="FulfillmentItemCode" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="NRCCxTotal" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="MRCCxTotal" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Created" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Updated" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AdjustedListPrice" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AssetCurrencyCode" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AssetDescription" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AssetId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="AssetNumber" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="BillingAccount" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="BillingAccountId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="CompoundProductNumber" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveEndDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="InstallDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="MfgDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ParentAssetId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="PriceType" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ProdPromId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ProductDefTypeCode" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ProductDescription" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ProductId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ProductName" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ProductPartNumber" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ProductType" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Quantity2" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="RegisteredDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="RootAssetId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="RootIntegrationId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAccount" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="SmartPartNumber" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="UnitofMeasure" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSKeyExpiryDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSOrganizationId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSVASActivationKey" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSVASRegistrationStatus" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSProductShipFlag" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSSAPrimaryAddresId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSSAPrimaryAddrPointId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSProductLine" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="BillingProfileId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSReasonCode" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSProductSubCategory" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSProductCategory" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ConnectivityReferenceNumber" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="TSPSTNNumber" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/&gt;
 *         &lt;element name="ListOfAssetMgmt-AssetXa" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}ListOfAssetMgmt-AssetXaQuery" minOccurs="0"/&gt;
 *         &lt;element name="AssetMgmt-Asset" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}AssetMgmt-AssetQuery" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="searchspec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetMgmt-AssetQuery", propOrder = {
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
public class AssetMgmtAssetQuery {

    @XmlElement(name = "TSAtrributeAccessType")
    protected QueryType tsAtrributeAccessType;
    @XmlElement(name = "TSCustomerId")
    protected QueryType tsCustomerId;
    @XmlElement(name = "TSDeliveryContractId")
    protected QueryType tsDeliveryContractId;
    @XmlElement(name = "TSMDUDeliveryContractRevNum")
    protected QueryType tsmduDeliveryContractRevNum;
    @XmlElement(name = "TSMDUServiceType")
    protected QueryType tsmduServiceType;
    @XmlElement(name = "TSVoIPDeviceType")
    protected QueryType tsVoIPDeviceType;
    @XmlElement(name = "TSMDUActivationType")
    protected QueryType tsmduActivationType;
    @XmlElement(name = "TSMDUDeliveryContractNum")
    protected QueryType tsmduDeliveryContractNum;
    @XmlElement(name = "TSPlayPlusLoginName")
    protected QueryType tsPlayPlusLoginName;
    @XmlElement(name = "TSTVAccountId")
    protected QueryType tstvAccountId;
    @XmlElement(name = "TSAgreementId")
    protected QueryType tsAgreementId;
    @XmlElement(name = "TSAgreementItemEndDate")
    protected QueryType tsAgreementItemEndDate;
    @XmlElement(name = "TSAgreementItemStartDate")
    protected QueryType tsAgreementItemStartDate;
    @XmlElement(name = "TSAgreementLineId")
    protected QueryType tsAgreementLineId;
    @XmlElement(name = "TSAgreementLineStatus")
    protected QueryType tsAgreementLineStatus;
    @XmlElement(name = "AssetSubStatus")
    protected QueryType assetSubStatus;
    @XmlElement(name = "FulfillmentItemCode")
    protected QueryType fulfillmentItemCode;
    @XmlElement(name = "NRCCxTotal")
    protected QueryType nrcCxTotal;
    @XmlElement(name = "MRCCxTotal")
    protected QueryType mrcCxTotal;
    @XmlElement(name = "Id")
    protected QueryType id;
    @XmlElement(name = "Created")
    protected QueryType created;
    @XmlElement(name = "Updated")
    protected QueryType updated;
    @XmlElement(name = "AdjustedListPrice")
    protected QueryType adjustedListPrice;
    @XmlElement(name = "AssetCurrencyCode")
    protected QueryType assetCurrencyCode;
    @XmlElement(name = "AssetDescription")
    protected QueryType assetDescription;
    @XmlElement(name = "AssetId")
    protected QueryType assetId;
    @XmlElement(name = "AssetNumber")
    protected QueryType assetNumber;
    @XmlElement(name = "BillingAccount")
    protected QueryType billingAccount;
    @XmlElement(name = "BillingAccountId")
    protected QueryType billingAccountId;
    @XmlElement(name = "Comments")
    protected QueryType comments;
    @XmlElement(name = "CompoundProductNumber")
    protected QueryType compoundProductNumber;
    @XmlElement(name = "EffectiveEndDate")
    protected QueryType effectiveEndDate;
    @XmlElement(name = "InstallDate")
    protected QueryType installDate;
    @XmlElement(name = "IntegrationId")
    protected QueryType integrationId;
    @XmlElement(name = "MfgDate")
    protected QueryType mfgDate;
    @XmlElement(name = "Name")
    protected QueryType name;
    @XmlElement(name = "ParentAssetId")
    protected QueryType parentAssetId;
    @XmlElement(name = "PriceType")
    protected QueryType priceType;
    @XmlElement(name = "ProdPromId")
    protected QueryType prodPromId;
    @XmlElement(name = "ProductDefTypeCode")
    protected QueryType productDefTypeCode;
    @XmlElement(name = "ProductDescription")
    protected QueryType productDescription;
    @XmlElement(name = "ProductId")
    protected QueryType productId;
    @XmlElement(name = "ProductName")
    protected QueryType productName;
    @XmlElement(name = "ProductPartNumber")
    protected QueryType productPartNumber;
    @XmlElement(name = "ProductType")
    protected QueryType productType;
    @XmlElement(name = "PurchaseDate")
    protected QueryType purchaseDate;
    @XmlElement(name = "Quantity2")
    protected QueryType quantity2;
    @XmlElement(name = "RegisteredDate")
    protected QueryType registeredDate;
    @XmlElement(name = "RootAssetId")
    protected QueryType rootAssetId;
    @XmlElement(name = "RootIntegrationId")
    protected QueryType rootIntegrationId;
    @XmlElement(name = "SerialNumber")
    protected QueryType serialNumber;
    @XmlElement(name = "ServiceAccount")
    protected QueryType serviceAccount;
    @XmlElement(name = "ShipDate")
    protected QueryType shipDate;
    @XmlElement(name = "SmartPartNumber")
    protected QueryType smartPartNumber;
    @XmlElement(name = "StartDate")
    protected QueryType startDate;
    @XmlElement(name = "Status")
    protected QueryType status;
    @XmlElement(name = "UnitofMeasure")
    protected QueryType unitofMeasure;
    @XmlElement(name = "Version")
    protected QueryType version;
    @XmlElement(name = "TSKeyExpiryDate")
    protected QueryType tsKeyExpiryDate;
    @XmlElement(name = "TSOrganizationId")
    protected QueryType tsOrganizationId;
    @XmlElement(name = "TSVASActivationKey")
    protected QueryType tsvasActivationKey;
    @XmlElement(name = "TSVASRegistrationStatus")
    protected QueryType tsvasRegistrationStatus;
    @XmlElement(name = "TSProductShipFlag")
    protected QueryType tsProductShipFlag;
    @XmlElement(name = "TSSAPrimaryAddresId")
    protected QueryType tssaPrimaryAddresId;
    @XmlElement(name = "TSSAPrimaryAddrPointId")
    protected QueryType tssaPrimaryAddrPointId;
    @XmlElement(name = "TSProductLine")
    protected QueryType tsProductLine;
    @XmlElement(name = "BillingProfileId")
    protected QueryType billingProfileId;
    @XmlElement(name = "TSReasonCode")
    protected QueryType tsReasonCode;
    @XmlElement(name = "TSProductSubCategory")
    protected QueryType tsProductSubCategory;
    @XmlElement(name = "TSProductCategory")
    protected QueryType tsProductCategory;
    @XmlElement(name = "ConnectivityReferenceNumber")
    protected QueryType connectivityReferenceNumber;
    @XmlElement(name = "TSPSTNNumber")
    protected QueryType tspstnNumber;
    @XmlElement(name = "ListOfAssetMgmt-AssetXa")
    protected ListOfAssetMgmtAssetXaQuery listOfAssetMgmtAssetXa;
    @XmlElement(name = "AssetMgmt-Asset")
    protected AssetMgmtAssetQuery assetMgmtAsset;
    @XmlAttribute(name = "searchspec")
    protected String searchspec;

    /**
     * Gets the value of the tsAtrributeAccessType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSAtrributeAccessType() {
        return tsAtrributeAccessType;
    }

    /**
     * Sets the value of the tsAtrributeAccessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSAtrributeAccessType(QueryType value) {
        this.tsAtrributeAccessType = value;
    }

    /**
     * Gets the value of the tsCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSCustomerId() {
        return tsCustomerId;
    }

    /**
     * Sets the value of the tsCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSCustomerId(QueryType value) {
        this.tsCustomerId = value;
    }

    /**
     * Gets the value of the tsDeliveryContractId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSDeliveryContractId() {
        return tsDeliveryContractId;
    }

    /**
     * Sets the value of the tsDeliveryContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSDeliveryContractId(QueryType value) {
        this.tsDeliveryContractId = value;
    }

    /**
     * Gets the value of the tsmduDeliveryContractRevNum property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSMDUDeliveryContractRevNum() {
        return tsmduDeliveryContractRevNum;
    }

    /**
     * Sets the value of the tsmduDeliveryContractRevNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSMDUDeliveryContractRevNum(QueryType value) {
        this.tsmduDeliveryContractRevNum = value;
    }

    /**
     * Gets the value of the tsmduServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSMDUServiceType() {
        return tsmduServiceType;
    }

    /**
     * Sets the value of the tsmduServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSMDUServiceType(QueryType value) {
        this.tsmduServiceType = value;
    }

    /**
     * Gets the value of the tsVoIPDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSVoIPDeviceType() {
        return tsVoIPDeviceType;
    }

    /**
     * Sets the value of the tsVoIPDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSVoIPDeviceType(QueryType value) {
        this.tsVoIPDeviceType = value;
    }

    /**
     * Gets the value of the tsmduActivationType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSMDUActivationType() {
        return tsmduActivationType;
    }

    /**
     * Sets the value of the tsmduActivationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSMDUActivationType(QueryType value) {
        this.tsmduActivationType = value;
    }

    /**
     * Gets the value of the tsmduDeliveryContractNum property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSMDUDeliveryContractNum() {
        return tsmduDeliveryContractNum;
    }

    /**
     * Sets the value of the tsmduDeliveryContractNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSMDUDeliveryContractNum(QueryType value) {
        this.tsmduDeliveryContractNum = value;
    }

    /**
     * Gets the value of the tsPlayPlusLoginName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSPlayPlusLoginName() {
        return tsPlayPlusLoginName;
    }

    /**
     * Sets the value of the tsPlayPlusLoginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSPlayPlusLoginName(QueryType value) {
        this.tsPlayPlusLoginName = value;
    }

    /**
     * Gets the value of the tstvAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSTVAccountId() {
        return tstvAccountId;
    }

    /**
     * Sets the value of the tstvAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSTVAccountId(QueryType value) {
        this.tstvAccountId = value;
    }

    /**
     * Gets the value of the tsAgreementId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSAgreementId() {
        return tsAgreementId;
    }

    /**
     * Sets the value of the tsAgreementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSAgreementId(QueryType value) {
        this.tsAgreementId = value;
    }

    /**
     * Gets the value of the tsAgreementItemEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSAgreementItemEndDate() {
        return tsAgreementItemEndDate;
    }

    /**
     * Sets the value of the tsAgreementItemEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSAgreementItemEndDate(QueryType value) {
        this.tsAgreementItemEndDate = value;
    }

    /**
     * Gets the value of the tsAgreementItemStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSAgreementItemStartDate() {
        return tsAgreementItemStartDate;
    }

    /**
     * Sets the value of the tsAgreementItemStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSAgreementItemStartDate(QueryType value) {
        this.tsAgreementItemStartDate = value;
    }

    /**
     * Gets the value of the tsAgreementLineId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSAgreementLineId() {
        return tsAgreementLineId;
    }

    /**
     * Sets the value of the tsAgreementLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSAgreementLineId(QueryType value) {
        this.tsAgreementLineId = value;
    }

    /**
     * Gets the value of the tsAgreementLineStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSAgreementLineStatus() {
        return tsAgreementLineStatus;
    }

    /**
     * Sets the value of the tsAgreementLineStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSAgreementLineStatus(QueryType value) {
        this.tsAgreementLineStatus = value;
    }

    /**
     * Gets the value of the assetSubStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetSubStatus() {
        return assetSubStatus;
    }

    /**
     * Sets the value of the assetSubStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetSubStatus(QueryType value) {
        this.assetSubStatus = value;
    }

    /**
     * Gets the value of the fulfillmentItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFulfillmentItemCode() {
        return fulfillmentItemCode;
    }

    /**
     * Sets the value of the fulfillmentItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFulfillmentItemCode(QueryType value) {
        this.fulfillmentItemCode = value;
    }

    /**
     * Gets the value of the nrcCxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNRCCxTotal() {
        return nrcCxTotal;
    }

    /**
     * Sets the value of the nrcCxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNRCCxTotal(QueryType value) {
        this.nrcCxTotal = value;
    }

    /**
     * Gets the value of the mrcCxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMRCCxTotal() {
        return mrcCxTotal;
    }

    /**
     * Sets the value of the mrcCxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMRCCxTotal(QueryType value) {
        this.mrcCxTotal = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setId(QueryType value) {
        this.id = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreated(QueryType value) {
        this.created = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUpdated(QueryType value) {
        this.updated = value;
    }

    /**
     * Gets the value of the adjustedListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAdjustedListPrice() {
        return adjustedListPrice;
    }

    /**
     * Sets the value of the adjustedListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAdjustedListPrice(QueryType value) {
        this.adjustedListPrice = value;
    }

    /**
     * Gets the value of the assetCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetCurrencyCode() {
        return assetCurrencyCode;
    }

    /**
     * Sets the value of the assetCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetCurrencyCode(QueryType value) {
        this.assetCurrencyCode = value;
    }

    /**
     * Gets the value of the assetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetDescription() {
        return assetDescription;
    }

    /**
     * Sets the value of the assetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetDescription(QueryType value) {
        this.assetDescription = value;
    }

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetId(QueryType value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the assetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetNumber() {
        return assetNumber;
    }

    /**
     * Sets the value of the assetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetNumber(QueryType value) {
        this.assetNumber = value;
    }

    /**
     * Gets the value of the billingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingAccount() {
        return billingAccount;
    }

    /**
     * Sets the value of the billingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingAccount(QueryType value) {
        this.billingAccount = value;
    }

    /**
     * Gets the value of the billingAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingAccountId() {
        return billingAccountId;
    }

    /**
     * Sets the value of the billingAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingAccountId(QueryType value) {
        this.billingAccountId = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setComments(QueryType value) {
        this.comments = value;
    }

    /**
     * Gets the value of the compoundProductNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCompoundProductNumber() {
        return compoundProductNumber;
    }

    /**
     * Sets the value of the compoundProductNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCompoundProductNumber(QueryType value) {
        this.compoundProductNumber = value;
    }

    /**
     * Gets the value of the effectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * Sets the value of the effectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEffectiveEndDate(QueryType value) {
        this.effectiveEndDate = value;
    }

    /**
     * Gets the value of the installDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getInstallDate() {
        return installDate;
    }

    /**
     * Sets the value of the installDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setInstallDate(QueryType value) {
        this.installDate = value;
    }

    /**
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIntegrationId(QueryType value) {
        this.integrationId = value;
    }

    /**
     * Gets the value of the mfgDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMfgDate() {
        return mfgDate;
    }

    /**
     * Sets the value of the mfgDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMfgDate(QueryType value) {
        this.mfgDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setName(QueryType value) {
        this.name = value;
    }

    /**
     * Gets the value of the parentAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentAssetId() {
        return parentAssetId;
    }

    /**
     * Sets the value of the parentAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentAssetId(QueryType value) {
        this.parentAssetId = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPriceType(QueryType value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the prodPromId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProdPromId() {
        return prodPromId;
    }

    /**
     * Sets the value of the prodPromId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProdPromId(QueryType value) {
        this.prodPromId = value;
    }

    /**
     * Gets the value of the productDefTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductDefTypeCode() {
        return productDefTypeCode;
    }

    /**
     * Sets the value of the productDefTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductDefTypeCode(QueryType value) {
        this.productDefTypeCode = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductDescription(QueryType value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductId(QueryType value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductName(QueryType value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductPartNumber() {
        return productPartNumber;
    }

    /**
     * Sets the value of the productPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductPartNumber(QueryType value) {
        this.productPartNumber = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductType(QueryType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPurchaseDate(QueryType value) {
        this.purchaseDate = value;
    }

    /**
     * Gets the value of the quantity2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuantity2() {
        return quantity2;
    }

    /**
     * Sets the value of the quantity2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuantity2(QueryType value) {
        this.quantity2 = value;
    }

    /**
     * Gets the value of the registeredDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRegisteredDate() {
        return registeredDate;
    }

    /**
     * Sets the value of the registeredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRegisteredDate(QueryType value) {
        this.registeredDate = value;
    }

    /**
     * Gets the value of the rootAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootAssetId() {
        return rootAssetId;
    }

    /**
     * Sets the value of the rootAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootAssetId(QueryType value) {
        this.rootAssetId = value;
    }

    /**
     * Gets the value of the rootIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootIntegrationId() {
        return rootIntegrationId;
    }

    /**
     * Sets the value of the rootIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootIntegrationId(QueryType value) {
        this.rootIntegrationId = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSerialNumber(QueryType value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the serviceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceAccount() {
        return serviceAccount;
    }

    /**
     * Sets the value of the serviceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceAccount(QueryType value) {
        this.serviceAccount = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipDate(QueryType value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the smartPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSmartPartNumber() {
        return smartPartNumber;
    }

    /**
     * Sets the value of the smartPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSmartPartNumber(QueryType value) {
        this.smartPartNumber = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStartDate(QueryType value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStatus(QueryType value) {
        this.status = value;
    }

    /**
     * Gets the value of the unitofMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUnitofMeasure() {
        return unitofMeasure;
    }

    /**
     * Sets the value of the unitofMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUnitofMeasure(QueryType value) {
        this.unitofMeasure = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVersion(QueryType value) {
        this.version = value;
    }

    /**
     * Gets the value of the tsKeyExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSKeyExpiryDate() {
        return tsKeyExpiryDate;
    }

    /**
     * Sets the value of the tsKeyExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSKeyExpiryDate(QueryType value) {
        this.tsKeyExpiryDate = value;
    }

    /**
     * Gets the value of the tsOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSOrganizationId() {
        return tsOrganizationId;
    }

    /**
     * Sets the value of the tsOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSOrganizationId(QueryType value) {
        this.tsOrganizationId = value;
    }

    /**
     * Gets the value of the tsvasActivationKey property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSVASActivationKey() {
        return tsvasActivationKey;
    }

    /**
     * Sets the value of the tsvasActivationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSVASActivationKey(QueryType value) {
        this.tsvasActivationKey = value;
    }

    /**
     * Gets the value of the tsvasRegistrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSVASRegistrationStatus() {
        return tsvasRegistrationStatus;
    }

    /**
     * Sets the value of the tsvasRegistrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSVASRegistrationStatus(QueryType value) {
        this.tsvasRegistrationStatus = value;
    }

    /**
     * Gets the value of the tsProductShipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSProductShipFlag() {
        return tsProductShipFlag;
    }

    /**
     * Sets the value of the tsProductShipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSProductShipFlag(QueryType value) {
        this.tsProductShipFlag = value;
    }

    /**
     * Gets the value of the tssaPrimaryAddresId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSSAPrimaryAddresId() {
        return tssaPrimaryAddresId;
    }

    /**
     * Sets the value of the tssaPrimaryAddresId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSSAPrimaryAddresId(QueryType value) {
        this.tssaPrimaryAddresId = value;
    }

    /**
     * Gets the value of the tssaPrimaryAddrPointId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSSAPrimaryAddrPointId() {
        return tssaPrimaryAddrPointId;
    }

    /**
     * Sets the value of the tssaPrimaryAddrPointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSSAPrimaryAddrPointId(QueryType value) {
        this.tssaPrimaryAddrPointId = value;
    }

    /**
     * Gets the value of the tsProductLine property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSProductLine() {
        return tsProductLine;
    }

    /**
     * Sets the value of the tsProductLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSProductLine(QueryType value) {
        this.tsProductLine = value;
    }

    /**
     * Gets the value of the billingProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingProfileId() {
        return billingProfileId;
    }

    /**
     * Sets the value of the billingProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingProfileId(QueryType value) {
        this.billingProfileId = value;
    }

    /**
     * Gets the value of the tsReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSReasonCode() {
        return tsReasonCode;
    }

    /**
     * Sets the value of the tsReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSReasonCode(QueryType value) {
        this.tsReasonCode = value;
    }

    /**
     * Gets the value of the tsProductSubCategory property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSProductSubCategory() {
        return tsProductSubCategory;
    }

    /**
     * Sets the value of the tsProductSubCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSProductSubCategory(QueryType value) {
        this.tsProductSubCategory = value;
    }

    /**
     * Gets the value of the tsProductCategory property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSProductCategory() {
        return tsProductCategory;
    }

    /**
     * Sets the value of the tsProductCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSProductCategory(QueryType value) {
        this.tsProductCategory = value;
    }

    /**
     * Gets the value of the connectivityReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getConnectivityReferenceNumber() {
        return connectivityReferenceNumber;
    }

    /**
     * Sets the value of the connectivityReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setConnectivityReferenceNumber(QueryType value) {
        this.connectivityReferenceNumber = value;
    }

    /**
     * Gets the value of the tspstnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTSPSTNNumber() {
        return tspstnNumber;
    }

    /**
     * Sets the value of the tspstnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTSPSTNNumber(QueryType value) {
        this.tspstnNumber = value;
    }

    /**
     * Gets the value of the listOfAssetMgmtAssetXa property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAssetMgmtAssetXaQuery }
     *     
     */
    public ListOfAssetMgmtAssetXaQuery getListOfAssetMgmtAssetXa() {
        return listOfAssetMgmtAssetXa;
    }

    /**
     * Sets the value of the listOfAssetMgmtAssetXa property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAssetMgmtAssetXaQuery }
     *     
     */
    public void setListOfAssetMgmtAssetXa(ListOfAssetMgmtAssetXaQuery value) {
        this.listOfAssetMgmtAssetXa = value;
    }

    /**
     * Gets the value of the assetMgmtAsset property.
     * 
     * @return
     *     possible object is
     *     {@link AssetMgmtAssetQuery }
     *     
     */
    public AssetMgmtAssetQuery getAssetMgmtAsset() {
        return assetMgmtAsset;
    }

    /**
     * Sets the value of the assetMgmtAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetMgmtAssetQuery }
     *     
     */
    public void setAssetMgmtAsset(AssetMgmtAssetQuery value) {
        this.assetMgmtAsset = value;
    }

    /**
     * Gets the value of the searchspec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchspec() {
        return searchspec;
    }

    /**
     * Sets the value of the searchspec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchspec(String value) {
        this.searchspec = value;
    }

}
