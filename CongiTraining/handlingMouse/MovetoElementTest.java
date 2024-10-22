package handlingMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MovetoElementTest {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://istqb.in/");
		 driver.manage().window().maximize();
		 
		 // handle dynamic menu
		 Action act=(Action) new Actions(driver);
		 Thread.sleep(10000);
		 WebElement  we=driver.findElement(By.linkText("AUTOMOTIVE TESTER"));
		 ((Actions) act).moveToElement(we).build().perform();
		 
		 
		 
		 
	}

	

}
