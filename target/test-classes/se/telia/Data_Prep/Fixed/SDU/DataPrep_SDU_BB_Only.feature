@DP_SDU_BB
Feature:  Test for New SDU BroadBand order

  Scenario Outline: Create New SDU BroadBand order
  This scenario used create new SDU BroadBand order 
  
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
      | TestcaseName                      | 
      | SDU_B2C_BBonly1                   | 
      | SDU_B2C_BBonly2                   | 
      | SDU_B2B_BBonly                    | 
      | SDU_B2B_BBonly_ForResume          | 
      | SDU_DATA_PREP_B2B_New_BB_Only     | 
      | SDU_B2B_New_BB_Only_SuspendResume | 
      | SDU_B2C_BBonly3                   | 
      | SDU_B2C_New_BB_only               | 
      | SDU_DATA_PREP_B2C_New_BB_only     | 
      | SDU_B2C_Bbonly_SuspendResume      | 
