package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginTest {
	WebDriver driver;
	Properties p;
	
  @Test
  public void login() {
	  
	  driver.findElement(By.name(p.getProperty("user"))).sendKeys("Admin");
      driver.findElement(By.id(p.getProperty("pass"))).sendKeys("admin123");
      driver.findElement(By.className(p.getProperty("butt"))).click();
      
      //checkpoint
      boolean found =driver.findElement(By.partialLinkText("Welcome")).isDisplayed();
      if(found)
      {
    	  System.out.println("Logged in successfully");
    	  
      }else
      {
    	  System.out.println("Not Logged in successfully");
      }
  }
  @BeforeTest
  public void launchBrowser() throws IOException {
	  //launch
	  System.setProperty("webdriver.chrome.driver","E:\\software\\chromedriver\\chromedriver.exe");
	   driver = new ChromeDriver();
	    
	    //implicit wait
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    //read properties file
	      p=new Properties();
	      FileInputStream f=new FileInputStream("C:\\Users\\Tathagat\\eclipse-workspace\\OrangeHRM\\Login.properties");
	      p.load(f);
	      
	      //open url
	      driver.get(p.getProperty("url"));
	      driver.manage().window().maximize();
  }

  @AfterTest
  public void logout() {
	//logout
      driver.findElement(By.partialLinkText(p.getProperty("wel"))).click();
     driver.findElement(By.linkText(p.getProperty("log"))).click();
      //close 
      driver.close();
  }

}

