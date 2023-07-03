package Utilities;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class CommonMethods extends PageInitializer{

	static JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

	public static void sendKeys(WebElement element, String text) {

		element.clear();
		element.sendKeys(text);
	}

	// Wait Method:

	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	//---------------------RadioButton, CheckBoxes Looping through code------------------------

	public static void clickRadioOrCheckBox(List<WebElement> radioOrCheckBox, String yourValue) {

		String actualValue;

		for (WebElement eachElement : radioOrCheckBox) {

			actualValue = eachElement.getAttribute("value").trim();

			if (eachElement.isEnabled() && actualValue.equals(yourValue)) { // isEnabled == is clickable
				eachElement.click();
				break;
			}

		}

	}
	// --------------------------------Selects dropdown Value/static------------------------------//
	

	public static void selectDropDownByVisibleText(WebElement element, String textToSelect) {
		// element above is the element(XPath of the DropDown
		try {
			Select select = new Select(element); // element is the xpath for the select dropdown
			List<WebElement> options = select.getOptions(); // grabs all the options for the select // dropdown
			for (WebElement el : options) {
				if (el.getText().equals(textToSelect)) {
					select.selectByVisibleText(textToSelect);
					break;
				}
			}
		} catch (UnexpectedTagNameException e) { // we just dont put exception because
													// we are looking for one specific option
			e.printStackTrace();
		}

	}

	// -------------------------------select DropDown by Index--------------------------------//
	
	public static void selectDropDownIndex(WebElement element, int indexValue) {
		try {
			Select select = new Select(element); // element is the xpath for the select dropdown

			int size = select.getOptions().size();

			if (size > indexValue) {
				select.selectByIndex(indexValue);

			}

		} catch (UnexpectedTagNameException e) { // we just dont put exception because
													// we are looking for one specific option
			e.printStackTrace();
		}

	}

	// -------------------------Alert Method------------------------------//

	// alert accept
	public static void acceptAlert() {

		try {
			Alert alert = Driver.getDriver().switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	// ----------------------------alert dismiss--------------------//
	public static void dismissAlert() {
		try {
			Alert alert = Driver.getDriver().switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	// -----------------alert getText---------------
	public static String getTextAlert() {
		String text = null;
		try {
			Alert alert = Driver.getDriver().switchTo().alert();
			text = alert.getText();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		return text;
	}

	// switch to iframe by name, by index, by web element; 3 different methods.

	// window handles. create a method for that

	/*
	 * first 3 methods: switch iframe by index switch iframe by element switch
	 * iframe by name
	 * 
	 * 
	 * bonus method - windowhandles: switch from parent to child windows
	 */

	// --------------------------------switch iframe by
	// name------------------------------------//

	public static void switchToIframeByName(String iframeName) {
		try {
			Driver.getDriver().switchTo().frame(iframeName);
		} catch (NoSuchFrameException e) {
			// Handle the exception when the iframe with the specified name is not found
			System.out.println("Unable to switch to iframe by name: " + iframeName);
			e.printStackTrace();
		}
		// Driver.getDriver().switchTo().defaultContent();

	}

	// ---------------------------------switch To Iframe ByIndex--------------------------------------//
	public static void switchToIframeByIndex(int index) {
		try {
			Driver.getDriver().switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			// Handle the exception when the iframe with the specified index is not found
			System.out.println("Unable to switch to iframe by index: " + index);
			e.printStackTrace();
		}
		// Driver.getDriver().switchTo().defaultContent();

	}

	// -----------------------------------------switch To Iframe ByElement------------------------------
	public static void switchToIframeByElement(WebElement iframeElement) {
		try {
			Driver.getDriver().switchTo().frame(iframeElement);
		} catch (NoSuchFrameException e) {
			// Handle the exception when the specified iframe element is not found
			System.out.println("Unable to switch to iframe by element: " + iframeElement);
			e.printStackTrace();
		}

		// Driver.getDriver().switchTo().defaultContent();
	}

	// ------------------------switch from parent to child windows------------------------------------
	public static void switchToChildWindow(String parentWindowHandle) {
		try {
			// Get all window handles
			Set<String> windowHandles = Driver.getDriver().getWindowHandles();

			// Switch to the child window
			for (String handle : windowHandles) {
				if (!handle.equals(parentWindowHandle)) {
					Driver.getDriver().switchTo().window(handle);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Exception occurred while switching to child window: " + e.getMessage());
			e.printStackTrace();
		}
	}

	// ---------------------------------/Declare wait object method/--------------------------------------------
	public static WebDriverWait getWaitObject() {

		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Constants.explicit_wait_time);
		return wait;
	}

	// ---------------------------------Waiting before element is clickable wait method--------------------------
	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static WebElement waitForVisibility(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	//-------------------------Click & SendKeys-----------------------
	public static void click(WebElement element) {
		waitForVisibility(element).click();
	}

	public static void sendKeys(String keys,WebElement element) {
		waitForVisibility(element).sendKeys(keys);

	}
	//Above is the wait when clicking and when sending keys.
	
	//-------------------Hovering Mouse over an element---------------------
	
	public static void hoverOverMouse(WebElement element) {
		Actions action = new Actions(Driver.getDriver());
		
		action.moveToElement(element).build().perform();
			
	}
	//-------------------------------Drag & Drop----------------------//
	public static void dragAndDrop(WebElement element1,WebElement element2) {
		Actions action = new Actions(Driver.getDriver());
		action.dragAndDrop(element1, element2).build().perform();
	}
	
	//------------------------ATTENTION: This is just for the Products Section----------------------------//
	//This method is only used for the Products Testcase number 4!!!!!
	public static void productsDragAndDropByOffsetUntilConditionMet(WebElement element, WebElement element2) {
		Actions action = new Actions(Driver.getDriver());
		String lowSliderValueText = "";
		
		//System.out.println(lowSliderValueText);
		
		//products.minPrice.clear();
		//--------------
		CommonMethods.sendKeys("6", products.minPrice);
		
		action.sendKeys(Keys.ENTER);
		
		while(!(lowSliderValueText.equals("60.00"))) {
			//lowSliderValueText=Driver.getDriver().findElement(By.xpath("//div[@class='noUi-handle noUi-handle-lower']")).getAttribute("aria-valuetext");
			double i = 1;
			action.dragAndDropBy(element, (int) i, 0).perform();
			lowSliderValueText=products.increaseSliderAttribute.getAttribute("aria-valuetext");

			System.out.println(lowSliderValueText);			
		}
		
//		String highSliderValueText = "";
//		
//		Driver.getDriver().findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree\"]/div/div[3]/div[1]/div[2]/div/div/div[1]/input[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
//		//products.maxPrice.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
//		Driver.getDriver().findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree\"]/div/div[3]/div[1]/div[2]/div/div/div[1]/input[2]")).sendKeys("512");
//
//		//action.sendKeys(Keys.ENTER);
//		
//		while(!(highSliderValueText.equals("503.00"))) {
//			//lowSliderValueText=Driver.getDriver().findElement(By.xpath("//div[@class='noUi-handle noUi-handle-lower']")).getAttribute("aria-valuetext");
//			
//			action.dragAndDropBy(element2, -1, 0).perform();
//			highSliderValueText=Driver.getDriver().findElement(By.xpath("//div[@class='noUi-handle noUi-handle-upper']")).getAttribute("aria-valuetext");
//
//			System.out.println(highSliderValueText);			
//		}
		
		CommonMethods.removeKeysUsingBackSpace(products.maxPrice);
		CommonMethods.sendKeys("512", products.maxPrice);
		action.sendKeys(Keys.ENTER);
		while(!(lowSliderValueText.equals("500.00"))) {
			//lowSliderValueText=Driver.getDriver().findElement(By.xpath("//div[@class='noUi-handle noUi-handle-lower']")).getAttribute("aria-valuetext");
			double i = -1;
			action.dragAndDropBy(element2, (int) i, 0).perform();
			lowSliderValueText=products.decreaseSliderAttribute.getAttribute("aria-valuetext");

			System.out.println(lowSliderValueText);		
			
		}
	}

	//-------------------------------Double click an element----------------------//
	public static void doubleClick(WebElement element) {
		Actions action = new Actions(Driver.getDriver());
		action.doubleClick(element).perform();;
	}
	
public static void actionClickInListByText(List<WebElement> list, String text) {
        
        //Actions actions = new Actions(Driver.getDriver());
        
        for (int i =1; i< list.size();i++) {
        	
        	String brandText = Driver.getDriver().findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree\"]/div/div[3]/div[3]/div[2]/div/div[1]/div[2]/div/div/div/ul/li["+i+"]/button/span[2]")).getText();
                
                if (brandText.equalsIgnoreCase(text)) {
                    //actions.moveToElement(list.get(i)).perform();;
                    list.get(i).click();
                    break;
                }
                //js.executeScript("window.scrollBy(0,650)", "");

        }
    
    }

//public static void clickSpecificElementInListByText(List<WebElement> listOfWebElement,
//        String textOfSpecificElement) {
//
//
//    for (int i = 1; i < 30; i++) {
//    	
//    	//System.out.print(listOfWebElement.toString()+" ");
//    	
//    	CommonMethods.wait(5);
//
//    	String brandText = Driver.getDriver().findElement(By.xpath("//*[@id=\"boost-pfs-filter-tree\"]/div/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div/ul/li["+i+"]/button/span[2]")).getText();
//    	System.out.println(brandText+" ");
//        if (brandText.equals(textOfSpecificElement)) {
//            listOfWebElement.get(i).click();
//        }
//    }
// }

public static void clickSpecificElementInListByText(List<WebElement> listOfWebElement,
        String textOfSpecificElement) {

    String text;

    for (int i = 0; i < listOfWebElement.size(); i++) {

        text = listOfWebElement.get(i).getText();
        if (text.contains(textOfSpecificElement)) {
            listOfWebElement.get(i).click();
        }
    }

}



public static void removeKeysUsingBackSpace(WebElement element) {
	
	for(int i =0; i < 3; i++) {
    waitForVisibility(element).sendKeys(Keys.BACK_SPACE);
	}

}

public static void sendKeysUsingEnter(String keys,WebElement element) {
    waitForVisibility(element).sendKeys(keys, Keys.ENTER);

}
//Above is the wait when clicking and when sending keys.


	// Muatter's Test 
	

		public static void iterateDropdownOptions(WebElement dropdownElement) {
			
			Select dropdown = new Select(dropdownElement);
			WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
		//	WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
			SDPage.changeButton.click();
			SDPage.suburbField.clear();
			SDPage.calculatorButton.click();
			wait(3);
			
			for (WebElement option : dropdown.getOptions()) {
				wait.until(ExpectedConditions.elementToBeClickable(SDPage.changeButton));
				SDPage.changeButton.click();
				String selectedState = option.getAttribute("value");
				dropdown.selectByValue(selectedState);
				String postcode = getPostcodeForState(selectedState);
				SDPage.postcodeInputField.clear();
				//SDPage.postcodeInputField.sendKeys(postcode, Keys.ENTER);
				SDPage.postcodeInputField.sendKeys(postcode);

				wait.until(ExpectedConditions.elementToBeClickable(SDPage.calculatorButton));
				SDPage.calculatorButton.click();
				Assert.assertTrue(SDPage.cartSubTotalPrice.isDisplayed());
				
				WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
			
				try {
				    wait1.until(ExpectedConditions.elementToBeClickable(SDPage.changeButton));
				} catch (StaleElementReferenceException e) {
				    // Element reference is stale, re-locate the element and retry the click
				    SDPage.newChangeButton.click();
				}
			}

		}

		public static String getPostcodeForState(String state) {
			switch (state) {
			case "ACT":
				return "2600";

			case "NSW":
				return "2000";
			case "QLD":
				return "4000";
			case "SA":
				return "5000";
			case "VIC":
				return "3000";
			default:
				return "5000";

			}
		}
		
		public static void searchDragAndDropByOffset(WebElement element) {
            Actions action = new Actions(Driver.getDriver());
            String highSliderValueText = "";
            
            
            
            action.sendKeys(Keys.ENTER);
            
            while(!(highSliderValueText.equals("150.23"))) {
                
                int j = -1;
                action.dragAndDropBy(element, j, 0).perform();
                highSliderValueText=search.increaseSliderAttribute.getAttribute("aria-valuetext");

                System.out.println(highSliderValueText);            
            }
        }
		
	}

