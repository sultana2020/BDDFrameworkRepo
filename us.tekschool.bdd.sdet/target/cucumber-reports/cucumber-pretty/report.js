$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Test Environment",
  "description": "",
  "id": "test-environment",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8406503200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on TEST Environment page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDefiniton.user_is_on_TEST_Environment_page()"
});
formatter.result({
  "duration": 1912069100,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Remove Item from Shopping Cart",
  "description": "",
  "id": "test-environment;remove-item-from-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 49,
      "name": "@removeFromShoppingCartTest"
    }
  ]
});
formatter.step({
  "line": 51,
  "name": "User click on Phones \u0026 PDAs",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "User click on iphone",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "User click on Add to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "User should see message \u0027Success: You have added iPhone to your shopping cart!\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "User click on Shopping Cart",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "User should see the iphone added in the Shopping Cart",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "User click on Shopping Cart",
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "User should see item in shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "User click on Red X button",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "User should should see message \u0027Your shopping cart is empty!\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToShoppingCartStepDefinition.user_click_on_Phones_PDAs()"
});
formatter.result({
  "duration": 1241119300,
  "status": "passed"
});
formatter.match({
  "location": "AddToShoppingCartStepDefinition.user_click_on_iphone()"
});
formatter.result({
  "duration": 1821874100,
  "status": "passed"
});
formatter.match({
  "location": "AddToShoppingCartStepDefinition.user_click_on_Add_to_Cart()"
});
formatter.result({
  "duration": 519428200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Success: You have added iPhone to your shopping cart!",
      "offset": 25
    }
  ],
  "location": "AddToShoppingCartStepDefinition.user_should_see_message_Success_You_have_added_iPhone_to_your_shopping_cart(String)"
});
formatter.result({
  "duration": 536341400,
  "status": "passed"
});
formatter.match({
  "location": "AddToShoppingCartStepDefinition.user_click_on_Shopping_Cart()"
});
formatter.result({
  "duration": 940097200,
  "status": "passed"
});
formatter.match({
  "location": "AddToShoppingCartStepDefinition.user_should_see_the_iphone_added_in_the_Shopping_Cart()"
});
formatter.result({
  "duration": 508633500,
  "status": "passed"
});
formatter.match({
  "location": "AddToShoppingCartStepDefinition.user_click_on_Shopping_Cart()"
});
formatter.result({
  "duration": 848671700,
  "status": "passed"
});
formatter.match({
  "location": "RemoveFShoppingStepDefin.user_should_see_item_in_shopping_cart()"
});
formatter.result({
  "duration": 18804000,
  "status": "passed"
});
formatter.match({
  "location": "RemoveFShoppingStepDefin.user_click_on_Red_X_button()"
});
formatter.result({
  "duration": 3534250100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your shopping cart is empty!",
      "offset": 32
    }
  ],
  "location": "RemoveFShoppingStepDefin.user_should_should_see_message_Your_shopping_cart_is_empty(String)"
});
formatter.result({
  "duration": 454117200,
  "status": "passed"
});
formatter.after({
  "duration": 764217700,
  "status": "passed"
});
});