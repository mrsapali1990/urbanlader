package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewfacebookACCOUNT {
	public static void main(String [] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//click on Create new Account
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		// Click on Male Radio Button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		//Click on Female Radio Button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		//click on Custom Radio Button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
