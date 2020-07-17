package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.DriverUtility;

public class AddToShoppingCartPageObj extends Base {
	
	public AddToShoppingCartPageObj() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//storing WebElements
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Phones & PDAs')]")
	private WebElement phonesAndPDAs;
	
	@FindBy(how = How.XPATH, using = "//div[@class='caption']//a[contains(text(),'iPhone')]")
	private WebElement iphone;
	
	@FindBy(how = How.XPATH, using = "//button[@id='button-cart']")
	private WebElement addToCart;
	
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successItemAddedMessage;
	//  //*[@id="product-product"]/div[1]
	// body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Shopping Cart')]")
	private WebElement shoppingCart;
	
	@FindBy(how = How.XPATH, using = "//table[@class='table table-bordered']//img[@class='img-thumbnail']")
	private WebElement itemIsInShoppingCart;
	
	//start writing methods
	
	public void clickOnPhonesAndPDAs() {
		DriverUtility.clickonElement(phonesAndPDAs);
		
	}
	
	public void clickOnIphone() {

		DriverUtility.clickElementWithJS(iphone);
		
	}
	
	public void clickOnAddToCart() {
		DriverUtility.clickElementWithJS(addToCart);
		
	}
	
	public String getSuccessMessage() {
		String itemAddedMessage =DriverUtility.getText(successItemAddedMessage);
		return itemAddedMessage;
		
		
	}
	
	public void clickOnShoppingCart() {
		DriverUtility.clickonElement(shoppingCart);
	}
	
	public boolean confirmItemInShoppingCart() {
		DriverUtility.isElementDisplayed(itemIsInShoppingCart);
		return true;
		
	}
	
	
	
	
	

}
