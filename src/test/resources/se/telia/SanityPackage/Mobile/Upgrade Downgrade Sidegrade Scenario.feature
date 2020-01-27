@SanityMobileUpgradeDowngradeSidegrade

Feature: Mobile-Upgrade/downgrade/sidegrade for MobileVoice and MBB

  Scenario Outline: This includes upgrade downgrade and sidegrade scenarios for mobileVoice and MBB 
  
  		Given Test case "<TestcaseName>" Starts
    	Given call QueryCustomer using SSN "SSN" to get account and billing details
      And call QueryAsset using SSN "SSN" to get asset details AssetNumber and ServiceAccountId for promotionName "Promotion"
      And call GetProductDetailsService using promotionCode "UpgradePromotion" and get ProductId, PriceList
      And call QueryUpgradePromotionToQuote for "ReasonCode" Order and get Quote
      And call ExecuteQuoting to commit the virtual quote in Siebel and get updated quote
      And call BeginConfigurationService using product item name "ServiceBundle"
      And call UpdateConfigurationSetAttribute to set commitment duration to "Duration" months for product item name "Plan_New"
      And call EndConfigurationService and get Quote
      And call SynchronizeQuote to change dueDate of "ReasonCode" for serivce "Plan" and "Plan_New" in a Mobile order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
  
    Examples:
  	| TestcaseName              |
  	| Upgrade Scenario_MBB      |
  	| Upgrade Scenario_Mobile   |
  	| Downgrade Scenario_MBB    |
  	| Downgrade Scenario_Mobile |
  	| Sidegrade Scenario_Mobile |
  
#Order ID- 5-3046722347