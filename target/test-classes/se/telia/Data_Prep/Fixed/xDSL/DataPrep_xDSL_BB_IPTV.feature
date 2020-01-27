@DP_xDSL_BBIPTV
Feature:  Test for New xDSL BroadBand IPTV order

  Scenario Outline: Create New xDSL BroadBand IPTV order
  This scenario used create new xDSL BroadBand IPTV order 
  
    Given Test case "<TestcaseName>" Starts
     When call SelfServiceUser to get primary organization id which is used in quote creation
      And call QueryCustomer using SSN "SSN" to get account and billing details
      And call QuerySelfServiceAddress Add/Update StreetName "GATUNAMN" StreetNumber "GATNR" Entrance "INGANG" City "POSTORT" Apartnumber "LGHNR" PointID "PointID" Postalcode "PostalCode" for stream "Stream"   
      And call GetProductDetailsService using promotionCode "PromotionBroadBand" and get ProductId, PriceList
      And call ApplyProductPromotionService "PromotionBroadBand" for and get quote
      And call ExecuteQuoting to commit the virtual quote in Siebel and get updated quote
      And call BeginConfigurationService using product item name "ServiceBundleBroadBand"
      And call Addproduct to set RelationShipName "RelationBroadband" and Package "PackageBroadband"
      And call EndConfigurationService and get Quote
      And call GetProductDetailsService using promotionCode "PromotionIPTV" and get ProductId, PriceList
      And call QuoteAddItems and get quote
      And call BeginConfigurationService using product item name "ServiceBundleIPTV"
      And call Addproduct to set RelationShipName "RelationIPTV" and Package "PackageIPTV"
      And call EndConfigurationService and get Quote
      And call xDSL BBIPTV SynchronizeQuote to populate the AccessCode "AccessType" and ConnRef number "FBNumber" and PSTN "PSTN" on the quote line items for Customer Type "CustomerType" a xDSL order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
  
    Examples: 
      | TestcaseName                               | 
      | xDSL_B2C_BB_IPTV1                          | 
      | xDSL_DATA_PREP_B2C_Add_IPTV_on_exitsing_BB | 
      | xDSL_DATA_PREP_B2C_xDSL_B2C_BB_IPTV        | 
      | xDSL_DATA_PREP_B2C_xDSL_B2C_BB_PSTN_IPTV   | 
      | xDSL_B2C_BB_IPTV2                          | 
      | xDSL_B2C_BB_IPTV_ForMove                   | 
 