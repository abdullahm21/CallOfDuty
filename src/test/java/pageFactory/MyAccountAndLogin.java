package pageFactory;

import Utilities.CommonMethods;
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

	@FindBy(xpath = "//*[@id=\"customer_login\"]/div[3]/div/button")
	public WebElement login_button;

	@FindBy(xpath = "//*[@id=\"customer_login\"]/p/a")
	public  WebElement Forgot_Password;

	@FindBy(xpath = "//*[@id=\"RecoverEmail\"]")
	public WebElement Recover_Email;

	@FindBy(xpath = "//*[@id=\"recover-password\"]/div[2]/form/div[2]/p/input")
	public WebElement submit_button;
}

	// Locators

//	private WebDriver driver;
//	private By emailInputLocator = By.xpath("//*[@id=\"email\"]");
//	private By passwordInputLocator = By.xpath("/html/body/div[3]/div[5]/div[1]/div/div/div[2]/div[1]/div/div[1]/form/div[2]/input");
//	private By loginButtonLocator = By.xpath("//*[@id=\"customer_login\"]/div[3]/div/button");
//	private By forgottenPasswordLinkLocator = By.xpath("//*[@id=\"customer_login\"]/p/a");
//	private By logoutLinkLocator = By.xpath("//*[@id=\"MainContent\"]/div[2]/div/div[1]/div[2]/span[6]");
//
//
//	// Constructor
//	public MyAccountAndLogin(WebDriver driver) {
//		this.driver = driver;
//	}
//
//	// Methods
//	public void enterEmail(String email) {
//		WebElement emailInput = driver.findElement(emailInputLocator);
//		emailInput.sendKeys(email);
//	}
//
//	public void enterPassword(String password) {
//		WebElement passwordInput = driver.findElement(passwordInputLocator);
//		passwordInput.sendKeys(password);
//	}
//
//	public void clickLoginButton() {
//		WebElement loginButton = driver.findElement(loginButtonLocator);
//		loginButton.click();
//	}
//
//	public void clickForgottenPasswordLink() {
//		WebElement forgottenPasswordLink = driver.findElement(forgottenPasswordLinkLocator);
//		forgottenPasswordLink.click();
//	}
//
//	public boolean checkForgotPwdLink(){
//		return driver.findElement(forgottenPasswordLinkLocator).isDisplayed();
//	}
//
//	public boolean checkLogoutLink(){
//		CommonMethods.wait(5);
//		return driver.findElement(logoutLinkLocator).isDisplayed();
//	}
//
//	public void login(String email, String password) {
//		enterEmail(email);
//		enterPassword(password);
//		clickLoginButton();
//	}
//
//	public String getForgotPwdPageUrl(){
//		String forgotPwdPageUrl = driver.getCurrentUrl();
//		return forgotPwdPageUrl;
//	}
//	public static void main(String[] args) {
//		// Set the path to the ChromeDriver executable
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\peak_\\Documents\\GitHub\\CallOfDuty\\src\\test\\java\\chromedriver.exe");
//
//		// Create a new instance of the ChromeDriver
//		WebDriver driver = new ChromeDriver();
//
//		// Initialize MyAccountAndLogin using the WebDriver
//		MyAccountAndLogin myAccount = new MyAccountAndLogin(driver);
//
//		// Navigate to the login page
//		driver.get("https://www.cheapaschips.com.au/account/login");
//
//		// Test Case: Successful Login
//		myAccount.login("jomnakorn4@gmail.com", "Vdvgvega1!");
//
//		// Verify successful login
//		boolean isLogoutLinkDisplayed = myAccount.checkLogoutLink();
//		if (isLogoutLinkDisplayed) {
//			System.out.println("Login was successful. Logout link is displayed.");
//		} else {
//			System.out.println("Login was not successful.");
//		}
//
//		// Test Case: Forgot Password
//		myAccount.clickForgottenPasswordLink();
//
//		// Verify the forgot password link is displayed
//		boolean isForgotPasswordLinkDisplayed = myAccount.checkForgotPwdLink();
//		if (isForgotPasswordLinkDisplayed) {
//			String forgotPwdPageUrl = myAccount.getForgotPwdPageUrl();
//			System.out.println("Forgot password link is displayed. Forgot Password Page URL: " + forgotPwdPageUrl);
//		} else {
//			System.out.println("Forgot password link is not displayed.");
//		}
//
//		// Quit the WebDriver instance
//		driver.quit();
//	}
//
//}





















