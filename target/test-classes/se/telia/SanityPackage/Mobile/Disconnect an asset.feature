@SanityMobileDisconnect

Feature: Mobile Sanity Disconnect

  Scenario Outline: Disconnect an asset MBB and MobileVoice 
  		Given Test case "<TestcaseName>" Starts
    	Given call QueryMainAsset using SSN "SSN" to get asset details AssetNumber and ServiceAccountId for promotionName "Promotion"
      And call DisconnectAssetToQuote
      And call QueryQuote to fetch the quote from database
      And call SynchronizeQuote for a Disconnect order
      And call QuoteCheckOutService and get ActiveOrderID
  	  And call TSChannelSubmitOrder to submit the order
  
  Examples:
  	| TestcaseName               |
  	| Disconnect an asset_MBB    |
  	| Disconnect an asset_Mobile |

#OrderID - 5-3478038182