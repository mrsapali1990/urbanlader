package SeleniumPractice;

import java.awt.Window;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxHandling {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		
		//driver.findElement(By.xpath("//input[@id=\"sunday\"]")).click();
		List<WebElement> days=driver.findElements(By.xpath("//input[@type=\"checkbox\" and @class=\"form-check-input\" ]"));
		System.out.println("Size of Days"  +days.size());
		
		//select all checkBoxes
//		for(int i=0;i<days.size();i++)
//		{
//			days.get(i).click();
//			System.out.println(days.get(i).isSelected());	
//			
//			
//		}
		//select multiple checkboxses by choice
//		for(WebElement day:days)
//		{
//			String chkBoxName=day.getAttribute("id");
//			if(chkBoxName.equals("sunday")||chkBoxName.equals("tuesday"))
//			{
//				day.click();
//			}
//		}
		//select first few no of checkboxes
		
//		for(int i=0;i<days.size();i++)
//		{
//			if(i<3)
//			{
//				days.get(i).click();
//			}
//		}
		//select last few checkboxes
		
		for(int i=days.size()-2;i<days.size();i++)
		{
			days.get(i).click();
		}
		
		
}}
