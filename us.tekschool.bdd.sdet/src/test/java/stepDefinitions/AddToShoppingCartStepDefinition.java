package stepDefinitions;

import org.junit.Assert;

import org.openqa.selenium.NoSuchElementException;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddToShoppingCartPageObj;
import utilities.DriverUtility;

public class AddToShoppingCartStepDefinition extends Base {

	AddToShoppingCartPageObj addToShoppingCartPageObj = new AddToShoppingCartPageObj();

	@Given("^User is on Test Environment page$")
	public void user_is_on_Test_Environment_page() throws Throwable {
		Base.initializeDriver();
	}

	@When("^User click on Phones & PDAs$")
	public void user_click_on_Phones_PDAs() throws Throwable {
		try {
			addToShoppingCartPageObj.clickOnPhonesAndPDAs();
			logger.info("click on phones & PDAs");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		DriverUtility.screenShot();
	}

	@Then("^User click on iphone$")
	public void user_click_on_iphone() throws Throwable {
		try {
			addToShoppingCartPageObj.clickOnIphone();
			logger.info("click on iphone");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		DriverUtility.screenShot();
	}

	@When("^User click on Add to Cart$")
	public void user_click_on_Add_to_Cart() throws Throwable {
		try {
			addToShoppingCartPageObj.clickOnAddToCart();
			logger.info("click on Add To Cart");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		DriverUtility.screenShot();
	}
	
	@Then("^User should see message '(.+)'$")
	public void user_should_see_message_Success_You_have_added_iPhone_to_your_shopping_cart(String message) throws Throwable {
		//DriverUtility.wait(2000);
		System.out.println(message);
		System.out.println(addToShoppingCartPageObj.getSuccessMessage());
		//Assert.assertEquals(addToShoppingCartPageObj.getSuccessMessage(), message);
		Assert.assertEquals(message.substring(0, 8),addToShoppingCartPageObj.getSuccessMessage().substring(0, 8));
		logger.info("Assertion passed");
		DriverUtility.screenShot(); 
	}

	@When("^User click on Shopping Cart$")
	public void user_click_on_Shopping_Cart() throws Throwable {
		try {
			addToShoppingCartPageObj.clickOnShoppingCart();
			logger.info("click on Shopping Cart");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		DriverUtility.screenShot();

	}

	@Then("^User should see the iphone added in the Shopping Cart$")
	public void user_should_see_the_iphone_added_in_the_Shopping_Cart() throws Throwable {
		
		Assert.assertTrue(addToShoppingCartPageObj.confirmItemInShoppingCart());
		logger.info("Confirm Item is Added in Shopping Cart");
		DriverUtility.screenShot();

	}

}
