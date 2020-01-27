@DP_KO_BBVOIP
Feature:  Test for New Ext_KO BroadBand VOIP order

  Scenario Outline: Create New Ext_KO BroadBand VOIP order
  This scenario used create new Ext_KO BroadBand VOIP order 
  
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
      And call UpdateConfiguration to set RelationShipName "RelationVoIP" and Package "PackageVoIP" for testcase "<TestcaseName>"
      And call EndConfigurationService and get Quote
      And call KO BBVOIP SynchronizeQuote to populate the AccessCode "AccessType" FBNumber "FBNumber" and KO agreement "DeliveryContract" row "RowID" revision "RevisionNumber" the quote line items for a ExtKO order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
  
    Examples: 
      | TestcaseName                                      | 
      | MDU_ExtKO_Broadband_and_VoIP_HigherPlan           | 
      | MDU_ExtKO_Broadband_and_VOIP_Lowerplan            | 
      | MDU_Ext_KO_Disconnect_Broadband_and_VoIP_Upgraded | 
      | MDU_Ext_KO_B2B_BB_VoIP_Access_Type_1100           | 
  
