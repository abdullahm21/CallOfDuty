package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class WinterWarmer {

	
	public WinterWarmer() {
		PageFactory.initElements(Driver.getDriver(), this);

	}
	
/*Declare the "FindBy elements here" for your page: For example:
	
	@FindBy(LocatorForElementLikeXpath="element")
	public WebElement nameYourFindByAnnotationElementHere;
	
	Like this one below:
	
	@FindBy(xpath="")
	public WebElement name;
	
	*/
	//test 1
	@FindBy(xpath="//ul[@class='main-navigation nav hidden-tablet hidden-sm hidden-xs']/li[3]/a/span[1]")
	public WebElement winterWarmer;
	
	@FindBy(xpath="//h1[@class='boost-pfs-filter-collection-header']/span")
	public WebElement wwHeader;
	
	@FindBy(xpath="//*[@id=\"shopify-section-collection-template-boost-pfs-filter\"]/div[4]/div[1]/div[2]/div[1]/div[1]/div/div[1]/a")
	public WebElement wwProduct;
	
	@FindBy(xpath="//h1[text()='Prinetti Gas Patio Heater, 1.4m, Powder Coated Finish']")
	public WebElement wwProductText;
	
	//test 2
	
	//@FindBy(xpath="//h6[text()='//ul[@class='main-navigation nav hidden-tablet hidden-sm hidden-xs']/li/a/span[text()='Winter Warmers']']")
	//public WebElement winterWarmer;
	
	@FindBy(xpath="//ul[@class='boost-pfs-filter-option-item-list boost-pfs-filter-option-item-list-multiple-list']/li[3]/button/span[1]")
	public WebElement appliancesCheckBox;
	
	@FindBy(xpath="//div[@class='refine-by-item boost-pfs-filter-option-label']/a/span")
	public WebElement refineByText;
	
	//test 3:

	//@FindBy(xpath="//h6[text()='//ul[@class='main-navigation nav hidden-tablet hidden-sm hidden-xs']/li/a/span[text()='Winter Warmers']']")
	//public WebElement winterWarmer;
	
	@FindBy(xpath="//*[@id=\"boost-pfs-filter-tree\"]/div/div[3]/div[3]/div[2]/div/div[1]/div[2]/div/div/div/ul/li[2]/button/span[2]")
	public WebElement germanicaCheckBox;
	
//	@FindBy(xpath="//div[@class='refine-by-item boost-pfs-filter-option-label']/a/span")
//	public WebElement refineByText;
	
	//Ensure that the user can navigate back to the Winter Warmers page from each brand page.
	
	
	
	
}
