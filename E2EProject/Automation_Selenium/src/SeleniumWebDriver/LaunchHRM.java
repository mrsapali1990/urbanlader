package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchHRM {
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("txtUsername"));
		 WebElement pass=driver.findElement(By.id("txtPassword"));
		 WebElement submit=driver.findElement(By.id("btnLogin"));
		 username.sendKeys("Admin");
		 pass.sendKeys("admin123");
		 submit.click();
		/* driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		 driver.findElement(By.id("menu_admin_UserManagement")).click();
		 driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Feroj");
		 driver.findElement(By.id("searchBtn")).click();
		 driver.findElement(By.xpath("//a[normalize-space()='Feroj']")).click();
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		//driver.manage().window().maximize();
		//driver.close();*/
		
		
	}

}
