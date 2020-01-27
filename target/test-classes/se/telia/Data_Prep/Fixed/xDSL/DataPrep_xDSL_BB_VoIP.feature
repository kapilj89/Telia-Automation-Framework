@DP_xDSL_BBVOIP
Feature:  Test for New xDSL BroadBand VOIP order

  Scenario Outline: Create New xDSL BroadBand VOIP order
  This scenario used create new xDSL BroadBand VOIP order 
  
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
      And call xDSL BBVOIP SynchronizeQuote to populate the AccessCode "AccessType" and ConnRef number "FBNumber" and PSTN "PSTN" on the quote line items for Customer Type "CustomerType" a xDSL order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
  
    Examples: 
      | TestcaseName                          | 
      | xDSL_DATA_PREP_B2B_BB_Voip1           | 
      | xDSL_DATA_PREP_B2B_BB_Voip2           | 
      | xDSL_DATA_PREP_B2B_BB_Voip_PSTN       | 
      | xDSL_DATA_PREP_B2B_BB_Voip_ForMove    | 
      | TC_003_xDSL_New_BroadbandandVOIP_ADSL | 
      | TC_001_xDSL_New_BroadbandandVOIP_VDSL | 
      | xDSL_B2C_BB_VOIP1                     | 
      | xDSL_B2C_BB_VOIP2                     | 
      | xDSL_DATA_PREP_B2C_BBVoip             | 
      | xDSL_B2C_BB_VOIP_ForMove              | 
