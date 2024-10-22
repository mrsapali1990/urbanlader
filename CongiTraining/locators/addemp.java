package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;

public class addemp
{
	

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				
				//open url
				driver.get("http://demo.guru99.com/test/newtours/");
				driver.manage().window().maximize();
				 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				 
				 driver.findElement(By.name("txtPassword")).sendKeys("admin123");
				 driver.findElement(By.className("button")).click();
				 //click login button
				driver.findElement(By.id("menu_leave_viewLeaveModule"));
				 driver.findElement(By.partialLinkText("Welcome")).click();
				 
				 Thread.sleep(5000);
				 
				 driver.findElement(By.partialLinkText("Logout")).click();
				 driver.close();
				 
				 
				 

	}

}
