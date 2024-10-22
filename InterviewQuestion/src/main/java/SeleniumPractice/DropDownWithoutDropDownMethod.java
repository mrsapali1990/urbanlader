package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutDropDownMethod {
	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@id,\"u_0_0\")]")).click();
		Thread.sleep(2000);
		WebElement monthDrp=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select month=new Select(monthDrp);
		List<WebElement> allOptions=month.getOptions();
		
		for(WebElement options:allOptions)
		{
			if(options.getText().equals("Mar"))
			{
				options.click();
				break;
			}
		}
		
		
		
		
		
}}
