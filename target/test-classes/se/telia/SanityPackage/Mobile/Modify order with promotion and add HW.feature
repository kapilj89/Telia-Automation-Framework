@SanityMobileModify

Feature: Modify MobileVoice and MBB

  Scenario Outline: Modify an asset and add Hardware 
  
  		Given Test case "<TestcaseName>" Starts
    	Given call QueryAllAsset using SSN "SSN" to get asset details AssetNumber and ServiceAccountId for promotionName "Promotion"     
      And call Mobile ModifyAssetToQuote for ServiceBundle "ServiceBundle"
      And call GetProductPromotionDetailsService using promotionCode "HardwarePromotion" and service "HardwareProduct" and get ProductId, PriceList
      And call ApplyPromotionOnExistingQuoteService and get quote
      And call QuoteAddBundleItem to add "HardwareProduct" serviceBundle and "HardwarePromotion" product
      And call ApplyProductPromotionService to associate Bundle
      And call ExecuteQuoting to commit the virtual quote in Siebel and get updated quote    
      And call BeginConfigurationService using product item name "HardwareProduct"
      And call HWUpdateConfiguration to SetAttribute "SerialNumber" Value of SIM "Value"
      And call EndConfigurationService and get Quote 
      And call SynchronizeQuote for a "ServiceBundle" Mobile Modify and HW "HardwareProduct" order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
 
  Examples:
  	| TestcaseName                                  |
  	| Modify order with promotion and add HW_MBB    |
  	| Modify order with promotion and add HW_Mobile |

            #OrderID - 5-8862430631 MBB