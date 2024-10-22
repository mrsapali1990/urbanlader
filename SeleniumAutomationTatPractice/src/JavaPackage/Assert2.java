package JavaPackage;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Assert2 {
	@Test
	
	public void assertionTestCase() throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\software\\Chromedrivernew\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
				driver.get("https://www.irctc.co.in");
				driver.manage().window().maximize();//It will maximize the window
				Thread.sleep(5000);//For Entering the Captcha before 5sec
			
				driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
				 driver.switchTo().alert().accept();
				 Robot robot = new Robot();
				 robot.delay(5000);
				 robot.keyPress(KeyEvent.VK_TAB);
				 robot.keyPress(KeyEvent.VK_ENTER);
//				driver.switchTo().alert().dismiss();
//				driver.switchTo().alert().accept();
//				Alert simpleAlert = driver.switchTo().alert();
//			    simpleAlert.accept();
//				Alert confirmationAlert = driver.switchTo().alert();
//				  String alertText = confirmationAlert.getText();
//				Actions().sendKeys(Keys.ESCAPE).build().perform();
//				browser.keys("Escape"); 

				    }
				
				
				
	}
	
	
	


