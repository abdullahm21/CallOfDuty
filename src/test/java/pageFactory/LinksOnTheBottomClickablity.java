package pageFactory;

import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class LinksOnTheBottomClickablity {

	
	public LinksOnTheBottomClickablity() {
		PageFactory.initElements(Driver.getDriver(), this);

	}
	
/*Declare the "FindBy elements here" for your page: For example:
	
	@FindBy(LocatorForElementLikeXpath="element")
	public WebElement nameYourFindByAnnotationElementHere;
	
	Like this one below:
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	public WebElement dashboardText;
	
	*/
	
}
