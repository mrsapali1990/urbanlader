package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {
	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//Scroll down a window
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,500)");
		WebElement doubleClick=driver.findElement(By.xpath("//button[text()=\"Copy Text\"]"));
		//WebElement mac=driver.findElement(By.xpath("(//a[@class=\"nav-link\"])[2]"));
		//right click opeartion using context click
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.doubleClick(doubleClick).build().perform();
		//driver.close();
		}
}
