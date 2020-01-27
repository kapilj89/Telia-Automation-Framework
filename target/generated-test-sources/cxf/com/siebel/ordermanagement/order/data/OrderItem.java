
package com.siebel.ordermanagement.order.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EligibilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ForcastableFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EligibilityReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExcludePricingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MRCCxTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NRCCxTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemPriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Milestone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductStructureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CfgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CfgStateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClassId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VolumeDiscountItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VolumeDiscountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdPromSourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdPromRuleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdPromInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdPromId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PortItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedQuantityRequested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSOldPSTNNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSMDUDeliveryContractNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSVoIPOldDeviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSVOIPNumberChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSVOIPNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConnectivityReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSDeliveryContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemparoryContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSC2BDueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSBusyPortFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSBillingPaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSServiceAccountPointId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSServiceAccountAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSMoveOutDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSMDUDeliveryContractRevNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProductLongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProductLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Temporary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VolumeUpsellItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSParcelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPSTNNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryContactPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryContactEmailAdd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RootOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RollupItemPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RollupAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLengthUoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RootProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VolumeUpsellMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSVoIPDeviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSColtDeliveryFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitofMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSBillNowFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProdPromInstanceCalc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VolumeUpsellItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostPickCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PricingComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NeedRefresh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RootAssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductLineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VolumeDiscountItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConfigurationModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HasGenerics" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrigListPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdPromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrePickCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InclusiveEligibilityFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Qty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SmartPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListOfOrderItemXA" type="{http://siebel.com/OrderManagement/Order/Data}ListOfOrderItemXA" minOccurs="0"/&gt;
 *         &lt;element name="BillingProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSCommitmentReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSOldPckgAssetIntegId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPackageCommitmentPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPckgCommitmentUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPckgDeleteReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSVASRegistrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSVASRegisteredDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductShipFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FulfillmentItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProductCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProductSubCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPrevAccessTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSAccessTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSTVAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderItem" type="{http://siebel.com/OrderManagement/Order/Data}OrderItem" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "OrderItem", propOrder = {
    "eligibilityStatus",
    "forcastableFlag",
    "eligibilityReason",
    "excludePricingFlag",
    "dueDate",
    "discount",
    "currencyCode",
    "cost",
    "mrcCxTotal",
    "nrcCxTotal",
    "lineNumber",
    "itemPriceListId",
    "milestone",
    "productType",
    "productStructureType",
    "cfgType",
    "cfgStateCode",
    "classId",
    "actionCode",
    "productTypeCode",
    "volumeDiscountItemId",
    "volumeDiscountId",
    "prodPromSourceId",
    "prodPromRuleId",
    "prodPromInstanceId",
    "prodPromId",
    "prodItemId",
    "portItemId",
    "extendedQuantityRequested",
    "tsOldPSTNNumber",
    "expectedDeliveryDate",
    "tsmduDeliveryContractNum",
    "tsVoIPOldDeviceType",
    "tsvoipNumberChange",
    "tsvoipNumber",
    "connectivityReferenceNumber",
    "tsDeliveryContractId",
    "temparoryContactId",
    "tsCarrierCode",
    "tsc2BDueDate",
    "tsBusyPortFlag",
    "tsBillingPaymentMethod",
    "tsServiceAccountPointId",
    "tsServiceAccountAddressId",
    "tsMoveOutDate",
    "tsmduDeliveryContractRevNum",
    "tsProductLongDescription",
    "tsProductLine",
    "temporary",
    "volumeUpsellItemId",
    "tsPaymentMethod",
    "tsParcelNumber",
    "tspstnNumber",
    "temporaryContactPhoneNumber",
    "temporaryContactLastName",
    "temporaryContactFirstName",
    "temporaryContactEmailAdd",
    "rootOrderItemId",
    "rollupItemPrice",
    "rollupAmount",
    "serviceLengthUoM",
    "rootProductId",
    "status",
    "assetIntegrationId",
    "volumeUpsellMessage",
    "tsVoIPDeviceType",
    "tsColtDeliveryFromDate",
    "unitofMeasure",
    "tsBillNowFlag",
    "tsProdPromInstanceCalc",
    "serviceLength",
    "integrationId",
    "exchangeDate",
    "currentPrice",
    "name",
    "productId",
    "volumeUpsellItem",
    "priceListId",
    "postPickCD",
    "pricingComments",
    "needRefresh",
    "discountSource",
    "sequenceNumber",
    "rootAssetIntegrationId",
    "productLineId",
    "discountPercent",
    "created",
    "id",
    "effectiveFrom",
    "unitPrice",
    "updated",
    "volumeDiscountItem",
    "configurationModelId",
    "hasGenerics",
    "discountAmount",
    "modId",
    "listPrice",
    "origListPrice",
    "parentOrderItemId",
    "conflictId",
    "priceType",
    "prodPromName",
    "prePickCD",
    "inclusiveEligibilityFlag",
    "qty",
    "smartPartNumber",
    "effectiveTo",
    "listOfOrderItemXA",
    "billingProfileId",
    "billingProfileName",
    "tsCommitmentReason",
    "tsOldPckgAssetIntegId",
    "tsPackageCommitmentPeriod",
    "tsPckgCommitmentUOM",
    "tsPckgDeleteReason",
    "tsNote",
    "tsvasRegistrationStatus",
    "tsvasRegisteredDate",
    "productShipFlag",
    "fulfillmentItemCode",
    "tsProductCategory",
    "tsProductSubCategory",
    "tsPrevAccessTypeId",
    "tsAccessTypeId",
    "tstvAccountId",
    "orderItem"
})
public class OrderItem {

