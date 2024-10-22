package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage1 {
	public static void main (String [] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("m.wasnik@gmail.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("SHRIMILINDRAJ");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@id='u_0_9_7J']")).click();
		//driver.findElement(By.xpath("//a[@id='u_0_0_4d']")).click();
		driver.close();
		
	}

}
