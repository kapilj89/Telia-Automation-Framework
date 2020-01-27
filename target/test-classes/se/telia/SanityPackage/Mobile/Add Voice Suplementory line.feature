@SanityMobileSupplementoryVoice 

Feature: Add supplementory voice on mobile voice 

  Scenario Outline: Create base order with mobile voice and Add Voice Suplementory line
  
   		Given Test case "<TestcaseName>" Starts
      When call SelfServiceUser to get primary organization id which is used in quote creation
      And call QueryCustomer using SSN "SSN" to get account and billing details
      And call GetProductPromotionDetailsService using promotionCode "Promotion" and service "SupplementaryBundle" and get ProductId, PriceList
      And call ApplyProductPromotionService and get quote
      And call QuoteAddBundleItem to add "SupplementaryBundle" serviceBundle and "Promotion" product
      And call ApplyProductPromotionService to associate Bundle
      And call ExecuteQuoting to commit the virtual quote in Siebel and get updated quote
      And call BeginConfigurationService using product item name "ServiceBundle"
      And call UpdateConfiguration to SetAttribute "ICCID" Value of SIM "ICCID_1"
      And call EndConfigurationService and get Quote 
      And call BeginConfigurationService using product item name "SupplementaryBundle"
      And call UpdateConfiguration to SetAttribute "ICCID" Value of SIM "ICCID_2"
      And call EndConfigurationService and get Quote 
      And call AddVoice SynchronizeQuote to book number "MSISDN" for serivce "ServiceBundle" and "SupplementaryBundle" in a Mobile order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
      
  Examples:
  	| TestcaseName                |
  	| Add Voice Suplementory line |

