package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GmailPriority {
WebDriver driver;
Properties p;

@Test(priority=2)
public void clickGmail() {
	  driver.findElement(By.linkText("Gmail")).click();
	  
	  
}
@Test(priority=1)
public void clickImage() {
	  driver.findElement(By.linkText("Image")).click();
}
	  

	

@BeforeMethod
public void printTitle()  {
	 
	  System.out.println(driver.getTitle());
}

@AfterMethod
public void navigateBack() {
	  System.out.println(driver.getTitle());
	  driver.navigate().back();
	  
}

@BeforeTest
public void launchBrowser() throws IOException {
	  System.setProperty("webdriver.chrome.driver","E:\\software\\chromedriver\\chromedriver.exe");
	   driver = new ChromeDriver();
	 //implicit wait
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    //read properties file
	      p=new Properties();
	      FileInputStream f=new FileInputStream("C:\\Users\\Tathagat\\eclipse-workspace\\OrangeHRM\\Login.properties");
	      p.load(f);
	      
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
	  
}

@AfterTest
public void closeBroweser() {
	  
	  driver.close();
}

}
