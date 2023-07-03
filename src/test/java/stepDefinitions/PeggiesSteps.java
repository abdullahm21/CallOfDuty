package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utilities.CommonMethods;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class PeggiesSteps extends CommonMethods {

    @Given("I am on the Chip As Cheap home page")
    public void i_am_on_the_Chip_As_Cheap_home_page() {
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://www.cheapaschips.com.au/";

        Assert.assertEquals(actualURL, expectedURL);
    }

    @When("user clicks on Login")
    public void the_user_clicks_on_login() {
        CommonMethods.wait(1);
        CommonMethods.click(login.Login);
    }

    @Given("I have entered a valid username and password")
    public void i_have_entered_a_valid_username_and_password() {
        CommonMethods.sendKeys("jomnakorn4@gmail.com", login.Login_Email);
        CommonMethods.sendKeys("Vdvgvega1!", login.Login_Password);

    }

    @Given("I have entered invalid {string} and {string}")
    public void i_have_entered_invalid_and(String username, String password) {
        CommonMethods.sendKeys("invalid@email.com", login.Login_Email);
        CommonMethods.sendKeys("invalidPassword", login.Login_Password);
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button(){
        CommonMethods.click(login.login_button);
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully(){
        CommonMethods.wait(15);
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://www.cheapaschips.com.au/challenge/";
        Assert.assertEquals(actualURL, expectedURL);
    }

    @Then("I should see an error message indicating {string}")
    public void i_should_see_an_error_message_indicating(String errorMessage) {
        CommonMethods.wait(15);
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://www.cheapaschips.com.au/challenge/";

        Assert.assertEquals(actualURL, expectedURL);
    }

    @Given("I click on forgot the password? and enter an valid email")
    public void iClickOnForgotThePasswordAndEnterAnValidEmail() {
        CommonMethods.click(login.Forgot_Password);
        CommonMethods.wait(1);
        CommonMethods.sendKeys("jomnakorn4@gmail.com", login.Recover_Email);

    }

    @When("I click on submit button")
    public void iClickOnSubmitButton() {
        CommonMethods.click(login.submit_button);
    }

    @Then("I should be redirected to the login page")
    public void iShouldBeRedirectedToTheLoginPage() {
        CommonMethods.wait(15);
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://www.cheapaschips.com.au/account/login";

        Assert.assertEquals(actualURL, expectedURL);
    }

    @Given("I have entered valid information")
    public void iHaveEnteredValidInformation() {
        CommonMethods.sendKeys("Teamm", login.First_Name);
        CommonMethods.sendKeys("Call Of Duty", login.Last_Name);
        CommonMethods.sendKeys("teamcallofd@gmail.com", login.Email);
        CommonMethods.sendKeys("22192", login.PostCode);
    }

    @And("Check the checkbox in the end and press enter to login")
    public void checkTheCheckboxInTheEndAndPressEnterToLogin() {
        login.Checkbox.click();
        CommonMethods.sendKeysUsingEnter("OmgRizzu21", login.Password);
    }

    @Then("User should be logged in and redirected to the home page")
    public void userShouldBeLoggedInAndRedirectedToTheHomePage() {
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://www.cheapaschips.com.au/";

        Assert.assertEquals(actualURL, expectedURL);
    }
}


