@DP_KO_BB
Feature:  Test for New Ext_KO BroadBand IPTV order

  Scenario Outline: Create New Ext_KO BroadBand order
  This scenario used create new Ext_KO BroadBand order 
  
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
      And call KO BB SynchronizeQuote to populate the AccessCode "AccessType" FBNumber "FBNumber" and KO agreement "DeliveryContract" row "RowID" revision "RevisionNumber" the quote line items for a ExtKO order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
  
    Examples: 
      | TestcaseName                         | 
      | MDU_ExtKO_Broadband_LowerPlan        | 
      | MDU_ExtKO_Broadband_Higherplan       | 
      | MDU_Ext_KO_B2B_BB_Access_Type_1000-1 | 
      | MDU_Ext_KO_B2B_BB_Access_Type_1000-2 | 
      | MDU_XLAN_B2B_Access_Type_200         | 
