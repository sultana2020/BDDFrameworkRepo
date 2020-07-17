package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.DriverUtility;

public class RemoveFShoppingPageO extends Base {
	
	public RemoveFShoppingPageO() {
		
		PageFactory.initElements(driver, this);
	}

	//storing WebElements
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Shopping Cart')]")
	private WebElement shoppingCart;
	
//	//other way
//	@FindBy(how =How.ID, using = "cart-total")
//	private WebElement items;
	
	@FindBy(how=How.XPATH, using = "//div[@id='content']")
	private WebElement itemInShoppingCart;
	
//	@FindBy(how=How.XPATH, using = "//button[@class='btn btn-danger']")
//	private WebElement isRedXButtonDisplayed;
	
	@FindBy(how=How.XPATH, using = "(//button[@type='button'])[8]")
	private WebElement redXButton;
	
	// relative xpath:  //i[@class='fa fa-times-circle']
	//Relative xpath: //button[@class='btn btn-danger']
	//classname: btn btn-danger
	//Absoluate xpath:  //*[@id="content"]/form/div/table/tbody/tr/td[4]/div/span/button[2]
	
	@FindBy(how= How.XPATH, using = "//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement emptyShoppingCart;
	
	//methods:
	
	public void clickOnShoppingCart() {
		shoppingCart.click();
		 
	}
	
	public boolean isItemInShoppingCart() {
		boolean item = DriverUtility.isElementDisplayed(itemInShoppingCart);
		return item;
	}
	
//	public boolean isRedXBDisplayed() {
//		boolean dispalyed = DriverUtility.isElementDisplayed(isRedXButtonDisplayed);
//		return dispalyed;
//		
//	}
	
	public void clickOnRedXButton() {
		redXButton.click();
		
	}
	
	public String getMessage() {
		String emptyShoppingCartMessage = DriverUtility.getText(emptyShoppingCart);
		return emptyShoppingCartMessage;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
