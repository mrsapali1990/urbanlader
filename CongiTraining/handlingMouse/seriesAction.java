package handlingMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class seriesAction {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("http://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		
		 String baseUrl = null;
		driver.get(baseUrl);
		 WebElement txtUsername = driver.findElement(By.id("email"));

		 Actions builder = new Actions(driver);
		 Action seriesOfActions = builder
		 	.moveToElement(txtUsername)
		 	.click()
		 	.keyDown(txtUsername, Keys.SHIFT)
		 	.sendKeys(txtUsername, "hello")
		 	.keyUp(txtUsername, Keys.SHIFT)
		 	.doubleClick(txtUsername)
		 	.contextClick()
		 	.build();
		 	
		 seriesOfActions.perform() ;
	}
}
