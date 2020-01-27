Feature: Sanity Test for (Primary&Secondary) SDU New BB ONLY

  @SanityxDSLBroadbandIPTVVOIP
  Scenario Outline: 
  Create New XDSL Broadband IPTV and VOIP
  This scenario used create new broadband IPTV and VOIP
  Note:AddressData format-  
  		Given Test case "<TestcaseName>" Starts
     	When call SelfServiceUser to get primary organization id which is used in quote creation
      And call QueryCustomer using SSN "SSN" to get account and billing details
  #	  And call QuerySelfServiceAddress Add/Update StreetName "GATUNAMN" StreetNumber "GATNR" Entrance "INGANG" City "POSTORT" Apartnumber "LGHNR" PointID "PointID" Postalcode "PostalCode" for stream "Stream"   
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
      And call EndConfigurationService and get Quote
      And call BBVOIPIPTV xDSLSynchronizeQuote to populate the AccessCode "AccessType" and ConnRef number "FbNumber" on the quote line items for a xDSL order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
   
  Examples: 
		   	| TestcaseName    |
		   	| xDSL_New_Broadband_IPTV_VoIP_1 |
		   	
		   	
  
