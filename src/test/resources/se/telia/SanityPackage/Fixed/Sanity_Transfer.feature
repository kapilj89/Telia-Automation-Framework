@SanityTransfer

Feature: Sanity Transfer

  Scenario Outline: Transfer an asset  
  
      Given Test case "<TestcaseName>" Starts
      Given call QueryAsset for source SSN "SSN" to get asset details AssetNumber and ServiceAccountId for promotionName "Promotions"
      And call QueryCustomer using SSN "TargetSSN" to get account and billing details
  	  And call QuerySelfServiceAddress Add/Update StreetName "GATUNAMN" StreetNumber "GATNR" Entrance "INGANG" City "POSTORT" Apartnumber "LGHNR" PointID "PointID" Postalcode "PostalCode" for stream "Stream"   
      And call QueryTransferModifyAssetToQuote and transfer Service to "TargetSSN"
      And call QueryQuote to fetch the quote from database
      And call SynchronizeQuote for a Transfer order
      And call QuoteCheckOutService and get ActiveOrderID
  	  And call TSChannelSubmitOrder to submit the order
  
    Examples: 
      | TestcaseName               |  
      | SDU_Transfer_Broadband_B2C | 
  

