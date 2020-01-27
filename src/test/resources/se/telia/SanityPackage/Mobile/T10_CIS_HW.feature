@T10Test

Feature: Mobile Hardware

  Scenario Outline: Add Hardware 
  
  		Given Test case "<TestcaseName>" Starts
      When call SelfServiceUser to get primary organization id which is used in quote creation
      And call QueryCustomer using SSN "SSN" to get account and billing details
      And call GetProductPromotionDetailsService using promotionCode "HardwarePromotion" and service "HardwareProduct" and get ProductId, PriceList
      And call ApplyProductPromotionService and get quote
      And call QuoteAddBundleItem to add "HardwareProduct" serviceBundle and "HardwarePromotion" product
      And call ApplyProductPromotionService to associate Bundle
      And call ExecuteQuoting to commit the virtual quote in Siebel and get updated quote    
      And call BeginConfigurationService using product item name "HardwareProduct"
      And call HWUpdateConfiguration to SetAttribute "SerialNumber" Value of SIM "Value"
      And call EndConfigurationService and get Quote 
      And call SynchronizeQuote for a "ServiceBundle" Mobile Hardware "HardwareProduct" to add shipping method "Shipping" and SSID "SSID"
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
      Then call QueryOrder to verify the status and delivery method
 
  Examples:
  	| TestcaseName                                      |
  	| New Mobile order with SSID and Shipping method    |
  	| New Mobile order without SSID and Shipping method |

