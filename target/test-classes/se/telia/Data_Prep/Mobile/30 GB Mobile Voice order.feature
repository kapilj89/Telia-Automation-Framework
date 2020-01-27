@DataPrep
Feature: Create Base orders - 9No's   

  Scenario Outline: Create Mobile Voice order with 30 GB promotion
   
     Given Test case "<TestcaseName>" Starts
     When call SelfServiceUser to get primary organization id which is used in quote creation
      And call QueryCustomer using SSN "SSN" to get account and billing details
      And call GetProductDetailsService using promotionCode "Promotion" and get ProductId, PriceList
      And call ApplyProductPromotionService and get quote
      And call ExecuteQuoting to commit the virtual quote in Siebel and get updated quote
      And call BeginConfigurationService using product item name "ServiceBundle"
      And call UpdateConfiguration to SetAttribute "ICCID" Value of SIM "ICCID_1"
      And call EndConfigurationService and get Quote
      And call SynchronizeQuote to book number "MSISDN" for serivce "ServiceBundle" in a Mobile order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
      

   Examples: 
      | TestcaseName                | 
      | 30 GB Mobile Voice order-1  | 
      | 30 GB Mobile Voice order-2  | 
      | 30 GB Mobile Voice order-3  | 
      | 30 GB Mobile Voice order-4  | 
      | 30 GB Mobile Voice order-5  | 
      | 30 GB Mobile Voice order-6  | 
      | 30 GB Mobile Voice order-7  | 
      | 30 GB Mobile Voice order-8  | 
      | 30 GB Mobile Voice order-9  | 
      | 30 GB Mobile Voice order-10 | 

  
