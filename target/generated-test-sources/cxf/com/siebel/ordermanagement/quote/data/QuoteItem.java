
package com.siebel.ordermanagement.quote.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VolumeUpsellMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VolumeDiscountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsageAssetProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSVoIPOldDeviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSVoIPDeviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSSubscriptionProdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSSubscriptionCommitmentPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPromAttribVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProductRelatedId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProductLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPrevContracttId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPortInTarTSCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSNHFReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSMOFBNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSMoveOutDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSMDUDeliveryContractRevNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSMDUDeliveryContractNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSMDSRelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSMDSPrimaryMSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSMOAddrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSIMEINumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSHasSecondary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSHardwareCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSDeliveryContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSDelayedDueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSDelayedActivation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToContactWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToContactHomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessShipToZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesServiceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RootQuoteItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RootAssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductXAClassId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductStructureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductShipFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdPromSourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdPromId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PricingCommitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PricingAdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PortItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonalShipToZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonalShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonalShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonalShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonalShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverrideRepriceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NRCCxTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MinPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MRCCxTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemPriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsPromEligible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuoteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HeaderDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FreightAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedQuantityRequested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExcludePricingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EligibilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EligibilityReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CoveredProductNetPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CoveredProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CoveredAssetProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactHomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CfgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CfgStateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CoveredQuoteItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarrierPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FreightTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HasGenerics" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrePickCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RootBundleFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsPrePickCartItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NeedRefreshBasePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VolumeUpsellItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VolumeDiscountItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductLineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RootProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostPickCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdPromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentQuoteItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConfigurationModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InclusiveEligibilityFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TsServiceIntegrationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessShipToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonalShipToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrigListPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SmartPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RollupItemPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PricingComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonalShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RollupAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListOfQuoteItemXA" type="{http://siebel.com/OrderManagement/Quote/Data}ListOfQuoteItemXA" minOccurs="0"/&gt;
 *         &lt;element name="BillingAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLengthUoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServicePriceMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServicePricePercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VolumeDiscountItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VolumeUpsellItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClassId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ForcastableFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdPromInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdPromRuleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitofMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProdItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingAccountAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingAccountAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingAccountAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingAccountCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingAccountContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingAccountCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingAccountState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingAccountZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingContactWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DonatingServiceProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndingPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LegacyAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberPortabilityAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberToPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedPortingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServicePostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartingPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPeriodUoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountMRCExclVAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountMRCInclVAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NonDiscountMRCExclVAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NonDiscountMRCInclVAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NRCInclVAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSCommitmentReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSOldPckgAssetIntegId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPackageCommitmentPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPckgCommitmentUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPckgDeleteReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSVASRegisteredDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSVASRegistrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FulfillmentItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSBusyPortFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSC2BDueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSColtDeliveryFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSAccessTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPrevAccessTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSCODFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Temporary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemparoryContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryContactEmailAdd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryContactPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSParcelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProductCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSProductSub-Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSVOIPNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSVOIPNumberChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConnectivityReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSOldPSTNNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSPSTNNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSTVAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TSItemToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuoteItem" type="{http://siebel.com/OrderManagement/Quote/Data}QuoteItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="searchspec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteItem", propOrder = {
    "volumeUpsellMessage",
    "volumeDiscountId",
    "usageAssetProductId",
    "taxAmt",
    "tsVoIPOldDeviceType",
    "tsVoIPDeviceType",
    "taxCode",
    "tsSubscriptionProdId",
    "tsSubscriptionCommitmentPeriod",
    "tsPromAttribVal",
    "tsProductType",
    "tsProductRelatedId",
    "tsProductLine",
    "tsPrevContracttId",
    "tsPortInTarTSCID",
    "tsnhfReservationStatus",
    "tsmofbNum",
    "tsMoveOutDate",
    "tsmduDeliveryContractRevNum",
    "tsmduDeliveryContractNum",
    "tsmdsRelId",
    "tsmdsPrimaryMSISDN",
    "tsmoAddrId",
    "tsimeiNumber",
    "tsHasSecondary",
    "tsHardwareCode",
    "tsDeliveryContractId",
    "tsDelayedDueDate",
    "tsDelayedActivation",
    "shipToState",
    "shipToPostalCode",
    "shipToCountry",
    "shipToContactWorkPhone",
    "shipToContactId",
    "shipToContactHomePhone",
    "shipToContactFirstName",
    "shipToContactEmail",
    "shipToCity",
    "businessShipToAddressId",
    "businessShipToZip",
    "businessShipToState",
    "businessShipToCountry",
    "businessShipToCity",
    "businessShipToAddress2",
    "serviceAccountId",
    "salesServiceFlag",
    "rootQuoteItemId",
    "rootAssetIntegrationId",
    "requestedDeliveryDate",
    "productXAClassId",
    "productTypeCode",
    "productStructureType",
    "productShipFlag",
    "prodPromSourceId",
    "prodPromId",
    "pricingCommitType",
    "pricingAdjustmentAmount",
    "priceType",
    "portItemId",
    "personalShipToZip",
    "personalShipToState",
    "personalShipToCountry",
    "personalShipToCity",
    "personalShipToAddress2",
    "overrideRepriceFlag",
    "netPrice",
    "nrcCxTotal",
    "minPrice",
    "maxPrice",
    "mrcCxTotal",
    "lineNumber",
    "itemPriceListId",
    "isPromEligible",
    "integrationId",
    "quoteId",
    "headerDiscountAmount",
    "freightAmount",
    "extendedQuantityRequested",
    "excludePricingFlag",
    "exchangeDate",
    "eligibilityStatus",
    "eligibilityReason",
    "discount",
    "description",
    "currentPrice",
    "currencyCode",
    "coveredProductNetPrice",
    "coveredProductId",
    "coveredAssetProductId",
    "cost",
    "contactWorkPhone",
    "contactId",
    "contactHomePhone",
    "contactFirstName",
    "contactEmail",
    "cfgType",
    "cfgStateCode",
    "assetIntegrationId",
    "actionCode",
    "accountId",
    "carrierCode",
    "coveredQuoteItemId",
    "carrierPriority",
    "serviceAccount",
    "contactLastName",
    "freightTerms",
    "shipToContactLastName",
    "shipToAccount",
    "hasGenerics",
    "prePickCD",
    "created",
    "rootBundleFlag",
    "isPrePickCartItem",
    "updated",
    "needRefreshBasePrice",
    "sequenceNumber",
    "id",
    "volumeUpsellItem",
    "volumeDiscountItem",
    "productLineId",
    "rootProductId",
    "priceListId",
    "postPickCD",
    "prodPromName",
    "modId",
    "parentQuoteItemId",
    "configurationModelId",
    "conflictId",
    "inclusiveEligibilityFlag",
    "tsServiceIntegrationID",
    "shipToAccountId",
    "listPrice",
    "businessShipToAddress",
    "personalShipToAddress",
    "origListPrice",
    "discountPercent",
    "smartPartNumber",
    "discountAmount",
    "unitPrice",
    "rollupItemPrice",
    "pricingComments",
    "quantity",
    "personalShipToAddressId",
    "rollupAmount",
    "discountSource",
    "name",
    "productId",
    "listOfQuoteItemXA",
    "billingAccountId",
    "billingType",
    "serviceLength",
    "serviceLengthUoM",
    "servicePriceMethod",
    "servicePricePercent",
    "volumeDiscountItemId",
    "volumeUpsellItemId",
    "classId",
    "effectiveFrom",
    "effectiveTo",
    "forcastableFlag",
    "prodPromInstanceId",
    "prodPromRuleId",
    "unitofMeasure",
    "prodItemId",
    "billingAccount",
    "billingAccountAddress",
    "billingAccountNumber",
    "billingAccountLocation",
    "billingProfileId",
    "billingProfileName",
    "billingAccountAddress2",
    "billingAccountAddressId",
    "billingAccountCity",
    "billingAccountContactId",
    "billingAccountCountry",
    "billingAccountState",
    "billingAccountZip",
    "billingContactEmail",
    "billingContactFirstName",
    "billingContactLastName",
    "billingContactWorkPhone",
    "donatingServiceProvider",
    "endingPhoneNumber",
    "legacyAccountNumber",
    "numberPortabilityAgencyName",
    "numberToPort",
    "pin",
    "requestedPortingDate",
    "servicePostalCode",
    "startingPhoneNumber",
    "serviceId",
    "discountPeriod",
    "discountPeriodUoM",
    "discountMRCExclVAT",
    "discountMRCInclVAT",
    "nonDiscountMRCExclVAT",
    "nonDiscountMRCInclVAT",
    "nrcInclVAT",
    "tsCommitmentReason",
    "tsOldPckgAssetIntegId",
    "tsPackageCommitmentPeriod",
    "tsPckgCommitmentUOM",
    "tsPckgDeleteReason",
    "tsNote",
    "tsvasRegisteredDate",
    "tsvasRegistrationStatus",
    "fulfillmentItemCode",
    "tsBusyPortFlag",
    "tsc2BDueDate",
    "tsColtDeliveryFromDate",
    "tsAccessTypeId",
    "tsPrevAccessTypeId",
    "tscodFlag",
    "temporary",
    "temparoryContactId",
    "temporaryContactEmailAdd",
    "temporaryContactFirstName",
    "temporaryContactLastName",
    "temporaryContactPhoneNumber",
    "tsParcelNumber",
    "tsPaymentMethod",
    "tsProductCategory",
    "tsProductSubCategory",
    "tsvoipNumber",
    "tsvoipNumberChange",
    "connectivityReferenceNumber",
    "tsOldPSTNNumber",
    "tspstnNumber",
    "tstvAccountId",
    "tsItemToken",
    "quoteItem"
})
public class QuoteItem {

