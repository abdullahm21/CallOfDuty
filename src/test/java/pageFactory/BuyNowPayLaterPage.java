package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class BuyNowPayLaterPage {
	
	public BuyNowPayLaterPage(){
		PageFactory.initElements(Driver.getDriver(), this);
	}

	//Buy Now and Pay Later Page
	
	
	@FindBy(xpath="//div[@data-id=\"g5vzade\"]")
	public WebElement afterPay ;
	
	
	@FindBy(xpath="//div[@data-id=\"88qs0bv\"]")
	public WebElement zipPay ;
}
