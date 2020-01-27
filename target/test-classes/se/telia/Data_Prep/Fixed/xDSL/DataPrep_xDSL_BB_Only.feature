@DP_xDSL_BB
Feature:  Test for New xDSL BroadBand order

  Scenario Outline: Create New xDSL BroadBand order
  This scenario used create new xDSL BroadBand order 
  
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
      And call BeginConfigurationService using product item name "ServiceBundleBroadBand"
      And call UpdateConfiguration set commitment duration to "Commitment" months for type "RelationBroadband" product item name "PackageBroadband"
      And call EndConfigurationService and get Quote
      And call xDSL BB SynchronizeQuote to populate the AccessCode "AccessType" and ConnRef number "FBNumber" and PSTN "PSTN" on the quote line items for a xDSL order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
  
    Examples: 
      | TestcaseName                                   | 
      | xDSL_B2C_BB_ADSL_Lowerplan                     | 
      | xDSL_B2C_BB_VDSL_Higherplan                    | 
      | xDSL_DATA_PREP_B2C_BB_PSTN                     | 
      | xDSL_DATA_PREP_B2C_Only_BB_With12MCommitments  | 
      | xDSL_B2C_BB_ADSL1                              | 
      | xDSL_B2C_BB_ADSL2                              | 
      | xDSL_DATA_PREP_B2B_BB_PSTN1                    | 
      | xDSL_DATA_PREP_B2B_Only_BB_With_Commitments12M | 
      | xDSL_B2B_BBOnly                                | 
      | xDSL_DATA_PREP_B2B_Only_BB                     | 
      | xDSL_DATA_PREP_B2B_BB_PSTN2                    | 
  