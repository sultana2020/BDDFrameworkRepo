Feature: Test Environment

  Background: 
    Given User is on TEST Environment page

  @loginTest
  Scenario: Login to MyAccount
    When User click on MyAccount
    And User click on Login
    And User enters username 's2020sana@gmail.com' and Password '2020!@#Sana'
    And User click on Login button
    Then User Should be logged in to user Dashboard

  @MultipleUsers
  Scenario Outline: Login to My Account with multiple users
    When User click on MyAccount
    And User click on Login
    And User enters username '<userName>' and Password '<password>'
    And User click on Login button
    Then User Should be logged in to user Dashboard

    Examples: 
      | userName              | password |
      | sdet@tekschool.us     | sdet     |
      | student@tekschool.us  | TEST     |
      | teacher@tekSchool.us  | teacher  |
      | consumer@tekschool.us | JBond    |

  @logout
  Scenario: Log out from  MyAccount
    When User click on MyAccount
    And User click on Login
    And User enters username 'sdet@tekschool.us' and Password 'sdet'
    And User click on Login button
    Then User Should be logged in to user Dashboard
    When User click on MyAccount
    And User click on Logout
    Then User should be logged out

  @addToShoppingCartTest
  Scenario: Add Item to Shopping Cart
    When User click on Phones & PDAs
    Then User click on iphone
    And User click on Add to Cart
    And User should see message 'Success: You have added iPhone to your shopping cart!'
    And User click on Shopping Cart
    Then User should see the iphone added in the Shopping Cart

  @removeFromShoppingCartTest
  Scenario: Remove Item from Shopping Cart
    When User click on Phones & PDAs
    Then User click on iphone
    And User click on Add to Cart
    And User should see message 'Success: You have added iPhone to your shopping cart!'
    And User click on Shopping Cart
    Then User should see the iphone added in the Shopping Cart
    When User click on Shopping Cart
    And User should see item in shopping cart
    When User click on Red X button
    Then User should should see message 'Your shopping cart is empty!'
