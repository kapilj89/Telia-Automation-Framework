@DP_xDSL_BBIPTVVOIP
Feature:  Test for New xDSL BroadBand IPTV VOIP order

  Scenario Outline: Create New xDSL BroadBand IPTV VOIP order
  This scenario used create new xDSL BroadBand IPTV VOIP order 
  
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
      And call GetProductDetailsService using promotionCode "PromotionIPTV" and get ProductId, PriceList
      And call QuoteAddItems and get quote
      And call BeginConfigurationService using product item name "ServiceBundleIPTV"
      And call Addproduct to set RelationShipName "RelationIPTV" and Package "PackageIPTV"
      And call EndConfigurationService and get Quote
      And call GetProductDetailsService using promotionCode "PromotionVoIP" and get ProductId, PriceList
      And call QuoteAddItems and get quote
      And call BeginConfigurationService using product item name "ServiceBundleVoIP"
      And call UpdateConfiguration to set RelationShipName "RelationVoIP" and Package "PackageVoIP" for testcase "<TestcaseName>"
      And call EndConfigurationService and get Quote
      And call xDSL BBVOIPIPTV SynchronizeQuote to populate the AccessCode "AccessType" and ConnRef number "FBNumber" and PSTN "PSTN" on the quote line items for Customer Type "CustomerType" a xDSL order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
  
    Examples: 
      | TestcaseName                                     | 
      | xDSL_New_Broadband_IPTV_VoIP_ADSL - Higherplans1 | 
      | xDSL_New_Broadband_IPTV_VoIP_ADSL - Higherplans2 | 
      | xDSL_New_Broadband_IPTV_VoIP_ADSL - Higherplans3 | 
      | xDSL_New_Broadband_IPTV_VoIP_ADSL - Higherplans4 | 
      | xDSL_New_Broadband_IPTV_VoIP_ADSL1               | 
      | TC_003_xDSL_New_Broadband_IPTV_VoIP_VDSL1        | 
      | TC_003_xDSL_New_Broadband_IPTV_VoIP_VDSL2        | 
      | xDSL_DATA_PREP_B2C_New_BB_Voip_IPTV              | 
      | xDSL_DATA_PREP_B2C_xDSL_B2C_BB_PSTN_IPTV_VOIP    | 
      | xDSL_New_Broadband_IPTV_VoIP_ADSL2               | 
      | xDSL_New_Broadband_IPTV_VoIP_ADSL3               | 
      | xDSL_New_Broadband_IPTV_VoIP_ADSL_ForMove        | 
      | xDSL_New_Broadband_IPTV_VoIP_ForMove             | 
