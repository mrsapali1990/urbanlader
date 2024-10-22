package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	By signin =By.xpath("//span[normalize-space()='Login']");
	By title=By.xpath("//h2[normalize-space()='Featured Courses']");
	By NavBar=By.xpath("//div[@role='navigation']");
	
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}


	

	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}
	

}
