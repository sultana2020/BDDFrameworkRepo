Feature: Remove Item From Shopping Cart

#@removeFromShoppingCartTest
Scenario:
Given User is on Test Environment page
When User click on Shopping Cart
And User should see item present in shopping cart
And User should see the Red X button is displayed
And User click on Red X button
Then User should see the message 'Your shopping cart is empty!'
