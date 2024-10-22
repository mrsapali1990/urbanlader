package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisplayedElementOnScreen {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.xpath("//input[@id=\"name\" ]"));
		WebElement male=driver.findElement(By.xpath("//input[@id=\"male\" ]"));
		WebElement female=driver.findElement(By.xpath("//input[@id=\"female\" ]"));
		if(name.isDisplayed())
		{
			name.sendKeys("my name is khan");
			System.out.println("element visible");
		}
		else
		{
			System.out.println("element not visible");
			
		}
		if(name.isEnabled())
		{
			name.sendKeys("tatahagata");
			System.out.println("element is enabled");
		}
		else
		{
			System.out.println("element not enabled");

			
		}
		male.click();
		
		if(male.isSelected())
		{
			
			System.out.println("option box selecated");
		}
		else
		{
			System.out.println("not selecated");
		}
		
		
	}
}
