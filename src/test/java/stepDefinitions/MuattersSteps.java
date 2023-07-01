package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import Utilities.CommonMethods;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MuattersSteps extends CommonMethods {

//	TestCase1 AboutUS

	@Given("hover over on the about button")
	public void hover_over_on_the_about_button() {
		waitForVisibility(about.aboutButton);
		// Create an instance of Actions class and pass the WebDriver instance
		Actions actions = new Actions(Driver.getDriver());

		// Perform the hover-over action on the About
		actions.moveToElement(about.aboutButton).perform();
	}

	@When("click on the About Us button")
	public void click_on_the_about_us_button() {
		about.aboutUsButton.click();

	}

	@Then("Cheap-as-Chips About Us page will be navigated to.")
	public void cheap_as_chips_about_us_page_will_be_navigated_to() throws InterruptedException {
		waitForVisibility(about.textVisableOnAboutPage);
		Assert.assertTrue(about.textVisableOnAboutPage.isDisplayed());
	}

//	TestCase2_AfterPay_Buy_Now_Pay_Later_Steps

	@When("click on the Buy Now Play Later button")
	public void click_on_the_buy_now_play_later_button() {
		about.buyNowPayLaterButton.click();

	}

	@Then("click on afterpay")
	public void click_on_afterpay() {
		bnpl.afterPay.click();

	}

	@Then("click on apple afterpay download")
	public void click_on_apple_afterpay_download() {
		afterPayPage.afterPayDownload.click();
	}

	@Then("new afterpay window opens")
	public void new_afterpay_window_opens() {
		switchToChildWindow(Driver.getDriver().getWindowHandle());
		Assert.assertEquals(ConfigurationReader.getProperty("expectedAfterPayTitle"), Driver.getDriver().getTitle());

	}

//	TestCase3_Zip_Buy_Now_Pay_Later_Steps 

	@Then("click on Zip")
	public void click_on_zip() {
		bnpl.zipPay.click();
	}

	@Then("click on apple zip download")
	public void click_on_apple_zip_download() {
		waitForVisibility(zipPayPage.zipPayIframe);
		switchToIframeByElement(zipPayPage.zipPayIframe);

		zipPayPage.zipPaySignup.click();

	}

	@Then("new zip window opens")
	public void new_zip_window_opens() {
		switchToChildWindow(Driver.getDriver().getWindowHandle());
		Assert.assertEquals(ConfigurationReader.getProperty("expectedZipPayTitle"), 
				Driver.getDriver().getTitle());

	}

//	TestCase4_TC_Steps 

	@When("click on the Legal T&Cs button")
	public void click_on_the_legal_t_cs_button() {
		about.legalTAndCButton.click();
		Assert.assertEquals(TCPage.termsAndCondition.getText(),
				ConfigurationReader.getProperty("expectedTermsAndConditionText"));
	}

	@Then("click on Chippie Reward Bar")
	public void click_on_chippie_reward_bar() {
		TCPage.chippieReward.click();
		TCPage.termAndConditionLink.click();
		Assert.assertEquals(Driver.getDriver().getCurrentUrl(),
				ConfigurationReader.getProperty("expectedTermsAndConditionURL"));
		Driver.getDriver().navigate().back();

	}

	@Then("click on Product Recall")
	public void click_on_product_recall() {
		TCPage.productRecall.click();
		Assert.assertEquals(TCPage.recalls.getText(), 
				ConfigurationReader.getProperty("expectedRecallText"));

	}

	@Then("click on Disclaimer")
	public void click_on_disclaimer() {
		TCPage.disclaimers.click();
		Assert.assertEquals(TCPage.disclaimersText.getText(),
				ConfigurationReader.getProperty("expectedDisclaimerText"));

	}

	@Then("click on Privacy Policy")
	public void click_on_privacy_policy() {
		TCPage.privacyPolicy.click();
		Assert.assertTrue(TCPage.privacyPolicyText.isDisplayed());

	}

//	TestCase5_Shipping_Delivery_Steps

	@Given("Search A Production")
	public void search_a_production() {
		about.searchField.sendKeys(ConfigurationReader.getProperty("product"));
		about.searchButton.click();

	}

	@When("click on the production")
	public void click_on_the_production() {
		products.airFryerImage.click();

	}

	@When("Add for Home Delivery then quit")
	public void add_for_home_delivery_then_quit() {
		waitForClickability(products.addHomeDelivery);
		products.addHomeDelivery.click();
		waitForVisibility(products.addToCartSuccessMsg);
		Assert.assertTrue(products.addToCartSuccessMsg.isDisplayed());
		products.quitButton.click();
	}

	@When("click on Shipping and Delivery Information button")
	public void click_on_shipping_and_delivery_information_button() {
		about.shippingAndDeliveryButton.click();
		
	}

	@Then("click on the change button")
	public void click_on_the_change_button() {
		iterateDropdownOptions(SDPage.changeStateDropdown);
		
	}

}


