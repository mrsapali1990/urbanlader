package SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseListener1 {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	//for mouseAction
	WebElement electronic =driver.findElement(By.xpath("//div[text()='Electronics']"));
	WebElement home=driver.findElement(By.xpath("//div[text()='Home']"));
	WebElement grocery=driver.findElement(By.xpath("//div[text()='Grocery']"));
	
	Actions act=new Actions(driver);
	act.moveToElement(electronic).build().perform();
	Thread.sleep(3000);
		
	//act.keyUp(electronic, Keys.ALT);// release control on electronic 
	//Thread.sleep(3000);
	
	act.contextClick(home).build().perform(); //right click
	Thread.sleep(3000);
	
	//for double click
	act.doubleClick(grocery).build().perform(); 
	Thread.sleep(3000);
	
	
	driver.close();
	
}
}
