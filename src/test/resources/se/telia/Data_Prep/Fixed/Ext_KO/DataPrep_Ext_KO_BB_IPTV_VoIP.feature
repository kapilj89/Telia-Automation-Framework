@DP_KO_BBIPTVVOIP
Feature:  Test for New Ext_KO BroadBand IPTV VOIP order

  Scenario Outline: Create New Ext_KO BroadBand IPTV VOIP order
  This scenario used create new Ext_KO BroadBand IPTV VOIP order 
  
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
      And call KO BBVOIPIPTV SynchronizeQuote to populate the AccessCode "AccessType" FBNumber "FBNumber" and KO agreement "DeliveryContract" row "RowID" revision "RevisionNumber" the quote line items for a ExtKO order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
  
    Examples: 
      | TestcaseName                                          | 
      | MDU_ExtKO_Broadband_IPTV_VoIP_Higherplan              | 
      | MDU_Ext_KO_B2C_BB_IPTV_VoIP_Access_Type_1000          | 
      | MDU_Ext_KO_B2C_BB_IPTV_VoIP_Access_Type_1000_Transfer | 
  