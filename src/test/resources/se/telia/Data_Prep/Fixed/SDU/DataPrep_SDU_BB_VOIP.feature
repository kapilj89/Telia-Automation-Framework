@DP_SDU_BBVOIP
Feature:  Test for New SDU BroadBand VOIP order

  Scenario Outline: Create New SDU BroadBand VOIP order
  This scenario used create new SDU BroadBand VOIP order 
  
    Given Test case "<TestcaseName>" Starts
     When call SelfServiceUser to get primary organization id which is used in quote creation
      And call QueryCustomer using SSN "SSN" to get account and billing details
      And call QuerySelfServiceAddress Add/Update StreetName "GATUNAMN" StreetNumber "GATNR" Entrance "INGANG" City "POSTORT" Apartnumber "LGHNR" PointID "PointID" Postalcode "PostalCode" for stream "Stream"
      And call GetProductDetailsService using promotionCode "PromotionBroadBand" and get ProductId, PriceList
      And call ApplyProductPromotionService "PromotionVoIP" for and get quote
      And call ExecuteQuoting to commit the virtual quote in Siebel and get updated quote
      And call BeginConfigurationService using product item name "ServiceBundleBroadBand"
      And call Addproduct to set RelationShipName "RelationBroadband" and Package "PackageBroadband"
      And call EndConfigurationService and get Quote
      And call GetProductDetailsService using promotionCode "PromotionVoIP" and get ProductId, PriceList
      And call QuoteAddItems and get quote
      And call BeginConfigurationService using product item name "ServiceBundleVoIP"
      And call EndConfigurationService and get Quote
      And call SDU BBVOIP SynchronizeQuote to populate the AccessCode "AccessType" on the quote line items for a SDU order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
  
    Examples: 
      | TestcaseName                                 | 
      | SDU_DATA_PREP_B2B_New_BB_Voip2               | 
      | SDU_DATA_PREP_B2B_New_BB_Voip_WithSG5Address | 
      | SDU_B2C_New_BB_VoIP                          | 
      | SDU_DATA_PREP_B2B_New_BB_Voip1               | 
      | SDU_B2B_BB_VOIP1                             | 
      | SDU_B2B_BB_VOIP2                             | 
      | SDU_B2B_BB_VOIP3                             | 
      | SDU_DATA_PREP_B2B_New_BB_Voip_WithSG5Address | 
