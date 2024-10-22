package SeleniumPractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardMultipleActions {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		WebElement text1=driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]"));
		WebElement text2=driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]"));
		text1.sendKeys("My name is Khan");
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		//pressing tab key shift to text2 box
		act.sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		//compairing text
		
		if(text1.getAttribute("value").equals(text2.getAttribute("value")))
		{
			System.out.println("Text copied");
		}
		else
		{
			System.out.println("Text not copied");
		}	
		
		
}
}