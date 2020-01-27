Feature: Modify

@SanitymodifyBB
  Scenario Outline: Modify single broadband on xDSL
  This scenario is a bit tricky because some steps will not be executed under all circumstances
  
    Given Test case "<TestcaseName>" Starts
    Given call QueryAllAsset using SSN "SSN" to get asset details AssetNumber and ServiceAccountId for promotionName "Promotions"
      And call ModifyAssetToQuote for ServiceBundle "ServiceBundles" from Package "CurrentPackage" to "NewPackage"
      And Modify all exsiting Asset using product item name "ServiceBundles" RelationShipName "Relationship" and Package "CurrentPackage" to "NewPackage"   
      And call SynchronizeQuote for a Modify order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
  
    Examples: 
      | TestcaseName                 | 
      | SDU_Modify_Broadband_B2C     | 
      | SDU_Modify_Broadband_B2B     | 
      | SDU_Modify_IPTV_B2C          | 
      | MDU_Modify_BB_IPTV_B2C       | 
      | xDSL_Modify_BB_IPTV_VoIP_B2C | 
      | SDU_Modify_BB_IPTV_VoIP_B2C  | 
  
  
