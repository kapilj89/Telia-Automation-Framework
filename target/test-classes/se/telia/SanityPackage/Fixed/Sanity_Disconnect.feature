Feature: Disconnect

  @Disconnect
  Scenario Outline: Disconnect Feature

    Given Test case "<TestcaseName>" Starts
    Given call QueryMainAsset using SSN "SSN" to get asset details AssetNumber and ServiceAccountId for promotionName "Promotions"
    And call DisconnectAssetToQuote
    And call QueryQuote to fetch the quote from database
    And call SynchronizeQuote for a Disconnect order
   	And call QuoteCheckOutService and get ActiveOrderID
    And call TSChannelSubmitOrder to submit the order

       Examples: 
      | TestcaseName | 
      | Disconnect-8 | 
      | Disconnect-9 | 
      | Disconnect-10 | 
      #| Disconnect-4 | 
      #| Disconnect-5 | 
      #| Disconnect-6 | 
      #| Disconnect-7 | 