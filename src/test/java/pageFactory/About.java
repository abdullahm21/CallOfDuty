package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class About {

	
	public About(){
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	/*Declare the "FindBy elements here" for your page: For example:

	*/
	//HomePage About
	@FindBy(xpath="//span[contains(text(), 'About')]")
	public WebElement aboutButton;
	
	@FindBy(xpath="//a[contains(text(), ' About us ')]")
	public WebElement aboutUsButton;
	
	@FindBy(xpath="//h2[@class=\"bdf-h-t bdf-sz-xl\"]")
	public WebElement textVisableOnAboutPage;
	
	
	
	@FindBy(xpath="//li[@class='ss_megamenu_lv2 menu_item_dropS']")
	public WebElement buyNowPayLaterButton;
	
	@FindBy(xpath="//li[@class='ss_megamenu_lv2  '][4]")
	public WebElement  legalTAndCButton;
	
	@FindBy(xpath="//li[@class='ss_megamenu_lv2  '][6]")
	public WebElement shippingAndDeliveryButton;
	
	@FindBy(id="boost-pfs-search-box-0")
	public WebElement searchField;
	
	@FindBy(xpath="//div[3]/div/div[2]/form/button")
	public WebElement searchButton;
	



	
}
