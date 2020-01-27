@DP_MDU_BB
Feature:  Test for New MDU BroadBand order

  Scenario Outline: Create New MDU BroadBand order
  This scenario used create new MDU BroadBand order 

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
    And call BB SynchronizeQuote to populate the deliveryContract "Agreement" Revision "RevisionNumber" RowID "RowID" and AccessCode "AccessType" on the quote line items for a MDU order
    And call QuoteCheckOutService and get ActiveOrderID
    And call TSChannelSubmitOrder to submit the order

    Examples: 
      | TestcaseName                        |
      | MDU_B2C_BB_Upgraded_Bulk            |
      | MDU_B2C_BB_Upgraded1                |
      | MDU_B2C_BB_Upgraded2                |
      | MDU_B2C_BB_Upgraded                 |
      | MDU_DATA_PREP_B2B_MDU_New_Broadband |
