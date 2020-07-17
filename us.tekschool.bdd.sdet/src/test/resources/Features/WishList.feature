Feature: Add and Remove From Whish List

Background: 
Given User is on Test Environment Page

@addToWishListTest
Scenario: Add Item to Wish List
    When User click on Phones & PDAs 
    Then User click on iphone 
    And User click on Heart button Add to Wish List
    And User should see message 'Success: You have added iPhone to your wish list!'
    And User click on Wish List 
    Then User should see the login page
    And User enters email 's2020sana@gmail.com' and password '2020!@#Sana'
    And User click on login
    Then User should see My Wish List page
    Then User should see the iphone added in Wish List
     
    
    
@removeFromWishListTest
Scenario: Remove Item from Wish List
When User click on Wish List
Then User should see the login page
And User enters email 's2020sana@gmail.com' and password '2020!@#Sana'
And User click on login
Then User should see My Wish List page
Then User click on Red X button
Then User should should see message 'Success: You have modified your wish list!'
 
 
 #organize it based of the add to shopping cart///////////////////////////////////