package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base {
	@Test
	public void basePageNavigation() throws Exception
	{
	driver=initializeDriver();
	driver.get("http://qaclickacademy.com");
	LandingPage l=new LandingPage(driver);
    l.getLogin().click();   //same as driver.findelement(By.xpath()
	
	}

}
