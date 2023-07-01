package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class Legal_T_CsPage {
	public Legal_T_CsPage(){
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath="//span[@style='color: #000000;']")
	public WebElement termsAndCondition;
	
	@FindBy(xpath="//div[@class='bdf-tb-t bdf-tb-dt-t'][1]")
	public WebElement chippieReward ;
	
	@FindBy(xpath="//span[@style='color: #333399;']")
	public WebElement termAndConditionLink ;
	//span[@style="color: #333399;"]
	
	
	@FindBy(xpath="//div[@class='bdf-tb-t bdf-tb-dt-t'][2]")
	public WebElement productRecall;

	@FindBy(xpath="//strong[contains(text(), 'Recalls')]")
	public WebElement recalls;

	@FindBy(xpath="//div[@class='bdf-tb-t bdf-tb-dt-t'][3]")
	public WebElement disclaimers;
	
	
	@FindBy(xpath="//*[contains(text(), 'Product Images')]")
	public WebElement disclaimersText;
	
	@FindBy(xpath="//div[@class='bdf-tb-t bdf-tb-dt-t'][4]")
	public WebElement privacyPolicy;
	
	@FindBy(xpath="//strong[contains(text(), 'Cheap as Chips Privacy Policy')]")
	public WebElement privacyPolicyText;
	
	
	

}
