package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;
public class NewReg
{
	

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				
				//open url
				driver.get("https://phptravels.org/");
				driver.manage().window().maximize();
				 driver.findElement(By.partialLinkText("Register")).click();
				 driver.findElement(By.name("firstname")).sendKeys("Tathagat");
				 driver.findElement(By.name("lastname")).sendKeys("WASNIK");
				 driver.findElement(By.name("email")).sendKeys("TP.WASNIKMP@GMAIL.COM");
				 driver.findElement(By.name("phonenumber")).sendKeys("9767331234");
				 
				 driver.findElement(By.name("companyname")).sendKeys("COGNIWIZE");
				 driver.findElement(By.name("address1")).sendKeys("REKHA COLONY");
				 driver.findElement(By.name("address2")).sendKeys("VMV ROAD");
				 driver.findElement(By.name("city")).sendKeys("AMRAVATI");
				 driver.findElement(By.name("state")).sendKeys("AMRAVATI");
				 
				 driver.findElement(By.name("postcode")).sendKeys("444604");
				 driver.findElement(By.name("customfield[2]")).sendKeys("9767331234");
				 driver.findElement(By.name("password")).sendKeys("Tat@12");
				 driver.findElement(By.name("password2")).sendKeys("Tat@12");
				// WebElement option1 = driver.findElement(By.id(""));
				// option1.click();
				// WebElement option1 = driver.findElement(By.id("vfb-6-0"));
				 
			       // fullName.sendKeys("Tathagat");
				// driver.findElement(By.id("firstname")).sendKeys("Tathagat");
				 
				// driver.findElement(By.name("txtPassword")).sendKeys("admin123");
				// driver.findElement(By.className("button")).click();
				 //click login button
				// driver.findElement(By.xpath("rc-anchor-logo-img rc-anchor-logo-img-portrait")).click();
				 
				// Thread.sleep(5000);
				 
				 driver.findElement(By.partialLinkText("Register")).click();
				driver.close();
				 
				 
				 

	}

}
