#@sampleToReadExcel
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #Scenario: Title of your scenario
  #
  #Given Read the 
    #Given Read the SSN "SSN" Promotion "Promo"
      #And Print the SSN and Promo

      @sampleToReadExcel
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: 
  
  #Given Read the 
  
    Given Get tc name "<TestcaseName>" Promotion "Promo"
      And Print the SSN and Promo
      
    Examples: 
    | TestcaseName |
    | TAG NAME1    |
    | TAG NAME2    |      
    | TAG NAME3    |      
    | TAG NAME4    |      
    | TAG NAME5    |      