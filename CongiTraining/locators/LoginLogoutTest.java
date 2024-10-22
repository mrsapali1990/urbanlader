package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;

public class LoginLogoutTest
{
	

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		
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
	
				 driver.findElement(By.partialLinkText("Welcome")).click();
				 
				 Thread.sleep(5000);
				 
		//click on logout button
				 
				 driver.findElement(By.partialLinkText("Logout")).click();
				 driver.close();
				 
				 
				 

	}

}
