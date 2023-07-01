package stepDefinitions;

import org.testng.Assert;

import Utilities.CommonMethods;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MohammadsSteps extends CommonMethods{

	@Given("the user is on the Home page of the Cheap As Chips URL")
	public void the_user_is_on_the_home_page_of_the_cheap_as_chips_url() {
		 String actualURL = Driver.getDriver().getCurrentUrl();
		    String expectedURL = "https://www.cheapaschips.com.au/";
		    
		    Assert.assertEquals(actualURL, expectedURL);
	}

	@When("the user clicks Winter Warmers from the navigation bar")
	public void the_user_clicks_winter_warmers_from_the_navigation_bar() {
	    CommonMethods.click(winter.winterWarmer);
	}

	//Test 1
	@When("the user clicks on a product in the Winter Warmers")
	public void the_user_clicks_on_a_product_in_the_winter_warmers() {
	    CommonMethods.click(winter.wwProduct);
	}

	@Then("the user should be able to see only the WW product with its information.")
	public void the_user_should_be_able_to_see_only_the_ww_product_with_its_information() {
	    
		String expectedText = winter.wwProductText.getText();
		String actualText = "Prinetti Gas Patio Heater, 1.4m, Powder Coated Finish";
		
		Assert.assertEquals(actualText, expectedText);
	}
	
	//Test 2:
	
	@When("the user clicks on the Appliances Category in the Winter Warmers")
	public void the_user_clicks_on_the_appliances_category_in_the_winter_warmers() {
	    CommonMethods.click(winter.appliancesCheckBox);
	}

	@Then("the user should be able to see the products from the Appliances Category in WW")
	public void the_user_should_be_able_to_see_the_products_from_the_appliances_category_in_ww() {
	    String actualText = winter.refineByText.getText();
	    String expectedText = "CATEGORY: APPLIANCES";
	    
	    Assert.assertEquals(actualText, expectedText);
	}
	
	//test 3:
	
	@When("the user clicks on the Germanica Brand in the Winter Warmers")
	public void the_user_clicks_on_the_germanica_brand_in_the_winter_warmers() {
	    CommonMethods.click(winter.germanicaCheckBox);
	}

	@Then("the user should be able to see the products from the Germanica Brand")
	public void the_user_should_be_able_to_see_the_products_from_the_germanica_brand() {
		String actualText = winter.refineByText.getText();
	    String expectedText = "BRAND: GERMANICA";
	    
	    Assert.assertEquals(actualText, expectedText);
	}
	
}
