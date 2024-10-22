package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

public class parallelTest1 {
	public WebDriver driver;
        @Test
        public void FirefoxTest() {	 
            //Initializing the firefox driver (Gecko)
        	
	    driver = new FirefoxDriver();
	    System.setProperty("webdriver.gecko.driver",
				"E:\\software\\Firefoxdriver\\geckodriver.exe");
	    driver.get("https://www.demoqa.com"); 
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	    driver.quit();
         }
 
        @Test
 	public void ChromeTest()
 	{ 
	  //Initialize the chrome driver
        	 System.setProperty("webdriver.chrome.driver","E:\\software\\chromedriver\\chromedriver.exe");
  		   driver = new ChromeDriver();
	  
	  driver.get("https://www.demoqa.com"); 
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	  driver.quit();
 	}
}