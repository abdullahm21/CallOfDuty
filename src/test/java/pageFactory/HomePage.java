package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);

	}
	
/*Declare the "FindBy elements here" for your page: For example:
	
	@FindBy(LocatorForElementLikeXpath="element")
	public WebElement nameYourFindByAnnotationElementHere;
	
	Like this one below:
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public WebElement dashboardText;
	
	*/
	
	//Products section from Navigation bar
		@FindBy(xpath="//span[text()='Products']")
		public WebElement productsSection;
		//Winter Warmers section from nav bar
		@FindBy(xpath="//ul[@class='main-navigation nav hidden-tablet hidden-sm hidden-xs']//span[text()='Winter Warmers']")
		public WebElement winterWarmers;
		//catalog section from Navigation bar
		@FindBy(xpath="//ul[@class='main-navigation nav hidden-tablet hidden-sm hidden-xs']//span[text()='Catalogue']")
		public WebElement catalog;
		//Store locator section from Navigation bar
		@FindBy(xpath="//ul[@class='main-navigation nav hidden-tablet hidden-sm hidden-xs']//span[text()='Store Locator']")
		public WebElement storeLocator;
		////About section from Navigation bar
		@FindBy(xpath="//ul[@class='main-navigation nav hidden-tablet hidden-sm hidden-xs']//span[text()='About']")
		public WebElement about;
		////Contact Us section from Navigation bar
		@FindBy(xpath="//ul[@class='main-navigation nav hidden-tablet hidden-sm hidden-xs']//span[text()='Contact Us']")
		public WebElement contactus;
		////Chippe Rewards section from Navigation bar
		@FindBy(xpath="//ul[@class='main-navigation nav hidden-tablet hidden-sm hidden-xs']//span[text()='Chippie Rewards']")
		public WebElement chippieRewards;
		
		//Search TextBox
		@FindBy(id="boost-pfs-search-box-0")
		public WebElement searchTextBox;
		
		//search Button
		@FindBy(xpath="//form[@class='formSearch ']/button[@type='submit']")
		public WebElement searchButton;
		
		//cart button
		@FindBy(xpath="//div[@class='middle-right d-none d-lg-block']/div/a")
		public WebElement cart;
		
		//Change store using the location dropdown arrow on the top right
		@FindBy(xpath="//li[@class='toplink-item changestore']/a/span")
		public WebElement changeStoreDropdown;
		
		//Change store using the location icon on the left of Click and collect store on the top right of page
		@FindBy(xpath="//li[@class='toplink-item changestore']/a/i")
		public WebElement changeStoreIcon;
		
		//My Account Button
		@FindBy(xpath="//li[@class='toplink-item account']/a")
		public WebElement myAccount;
		
		//Login button
		@FindBy(xpath="//ul[@class='toplinks-wrapper']/li[@class='s-login']/a")
		public WebElement Login;
		
		//Cheap As Chips Image Logo on the top left to redirect to Home page
		@FindBy(xpath="//div[@class='navbar-logo d-none d-lg-block']/div/a/img")
		public WebElement cheapAsChipsLogo;
		
		//Links on the Bottom of the Page:
		
		//Contact us
		@FindBy(xpath="//a[text()='Contact us']")
		public WebElement contactUs;
		
		//FAQs(Bottom)
		@FindBy(xpath="//div[@class='col-md-3 col-sm-3 col-3']/a[text()='FAQs']")
		public WebElement FAQS;
		//Facebook page
		@FindBy(xpath="//a[text()='Facebook']")
		public WebElement facebook;
		//Instagram page
		@FindBy(xpath="//a[text()='Instagram']")
		public WebElement instagram;
		
		
		
	
	
}
