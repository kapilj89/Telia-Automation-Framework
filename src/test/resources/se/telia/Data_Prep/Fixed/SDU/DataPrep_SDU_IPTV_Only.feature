@DP_SDU_IPTV
Feature:  Test for New SDU IPTV order

  Scenario Outline: Create New SDU IPTV order
  This scenario used create new SDU IPTV order 
  
    Given Test case "<TestcaseName>" Starts
     When call SelfServiceUser to get primary organization id which is used in quote creation
      And call QueryCustomer using SSN "SSN" to get account and billing details
      And call QuerySelfServiceAddress Add/Update StreetName "GATUNAMN" StreetNumber "GATNR" Entrance "INGANG" City "POSTORT" Apartnumber "LGHNR" PointID "PointID" Postalcode "PostalCode" for stream "Stream"    
      And call GetProductDetailsService using promotionCode "PromotionIPTV" and get ProductId, PriceList
      And call ApplyProductPromotionService "PromotionIPTV" for and get quote
      And call ExecuteQuoting to commit the virtual quote in Siebel and get updated quote
      And call BeginConfigurationService using product item name "ServiceBundleIPTV"
      And call Addproduct to set RelationShipName "RelationIPTV" and Package "PackageIPTV"
      And call EndConfigurationService and get Quote
      And call SDU IPTV SynchronizeQuote to populate the AccessCode "AccessType" on the quote line items for a SDU order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
  
    Examples: 
      | TestcaseName                     | 
      #| SDU_DATA_PREP_B2C_New_IPTV_Only1 | 
      | SDU_B2C_IPTVonly                 | 
      #| SDU_DATA_PREP_B2C_New_IPTV_only2 | 
      #| SDU_DATA_PREP_B2C_New_IPTV_only3 | 
  
  
