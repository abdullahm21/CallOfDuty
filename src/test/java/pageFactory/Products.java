package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class Products {

	
	public Products() {
		PageFactory.initElements(Driver.getDriver(), this);

	}
	
/*	Declare the "FindBy elements here" for your page: For example:
	
		@FindBy(LocatorForElementLikeXpath="element")
		public WebElement nameYourFindByAnnotationElementHere;
		
		Like this one below:
		
		@FindBy(xpath="//ul[@class='main-navigation nav hidden-tablet hidden-sm hidden-xs']/li[2]/a/span[1]")
		public WebElement dashboardText;
	
*/
	
	//------------------------------Page Object Model for 'Products'-------------------------------------//
	
	
	//Products section from Navigation bar
	@FindBy(xpath="//ul[@class='main-navigation nav hidden-tablet hidden-sm hidden-xs']/li[2]/a/span[1]")
	public WebElement productsSection;
	
	
	
	//Test Case 1: Click And Collect elements:
	
	@FindBy(xpath="//ul[@class='ss_megamenu_dropdown raghudrodown dropdown_lv1 row']/li[3]/a")
	public WebElement clothing;
	
	@FindBy(xpath="//a[@title='Converse Kids Split Bow Tshirt, Blue, 5-6Y']")
	public WebElement clothingItem;
	
	@FindBy(xpath="//a[@class='product-stock__store-view-more']")
	public WebElement changeStore;
	
	@FindBy(xpath="//div[@class='row border-bottom changemystorediv MY']/div[5]/a")
	public WebElement makeMyStore;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	public WebElement confirmButton;
	
	@FindBy(id="AddToPickup-product-template")
	public WebElement clickAndCollect;
	
	@FindBy(xpath="//div[@class='popup_cart bg_1 modal-pu pu-cart active']/div/div/div/a")
	public WebElement closeButton;
	
	
	//Test Case 2: Add and then remove an item from cart:
	
	/*
	 * @FindBy(xpath="//ul[@class='ss_megamenu_dropdown raghudrodown dropdown_lv1 row']/li[3]/a")
		public WebElement clothing;
	 * @FindBy(xpath="//a[@title='Converse Kids Split Bow Tshirt, Blue, 5-6Y']")
		public WebElement clothingItem;
	*/
	
	@FindBy(id="AddToCart-product-template")
	public WebElement addToCart;
	
	//@FindBy(xpath="//div[@class='popup_cart bg_1 modal-pu pu-cart active']/div/div/div/a")
	//public WebElement closeButton;
	
	@FindBy(xpath="//div[@class='middle-right d-none d-lg-block']/div/a")
	public WebElement cartButton;
	
	@FindBy(xpath="//div[@class='middle-right d-none d-lg-block']/div/div/div[2]/div[2]/div[2]/a[1]")
	public WebElement viewCart;
		
	@FindBy(xpath="//a[@class='btn btn--small btn--secondary cart__remove medium-up--hide']")
	public WebElement removeFromCart;
	
	
	//Test Case 3: View items in Grocery Section from only "Grocery" Category and "Cheap As Chips" Brand
	
	@FindBy(xpath="//ul[@class='ss_megamenu_dropdown raghudrodown dropdown_lv1 row']/li[7]/a")
	public WebElement grocery;
	
	@FindBy(xpath="//div[@class='boost-pfs-filter-options-wrapper']/div[2]/div[2]/div/div/div[2]/div/div/div/ul/li[5]/button/span[1]")
	public WebElement groceryCategoryButton;
	
	@FindBy(xpath="//*[@id=\\\"boost-pfs-filter-tree\\\"]/div/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div/ul/li\"")
	public WebElement brandsList;
	
	//Assertion from Refine by section afterwards.
	
//	Test Case 4: Slider Test in Electrical section of Products
	
	@FindBy(xpath="//ul[@class='ss_megamenu_dropdown raghudrodown dropdown_lv1 row']/li[4]/a")
	public WebElement electrical;
	
	@FindBy(xpath="//div[@class='noUi-handle noUi-handle-lower']/div")
	public WebElement increaseSlider;
				   //div[@class='noUi-handle noUi-handle-lower']
	@FindBy(xpath="//div[@class='noUi-handle noUi-handle-lower']")
	public WebElement increaseSliderAttribute;
	
	@FindBy(xpath="//div[@class='noUi-handle noUi-handle-upper']/div")
	public WebElement decreaseSlider;
	
	@FindBy(xpath="//div[@class='noUi-handle noUi-handle-upper']")
	public WebElement decreaseSliderAttribute;
	
	//Assertion from Refine by section afterwards.
	
	
//	Test Case 5: custom Price range by entering the Highest and lowest price in the Furniture section
	
	@FindBy(xpath="//ul[@class='ss_megamenu_dropdown raghudrodown dropdown_lv1 row']/li[5]/a")
	public WebElement furniture;
	
	@FindBy(xpath="//input[@class='boost-pfs-filter-option-range-amount-min']")
	public WebElement minPrice;
	
	
	@FindBy(xpath="//input[@class='boost-pfs-filter-option-range-amount-max']")
	//@FindBy(xpath="//input[@aria-label='Max Price']\")
	public WebElement maxPrice;
	
	//Assertion from Refine by section afterwards.
	
	
	
}