    @XmlElement(name = "VolumeUpsellMessage")
    protected String volumeUpsellMessage;
    @XmlElement(name = "VolumeDiscountId")
    protected String volumeDiscountId;
    @XmlElement(name = "UsageAssetProductId")
    protected String usageAssetProductId;
    @XmlElement(name = "TaxAmt")
    protected String taxAmt;
    @XmlElement(name = "TSVoIPOldDeviceType")
    protected String tsVoIPOldDeviceType;
    @XmlElement(name = "TSVoIPDeviceType")
    protected String tsVoIPDeviceType;
    @XmlElement(name = "TaxCode")
    protected String taxCode;
    @XmlElement(name = "TSSubscriptionProdId")
    protected String tsSubscriptionProdId;
    @XmlElement(name = "TSSubscriptionCommitmentPeriod")
    protected String tsSubscriptionCommitmentPeriod;
    @XmlElement(name = "TSPromAttribVal")
    protected String tsPromAttribVal;
    @XmlElement(name = "TSProductType")
    protected String tsProductType;
    @XmlElement(name = "TSProductRelatedId")
    protected String tsProductRelatedId;
    @XmlElement(name = "TSProductLine")
    protected String tsProductLine;
    @XmlElement(name = "TSPrevContracttId")
    protected String tsPrevContracttId;
    @XmlElement(name = "TSPortInTarTSCID")
    protected String tsPortInTarTSCID;
    @XmlElement(name = "TSNHFReservationStatus")
    protected String tsnhfReservationStatus;
    @XmlElement(name = "TSMOFBNum")
    protected String tsmofbNum;
    @XmlElement(name = "TSMoveOutDate")
    protected String tsMoveOutDate;
    @XmlElement(name = "TSMDUDeliveryContractRevNum")
    protected String tsmduDeliveryContractRevNum;
    @XmlElement(name = "TSMDUDeliveryContractNum")
    protected String tsmduDeliveryContractNum;
    @XmlElement(name = "TSMDSRelId")
    protected String tsmdsRelId;
    @XmlElement(name = "TSMDSPrimaryMSISDN")
    protected String tsmdsPrimaryMSISDN;
    @XmlElement(name = "TSMOAddrId")
    protected String tsmoAddrId;
    @XmlElement(name = "TSIMEINumber")
    protected String tsimeiNumber;
    @XmlElement(name = "TSHasSecondary")
    protected String tsHasSecondary;
    @XmlElement(name = "TSHardwareCode")
    protected String tsHardwareCode;
    @XmlElement(name = "TSDeliveryContractId")
    protected String tsDeliveryContractId;
    @XmlElement(name = "TSDelayedDueDate")
    protected String tsDelayedDueDate;
    @XmlElement(name = "TSDelayedActivation")
    protected String tsDelayedActivation;
    @XmlElement(name = "ShipToState")
    protected String shipToState;
    @XmlElement(name = "ShipToPostalCode")
    protected String shipToPostalCode;
    @XmlElement(name = "ShipToCountry")
    protected String shipToCountry;
    @XmlElement(name = "ShipToContactWorkPhone")
    protected String shipToContactWorkPhone;
    @XmlElement(name = "ShipToContactId")
    protected String shipToContactId;
    @XmlElement(name = "ShipToContactHomePhone")
    protected String shipToContactHomePhone;
    @XmlElement(name = "ShipToContactFirstName")
    protected String shipToContactFirstName;
    @XmlElement(name = "ShipToContactEmail")
    protected String shipToContactEmail;
    @XmlElement(name = "ShipToCity")
    protected String shipToCity;
    @XmlElement(name = "BusinessShipToAddressId")
    protected String businessShipToAddressId;
    @XmlElement(name = "BusinessShipToZip")
    protected String businessShipToZip;
    @XmlElement(name = "BusinessShipToState")
    protected String businessShipToState;
    @XmlElement(name = "BusinessShipToCountry")
    protected String businessShipToCountry;
    @XmlElement(name = "BusinessShipToCity")
    protected String businessShipToCity;
    @XmlElement(name = "BusinessShipToAddress2")
    protected String businessShipToAddress2;
    @XmlElement(name = "ServiceAccountId")
    protected String serviceAccountId;
    @XmlElement(name = "SalesServiceFlag")
    protected String salesServiceFlag;
    @XmlElement(name = "RootQuoteItemId")
    protected String rootQuoteItemId;
    @XmlElement(name = "RootAssetIntegrationId")
    protected String rootAssetIntegrationId;
    @XmlElement(name = "RequestedDeliveryDate")
    protected String requestedDeliveryDate;
    @XmlElement(name = "ProductXAClassId")
    protected String productXAClassId;
    @XmlElement(name = "ProductTypeCode")
    protected String productTypeCode;
    @XmlElement(name = "ProductStructureType")
    protected String productStructureType;
    @XmlElement(name = "ProductShipFlag")
    protected String productShipFlag;
    @XmlElement(name = "ProdPromSourceId")
    protected String prodPromSourceId;
    @XmlElement(name = "ProdPromId")
    protected String prodPromId;
    @XmlElement(name = "PricingCommitType")
    protected String pricingCommitType;
    @XmlElement(name = "PricingAdjustmentAmount")
    protected String pricingAdjustmentAmount;
    @XmlElement(name = "PriceType")
    protected String priceType;
    @XmlElement(name = "PortItemId")
    protected String portItemId;
    @XmlElement(name = "PersonalShipToZip")
    protected String personalShipToZip;
    @XmlElement(name = "PersonalShipToState")
    protected String personalShipToState;
    @XmlElement(name = "PersonalShipToCountry")
    protected String personalShipToCountry;
    @XmlElement(name = "PersonalShipToCity")
    protected String personalShipToCity;
    @XmlElement(name = "PersonalShipToAddress2")
    protected String personalShipToAddress2;
    @XmlElement(name = "OverrideRepriceFlag")
    protected String overrideRepriceFlag;
    @XmlElement(name = "NetPrice")
    protected String netPrice;
    @XmlElement(name = "NRCCxTotal")
    protected String nrcCxTotal;
    @XmlElement(name = "MinPrice")
    protected String minPrice;
    @XmlElement(name = "MaxPrice")
    protected String maxPrice;
    @XmlElement(name = "MRCCxTotal")
    protected String mrcCxTotal;
    @XmlElement(name = "LineNumber")
    protected String lineNumber;
    @XmlElement(name = "ItemPriceListId")
    protected String itemPriceListId;
    @XmlElement(name = "IsPromEligible")
    protected String isPromEligible;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "QuoteId")
    protected String quoteId;
    @XmlElement(name = "HeaderDiscountAmount")
    protected String headerDiscountAmount;
    @XmlElement(name = "FreightAmount")
    protected String freightAmount;
    @XmlElement(name = "ExtendedQuantityRequested")
    protected String extendedQuantityRequested;
    @XmlElement(name = "ExcludePricingFlag")
    protected String excludePricingFlag;
    @XmlElement(name = "ExchangeDate")
    protected String exchangeDate;
    @XmlElement(name = "EligibilityStatus")
    protected String eligibilityStatus;
    @XmlElement(name = "EligibilityReason")
    protected String eligibilityReason;
    @XmlElement(name = "Discount")
    protected String discount;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "CurrentPrice")
    protected String currentPrice;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "CoveredProductNetPrice")
    protected String coveredProductNetPrice;
    @XmlElement(name = "CoveredProductId")
    protected String coveredProductId;
    @XmlElement(name = "CoveredAssetProductId")
    protected String coveredAssetProductId;
    @XmlElement(name = "Cost")
    protected String cost;
    @XmlElement(name = "ContactWorkPhone")
    protected String contactWorkPhone;
    @XmlElement(name = "ContactId")
    protected String contactId;
    @XmlElement(name = "ContactHomePhone")
    protected String contactHomePhone;
    @XmlElement(name = "ContactFirstName")
    protected String contactFirstName;
    @XmlElement(name = "ContactEmail")
    protected String contactEmail;
    @XmlElement(name = "CfgType")
    protected String cfgType;
    @XmlElement(name = "CfgStateCode")
    protected String cfgStateCode;
    @XmlElement(name = "AssetIntegrationId")
    protected String assetIntegrationId;
    @XmlElement(name = "ActionCode")
    protected String actionCode;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "CarrierCode")
    protected String carrierCode;
    @XmlElement(name = "CoveredQuoteItemId")
    protected String coveredQuoteItemId;
    @XmlElement(name = "CarrierPriority")
    protected String carrierPriority;
    @XmlElement(name = "ServiceAccount")
    protected String serviceAccount;
    @XmlElement(name = "ContactLastName")
    protected String contactLastName;
    @XmlElement(name = "FreightTerms")
    protected String freightTerms;
    @XmlElement(name = "ShipToContactLastName")
    protected String shipToContactLastName;
    @XmlElement(name = "ShipToAccount")
    protected String shipToAccount;
    @XmlElement(name = "HasGenerics")
    protected String hasGenerics;
    @XmlElement(name = "PrePickCD")
    protected String prePickCD;
    @XmlElement(name = "Created")
    protected String created;
    @XmlElement(name = "RootBundleFlag")
    protected String rootBundleFlag;
    @XmlElement(name = "IsPrePickCartItem")
    protected String isPrePickCartItem;
    @XmlElement(name = "Updated")
    protected String updated;
    @XmlElement(name = "NeedRefreshBasePrice")
    protected String needRefreshBasePrice;
    @XmlElement(name = "SequenceNumber")
    protected String sequenceNumber;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "VolumeUpsellItem")
    protected String volumeUpsellItem;
    @XmlElement(name = "VolumeDiscountItem")
    protected String volumeDiscountItem;
    @XmlElement(name = "ProductLineId")
    protected String productLineId;
    @XmlElement(name = "RootProductId")
    protected String rootProductId;
    @XmlElement(name = "PriceListId")
    protected String priceListId;
    @XmlElement(name = "PostPickCD")
    protected String postPickCD;
    @XmlElement(name = "ProdPromName")
    protected String prodPromName;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "ParentQuoteItemId")
    protected String parentQuoteItemId;
    @XmlElement(name = "ConfigurationModelId")
    protected String configurationModelId;
    @XmlElement(name = "ConflictId")
    protected String conflictId;
    @XmlElement(name = "InclusiveEligibilityFlag")
    protected String inclusiveEligibilityFlag;
    @XmlElement(name = "TsServiceIntegrationID")
    protected String tsServiceIntegrationID;
    @XmlElement(name = "ShipToAccountId")
    protected String shipToAccountId;
    @XmlElement(name = "ListPrice")
    protected String listPrice;
    @XmlElement(name = "BusinessShipToAddress")
    protected String businessShipToAddress;
    @XmlElement(name = "PersonalShipToAddress")
    protected String personalShipToAddress;
    @XmlElement(name = "OrigListPrice")
    protected String origListPrice;
    @XmlElement(name = "DiscountPercent")
    protected String discountPercent;
    @XmlElement(name = "SmartPartNumber")
    protected String smartPartNumber;
    @XmlElement(name = "DiscountAmount")
    protected String discountAmount;
    @XmlElement(name = "UnitPrice")
    protected String unitPrice;
    @XmlElement(name = "RollupItemPrice")
    protected String rollupItemPrice;
    @XmlElement(name = "PricingComments")
    protected String pricingComments;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "PersonalShipToAddressId")
    protected String personalShipToAddressId;
    @XmlElement(name = "RollupAmount")
    protected String rollupAmount;
    @XmlElement(name = "DiscountSource")
    protected String discountSource;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "ListOfQuoteItemXA")
    protected ListOfQuoteItemXA listOfQuoteItemXA;
    @XmlElement(name = "BillingAccountId")
    protected String billingAccountId;
    @XmlElement(name = "BillingType")
    protected String billingType;
    @XmlElement(name = "ServiceLength")
    protected String serviceLength;
    @XmlElement(name = "ServiceLengthUoM")
    protected String serviceLengthUoM;
    @XmlElement(name = "ServicePriceMethod")
    protected String servicePriceMethod;
    @XmlElement(name = "ServicePricePercent")
    protected String servicePricePercent;
    @XmlElement(name = "VolumeDiscountItemId")
    protected String volumeDiscountItemId;
    @XmlElement(name = "VolumeUpsellItemId")
    protected String volumeUpsellItemId;
    @XmlElement(name = "ClassId")
    protected String classId;
    @XmlElement(name = "EffectiveFrom")
    protected String effectiveFrom;
    @XmlElement(name = "EffectiveTo")
    protected String effectiveTo;
    @XmlElement(name = "ForcastableFlag")
    protected String forcastableFlag;
    @XmlElement(name = "ProdPromInstanceId")
    protected String prodPromInstanceId;
    @XmlElement(name = "ProdPromRuleId")
    protected String prodPromRuleId;
    @XmlElement(name = "UnitofMeasure")
    protected String unitofMeasure;
    @XmlElement(name = "ProdItemId")
    protected String prodItemId;
    @XmlElement(name = "BillingAccount")
    protected String billingAccount;
    @XmlElement(name = "BillingAccountAddress")
    protected String billingAccountAddress;
    @XmlElement(name = "BillingAccountNumber")
    protected String billingAccountNumber;
    @XmlElement(name = "BillingAccountLocation")
    protected String billingAccountLocation;
    @XmlElement(name = "BillingProfileId")
    protected String billingProfileId;
    @XmlElement(name = "BillingProfileName")
    protected String billingProfileName;
    @XmlElement(name = "BillingAccountAddress2")
    protected String billingAccountAddress2;
    @XmlElement(name = "BillingAccountAddressId")
    protected String billingAccountAddressId;
    @XmlElement(name = "BillingAccountCity")
    protected String billingAccountCity;
    @XmlElement(name = "BillingAccountContactId")
    protected String billingAccountContactId;
    @XmlElement(name = "BillingAccountCountry")
    protected String billingAccountCountry;
    @XmlElement(name = "BillingAccountState")
    protected String billingAccountState;
    @XmlElement(name = "BillingAccountZip")
    protected String billingAccountZip;
    @XmlElement(name = "BillingContactEmail")
    protected String billingContactEmail;
    @XmlElement(name = "BillingContactFirstName")
    protected String billingContactFirstName;
    @XmlElement(name = "BillingContactLastName")
    protected String billingContactLastName;
    @XmlElement(name = "BillingContactWorkPhone")
    protected String billingContactWorkPhone;
    @XmlElement(name = "DonatingServiceProvider")
    protected String donatingServiceProvider;
    @XmlElement(name = "EndingPhoneNumber")
    protected String endingPhoneNumber;
    @XmlElement(name = "LegacyAccountNumber")
    protected String legacyAccountNumber;
    @XmlElement(name = "NumberPortabilityAgencyName")
    protected String numberPortabilityAgencyName;
    @XmlElement(name = "NumberToPort")
    protected String numberToPort;
    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "RequestedPortingDate")
    protected String requestedPortingDate;
    @XmlElement(name = "ServicePostalCode")
    protected String servicePostalCode;
    @XmlElement(name = "StartingPhoneNumber")
    protected String startingPhoneNumber;
    @XmlElement(name = "ServiceId")
    protected String serviceId;
    @XmlElement(name = "DiscountPeriod")
    protected String discountPeriod;
    @XmlElement(name = "DiscountPeriodUoM")
    protected String discountPeriodUoM;
    @XmlElement(name = "DiscountMRCExclVAT")
    protected String discountMRCExclVAT;
    @XmlElement(name = "DiscountMRCInclVAT")
    protected String discountMRCInclVAT;
    @XmlElement(name = "NonDiscountMRCExclVAT")
    protected String nonDiscountMRCExclVAT;
    @XmlElement(name = "NonDiscountMRCInclVAT")
    protected String nonDiscountMRCInclVAT;
    @XmlElement(name = "NRCInclVAT")
    protected String nrcInclVAT;
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
    @XmlElement(name = "TSVASRegisteredDate")
    protected String tsvasRegisteredDate;
    @XmlElement(name = "TSVASRegistrationStatus")
    protected String tsvasRegistrationStatus;
    @XmlElement(name = "FulfillmentItemCode")
    protected String fulfillmentItemCode;
    @XmlElement(name = "TSBusyPortFlag")
    protected String tsBusyPortFlag;
    @XmlElement(name = "TSC2BDueDate")
    protected String tsc2BDueDate;
    @XmlElement(name = "TSColtDeliveryFromDate")
    protected String tsColtDeliveryFromDate;
    @XmlElement(name = "TSAccessTypeId")
    protected String tsAccessTypeId;
    @XmlElement(name = "TSPrevAccessTypeId")
    protected String tsPrevAccessTypeId;
    @XmlElement(name = "TSCODFlag")
    protected String tscodFlag;
    @XmlElement(name = "Temporary")
    protected String temporary;
    @XmlElement(name = "TemparoryContactId")
    protected String temparoryContactId;
    @XmlElement(name = "TemporaryContactEmailAdd")
    protected String temporaryContactEmailAdd;
    @XmlElement(name = "TemporaryContactFirstName")
    protected String temporaryContactFirstName;
    @XmlElement(name = "TemporaryContactLastName")
    protected String temporaryContactLastName;
    @XmlElement(name = "TemporaryContactPhoneNumber")
    protected String temporaryContactPhoneNumber;
    @XmlElement(name = "TSParcelNumber")
    protected String tsParcelNumber;
    @XmlElement(name = "TSPaymentMethod")
    protected String tsPaymentMethod;
    @XmlElement(name = "TSProductCategory")
    protected String tsProductCategory;
    @XmlElement(name = "TSProductSub-Category")
    protected String tsProductSubCategory;
    @XmlElement(name = "TSVOIPNumber")
    protected String tsvoipNumber;
    @XmlElement(name = "TSVOIPNumberChange")
    protected String tsvoipNumberChange;
    @XmlElement(name = "ConnectivityReferenceNumber")
    protected String connectivityReferenceNumber;
    @XmlElement(name = "TSOldPSTNNumber")
    protected String tsOldPSTNNumber;
    @XmlElement(name = "TSPSTNNumber")
    protected String tspstnNumber;
    @XmlElement(name = "TSTVAccountId")
    protected String tstvAccountId;
    @XmlElement(name = "TSItemToken")
    protected String tsItemToken;
    @XmlElement(name = "QuoteItem")
    protected List<QuoteItem> quoteItem;
    @XmlAttribute(name = "searchspec")
    protected String searchspec;
    @XmlAttribute(name = "operation")
    protected String operation;

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
     * Gets the value of the usageAssetProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageAssetProductId() {
        return usageAssetProductId;
    }

    /**
     * Sets the value of the usageAssetProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageAssetProductId(String value) {
        this.usageAssetProductId = value;
    }

    /**
     * Gets the value of the taxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmt() {
        return taxAmt;
    }

    /**
     * Sets the value of the taxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmt(String value) {
        this.taxAmt = value;
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
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the tsSubscriptionProdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSubscriptionProdId() {
        return tsSubscriptionProdId;
    }

    /**
     * Sets the value of the tsSubscriptionProdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSubscriptionProdId(String value) {
        this.tsSubscriptionProdId = value;
    }

    /**
     * Gets the value of the tsSubscriptionCommitmentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSubscriptionCommitmentPeriod() {
        return tsSubscriptionCommitmentPeriod;
    }

    /**
     * Sets the value of the tsSubscriptionCommitmentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSubscriptionCommitmentPeriod(String value) {
        this.tsSubscriptionCommitmentPeriod = value;
    }

    /**
     * Gets the value of the tsPromAttribVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPromAttribVal() {
        return tsPromAttribVal;
    }

    /**
     * Sets the value of the tsPromAttribVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPromAttribVal(String value) {
        this.tsPromAttribVal = value;
    }

    /**
     * Gets the value of the tsProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSProductType() {
        return tsProductType;
    }

    /**
     * Sets the value of the tsProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSProductType(String value) {
        this.tsProductType = value;
    }

    /**
     * Gets the value of the tsProductRelatedId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSProductRelatedId() {
        return tsProductRelatedId;
    }

    /**
     * Sets the value of the tsProductRelatedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSProductRelatedId(String value) {
        this.tsProductRelatedId = value;
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
     * Gets the value of the tsPrevContracttId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPrevContracttId() {
        return tsPrevContracttId;
    }

    /**
     * Sets the value of the tsPrevContracttId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPrevContracttId(String value) {
        this.tsPrevContracttId = value;
    }

    /**
     * Gets the value of the tsPortInTarTSCID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPortInTarTSCID() {
        return tsPortInTarTSCID;
    }

    /**
     * Sets the value of the tsPortInTarTSCID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPortInTarTSCID(String value) {
        this.tsPortInTarTSCID = value;
    }

    /**
     * Gets the value of the tsnhfReservationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSNHFReservationStatus() {
        return tsnhfReservationStatus;
    }

    /**
     * Sets the value of the tsnhfReservationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSNHFReservationStatus(String value) {
        this.tsnhfReservationStatus = value;
    }

    /**
     * Gets the value of the tsmofbNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSMOFBNum() {
        return tsmofbNum;
    }

    /**
     * Sets the value of the tsmofbNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSMOFBNum(String value) {
        this.tsmofbNum = value;
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
     * Gets the value of the tsmdsRelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSMDSRelId() {
        return tsmdsRelId;
    }

    /**
     * Sets the value of the tsmdsRelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSMDSRelId(String value) {
        this.tsmdsRelId = value;
    }

    /**
     * Gets the value of the tsmdsPrimaryMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSMDSPrimaryMSISDN() {
        return tsmdsPrimaryMSISDN;
    }

    /**
     * Sets the value of the tsmdsPrimaryMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSMDSPrimaryMSISDN(String value) {
        this.tsmdsPrimaryMSISDN = value;
    }

    /**
     * Gets the value of the tsmoAddrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSMOAddrId() {
        return tsmoAddrId;
    }

    /**
     * Sets the value of the tsmoAddrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSMOAddrId(String value) {
        this.tsmoAddrId = value;
    }

    /**
     * Gets the value of the tsimeiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSIMEINumber() {
        return tsimeiNumber;
    }

    /**
     * Sets the value of the tsimeiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSIMEINumber(String value) {
        this.tsimeiNumber = value;
    }

    /**
     * Gets the value of the tsHasSecondary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSHasSecondary() {
        return tsHasSecondary;
    }

    /**
     * Sets the value of the tsHasSecondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSHasSecondary(String value) {
        this.tsHasSecondary = value;
    }

    /**
     * Gets the value of the tsHardwareCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSHardwareCode() {
        return tsHardwareCode;
    }

    /**
     * Sets the value of the tsHardwareCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSHardwareCode(String value) {
        this.tsHardwareCode = value;
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
     * Gets the value of the tsDelayedDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSDelayedDueDate() {
        return tsDelayedDueDate;
    }

    /**
     * Sets the value of the tsDelayedDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSDelayedDueDate(String value) {
        this.tsDelayedDueDate = value;
    }

    /**
     * Gets the value of the tsDelayedActivation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSDelayedActivation() {
        return tsDelayedActivation;
    }

    /**
     * Sets the value of the tsDelayedActivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSDelayedActivation(String value) {
        this.tsDelayedActivation = value;
    }

    /**
     * Gets the value of the shipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToState() {
        return shipToState;
    }

    /**
     * Sets the value of the shipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToState(String value) {
        this.shipToState = value;
    }

    /**
     * Gets the value of the shipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToPostalCode() {
        return shipToPostalCode;
    }

    /**
     * Sets the value of the shipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToPostalCode(String value) {
        this.shipToPostalCode = value;
    }

    /**
     * Gets the value of the shipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCountry() {
        return shipToCountry;
    }

    /**
     * Sets the value of the shipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCountry(String value) {
        this.shipToCountry = value;
    }

    /**
     * Gets the value of the shipToContactWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactWorkPhone() {
        return shipToContactWorkPhone;
    }

    /**
     * Sets the value of the shipToContactWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactWorkPhone(String value) {
        this.shipToContactWorkPhone = value;
    }

    /**
     * Gets the value of the shipToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactId() {
        return shipToContactId;
    }

    /**
     * Sets the value of the shipToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactId(String value) {
        this.shipToContactId = value;
    }

    /**
     * Gets the value of the shipToContactHomePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactHomePhone() {
        return shipToContactHomePhone;
    }

    /**
     * Sets the value of the shipToContactHomePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactHomePhone(String value) {
        this.shipToContactHomePhone = value;
    }

    /**
     * Gets the value of the shipToContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactFirstName() {
        return shipToContactFirstName;
    }

    /**
     * Sets the value of the shipToContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactFirstName(String value) {
        this.shipToContactFirstName = value;
    }

    /**
     * Gets the value of the shipToContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactEmail() {
        return shipToContactEmail;
    }

    /**
     * Sets the value of the shipToContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactEmail(String value) {
        this.shipToContactEmail = value;
    }

    /**
     * Gets the value of the shipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCity() {
        return shipToCity;
    }

    /**
     * Sets the value of the shipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCity(String value) {
        this.shipToCity = value;
    }

    /**
     * Gets the value of the businessShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessShipToAddressId() {
        return businessShipToAddressId;
    }

    /**
     * Sets the value of the businessShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessShipToAddressId(String value) {
        this.businessShipToAddressId = value;
    }

    /**
     * Gets the value of the businessShipToZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessShipToZip() {
        return businessShipToZip;
    }

    /**
     * Sets the value of the businessShipToZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessShipToZip(String value) {
        this.businessShipToZip = value;
    }

    /**
     * Gets the value of the businessShipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessShipToState() {
        return businessShipToState;
    }

    /**
     * Sets the value of the businessShipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessShipToState(String value) {
        this.businessShipToState = value;
    }

    /**
     * Gets the value of the businessShipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessShipToCountry() {
        return businessShipToCountry;
    }

    /**
     * Sets the value of the businessShipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessShipToCountry(String value) {
        this.businessShipToCountry = value;
    }

    /**
     * Gets the value of the businessShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessShipToCity() {
        return businessShipToCity;
    }

    /**
     * Sets the value of the businessShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessShipToCity(String value) {
        this.businessShipToCity = value;
    }

    /**
     * Gets the value of the businessShipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessShipToAddress2() {
        return businessShipToAddress2;
    }

    /**
     * Sets the value of the businessShipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessShipToAddress2(String value) {
        this.businessShipToAddress2 = value;
    }

    /**
     * Gets the value of the serviceAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccountId() {
        return serviceAccountId;
    }

    /**
     * Sets the value of the serviceAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccountId(String value) {
        this.serviceAccountId = value;
    }

    /**
     * Gets the value of the salesServiceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesServiceFlag() {
        return salesServiceFlag;
    }

    /**
     * Sets the value of the salesServiceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesServiceFlag(String value) {
        this.salesServiceFlag = value;
    }

    /**
     * Gets the value of the rootQuoteItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootQuoteItemId() {
        return rootQuoteItemId;
    }

    /**
     * Sets the value of the rootQuoteItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootQuoteItemId(String value) {
        this.rootQuoteItemId = value;
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
     * Gets the value of the requestedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    /**
     * Sets the value of the requestedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedDeliveryDate(String value) {
        this.requestedDeliveryDate = value;
    }

    /**
     * Gets the value of the productXAClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductXAClassId() {
        return productXAClassId;
    }

    /**
     * Sets the value of the productXAClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductXAClassId(String value) {
        this.productXAClassId = value;
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
     * Gets the value of the pricingCommitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingCommitType() {
        return pricingCommitType;
    }

    /**
     * Sets the value of the pricingCommitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingCommitType(String value) {
        this.pricingCommitType = value;
    }

    /**
     * Gets the value of the pricingAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingAdjustmentAmount() {
        return pricingAdjustmentAmount;
    }

    /**
     * Sets the value of the pricingAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingAdjustmentAmount(String value) {
        this.pricingAdjustmentAmount = value;
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
     * Gets the value of the personalShipToZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToZip() {
        return personalShipToZip;
    }

    /**
     * Sets the value of the personalShipToZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToZip(String value) {
        this.personalShipToZip = value;
    }

    /**
     * Gets the value of the personalShipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToState() {
        return personalShipToState;
    }

    /**
     * Sets the value of the personalShipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToState(String value) {
        this.personalShipToState = value;
    }

    /**
     * Gets the value of the personalShipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToCountry() {
        return personalShipToCountry;
    }

    /**
     * Sets the value of the personalShipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToCountry(String value) {
        this.personalShipToCountry = value;
    }

    /**
     * Gets the value of the personalShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToCity() {
        return personalShipToCity;
    }

    /**
     * Sets the value of the personalShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToCity(String value) {
        this.personalShipToCity = value;
    }

    /**
     * Gets the value of the personalShipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToAddress2() {
        return personalShipToAddress2;
    }

    /**
     * Sets the value of the personalShipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToAddress2(String value) {
        this.personalShipToAddress2 = value;
    }

    /**
     * Gets the value of the overrideRepriceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideRepriceFlag() {
        return overrideRepriceFlag;
    }

    /**
     * Sets the value of the overrideRepriceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideRepriceFlag(String value) {
        this.overrideRepriceFlag = value;
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
     * Gets the value of the minPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinPrice(String value) {
        this.minPrice = value;
    }

    /**
     * Gets the value of the maxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPrice(String value) {
        this.maxPrice = value;
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
     * Gets the value of the isPromEligible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPromEligible() {
        return isPromEligible;
    }

    /**
     * Sets the value of the isPromEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPromEligible(String value) {
        this.isPromEligible = value;
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
     * Gets the value of the quoteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteId() {
        return quoteId;
    }

    /**
     * Sets the value of the quoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteId(String value) {
        this.quoteId = value;
    }

    /**
     * Gets the value of the headerDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderDiscountAmount() {
        return headerDiscountAmount;
    }

    /**
     * Sets the value of the headerDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderDiscountAmount(String value) {
        this.headerDiscountAmount = value;
    }

    /**
     * Gets the value of the freightAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightAmount() {
        return freightAmount;
    }

    /**
     * Sets the value of the freightAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightAmount(String value) {
        this.freightAmount = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the coveredProductNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveredProductNetPrice() {
        return coveredProductNetPrice;
    }

    /**
     * Sets the value of the coveredProductNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveredProductNetPrice(String value) {
        this.coveredProductNetPrice = value;
    }

    /**
     * Gets the value of the coveredProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveredProductId() {
        return coveredProductId;
    }

    /**
     * Sets the value of the coveredProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveredProductId(String value) {
        this.coveredProductId = value;
    }

    /**
     * Gets the value of the coveredAssetProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveredAssetProductId() {
        return coveredAssetProductId;
    }

    /**
     * Sets the value of the coveredAssetProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveredAssetProductId(String value) {
        this.coveredAssetProductId = value;
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
     * Gets the value of the contactWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactWorkPhone() {
        return contactWorkPhone;
    }

    /**
     * Sets the value of the contactWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactWorkPhone(String value) {
        this.contactWorkPhone = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the contactHomePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactHomePhone() {
        return contactHomePhone;
    }

    /**
     * Sets the value of the contactHomePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactHomePhone(String value) {
        this.contactHomePhone = value;
    }

    /**
     * Gets the value of the contactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFirstName() {
        return contactFirstName;
    }

    /**
     * Sets the value of the contactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFirstName(String value) {
        this.contactFirstName = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
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
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the coveredQuoteItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveredQuoteItemId() {
        return coveredQuoteItemId;
    }

    /**
     * Sets the value of the coveredQuoteItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveredQuoteItemId(String value) {
        this.coveredQuoteItemId = value;
    }

    /**
     * Gets the value of the carrierPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierPriority() {
        return carrierPriority;
    }

    /**
     * Sets the value of the carrierPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierPriority(String value) {
        this.carrierPriority = value;
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
     * Gets the value of the contactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactLastName() {
        return contactLastName;
    }

    /**
     * Sets the value of the contactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactLastName(String value) {
        this.contactLastName = value;
    }

    /**
     * Gets the value of the freightTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightTerms() {
        return freightTerms;
    }

    /**
     * Sets the value of the freightTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightTerms(String value) {
        this.freightTerms = value;
    }

    /**
     * Gets the value of the shipToContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactLastName() {
        return shipToContactLastName;
    }

    /**
     * Sets the value of the shipToContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactLastName(String value) {
        this.shipToContactLastName = value;
    }

    /**
     * Gets the value of the shipToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccount() {
        return shipToAccount;
    }

    /**
     * Sets the value of the shipToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccount(String value) {
        this.shipToAccount = value;
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
     * Gets the value of the rootBundleFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootBundleFlag() {
        return rootBundleFlag;
    }

    /**
     * Sets the value of the rootBundleFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootBundleFlag(String value) {
        this.rootBundleFlag = value;
    }

    /**
     * Gets the value of the isPrePickCartItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrePickCartItem() {
        return isPrePickCartItem;
    }

    /**
     * Sets the value of the isPrePickCartItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrePickCartItem(String value) {
        this.isPrePickCartItem = value;
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
     * Gets the value of the needRefreshBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeedRefreshBasePrice() {
        return needRefreshBasePrice;
    }

    /**
     * Sets the value of the needRefreshBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeedRefreshBasePrice(String value) {
        this.needRefreshBasePrice = value;
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
     * Gets the value of the parentQuoteItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentQuoteItemId() {
        return parentQuoteItemId;
    }

    /**
     * Sets the value of the parentQuoteItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentQuoteItemId(String value) {
        this.parentQuoteItemId = value;
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
     * Gets the value of the tsServiceIntegrationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsServiceIntegrationID() {
        return tsServiceIntegrationID;
    }

    /**
     * Sets the value of the tsServiceIntegrationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsServiceIntegrationID(String value) {
        this.tsServiceIntegrationID = value;
    }

    /**
     * Gets the value of the shipToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccountId() {
        return shipToAccountId;
    }

    /**
     * Sets the value of the shipToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccountId(String value) {
        this.shipToAccountId = value;
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
     * Gets the value of the businessShipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessShipToAddress() {
        return businessShipToAddress;
    }

    /**
     * Sets the value of the businessShipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessShipToAddress(String value) {
        this.businessShipToAddress = value;
    }

    /**
     * Gets the value of the personalShipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToAddress() {
        return personalShipToAddress;
    }

    /**
     * Sets the value of the personalShipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToAddress(String value) {
        this.personalShipToAddress = value;
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
     * Gets the value of the personalShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToAddressId() {
        return personalShipToAddressId;
    }

    /**
     * Sets the value of the personalShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToAddressId(String value) {
        this.personalShipToAddressId = value;
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
     * Gets the value of the listOfQuoteItemXA property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfQuoteItemXA }
     *     
     */
    public ListOfQuoteItemXA getListOfQuoteItemXA() {
        return listOfQuoteItemXA;
    }

    /**
     * Sets the value of the listOfQuoteItemXA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfQuoteItemXA }
     *     
     */
    public void setListOfQuoteItemXA(ListOfQuoteItemXA value) {
        this.listOfQuoteItemXA = value;
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
     * Gets the value of the billingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingType() {
        return billingType;
    }

    /**
     * Sets the value of the billingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingType(String value) {
        this.billingType = value;
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
     * Gets the value of the servicePriceMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePriceMethod() {
        return servicePriceMethod;
    }

    /**
     * Sets the value of the servicePriceMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePriceMethod(String value) {
        this.servicePriceMethod = value;
    }

    /**
     * Gets the value of the servicePricePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePricePercent() {
        return servicePricePercent;
    }

    /**
     * Sets the value of the servicePricePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePricePercent(String value) {
        this.servicePricePercent = value;
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
     * Gets the value of the billingAccountAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountAddress() {
        return billingAccountAddress;
    }

    /**
     * Sets the value of the billingAccountAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountAddress(String value) {
        this.billingAccountAddress = value;
    }

    /**
     * Gets the value of the billingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountNumber() {
        return billingAccountNumber;
    }

    /**
     * Sets the value of the billingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountNumber(String value) {
        this.billingAccountNumber = value;
    }

    /**
     * Gets the value of the billingAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountLocation() {
        return billingAccountLocation;
    }

    /**
     * Sets the value of the billingAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountLocation(String value) {
        this.billingAccountLocation = value;
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
     * Gets the value of the billingAccountAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountAddress2() {
        return billingAccountAddress2;
    }

    /**
     * Sets the value of the billingAccountAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountAddress2(String value) {
        this.billingAccountAddress2 = value;
    }

    /**
     * Gets the value of the billingAccountAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountAddressId() {
        return billingAccountAddressId;
    }

    /**
     * Sets the value of the billingAccountAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountAddressId(String value) {
        this.billingAccountAddressId = value;
    }

    /**
     * Gets the value of the billingAccountCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountCity() {
        return billingAccountCity;
    }

    /**
     * Sets the value of the billingAccountCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountCity(String value) {
        this.billingAccountCity = value;
    }

    /**
     * Gets the value of the billingAccountContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountContactId() {
        return billingAccountContactId;
    }

    /**
     * Sets the value of the billingAccountContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountContactId(String value) {
        this.billingAccountContactId = value;
    }

    /**
     * Gets the value of the billingAccountCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountCountry() {
        return billingAccountCountry;
    }

    /**
     * Sets the value of the billingAccountCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountCountry(String value) {
        this.billingAccountCountry = value;
    }

    /**
     * Gets the value of the billingAccountState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountState() {
        return billingAccountState;
    }

    /**
     * Sets the value of the billingAccountState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountState(String value) {
        this.billingAccountState = value;
    }

    /**
     * Gets the value of the billingAccountZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountZip() {
        return billingAccountZip;
    }

    /**
     * Sets the value of the billingAccountZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountZip(String value) {
        this.billingAccountZip = value;
    }

    /**
     * Gets the value of the billingContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingContactEmail() {
        return billingContactEmail;
    }

    /**
     * Sets the value of the billingContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingContactEmail(String value) {
        this.billingContactEmail = value;
    }

    /**
     * Gets the value of the billingContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingContactFirstName() {
        return billingContactFirstName;
    }

    /**
     * Sets the value of the billingContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingContactFirstName(String value) {
        this.billingContactFirstName = value;
    }

    /**
     * Gets the value of the billingContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingContactLastName() {
        return billingContactLastName;
    }

    /**
     * Sets the value of the billingContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingContactLastName(String value) {
        this.billingContactLastName = value;
    }

    /**
     * Gets the value of the billingContactWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingContactWorkPhone() {
        return billingContactWorkPhone;
    }

    /**
     * Sets the value of the billingContactWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingContactWorkPhone(String value) {
        this.billingContactWorkPhone = value;
    }

    /**
     * Gets the value of the donatingServiceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonatingServiceProvider() {
        return donatingServiceProvider;
    }

    /**
     * Sets the value of the donatingServiceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonatingServiceProvider(String value) {
        this.donatingServiceProvider = value;
    }

    /**
     * Gets the value of the endingPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndingPhoneNumber() {
        return endingPhoneNumber;
    }

    /**
     * Sets the value of the endingPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndingPhoneNumber(String value) {
        this.endingPhoneNumber = value;
    }

    /**
     * Gets the value of the legacyAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyAccountNumber() {
        return legacyAccountNumber;
    }

    /**
     * Sets the value of the legacyAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyAccountNumber(String value) {
        this.legacyAccountNumber = value;
    }

    /**
     * Gets the value of the numberPortabilityAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberPortabilityAgencyName() {
        return numberPortabilityAgencyName;
    }

    /**
     * Sets the value of the numberPortabilityAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberPortabilityAgencyName(String value) {
        this.numberPortabilityAgencyName = value;
    }

    /**
     * Gets the value of the numberToPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberToPort() {
        return numberToPort;
    }

    /**
     * Sets the value of the numberToPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberToPort(String value) {
        this.numberToPort = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the requestedPortingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedPortingDate() {
        return requestedPortingDate;
    }

    /**
     * Sets the value of the requestedPortingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedPortingDate(String value) {
        this.requestedPortingDate = value;
    }

    /**
     * Gets the value of the servicePostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePostalCode() {
        return servicePostalCode;
    }

    /**
     * Sets the value of the servicePostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePostalCode(String value) {
        this.servicePostalCode = value;
    }

    /**
     * Gets the value of the startingPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingPhoneNumber() {
        return startingPhoneNumber;
    }

    /**
     * Sets the value of the startingPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingPhoneNumber(String value) {
        this.startingPhoneNumber = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the discountPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPeriod() {
        return discountPeriod;
    }

    /**
     * Sets the value of the discountPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPeriod(String value) {
        this.discountPeriod = value;
    }

    /**
     * Gets the value of the discountPeriodUoM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPeriodUoM() {
        return discountPeriodUoM;
    }

    /**
     * Sets the value of the discountPeriodUoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPeriodUoM(String value) {
        this.discountPeriodUoM = value;
    }

    /**
     * Gets the value of the discountMRCExclVAT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountMRCExclVAT() {
        return discountMRCExclVAT;
    }

    /**
     * Sets the value of the discountMRCExclVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountMRCExclVAT(String value) {
        this.discountMRCExclVAT = value;
    }

    /**
     * Gets the value of the discountMRCInclVAT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountMRCInclVAT() {
        return discountMRCInclVAT;
    }

    /**
     * Sets the value of the discountMRCInclVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountMRCInclVAT(String value) {
        this.discountMRCInclVAT = value;
    }

    /**
     * Gets the value of the nonDiscountMRCExclVAT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonDiscountMRCExclVAT() {
        return nonDiscountMRCExclVAT;
    }

    /**
     * Sets the value of the nonDiscountMRCExclVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonDiscountMRCExclVAT(String value) {
        this.nonDiscountMRCExclVAT = value;
    }

    /**
     * Gets the value of the nonDiscountMRCInclVAT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonDiscountMRCInclVAT() {
        return nonDiscountMRCInclVAT;
    }

    /**
     * Sets the value of the nonDiscountMRCInclVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonDiscountMRCInclVAT(String value) {
        this.nonDiscountMRCInclVAT = value;
    }

    /**
     * Gets the value of the nrcInclVAT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCInclVAT() {
        return nrcInclVAT;
    }

    /**
     * Sets the value of the nrcInclVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCInclVAT(String value) {
        this.nrcInclVAT = value;
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
     * Gets the value of the tscodFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSCODFlag() {
        return tscodFlag;
    }

    /**
     * Sets the value of the tscodFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSCODFlag(String value) {
        this.tscodFlag = value;
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
     * Gets the value of the tsItemToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSItemToken() {
        return tsItemToken;
    }

    /**
     * Sets the value of the tsItemToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSItemToken(String value) {
        this.tsItemToken = value;
    }

    /**
     * Gets the value of the quoteItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteItem }
     * 
     * 
     */
    public List<QuoteItem> getQuoteItem() {
        if (quoteItem == null) {
            quoteItem = new ArrayList<QuoteItem>();
        }
        return this.quoteItem;
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