    @XmlElement(name = "EligibilityStatus")
    protected String eligibilityStatus;
    @XmlElement(name = "ForcastableFlag")
    protected String forcastableFlag;
    @XmlElement(name = "EligibilityReason")
    protected String eligibilityReason;
    @XmlElement(name = "ExcludePricingFlag")
    protected String excludePricingFlag;
    @XmlElement(name = "DueDate")
    protected String dueDate;
    @XmlElement(name = "Discount")
    protected String discount;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "Cost")
    protected String cost;
    @XmlElement(name = "MRCCxTotal")
    protected String mrcCxTotal;
    @XmlElement(name = "NRCCxTotal")
    protected String nrcCxTotal;
    @XmlElement(name = "LineNumber")
    protected String lineNumber;
    @XmlElement(name = "ItemPriceListId")
    protected String itemPriceListId;
    @XmlElement(name = "Milestone")
    protected String milestone;
    @XmlElement(name = "ProductType")
    protected String productType;
    @XmlElement(name = "ProductStructureType")
    protected String productStructureType;
    @XmlElement(name = "CfgType")
    protected String cfgType;
    @XmlElement(name = "CfgStateCode")
    protected String cfgStateCode;
    @XmlElement(name = "ClassId")
    protected String classId;
    @XmlElement(name = "ActionCode")
    protected String actionCode;
    @XmlElement(name = "ProductTypeCode")
    protected String productTypeCode;
    @XmlElement(name = "VolumeDiscountItemId")
    protected String volumeDiscountItemId;
    @XmlElement(name = "VolumeDiscountId")
    protected String volumeDiscountId;
    @XmlElement(name = "ProdPromSourceId")
    protected String prodPromSourceId;
    @XmlElement(name = "ProdPromRuleId")
    protected String prodPromRuleId;
    @XmlElement(name = "ProdPromInstanceId")
    protected String prodPromInstanceId;
    @XmlElement(name = "ProdPromId")
    protected String prodPromId;
    @XmlElement(name = "ProdItemId")
    protected String prodItemId;
    @XmlElement(name = "PortItemId")
    protected String portItemId;
    @XmlElement(name = "ExtendedQuantityRequested")
    protected String extendedQuantityRequested;
    @XmlElement(name = "TSOldPSTNNumber")
    protected String tsOldPSTNNumber;
    @XmlElement(name = "ExpectedDeliveryDate")
    protected String expectedDeliveryDate;
    @XmlElement(name = "TSMDUDeliveryContractNum")
    protected String tsmduDeliveryContractNum;
    @XmlElement(name = "TSVoIPOldDeviceType")
    protected String tsVoIPOldDeviceType;
    @XmlElement(name = "TSVOIPNumberChange")
    protected String tsvoipNumberChange;
    @XmlElement(name = "TSVOIPNumber")
    protected String tsvoipNumber;
    @XmlElement(name = "ConnectivityReferenceNumber")
    protected String connectivityReferenceNumber;
    @XmlElement(name = "TSDeliveryContractId")
    protected String tsDeliveryContractId;
    @XmlElement(name = "TemparoryContactId")
    protected String temparoryContactId;
    @XmlElement(name = "TSCarrierCode")
    protected String tsCarrierCode;
    @XmlElement(name = "TSC2BDueDate")
    protected String tsc2BDueDate;
    @XmlElement(name = "TSBusyPortFlag")
    protected String tsBusyPortFlag;
    @XmlElement(name = "TSBillingPaymentMethod")
    protected String tsBillingPaymentMethod;
    @XmlElement(name = "TSServiceAccountPointId")
    protected String tsServiceAccountPointId;
    @XmlElement(name = "TSServiceAccountAddressId")
    protected String tsServiceAccountAddressId;
    @XmlElement(name = "TSMoveOutDate")
    protected String tsMoveOutDate;
    @XmlElement(name = "TSMDUDeliveryContractRevNum")
    protected String tsmduDeliveryContractRevNum;
    @XmlElement(name = "TSProductLongDescription")
    protected String tsProductLongDescription;
    @XmlElement(name = "TSProductLine")
    protected String tsProductLine;
    @XmlElement(name = "Temporary")
    protected String temporary;
    @XmlElement(name = "VolumeUpsellItemId")
    protected String volumeUpsellItemId;
    @XmlElement(name = "TSPaymentMethod")
    protected String tsPaymentMethod;
    @XmlElement(name = "TSParcelNumber")
    protected String tsParcelNumber;
    @XmlElement(name = "TSPSTNNumber")
    protected String tspstnNumber;
    @XmlElement(name = "TemporaryContactPhoneNumber")
    protected String temporaryContactPhoneNumber;
    @XmlElement(name = "TemporaryContactLastName")
    protected String temporaryContactLastName;
    @XmlElement(name = "TemporaryContactFirstName")
    protected String temporaryContactFirstName;
    @XmlElement(name = "TemporaryContactEmailAdd")
    protected String temporaryContactEmailAdd;
    @XmlElement(name = "RootOrderItemId")
    protected String rootOrderItemId;
    @XmlElement(name = "RollupItemPrice")
    protected String rollupItemPrice;
    @XmlElement(name = "RollupAmount")
    protected String rollupAmount;
    @XmlElement(name = "ServiceLengthUoM")
    protected String serviceLengthUoM;
    @XmlElement(name = "RootProductId")
    protected String rootProductId;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "AssetIntegrationId")
    protected String assetIntegrationId;
    @XmlElement(name = "VolumeUpsellMessage")
    protected String volumeUpsellMessage;
    @XmlElement(name = "TSVoIPDeviceType")
    protected String tsVoIPDeviceType;
    @XmlElement(name = "TSColtDeliveryFromDate")
    protected String tsColtDeliveryFromDate;
    @XmlElement(name = "UnitofMeasure")
    protected String unitofMeasure;
    @XmlElement(name = "TSBillNowFlag")
    protected String tsBillNowFlag;
    @XmlElement(name = "TSProdPromInstanceCalc")
    protected String tsProdPromInstanceCalc;
    @XmlElement(name = "ServiceLength")
    protected String serviceLength;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "ExchangeDate")
    protected String exchangeDate;
    @XmlElement(name = "CurrentPrice")
    protected String currentPrice;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "VolumeUpsellItem")
    protected String volumeUpsellItem;
    @XmlElement(name = "PriceListId")
    protected String priceListId;
    @XmlElement(name = "PostPickCD")
    protected String postPickCD;
    @XmlElement(name = "PricingComments")
    protected String pricingComments;
    @XmlElement(name = "NeedRefresh")
    protected String needRefresh;
    @XmlElement(name = "DiscountSource")
    protected String discountSource;
    @XmlElement(name = "SequenceNumber")
    protected String sequenceNumber;
    @XmlElement(name = "RootAssetIntegrationId")
    protected String rootAssetIntegrationId;
    @XmlElement(name = "ProductLineId")
    protected String productLineId;
    @XmlElement(name = "DiscountPercent")
    protected String discountPercent;
    @XmlElement(name = "Created")
    protected String created;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "EffectiveFrom")
    protected String effectiveFrom;
    @XmlElement(name = "UnitPrice")
    protected String unitPrice;
    @XmlElement(name = "Updated")
    protected String updated;
    @XmlElement(name = "VolumeDiscountItem")
    protected String volumeDiscountItem;
    @XmlElement(name = "ConfigurationModelId")
    protected String configurationModelId;
    @XmlElement(name = "HasGenerics")
    protected String hasGenerics;
    @XmlElement(name = "DiscountAmount")
    protected String discountAmount;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "ListPrice")
    protected String listPrice;
    @XmlElement(name = "OrigListPrice")
    protected String origListPrice;
    @XmlElement(name = "ParentOrderItemId")
    protected String parentOrderItemId;
    @XmlElement(name = "ConflictId")
    protected String conflictId;
    @XmlElement(name = "PriceType")
    protected String priceType;
    @XmlElement(name = "ProdPromName")
    protected String prodPromName;
    @XmlElement(name = "PrePickCD")
    protected String prePickCD;
    @XmlElement(name = "InclusiveEligibilityFlag")
    protected String inclusiveEligibilityFlag;
    @XmlElement(name = "Qty")
    protected String qty;
    @XmlElement(name = "SmartPartNumber")
    protected String smartPartNumber;
    @XmlElement(name = "EffectiveTo")
    protected String effectiveTo;
    @XmlElement(name = "ListOfOrderItemXA")
    protected ListOfOrderItemXA listOfOrderItemXA;
    @XmlElement(name = "BillingProfileId")
    protected String billingProfileId;
    @XmlElement(name = "BillingProfileName")
    protected String billingProfileName;
    @XmlElement(name = "TSCommitmentReason")
    protected String tsCommitmentReason;
    @XmlElement(name = "TSOldPckgAssetIntegId")
    protected String tsOldPckgAssetIntegId;
    @XmlElement(name = "TSPackageCommitmentPeriod")
    protected String tsPackageCommitmentPeriod;
    @XmlElement(name = "TSPckgCommitmentUOM")
    protected String tsPckgCommitmentUOM;
    @XmlElement(name = "TSPckgDeleteReason")
    protected String tsPckgDeleteReason;
    @XmlElement(name = "TSNote")
    protected String tsNote;
    @XmlElement(name = "TSVASRegistrationStatus")
    protected String tsvasRegistrationStatus;
    @XmlElement(name = "TSVASRegisteredDate")
    protected String tsvasRegisteredDate;
    @XmlElement(name = "ProductShipFlag")
    protected String productShipFlag;
    @XmlElement(name = "FulfillmentItemCode")
    protected String fulfillmentItemCode;
    @XmlElement(name = "TSProductCategory")
    protected String tsProductCategory;
    @XmlElement(name = "TSProductSubCategory")
    protected String tsProductSubCategory;
    @XmlElement(name = "TSPrevAccessTypeId")
    protected String tsPrevAccessTypeId;
    @XmlElement(name = "TSAccessTypeId")
    protected String tsAccessTypeId;
    @XmlElement(name = "TSTVAccountId")
    protected String tstvAccountId;
    @XmlElement(name = "OrderItem")
    protected List<OrderItem> orderItem;
    @XmlAttribute(name = "searchspec")
    protected String searchspec;

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
     * Gets the value of the forcastableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForcastableFlag() {
        return forcastableFlag;
    }

    /**
     * Sets the value of the forcastableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForcastableFlag(String value) {
        this.forcastableFlag = value;
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
     * Gets the value of the excludePricingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludePricingFlag() {
        return excludePricingFlag;
    }

    /**
     * Sets the value of the excludePricingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludePricingFlag(String value) {
        this.excludePricingFlag = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount(String value) {
        this.discount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCost(String value) {
        this.cost = value;
    }

    /**
     * Gets the value of the mrcCxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRCCxTotal() {
        return mrcCxTotal;
    }

    /**
     * Sets the value of the mrcCxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRCCxTotal(String value) {
        this.mrcCxTotal = value;
    }

    /**
     * Gets the value of the nrcCxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCCxTotal() {
        return nrcCxTotal;
    }

    /**
     * Sets the value of the nrcCxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCCxTotal(String value) {
        this.nrcCxTotal = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the itemPriceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPriceListId() {
        return itemPriceListId;
    }

    /**
     * Sets the value of the itemPriceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPriceListId(String value) {
        this.itemPriceListId = value;
    }

    /**
     * Gets the value of the milestone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilestone() {
        return milestone;
    }

    /**
     * Sets the value of the milestone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilestone(String value) {
        this.milestone = value;
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
     * Gets the value of the productStructureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductStructureType() {
        return productStructureType;
    }

    /**
     * Sets the value of the productStructureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductStructureType(String value) {
        this.productStructureType = value;
    }

    /**
     * Gets the value of the cfgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfgType() {
        return cfgType;
    }

    /**
     * Sets the value of the cfgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfgType(String value) {
        this.cfgType = value;
    }

    /**
     * Gets the value of the cfgStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfgStateCode() {
        return cfgStateCode;
    }

    /**
     * Sets the value of the cfgStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfgStateCode(String value) {
        this.cfgStateCode = value;
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
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the productTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }

    /**
     * Sets the value of the productTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeCode(String value) {
        this.productTypeCode = value;
    }

    /**
     * Gets the value of the volumeDiscountItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeDiscountItemId() {
        return volumeDiscountItemId;
    }

    /**
     * Sets the value of the volumeDiscountItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeDiscountItemId(String value) {
        this.volumeDiscountItemId = value;
    }

    /**
     * Gets the value of the volumeDiscountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeDiscountId() {
        return volumeDiscountId;
    }

    /**
     * Sets the value of the volumeDiscountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeDiscountId(String value) {
        this.volumeDiscountId = value;
    }

    /**
     * Gets the value of the prodPromSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromSourceId() {
        return prodPromSourceId;
    }

    /**
     * Sets the value of the prodPromSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromSourceId(String value) {
        this.prodPromSourceId = value;
    }

    /**
     * Gets the value of the prodPromRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromRuleId() {
        return prodPromRuleId;
    }

    /**
     * Sets the value of the prodPromRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromRuleId(String value) {
        this.prodPromRuleId = value;
    }

    /**
     * Gets the value of the prodPromInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromInstanceId() {
        return prodPromInstanceId;
    }

    /**
     * Sets the value of the prodPromInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromInstanceId(String value) {
        this.prodPromInstanceId = value;
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
     * Gets the value of the prodItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdItemId() {
        return prodItemId;
    }

    /**
     * Sets the value of the prodItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdItemId(String value) {
        this.prodItemId = value;
    }

    /**
     * Gets the value of the portItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortItemId() {
        return portItemId;
    }

    /**
     * Sets the value of the portItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortItemId(String value) {
        this.portItemId = value;
    }

    /**
     * Gets the value of the extendedQuantityRequested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedQuantityRequested() {
        return extendedQuantityRequested;
    }

    /**
     * Sets the value of the extendedQuantityRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedQuantityRequested(String value) {
        this.extendedQuantityRequested = value;
    }

    /**
     * Gets the value of the tsOldPSTNNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSOldPSTNNumber() {
        return tsOldPSTNNumber;
    }

    /**
     * Sets the value of the tsOldPSTNNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSOldPSTNNumber(String value) {
        this.tsOldPSTNNumber = value;
    }

    /**
     * Gets the value of the expectedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    /**
     * Sets the value of the expectedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedDeliveryDate(String value) {
        this.expectedDeliveryDate = value;
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
     * Gets the value of the tsVoIPOldDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSVoIPOldDeviceType() {
        return tsVoIPOldDeviceType;
    }

    /**
     * Sets the value of the tsVoIPOldDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSVoIPOldDeviceType(String value) {
        this.tsVoIPOldDeviceType = value;
    }

    /**
     * Gets the value of the tsvoipNumberChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSVOIPNumberChange() {
        return tsvoipNumberChange;
    }

    /**
     * Sets the value of the tsvoipNumberChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSVOIPNumberChange(String value) {
        this.tsvoipNumberChange = value;
    }

    /**
     * Gets the value of the tsvoipNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSVOIPNumber() {
        return tsvoipNumber;
    }

    /**
     * Sets the value of the tsvoipNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSVOIPNumber(String value) {
        this.tsvoipNumber = value;
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
     * Gets the value of the temparoryContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemparoryContactId() {
        return temparoryContactId;
    }

    /**
     * Sets the value of the temparoryContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemparoryContactId(String value) {
        this.temparoryContactId = value;
    }

    /**
     * Gets the value of the tsCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCarrierCode() {
        return tsCarrierCode;
    }

    /**
     * Sets the value of the tsCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCarrierCode(String value) {
        this.tsCarrierCode = value;
    }

    /**
     * Gets the value of the tsc2BDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSC2BDueDate() {
        return tsc2BDueDate;
    }

    /**
     * Sets the value of the tsc2BDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSC2BDueDate(String value) {
        this.tsc2BDueDate = value;
    }

    /**
     * Gets the value of the tsBusyPortFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSBusyPortFlag() {
        return tsBusyPortFlag;
    }

    /**
     * Sets the value of the tsBusyPortFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSBusyPortFlag(String value) {
        this.tsBusyPortFlag = value;
    }

    /**
     * Gets the value of the tsBillingPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSBillingPaymentMethod() {
        return tsBillingPaymentMethod;
    }

    /**
     * Sets the value of the tsBillingPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSBillingPaymentMethod(String value) {
        this.tsBillingPaymentMethod = value;
    }

    /**
     * Gets the value of the tsServiceAccountPointId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSServiceAccountPointId() {
        return tsServiceAccountPointId;
    }

    /**
     * Sets the value of the tsServiceAccountPointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSServiceAccountPointId(String value) {
        this.tsServiceAccountPointId = value;
    }

    /**
     * Gets the value of the tsServiceAccountAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSServiceAccountAddressId() {
        return tsServiceAccountAddressId;
    }

    /**
     * Sets the value of the tsServiceAccountAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSServiceAccountAddressId(String value) {
        this.tsServiceAccountAddressId = value;
    }

    /**
     * Gets the value of the tsMoveOutDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSMoveOutDate() {
        return tsMoveOutDate;
    }

    /**
     * Sets the value of the tsMoveOutDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSMoveOutDate(String value) {
        this.tsMoveOutDate = value;
    }

    /**
     * Gets the value of the tsmduDeliveryContractRevNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSMDUDeliveryContractRevNum() {
        return tsmduDeliveryContractRevNum;
    }

    /**
     * Sets the value of the tsmduDeliveryContractRevNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSMDUDeliveryContractRevNum(String value) {
        this.tsmduDeliveryContractRevNum = value;
    }

    /**
     * Gets the value of the tsProductLongDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSProductLongDescription() {
        return tsProductLongDescription;
    }

    /**
     * Sets the value of the tsProductLongDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSProductLongDescription(String value) {
        this.tsProductLongDescription = value;
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
     * Gets the value of the temporary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporary() {
        return temporary;
    }

    /**
     * Sets the value of the temporary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporary(String value) {
        this.temporary = value;
    }

    /**
     * Gets the value of the volumeUpsellItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeUpsellItemId() {
        return volumeUpsellItemId;
    }

    /**
     * Sets the value of the volumeUpsellItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeUpsellItemId(String value) {
        this.volumeUpsellItemId = value;
    }

    /**
     * Gets the value of the tsPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPaymentMethod() {
        return tsPaymentMethod;
    }

    /**
     * Sets the value of the tsPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPaymentMethod(String value) {
        this.tsPaymentMethod = value;
    }

    /**
     * Gets the value of the tsParcelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSParcelNumber() {
        return tsParcelNumber;
    }

    /**
     * Sets the value of the tsParcelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSParcelNumber(String value) {
        this.tsParcelNumber = value;
    }

    /**
     * Gets the value of the tspstnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPSTNNumber() {
        return tspstnNumber;
    }

    /**
     * Sets the value of the tspstnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPSTNNumber(String value) {
        this.tspstnNumber = value;
    }

    /**
     * Gets the value of the temporaryContactPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporaryContactPhoneNumber() {
        return temporaryContactPhoneNumber;
    }

    /**
     * Sets the value of the temporaryContactPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporaryContactPhoneNumber(String value) {
        this.temporaryContactPhoneNumber = value;
    }

    /**
     * Gets the value of the temporaryContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporaryContactLastName() {
        return temporaryContactLastName;
    }

    /**
     * Sets the value of the temporaryContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporaryContactLastName(String value) {
        this.temporaryContactLastName = value;
    }

    /**
     * Gets the value of the temporaryContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporaryContactFirstName() {
        return temporaryContactFirstName;
    }

    /**
     * Sets the value of the temporaryContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporaryContactFirstName(String value) {
        this.temporaryContactFirstName = value;
    }

    /**
     * Gets the value of the temporaryContactEmailAdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporaryContactEmailAdd() {
        return temporaryContactEmailAdd;
    }

    /**
     * Sets the value of the temporaryContactEmailAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporaryContactEmailAdd(String value) {
        this.temporaryContactEmailAdd = value;
    }

    /**
     * Gets the value of the rootOrderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootOrderItemId() {
        return rootOrderItemId;
    }

    /**
     * Sets the value of the rootOrderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootOrderItemId(String value) {
        this.rootOrderItemId = value;
    }

    /**
     * Gets the value of the rollupItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollupItemPrice() {
        return rollupItemPrice;
    }

    /**
     * Sets the value of the rollupItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollupItemPrice(String value) {
        this.rollupItemPrice = value;
    }

    /**
     * Gets the value of the rollupAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollupAmount() {
        return rollupAmount;
    }

    /**
     * Sets the value of the rollupAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollupAmount(String value) {
        this.rollupAmount = value;
    }

    /**
     * Gets the value of the serviceLengthUoM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLengthUoM() {
        return serviceLengthUoM;
    }

    /**
     * Sets the value of the serviceLengthUoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLengthUoM(String value) {
        this.serviceLengthUoM = value;
    }

    /**
     * Gets the value of the rootProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootProductId() {
        return rootProductId;
    }

    /**
     * Sets the value of the rootProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootProductId(String value) {
        this.rootProductId = value;
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
     * Gets the value of the assetIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetIntegrationId() {
        return assetIntegrationId;
    }

    /**
     * Sets the value of the assetIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetIntegrationId(String value) {
        this.assetIntegrationId = value;
    }

    /**
     * Gets the value of the volumeUpsellMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeUpsellMessage() {
        return volumeUpsellMessage;
    }

    /**
     * Sets the value of the volumeUpsellMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeUpsellMessage(String value) {
        this.volumeUpsellMessage = value;
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
     * Gets the value of the tsColtDeliveryFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSColtDeliveryFromDate() {
        return tsColtDeliveryFromDate;
    }

    /**
     * Sets the value of the tsColtDeliveryFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSColtDeliveryFromDate(String value) {
        this.tsColtDeliveryFromDate = value;
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
     * Gets the value of the tsBillNowFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSBillNowFlag() {
        return tsBillNowFlag;
    }

    /**
     * Sets the value of the tsBillNowFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSBillNowFlag(String value) {
        this.tsBillNowFlag = value;
    }

    /**
     * Gets the value of the tsProdPromInstanceCalc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSProdPromInstanceCalc() {
        return tsProdPromInstanceCalc;
    }

    /**
     * Sets the value of the tsProdPromInstanceCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSProdPromInstanceCalc(String value) {
        this.tsProdPromInstanceCalc = value;
    }

    /**
     * Gets the value of the serviceLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLength() {
        return serviceLength;
    }

    /**
     * Sets the value of the serviceLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLength(String value) {
        this.serviceLength = value;
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
     * Gets the value of the exchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeDate() {
        return exchangeDate;
    }

    /**
     * Sets the value of the exchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeDate(String value) {
        this.exchangeDate = value;
    }

    /**
     * Gets the value of the currentPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPrice() {
        return currentPrice;
    }

    /**
     * Sets the value of the currentPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPrice(String value) {
        this.currentPrice = value;
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
     * Gets the value of the volumeUpsellItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeUpsellItem() {
        return volumeUpsellItem;
    }

    /**
     * Sets the value of the volumeUpsellItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeUpsellItem(String value) {
        this.volumeUpsellItem = value;
    }

    /**
     * Gets the value of the priceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListId() {
        return priceListId;
    }

    /**
     * Sets the value of the priceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListId(String value) {
        this.priceListId = value;
    }

    /**
     * Gets the value of the postPickCD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostPickCD() {
        return postPickCD;
    }

    /**
     * Sets the value of the postPickCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostPickCD(String value) {
        this.postPickCD = value;
    }

    /**
     * Gets the value of the pricingComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingComments() {
        return pricingComments;
    }

    /**
     * Sets the value of the pricingComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingComments(String value) {
        this.pricingComments = value;
    }

    /**
     * Gets the value of the needRefresh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeedRefresh() {
        return needRefresh;
    }

    /**
     * Sets the value of the needRefresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeedRefresh(String value) {
        this.needRefresh = value;
    }

    /**
     * Gets the value of the discountSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountSource() {
        return discountSource;
    }

    /**
     * Sets the value of the discountSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountSource(String value) {
        this.discountSource = value;
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
     * Gets the value of the rootAssetIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootAssetIntegrationId() {
        return rootAssetIntegrationId;
    }

    /**
     * Sets the value of the rootAssetIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootAssetIntegrationId(String value) {
        this.rootAssetIntegrationId = value;
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
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPercent(String value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
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
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPrice(String value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdated(String value) {
        this.updated = value;
    }

    /**
     * Gets the value of the volumeDiscountItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeDiscountItem() {
        return volumeDiscountItem;
    }

    /**
     * Sets the value of the volumeDiscountItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeDiscountItem(String value) {
        this.volumeDiscountItem = value;
    }

    /**
     * Gets the value of the configurationModelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationModelId() {
        return configurationModelId;
    }

    /**
     * Sets the value of the configurationModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationModelId(String value) {
        this.configurationModelId = value;
    }

    /**
     * Gets the value of the hasGenerics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasGenerics() {
        return hasGenerics;
    }

    /**
     * Sets the value of the hasGenerics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasGenerics(String value) {
        this.hasGenerics = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the modId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModId() {
        return modId;
    }

    /**
     * Sets the value of the modId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModId(String value) {
        this.modId = value;
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
     * Gets the value of the origListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigListPrice() {
        return origListPrice;
    }

    /**
     * Sets the value of the origListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigListPrice(String value) {
        this.origListPrice = value;
    }

    /**
     * Gets the value of the parentOrderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrderItemId() {
        return parentOrderItemId;
    }

    /**
     * Sets the value of the parentOrderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrderItemId(String value) {
        this.parentOrderItemId = value;
    }

    /**
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflictId(String value) {
        this.conflictId = value;
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
     * Gets the value of the prodPromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromName() {
        return prodPromName;
    }

    /**
     * Sets the value of the prodPromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromName(String value) {
        this.prodPromName = value;
    }

    /**
     * Gets the value of the prePickCD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrePickCD() {
        return prePickCD;
    }

    /**
     * Sets the value of the prePickCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrePickCD(String value) {
        this.prePickCD = value;
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
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQty(String value) {
        this.qty = value;
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
     * Gets the value of the listOfOrderItemXA property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderItemXA }
     *     
     */
    public ListOfOrderItemXA getListOfOrderItemXA() {
        return listOfOrderItemXA;
    }

    /**
     * Sets the value of the listOfOrderItemXA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderItemXA }
     *     
     */
    public void setListOfOrderItemXA(ListOfOrderItemXA value) {
        this.listOfOrderItemXA = value;
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
     * Gets the value of the billingProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingProfileName() {
        return billingProfileName;
    }

    /**
     * Sets the value of the billingProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingProfileName(String value) {
        this.billingProfileName = value;
    }

    /**
     * Gets the value of the tsCommitmentReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCommitmentReason() {
        return tsCommitmentReason;
    }

    /**
     * Sets the value of the tsCommitmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCommitmentReason(String value) {
        this.tsCommitmentReason = value;
    }

    /**
     * Gets the value of the tsOldPckgAssetIntegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSOldPckgAssetIntegId() {
        return tsOldPckgAssetIntegId;
    }

    /**
     * Sets the value of the tsOldPckgAssetIntegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSOldPckgAssetIntegId(String value) {
        this.tsOldPckgAssetIntegId = value;
    }

    /**
     * Gets the value of the tsPackageCommitmentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPackageCommitmentPeriod() {
        return tsPackageCommitmentPeriod;
    }

    /**
     * Sets the value of the tsPackageCommitmentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPackageCommitmentPeriod(String value) {
        this.tsPackageCommitmentPeriod = value;
    }

    /**
     * Gets the value of the tsPckgCommitmentUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPckgCommitmentUOM() {
        return tsPckgCommitmentUOM;
    }

    /**
     * Sets the value of the tsPckgCommitmentUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPckgCommitmentUOM(String value) {
        this.tsPckgCommitmentUOM = value;
    }

    /**
     * Gets the value of the tsPckgDeleteReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPckgDeleteReason() {
        return tsPckgDeleteReason;
    }

    /**
     * Sets the value of the tsPckgDeleteReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPckgDeleteReason(String value) {
        this.tsPckgDeleteReason = value;
    }

    /**
     * Gets the value of the tsNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSNote() {
        return tsNote;
    }

    /**
     * Sets the value of the tsNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSNote(String value) {
        this.tsNote = value;
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
     * Gets the value of the tsvasRegisteredDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSVASRegisteredDate() {
        return tsvasRegisteredDate;
    }

    /**
     * Sets the value of the tsvasRegisteredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSVASRegisteredDate(String value) {
        this.tsvasRegisteredDate = value;
    }

    /**
     * Gets the value of the productShipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductShipFlag() {
        return productShipFlag;
    }

    /**
     * Sets the value of the productShipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductShipFlag(String value) {
        this.productShipFlag = value;
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
     * Gets the value of the tsPrevAccessTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPrevAccessTypeId() {
        return tsPrevAccessTypeId;
    }

    /**
     * Sets the value of the tsPrevAccessTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPrevAccessTypeId(String value) {
        this.tsPrevAccessTypeId = value;
    }

    /**
     * Gets the value of the tsAccessTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSAccessTypeId() {
        return tsAccessTypeId;
    }

    /**
     * Sets the value of the tsAccessTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSAccessTypeId(String value) {
        this.tsAccessTypeId = value;
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
     * Gets the value of the orderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItem }
     * 
     * 
     */
    public List<OrderItem> getOrderItem() {
        if (orderItem == null) {
            orderItem = new ArrayList<OrderItem>();
        }
        return this.orderItem;
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
