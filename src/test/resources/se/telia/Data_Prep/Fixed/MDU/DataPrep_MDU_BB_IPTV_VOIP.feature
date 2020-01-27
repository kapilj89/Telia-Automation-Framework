@DP_MDU_BBIPTVVOIP
Feature:  Test for New MDU BroadBand IPTV VOIP order

  Scenario Outline: Create New MDU BroadBand IPTV VOIP order
  This scenario used create new MDU BroadBand IPTV VOIP order 

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
    And call BBVOIPIPTV SynchronizeQuote to populate the deliveryContract "Agreement" Revision "RevisionNumber" RowID "RowID" and AccessCode "AccessType" on the quote line items for a MDU order
    And call QuoteCheckOutService and get ActiveOrderID
    And call TSChannelSubmitOrder to submit the order

    Examples: 
      | MDU_B2C_BB_IPTV_VOIP_Lowerplans                                        |
      | MDU_DATA_PREP_B2C_MDU_New_Broadband_IPTV_and_VoIP_Upgraded_Higherplans |
