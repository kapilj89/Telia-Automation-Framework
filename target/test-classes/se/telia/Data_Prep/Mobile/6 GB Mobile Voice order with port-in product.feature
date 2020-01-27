@DataPrep
Feature: Create Base orders   

  Scenario Outline: Create Mobile Voice order with 6 GB promotion with portin product- required port-in number (MobileNumber) 

     Given Test case "<TestcaseName>" Starts
     When call SelfServiceUser to get primary organization id which is used in quote creation
      And call QueryCustomer using SSN "SSN" to get account and billing details
      And call GetProductDetailsService using promotionCode "Promotion" and get ProductId, PriceList
      And call ApplyProductPromotionService and get quote
      And call ExecuteQuoting to commit the virtual quote in Siebel and get updated quote
      And call BeginConfigurationService using product item name "ServiceBundle"
      And call Addproduct to set RelationShipName "Relationship" and Package "Package"
      And call UpdateConfiguration to SetAttribute "ICCID" Value of SIM "ICCID_1"
      And call EndConfigurationService and get Quote
      And call SynchronizeQuote to book number "MSISDN" for serivce "ServiceBundle" in a Mobile order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
      

   Examples: 
      | TestcaseName                                 | 
      | 6 GB Mobile Voice order with port-in product | 
      