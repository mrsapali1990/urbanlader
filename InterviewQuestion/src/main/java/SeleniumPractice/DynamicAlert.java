package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicAlert {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();	
		
		
       //using explicit wait
		
		try {
			
			WebElement alert=driver.findElement(By.xpath("//button[text()=\"Alera\"]"));
			alert.click();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 10); // Wait for up to 10 seconds
			
			if(wait.until(ExpectedConditions.alertIsPresent())==null)
			{
				System.out.println("alert is not present");
			}
			else
			{
				driver.switchTo().alert().accept();
				//or
				//driver.switchTo().alert().dismiss();
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			driver.quit();
		}
		
	}
}

