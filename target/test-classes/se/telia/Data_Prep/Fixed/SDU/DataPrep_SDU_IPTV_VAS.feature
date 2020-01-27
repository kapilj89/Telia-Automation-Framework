@DP_SDU_IPTVVAS
Feature:  Test for New SDU IPTV VAS order

  Scenario Outline: Create New SDU IPTV VAS order
  This scenario used create new SDU IPTV VAS order 
  
    Given Test case "<TestcaseName>" Starts
     When call SelfServiceUser to get primary organization id which is used in quote creation
    And call QueryCustomer using SSN "SSN" to get account and billing details
 		And call QuerySelfServiceAddress Add/Update StreetName "GATUNAMN" StreetNumber "GATNR" Entrance "INGANG" City "POSTORT" Apartnumber "LGHNR" PointID "PointID" Postalcode "PostalCode" for stream "Stream"    
    And call GetProductDetailsService using promotionCode "PromotionIPTV" and get ProductId, PriceList
    And call ApplyProductPromotionService "PromotionBroadBand" for and get quote
    And call ExecuteQuoting to commit the virtual quote in Siebel and get updated quote
    And call BeginConfigurationService using product item name "ServiceBundleIPTV"
    And call Addproduct to set RelationShipName "RelationIPTV" and Package "PackageIPTV"
    And call EndConfigurationService and get Quote    
    And call GetProductDetailsService using promotionCode "PromotionBroadBand" and get ProductId, PriceList
    And call QuoteAddItems and get quote    
    And call BeginConfigurationService using product item name "ServiceBundleBroadBand"
    And call Addproduct to set RelationShipName "RelationBroadband" and Package "PackageBroadband"
    And call EndConfigurationService and get Quote
    And call SDU IPTV SynchronizeQuote to populate the AccessCode "AccessType" on the quote line items for a SDU order
    And call QuoteCheckOutService and get ActiveOrderID
    And call TSChannelSubmitOrder to submit the order
  
    Examples: 
   	| TestcaseName    |
   	| IPTV with Stor Package,C Sandard & HBO+VAS(Spotify - Premium)1 |
   #	| IPTV with Stor Package,C Sandard & HBO+VAS(Spotify - Premium)2 |
   	
   	
   	
   