package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Utilities.CommonMethods;
import Utilities.Driver;
import io.cucumber.java.en.*;

public class AbdullahsSteps extends CommonMethods{

	JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	Actions action = new Actions(Driver.getDriver());
	
	@Given("the user is on the Home page")
	public void the_user_is_on_the_home_page() {
	    String actualURL = Driver.getDriver().getCurrentUrl();
	    String expectedURL = "https://www.cheapaschips.com.au/";
	    
	    Assert.assertEquals(actualURL, expectedURL);
	}

	@When("the user hovers over Products in Navigation Bar")
	public void the_user_hovers_over_products_in_navigation_bar() {
		CommonMethods.hoverOverMouse(products.productsSection);
	}
	
	@When("the user clicks on Clothing section and selects the clothing Item")
	public void the_user_clicks_on_clothing_section_and_selects_the_clothing_item() {
	    // Write code here that turns the phrase above into concrete actions
	    products.clothing.click();
	    
	    js.executeScript("window.scrollBy(0,50)", "");
	    products.clothingItem.click();
	}
//	Test Case 1:
	@When("clicks on the Change Store and Changes their location")
	public void clicks_on_the_change_store_and_changes_their_location() {
	    products.changeStore.click();
	    js.executeScript("window.scrollBy(0,300)", "");
	    products.makeMyStore.click();
	}

	@When("Click & Collect Item for their designated location")
	public void click_collect_item_for_their_designated_location() {
	    
		products.clickAndCollect.click();
		products.closeButton.click();
	}

	@Then("the user should be able to see their store location on the top right.")
	public void the_user_should_be_able_to_see_their_store_location_on_the_top_right() {
		
		String expectedText="Murray Bridge";
		String actualText=Driver.getDriver().findElement(By.xpath("//span[@class='product-stock__store-name p_currentstore']")).getText();
		Assert.assertEquals(actualText, expectedText);;
	}
	
	//Test Case 2:
	
	@When("the user adds the item to their cart and then close the popup")
	public void the_user_adds_the_item_to_their_cart_and_then_close_the_popup() {
		   CommonMethods.click(products.addToCart);
		   products.closeButton.click();

	}

	@When("views the cart and then removes the item from there")
	public void views_the_cart_and_then_removes_the_item_from_there() {
		CommonMethods.click(products.cartButton);
		CommonMethods.click(products.viewCart);
		CommonMethods.click(products.removeFromCart);

	}

	@Then("the user should see a message that the Cart is empty")
	public void the_user_should_see_a_message_that_the_cart_is_empty() {
	    String actualText = Driver.getDriver().findElement(By.xpath("//p[@class='cart_empty']")).getText();
	    String expectedText = "YOUR CART IS CURRENTLY EMPTY.";
	    Assert.assertEquals(actualText, expectedText);;
	}
	
	//TestCase 3:
	
	
	@When("the user clicks on Grocery section")
	public void the_user_clicks_on_grocery_section() {
	    CommonMethods.click(products.grocery);
	}

	@When("the user selects Grocery from the Category")
	public void the_user_selects_grocery_from_the_category() {
		js.executeScript("window.scrollBy(0,150)", "");
	    CommonMethods.click(products.groceryCategoryButton);
	}

	@When("the user selects Cavendish and Harvey from the brand")
	public void the_user_selects_cavendish_and_harvey_from_the_brand() throws InterruptedException {
		js.executeScript("window.scrollBy(0,550)", "");
		//Thread.sleep(3000);
		List<WebElement> brandList = Driver.getDriver().findElements(By.xpath("//*[@id=\"boost-pfs-filter-tree\"]/div/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div/ul/li"));
							//System.out.println(brandList.toString());										   //*[@id="boost-pfs-filter-tree"]/div/div[3]/div[3]/div[2]/div/div[1]/div[2]/div/div/div/ul/li[19]/button/span[2]	
		CommonMethods.clickSpecificElementInListByText(brandList, "Cavendish & Harvey");
		System.out.println();
	}

	@Then("the user should see the Products only from the selected options")
	public void the_user_should_see_the_products_only_from_the_selected_options() {
	    
	    action.sendKeys(Keys.PAGE_UP).build().perform();

	    String expectedText = "CATEGORY: GROCERY";
	    String actualText = Driver.getDriver().findElement(By.xpath("//div[@class='boost-pfs-filter-refine-by-items']/div[1]/a/span")).getText();
	    Assert.assertEquals(actualText, expectedText);
	    
	    String expectedText2 = "BRAND: CAVENDISH & HARVEY";
	    					  //Brand: Cavendish & Harvey	
	    String actualText2 = Driver.getDriver().findElement(By.xpath("//div[@class='boost-pfs-filter-refine-by-items']/div[2]/a/span")).getText();
	    Assert.assertEquals(actualText2, expectedText2);
	}
	
	//test 4
	
	@When("the user clicks on Electrical section")
	public void the_user_clicks_on_electrical_section() {
	    CommonMethods.click(products.electrical);
	}
							      //and the max/min prices textboxes 
	@When("the user uses the Slider and the max\\/min prices textboxes to adjust the high and low Price")
	public void the_user_uses_the_slider_and_the_max_min_prices_textboxes_to_adjust_the_high_and_low_price() {
		//action.dragAndDropBy(Driver.getDriver().findElement(By.xpath("//div[@class='noUi-handle noUi-handle-lower']/div")), 140,0).perform();
		CommonMethods.productsDragAndDropByOffsetUntilConditionMet(products.increaseSlider, products.decreaseSlider);
		}
	//div[@class='noUi-handle noUi-handle-lower']/div
	@Then("the user should see the Products only from the selected price range")
	public void the_user_should_see_the_products_only_from_the_selected_price_range() {
		String expectedText = "PRICE: $60 - $500";
							 //Price: $60 - $500  
	    String actualText = Driver.getDriver().findElement(By.xpath("//div[@class='boost-pfs-filter-refine-by-items']/div[1]/a/span")).getText();
	    Assert.assertEquals(actualText, expectedText);
	    
	}
	
}
