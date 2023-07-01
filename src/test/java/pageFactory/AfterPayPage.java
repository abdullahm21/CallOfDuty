package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class AfterPayPage {
	public AfterPayPage(){
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath="//img[@width=\"250\"]")
	public WebElement afterPayDownload;
	
	
	
	
	
}
