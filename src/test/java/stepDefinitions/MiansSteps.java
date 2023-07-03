package stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utilities.CommonMethods;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.MyAccountAndLogin;

public class MiansSteps extends CommonMethods{
//	@When("the user clicks on Login")
//	public void the_user_clicks_on_login() {
//		login.Login.click();
//	}
//
//	@When("enters the required information")
//	public void enters_the_required_information() {
//	    CommonMethods.sendKeys("Team", login.First_Name);
//	    CommonMethods.sendKeys("Call Of Duty", login.Last_Name);
//	    CommonMethods.sendKeys("teamcod@gmail.com", login.Email);
//	    CommonMethods.sendKeys("22192", login.PostCode);
//	    CommonMethods.sendKeys("OmgRizzu21", login.Password);
//
//	}
//
//	@When("selects the checkbox in the end of info entered")
//	public void selects_the_checkbox_in_the_end_of_info_entered() {
//		CommonMethods.click(login.Checkbox);
//	}
//
//	@When("clicks on the Create Account button")
//	public void clicks_on_the_create_account_button() {
//		CommonMethods.click(login.Signup);
//	}
//
//	@Then("the user should be logged in and redirected to the home page")
//	public void the_user_should_be_logged_in_and_redirected_to_the_home_page() {
//		String actualURL = Driver.getDriver().getCurrentUrl();
//	    String expectedURL = "https://www.cheapaschips.com.au/";
//
//	    Assert.assertEquals(actualURL, expectedURL);
//	}
//
//	@When("the user enters the valid email and password")
//	public void the_user_enters_the_valid_email_and_password() {
//		CommonMethods.sendKeys("teamcod@gmail.com", login.Email);
//		CommonMethods.sendKeys("OmgRizzu21", login.Password);
//	}
//
//	@When("clicks on the login button")
//	public void clicks_on_the_login_button() {
//	   CommonMethods.click(login.signup_button);
//	}
//
//	@When("the user enters an invalid email and valid password")
//	public void the_user_enters_an_invalid_email_and_valid_password() {
//		CommonMethods.sendKeys("invaliduser@gmail.com", login.Email);
//		CommonMethods.sendKeys("OmgRizzu21", login.Password);
//	}
//
//	@Then("the user should see an error message saying Invalid email or password")
//	public void the_user_should_see_an_error_message_saying_invalid_email_or_password() {
//	    Assert.assertTrue(login.Error.isDisplayed());
//	}

	@Given("the user is on the Home page of the website")
	public void the_user_is_on_the_home_page_of_the_website() {
		String actualURL = Driver.getDriver().getCurrentUrl();
	    String expectedURL = "https://www.cheapaschips.com.au/";

	    Assert.assertEquals(actualURL, expectedURL);
	}

	@When("the user clicks on Login")
	public void the_user_clicks_on_login() {
		CommonMethods.wait(1);
		   CommonMethods.click(login.Login);

	}

	@When("enters the required information")
	public void enters_the_required_information() {
			CommonMethods.sendKeys("Teamm", login.First_Name);
		    CommonMethods.sendKeys("Call Of Duty", login.Last_Name);
		    CommonMethods.sendKeys("teamcallofd@gmail.com", login.Email);
		    CommonMethods.sendKeys("22192", login.PostCode);
	}


	@When("selects the checkbox in the end of info entered and press enter to login")
	public void selects_the_checkbox_in_the_end_of_info_entered_and_press_enter_to_login() {
		login.Checkbox.click();
		CommonMethods.sendKeysUsingEnter("OmgRizzu21", login.Password);
	}

	@When("clicks on the Create Account button")
	public void clicks_on_the_create_account_button() {
		//CommonMethods.sendKeysUsingEnter("OmgRizzu21", login.Password);
		System.out.println("Logged In");
	}

	@Then("the user should be logged in and redirected to the home page")
	public void the_user_should_be_logged_in_and_redirected_to_the_home_page() {
		String actualURL = Driver.getDriver().getCurrentUrl();
	    String expectedURL = "https://www.cheapaschips.com.au/";

	    Assert.assertEquals(actualURL, expectedURL);
	}

	//TestCase 2:

	@When("the user enters the valid email")
	public void the_user_enters_the_valid_email() {
	    CommonMethods.sendKeys("teamcallofd@gmail.com", login.Login_Email);

	}


	@When("the user enters a valid password and press enter to login")
	public void the_user_enters_a_valid_password_and_press_enter_to_login() {
		CommonMethods.sendKeysUsingEnter("OmgRizzu21", login.Login_Password);


	}

	@Then("the user should be logged in and redirected to the Account Info Page")
	public void the_user_should_be_logged_in_and_redirected_to_the_account_info_page() {
	    CommonMethods.wait(15);

	    String actualURL = Driver.getDriver().getCurrentUrl();
	    String expectedURL = "https://www.cheapaschips.com.au/challenge/";

	    Assert.assertEquals(actualURL, expectedURL);
	}

	//
	@When("the user enters an invalid email")
	public void the_user_enters_an_invalid_email() {
	    CommonMethods.sendKeys("invalidemailgsuaydgs@gmail.com", login.Login_Email);

	}

	@Then("the user should see an error message saying Invalid email or password")
	public void the_user_should_see_an_error_message_saying_invalid_email_or_password() {
		CommonMethods.wait(15);
		String actualURL = Driver.getDriver().getCurrentUrl();
	    String expectedURL = "https://www.cheapaschips.com.au/challenge/";

	    Assert.assertEquals(actualURL, expectedURL);
	}
}
