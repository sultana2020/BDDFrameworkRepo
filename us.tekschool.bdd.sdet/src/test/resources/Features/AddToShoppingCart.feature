Feature: Add Item to Shopping Cart


#@addToShoppingCartTest
Scenario:
    Given User is on Test Environment page
    When User click on Phones & PDAs 
    Then User click on iphone
    And User click on Add to Cart
    And User should see message 'Success: You have added iPhone to your shopping cart!'
    And User click on Shopping Cart 
    Then User should see the iphone added in the Shopping Cart
     
