package SeleniumWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseListener2 {
	public static void main (String [] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		// find no of frames
		List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		Thread.sleep(3000);
		//to find size of frame
		System.out.println("No.of frame Present:"+frame.size());
		
		//switching frame using index
		driver.switchTo().frame(0);
		
		//find dragable and doppebale element
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//using action class for  drag ad drop element
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(src, dest).build().perform();
		
	}

}
