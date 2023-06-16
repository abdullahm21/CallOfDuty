package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.Driver;
import Utilities.CommonMethods;

public class demoTest extends CommonMethods{

	@BeforeMethod
    public void setUp() {
        Driver.getDriver();
    }
	
	@Test
	public void demoTesting() throws InterruptedException {
		
		//about.wait();
		
		about.aboutButton.click();
		
		System.out.println("Success");
	}
	
}
