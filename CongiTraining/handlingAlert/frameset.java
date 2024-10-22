package handlingAlert;


	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
	public class frameset
	{
	   public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			//Open url
			driver.get("https://demoqa.com/frames");
			
			//By executing a java script
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
			System.out.println("Number of iframes on the page are " + numberOfFrames);
			
			//By finding all the web elements using iframe tag
			List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
			System.out.println("The total number of iframes are " + iframeElements.size());
			
			//Switch by Index
			driver.switchTo().frame(0);
			driver.quit();
			
			//Switch by frame name
			driver.switchTo().frame("iframe1");
			driver.quit();
			
			//Switch by frame ID
			driver.switchTo().frame("IF1");
			driver.quit();
			
			String iframeElement = null;
			//now use the switch command
			driver.switchTo().frame(iframeElement);
			driver.quit();
			
			//now use the switch command
			driver.switchTo().frame(0);
			driver.switchTo().defaultContent();
			driver.quit();
	   }
	}