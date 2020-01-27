@SanityMobileTransfer

Feature: Mobile Sanity Transfer

  Scenario Outline: Transfer an asset MBB and MobileVoice 
  
  		Given Test case "<TestcaseName>" Starts
      Given call QueryAsset for source SSN "SSN" to get asset details AssetNumber and ServiceAccountId for promotionName "Promotion"
      And call QueryCustomer using SSN "TargetSSN" to get account and billing details
      And call QueryTransferModifyAssetToQuote and transfer Service to "TargetSSN"
      And call QueryQuote to fetch the quote from database
      And call SynchronizeQuote for a Transfer order
      And call QuoteCheckOutService and get ActiveOrderID
  	  And call TSChannelSubmitOrder to submit the order
      
   Examples:
  	| TestcaseName             |
  	| Transfer an Asset_MBB    |
  	| Transfer an Asset_Mobile |
  

#OrderID - 5-4615604676