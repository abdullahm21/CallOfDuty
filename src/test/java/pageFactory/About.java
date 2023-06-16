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
	
	@FindBy(LocatorForElementLikeXpath="element")
	public WebElement nameYourFindByAnnotationElementHere;
	
	Like this one below:
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public WebElement dashboardText;
	
	*/
	
	@FindBy(xpath="//ul[@class='main-navigation nav hidden-tablet hidden-sm hidden-xs']/li[6]/a/span[1]")
	public WebElement aboutButton;
	
	
}
