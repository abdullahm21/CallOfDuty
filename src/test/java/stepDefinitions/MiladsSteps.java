package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utilities.CommonMethods;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.SearchBar;

public class MiladsSteps extends CommonMethods{

	@Given("the user is on the Home page")
	public void the_user_is_on_the_home_page() {
		String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://www.cheapaschips.com.au/";
        
        Assert.assertEquals(actualURL, expectedURL);
	}

	@When("the user write the desired item on search box")
	public void the_user_write_the_desired_item_on_search_box() {
	   
		CommonMethods.sendKeys("brush", search.searchTextBox);
		
	}

	

	@When("click on the desired item")
	public void click_on_the_desired_item() {

		Driver.getDriver().findElement(By.xpath("/html/body/div[3]/div[5]/div[1]/div/div[4]/div/div[2]/div/div[1]/div/div[1]/a")).click();

	}

	@Then("the user should be able to see the item")
	public void the_user_should_be_able_to_see_the_item() {
	    
		Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id=\"fulfillment\"]/div[2]/fieldset/div/div[1]/div/p")).isDisplayed());
	}
	
	@When("the user gets the search result")
	public void the_user_gets_the_search_result() {


		Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id=\"shopify-section-search-template-boost-pfs-filter\"]/div[1]/div/h1")).isDisplayed());
	}

	@When("mark the desired category")
	public void mark_the_desired_category() {
		List<WebElement> category = Driver.getDriver().findElements(By.xpath("//*[@id=\"boost-pfs-filter-tree\"]/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/ul/li"));
        //System.out.println(brandList.toString());                                           //*[@id="boost-pfs-filter-tree"]/div/div[3]/div[3]/div[2]/div/div[1]/div[2]/div/div/div/ul/li[19]/button/span[2]    
CommonMethods.clickSpecificElementInListByText(category, "Adults");
	}

	@Then("the user should be able to see the result of seleced category")
	public void the_user_should_be_able_to_see_the_result_of_seleced_category() {
		Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id=\"fulfillment\"]/div[2]/fieldset/div/div[1]/div/p")).isDisplayed());

	}
	@When("mark the desired brand")
	public void mark_the_desired_brand() {
		List<WebElement> brand = Driver.getDriver().findElements(By.xpath("//*[@id=\"boost-pfs-filter-tree\"]/div/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/ul/li"));
        //System.out.println(brandList.toString());                                           //*[@id="boost-pfs-filter-tree"]/div/div[3]/div[3]/div[2]/div/div[1]/div[2]/div/div/div/ul/li[19]/button/span[2]    
CommonMethods.clickSpecificElementInListByText(brand, "Others");
	}
	    

	@Then("the user should be able to see the result of seleced brand")
	public void the_user_should_be_able_to_see_the_result_of_seleced_brand() {
	   
		System.out.println("Working");
	}

	//
	@When("the user adjust the slider to specific price")
	public void the_user_adjust_the_slider_to_specific_price() {
	   CommonMethods.searchDragAndDropByOffset(search.moveSlider);
	}

	@Then("the user should be able to see the result for selected price")
	public void the_user_should_be_able_to_see_the_result_for_selected_price() {

		String expectedText = "PRICE: $2 - $151";
		String actualText = Driver.getDriver().findElement(By.xpath("//*[@id=\"shopify-section-search-template-boost-pfs-filter\"]/div[4]/div/div[1]/div[1]/div/div[2]/div/a/span")).getText();

		Assert.assertEquals(actualText, expectedText);
	}

	//Milad
	
}
