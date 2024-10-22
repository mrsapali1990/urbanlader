package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {
	public static void main(String [] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		//email id through javaScript one way
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//one way
		//jse.executeScript("document.getElementById('email').value='m.wasnik@gmail.com'");
		//Thread.sleep(3000);
		
		//second way
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		jse.executeScript("arguments[0].value='m.wasnik@gmail.com'", email);
		Thread.sleep(3000);
		
			
		//scroll down
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		
		//scroll up
		jse.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(3000);
		
		//create new Account
		WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		jse.executeScript("arguments[0].click()",createNewAccount);
		Thread.sleep(3000);
		
		//select mail radio button
		WebElement mailRadio =driver.findElement(By.xpath("//input[@value='2']"));
		jse.executeScript("arguments[0].click()",mailRadio);
		Thread.sleep(3000);
	}

}
