Feature: Sanity Test for (Secondary) SDU New BB ONLY

@SanitySDUBroadband
  Scenario Outline: 
  Create New Broadband Only
  This scenario used create new broadband Only
  Note:AddressData format-
  
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
      And call SDU BB SynchronizeQuote to populate the AccessCode "AccessType" on the quote line items for a SDU order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
  
		Examples: 
		   	| TestcaseName        |
		   	| SDU_New_Broadband_1 |
		   	| SDU_New_Broadband_2 |
		   	| SDU_New_Broadband_3 |
#		   	| SDU_New_Broadband_4 |