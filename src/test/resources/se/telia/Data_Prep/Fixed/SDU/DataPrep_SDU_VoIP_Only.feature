@DP_SDU_VOIP
Feature:  Test for New SDU VOIP order

  Scenario Outline: Create New SDU VOIP order
  This scenario used create new SDU VOIP order 
  
    Given Test case "<TestcaseName>" Starts
     When call SelfServiceUser to get primary organization id which is used in quote creation
      And call QueryCustomer using SSN "SSN" to get account and billing details
      And call QuerySelfServiceAddress Add/Update StreetName "GATUNAMN" StreetNumber "GATNR" Entrance "INGANG" City "POSTORT" Apartnumber "LGHNR" PointID "PointID" Postalcode "PostalCode" for stream "Stream"    
      And call GetProductDetailsService using promotionCode "PromotionVoIP" and get ProductId, PriceList
      And call ApplyProductPromotionService "PromotionVoIP" for and get quote
      And call ExecuteQuoting to commit the virtual quote in Siebel and get updated quote
      And call BeginConfigurationService using product item name "ServiceBundleVoIP"     
      And call EndConfigurationService and get Quote
      And call SDU VOIP SynchronizeQuote to populate the AccessCode "AccessType" on the quote line items for a SDU order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
  
    Examples: 
      | TestcaseName                     | 
      | SDU_DATA_PREP_B2C_New_VOIP_Only1 | 
      | SDU_DATA_PREP_B2C_New_VOIP_Only2 | 
  
