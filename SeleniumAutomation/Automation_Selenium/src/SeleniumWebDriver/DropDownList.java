package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {
	public static void main(String [] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		//select DropDown list 
		WebElement birtmonth=driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(3000);
		// create Select Constructor  pass argument as webelement
		Select month=new Select(birtmonth);
		
		System.out.println(month.getFirstSelectedOption().getText()); //display default select value
		Thread.sleep(3000);
		month.selectByIndex(5);  // June
		Thread.sleep(3000);
		month.selectByValue("12");  //December 
		Thread.sleep(3000);
		month.selectByVisibleText("Mar"); // march
		Thread.sleep(3000);
		birtmonth.sendKeys("May");
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
	}

}
