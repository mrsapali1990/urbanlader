package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// org.openqa.selenium.support.ui.Select;

public class DropDown4 {
	public static void main(String [] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		WebElement bm=driver.findElement(By.xpath("//select[@id='month']"));
		//Select sm=new Select(bm);
		Thread.sleep(3000);
		bm.sendKeys("March");
		Thread.sleep(3000);
		driver.close();
		
	}

}
