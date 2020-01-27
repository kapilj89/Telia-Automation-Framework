@SanityMobileBaseMBB 

Feature: API Mobile Sanity Test 

  Scenario Outline: Create base order with MBB Promotion
   
    	Given Test case "<TestcaseName>" Starts
      When call SelfServiceUser to get primary organization id which is used in quote creation
      And call QueryCustomer using SSN "SSN" to get account and billing details
      And call GetProductDetailsService using promotionCode "Promotion" and get ProductId, PriceList
      And call ApplyProductPromotionService and get quote
      And call ExecuteQuoting to commit the virtual quote in Siebel and get updated quote
      And call BeginConfigurationService using product item name "ServiceBundle"
      And call UpdateConfiguration to SetAttribute "ICCID" Value of SIM "ICCID_1"
      And call UpdateConfiguration to SetAttribute "Email" Value of SIM "E-mail"
      And call EndConfigurationService and get Quote
      And call SynchronizeQuote to book number "MSISDN" for serivce "ServiceBundle" in a Mobile order
      And call QuoteCheckOutService and get ActiveOrderID
      And call TSChannelSubmitOrder to submit the order
      
  Examples: 
     | TestcaseName                      			|
     | Create base order with MBB Promotion-1 |
		 | Create base order with MBB Promotion-2 |
		 | Create base order with MBB Promotion-3 |
     | Create base order with MBB Promotion-4 |
     | Create base order with MBB Promotion-5 |
  

