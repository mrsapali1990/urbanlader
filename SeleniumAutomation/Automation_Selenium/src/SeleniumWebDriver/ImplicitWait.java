package SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// for email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("m.wasnik@gmail.com");
		//for password
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("SHRIMILINDRAJ");
		//for login
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
