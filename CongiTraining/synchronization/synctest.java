package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synctest 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException
	{
				
		//launch Url
				System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				
		//implicit wait
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
		//open url
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.manage().window().maximize();
				
		//enter data in  username and password
				 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				 driver.findElement(By.name("txtPassword")).sendKeys("admin123");
				 
		//click on login button
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
				driver.findElement(By.xpath("//div[@id=\"divPassword\"]/input")).sendKeys("admin123");
				driver.findElement(By.xpath("//*[@id=\"divLoginButton\"]/input")).click();
				 
		//click on logout button
				 
				 //driver.findElement(By.partialLinkText("Logout")).click();
				 
		//explicit wait
				 WebDriver wait= (WebDriver) new WebDriverWait(driver,30);
				 ((FluentWait<WebDriver>) wait).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logout")));
				 driver.findElement(By.linkText("Logout")).click();
		//close browser
				 driver.close();
				 
	}

}
