package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class ShippingDeliveryPage {
	public ShippingDeliveryPage(){
		PageFactory.initElements(Driver.getDriver(), this);
	}
	//Shipping and Delivery
	@FindBy(xpath="//span[@class=\"docapp-trigger-label\"]")
	public WebElement changeButton;
	
	@FindBy(xpath="//span[@class=\"docapp-trigger-label\"]")
	public WebElement newChangeButton;
	
	@FindBy(xpath="//select[@name='shipping_address[province]']")
	public WebElement changeStateDropdown;
	
	@FindBy(xpath="//option[@value='NSW']")
	public WebElement NSW;
	
	@FindBy(xpath="//input[@name='shipping_address[zip]']")
	public WebElement postcodeInputField;
	
	@FindBy(xpath="//input[@name=\"shipping_address[city]\"]")
	public WebElement suburbField;
	
	// sendkey: 2000
	
	@FindBy(xpath="//div[@class='docapp-shipping-calculator--button']")
	public WebElement calculatorButton;
	
	
	@FindBy(xpath="//*[@id=\"docapp-int-8268\"]/div[1]/div[4]/span")
	
	public WebElement cartSubTotalPrice;
	
	
	
}
