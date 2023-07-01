package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class ZipPayPage {

	public ZipPayPage(){
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath=("//iframe[@class='zip-widget zip-widget__iframe zip-widget__iframe--type-landingpage']"))
			public WebElement zipPayIframe;
	
	@FindBy(xpath=("/html/body/section[2]/div/div[1]/a"))
	public WebElement zipPaySignup;
	
}
