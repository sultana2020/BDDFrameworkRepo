package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RemoveFShoppingPageO;
import utilities.DriverUtility;

public class RemoveFShoppingStepDefin extends Base {

	RemoveFShoppingPageO removeItemPageObj = new RemoveFShoppingPageO();
	
	
	@When("^User should see item in shopping cart$")
	public void user_should_see_item_in_shopping_cart() throws Throwable {
	    
	}

//	@When("^User should see the Red X button$")
//	public void user_should_see_the_Red_X_button() throws Throwable {
//		Assert.assertTrue(removeItemPageObj.isRedXBDisplayed());
//		logger.info("Red X button is available");
//		DriverUtility.screenShot();
//	}

	@When("^User click on Red X button$")
	public void user_click_on_Red_X_button() throws Throwable {
		removeItemPageObj.clickOnRedXButton();
		//logger.info("Click on Red X Button");
		DriverUtility.wait(3000);
		DriverUtility.screenShot();
	}

	@Then("^User should should see message '(.+)'$")
	public void user_should_should_see_message_Your_shopping_cart_is_empty(String message) throws Throwable {
		Assert.assertEquals(removeItemPageObj.getMessage(), message);
		logger.info("Assertion passed");
		DriverUtility.screenShot();
	}
	
}
