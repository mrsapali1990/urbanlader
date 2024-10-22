package handlingAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleFrames {

	public static void main(String[] args) 
	{
		//launch
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//Open url
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		
		//handle frames
		//using frame index
		driver.switchTo().frame(2);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		//switch to frame by id or name
		driver.switchTo().frame("google_esf");
		System.out.println(driver.findElement(By.linkText("Home")).isDisplayed());
		
	//Switch backto parent frame
		driver.switchTo().defaultContent();
		
		//switch to webelement
		WebElement frameElement=driver.findElement(By.name("Below is an iFrame. If you want to perform any operation in this window, you will need to enter in this iframe."));driver.switchTo().frame(frameElement);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		//close
		driver.close();
		
		
		

	}

}
