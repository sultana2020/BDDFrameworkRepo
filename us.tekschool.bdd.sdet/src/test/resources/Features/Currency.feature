 Feature: Currency options

Background: 
    Given User is on TEST Environment page
    
  Scenario: Check carrency Options
    When User click on Currency dorpdown
    And User click on Euro
    And User click on Pound Sterling
    And User click on US Dollar
    
    
    
    Scenario: Check Default Currency is US Dollar  
    When User click on Currency
    Then User should see US Dollar as default 
    Then User click on Camera in the menue bar
    And User move to Show All Cameras
    And User click on Show All Cameras
    And User should the list of Cameras each with a defauld price in US Dollar
    And User click on 'Nikon D300'
    And User should see full description page 
    And User verifies the default price of 'Nikon D300' in US Dollar
    Then User click on Add to Cart
    And User click on Shopping Cart
    And User verifies default unit price in US Dollar
    Then User click on Camera back in the menue bar
    And User move to Show All Cameras
    And User click on Show All Cameras
    And User should see the list of Cameras each with a defauld price in US Dollar
    And User click on 'Nikon D300'
    And User click on Heart button Add to Wishlist inthe product image and decriptions
    And User click on Wishlist button at the right top of the page
    Then User should see the login page
    And User enters email 's2020sana@gmail.com' and password '2020!@#Sana'
    And User click on login
    Then User should see My Wish List page
    And Suer veryfies default Unit Price in US Dollar
    
    
    Scenario: Change Currency to Euro
    When User click on Currency
    And User click on Euro
    Then User click on product name in menu bar 'Camera'
    And User move to Show All Cameras
    And User click on Show All Cameras
    Then User should see the price unit change to Euro under product image
    And User click on 'Nikon D300'
    And User should see full description page 
    And User verifies the price unit of 'Nikon D300' change to Euro
    Then User click on Add to Cart
    And User click on Shopping Cart
    And User verifies unit price change to Euro in shopping cart
    Then User click on Camera in menue bar
    And User move to Show All Cameras
    And User click on Show All Cameras
    And User click on 'Nikon D300'
    And User click on Heart button Add to Wish list in the product decriptions page
    And User click on Wishlist button at the right top of the page above the menu bar
    Then User should see the login page
    And User enters email 's2020sana@gmail.com' and password '2020!@#Sana'
    And User click on login
    Then User should see My Wish List page
    And Suer veryfies Unit Price changed to Euro
    
    
    #Questions for Shaiq
    #1- how do i manage Background for these Scenarios// which steps do i have to put under Background??
    #2- should I follow the same stps Pound Sterling?????? just do one of currency
    #3- Can I use login tag in my testRunner with the Currency tags together to run the test since i have to login to check
    # my wish list???
    #4- can we copy utility class from one project to another?
    #5- Internet Explorar still has problem not open selenium launch browser??
    #6- check my login.feature for MavenProjectDemo
    
    
     
    
    
