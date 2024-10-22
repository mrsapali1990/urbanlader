package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class validateNavigationBar extends base {
	WebDriver driver;
	
	@BeforeTest
	public void initialize() throws Exception
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}


	@Test

	public void basePageNavigation() throws IOException
	{
		//one is inheritance
		// creating object to that class and invoke methods of it
		LandingPage l=new LandingPage(driver);
		//compare the text from the browser with actual text.- Error..
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		//	 log.info("Successfully validated Text message");
		//	 System.out.println("Test completed");

	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	

}
