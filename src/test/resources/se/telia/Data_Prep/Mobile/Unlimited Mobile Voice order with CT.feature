@DataPrep
Feature: Create Base orders - 3No's  

  Scenario Outline: Create Mobile Voice order with unlimited promotion with CT

     Given Test case "<TestcaseName>" Starts
     When call SelfServiceUser to get primary organization id which is used in quote creation
      And call QueryCustomer using SSN "SSN" to get account and billing details
      And call GetProductDetailsService using promotionCode "Promotion" and get ProductId, PriceList
      And call ApplyProductPromotionService and get quote
      And call ExecuteQuoting to commit the virtual quote in Siebel and get updated quote
      And call BeginConfigurationService using product item name "ServiceBundle"
      And call UpdateConfiguration to SetAttribute "ICCID" Value of SIM "ICCID_1"
      And call UpdateConfigurationSetAttribute to set commitment duration to "Duration" months for product item name "Plan"
      And call EndConfigurationService and get Quote
      And call SynchronizeQuote to book number "MSISDN" for serivce "ServiceBundle" in a Mobile order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
      

   Examples: 
      | TestcaseName                           | 
      | Unlimited Mobile Voice order with CT-1 | 
      | Unlimited Mobile Voice order with CT-2 | 
      | Unlimited Mobile Voice order with CT-3 | 
      