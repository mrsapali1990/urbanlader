package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class longtoint {

	public static void main(String[] args)
	{
		
//launch Url
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
//open url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
//enter data in  username and password
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 
		 driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		 
//click on login button
		 driver.findElement(By.className("button")).click();
		 
//load timing
		 long startTime=System.currentTimeMillis();
		 System.out.println(startTime);
		 long seconds=(startTime/1000);
		 
		 //logout
		 driver.findElement(By.partialLinkText("Welcome")).click();
		 
		 //explicit wait
		 WebDriver wait= (WebDriver) new WebDriverWait(driver,30);
		 ((FluentWait<WebDriver>) wait).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logout")));
		 driver.findElement(By.linkText("Logout")).click();
		 
		 driver.findElement(By.linkText("ogo")).click();
		 driver.close();
		 
		 


	}

}
