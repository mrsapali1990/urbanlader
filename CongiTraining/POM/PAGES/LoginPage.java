package POM.PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public static WebElement uname,pass,LogButt;
	public static WebElement getUname()
	{
		
		uname=POM.CONFIGURATION.Driver.driver.findElement(By.id("txtUsername"));
				return uname;
		
			
	}
	
	public static WebElement getPass()
	{
		
		pass=POM.CONFIGURATION.Driver.driver.findElement(By.id("txtPassword"));
				return pass;
		
	}
	public static WebElement getLogButt()
	{
		
		LogButt=POM.CONFIGURATION.Driver.driver.findElement(By.id("txtPassword"));
		return LogButt;
}
}
