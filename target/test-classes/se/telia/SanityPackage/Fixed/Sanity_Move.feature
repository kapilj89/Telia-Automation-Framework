Feature: Simple Move

  @Sanitymove
  Scenario Outline: Move single broadband on xDSL
    
    This scenario is a bit tricky because some steps will not be executed under all circumstances

    Given Test case "<TestcaseName>" Starts
    Given call QueryAllAsset using SSN "SSN" to get asset details AssetNumber and ServiceAccountId for promotionName "Promotions"
    When call QueryCustomer using SSN "SSN" to get PrimaryAddressId
    And call QuerySelfServiceAccount to add end date
 	  And call QuerySelfServiceAddress Add/Update StreetName "GATUNAMN" StreetNumber "GATNR" Entrance "INGANG" City "POSTORT" Apartnumber "LGHNR" PointID "PointID" Postalcode "PostalCode" for stream "Stream"   
    And call MoveModifyAssetToQuote to create move quote using AssetNumber and ServiceAccountId
    And check "MoveFlag" and Move all exsiting Asset with help of product item name "ServiceBundles" RelationShipName "Relationship" and Package "CurrentPackage" to "NewPackage"
    And call SynchronizeQuote for "Stream" Move order
    And call QuoteCheckOutService and get ActiveOrderID
    And call TSChannelSubmitOrder to submit the order

   Examples: 
      | TestcaseName               |  
      | xDSL_Move_BB_IPTV_VoIP_B2C | 
      | SDU_Move_BB_VoiP_B2B       |  
      | SDU_Move_BB_IPTV_B2C       |  
  