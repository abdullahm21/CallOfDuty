package pageFactory;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Utilities.Driver;

public class MyAccountAndLogin {

	
	public MyAccountAndLogin() {
		PageFactory.initElements(Driver.getDriver(), this);



	
//		        // Set the path to the chromedriver executable
//		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//
//		        // Create a new instance of ChromeDriver
//		        WebDriver driver = new ChromeDriver();
//
//		        // Open the website
//		        driver.get("https://www.cheapaschips.com.au/");
//
//		        // Click on the My Account link
//		        WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
//		        myAccountLink.click();
//
//		        // Find the login form elements and enter the credentials
//		        WebElement usernameField = driver.findElement(By.id("username"));
//		        WebElement passwordField = driver.findElement(By.id("password"));
//		        WebElement loginButton = driver.findElement(By.name("login"));
//
//		        usernameField.sendKeys("your_username");
//		        passwordField.sendKeys("your_password");
//		        loginButton.click();
//
//		        // Perform assertions or further actions after login
//
//		        // Close the browser
//		        driver.quit();
		    }
	
		@FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div/div[2]/ul/li[1]/a")
		public WebElement Login;
		
		@FindBy(xpath = "//*[@id=\"create_customer\"]/div[1]/input")
		public WebElement First_Name;
		
		@FindBy(xpath = "//*[@id=\"create_customer\"]/div[2]/input")
		public WebElement Last_Name;
		
		@FindBy(xpath = "//*[@id=\"create_customer\"]/div[3]/input")
		public WebElement Email;
		
		@FindBy(xpath = "//*[@id=\"create_customer\"]/div[5]/input")
		public WebElement PostCode;
		
		@FindBy(xpath = "/html/body/div[3]/div[5]/div[1]/div/div/div[2]/div[2]/div/form/div[8]/input")
		public WebElement Password;
		
		@FindBy(xpath = "//*[@id=\"flexCheckChecked\"]")
		public WebElement Checkbox;
		
		@FindBy(xpath = "//*[@id=\"create_customer\"]/p/input")
		public WebElement Signup;
		
		//--------------------------------------------------------------------------//
		
		
		
		@FindBy(xpath = "//*[@id=\"email\"]")
		public WebElement Login_Email;
		
		@FindBy(xpath = "/html/body/div[3]/div[5]/div[1]/div/div/div[2]/div[1]/div/div[1]/form/div[2]/input")
		public WebElement Login_Password;
		
		
		@FindBy(xpath = "//*[@id=\"customer_login\"]/div[3]/div/button")
		public WebElement signup_button;
		
		@FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/ul/li")
		public WebElement Error;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

