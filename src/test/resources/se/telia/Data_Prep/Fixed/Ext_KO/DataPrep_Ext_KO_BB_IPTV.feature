@DP_KO_BBIPTV
Feature:  Test for New Ext_KO BroadBand IPTV order

  Scenario Outline: Create New Ext_KO BroadBand IPTV order
  This scenario used create new Ext_KO BroadBand IPTV order 
  
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
      And call KO BBIPTV SynchronizeQuote to populate the AccessCode "AccessType" FBNumber "FBNumber" and KO agreement "DeliveryContract" row "RowID" revision "RevisionNumber" the quote line items for a ExtKO order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
  
    Examples: 
      | TestcaseName                                    | 
      | MDU_ExtKO_IPTVUpgrade_B2C_External              | 
      | MDU_ExtKO_IPTVDowngrade_B2C_External            | 
      | MDU_Ext_KO_Disconnect_Broadband_And_IPTV_B2C    | 
      | MDU_Ext_KO_B2C_BB_IPTV_Access_Type_1600         | 
      | MDU_Ext_KO_B2C_BB_IPTV_Access_Type_1600_ForMove | 
  
