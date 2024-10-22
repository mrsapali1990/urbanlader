package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginfacebook {
	public static void main (String [] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("m.wasnik@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sHRIMILINDRAJ");
		driver.findElement(By.xpath("//button[@value='1']")).click();
		//driver.close();
		
	}


}
