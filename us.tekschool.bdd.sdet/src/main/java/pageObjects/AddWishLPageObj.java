package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.DriverUtility;

public class AddWishLPageObj extends Base {

	public AddWishLPageObj() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//storing WebElements:
	
	@FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle'][contains(text(),'Cameras')]")
	private WebElement camera;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Show All Cameras')]")
	private WebElement showAllCameras;
	
	@FindBy(how = How.XPATH, using = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[2]//i[1]")
	private WebElement heartButton;
	
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Wish List (1)')]")
	private WebElement wishList;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='well'])[2]")
	private WebElement returningCustomerForm;
	
	@FindBy(how = How.ID, using = "input-email")
	private WebElement Email;
	 
	@FindBy(id = "input-password")
	private WebElement Password;
	 
	@FindBy(how = How.XPATH, using = "//input[@class='btn btn-primary']")
	private WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//div[@id='content']")
	private WebElement myWishListForm;
	
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-danger']")
	private WebElement redXButton;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Your wish list is empty.')]")
	private WebElement epmtyWishL;
	
	//Methods
	
	public void clickOnCamera() {
		camera.click();
	}
	
	public void moveToShowAllCameras() {
		showAllCameras.click();
	}
	
	public void clickOHeartButton() {
		heartButton.click();
	}
	
	public String getSuccessMessage() {
		String addWishLMessage = DriverUtility.getText(successMessage);
		return addWishLMessage;
	}
	
	public void clickOnWishList() {
		wishList.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
