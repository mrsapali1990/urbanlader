package SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown3 {
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		//for month
		
		List<WebElement> bm=driver.findElements(By.xpath("//select[@id='month']/option"));
		Thread.sleep(3000);
		for(int i=0;i<bm.size();i++)
		{
		bm.get(i).click();
		System.out.println(bm.get(i).getText());
		Thread.sleep(1000);
		}
		
		//for days
		List<WebElement> bd=driver.findElements(By.xpath("//select[@id='day']/option"));
		Thread.sleep(1000);
		for(int j=0;j<bd.size();j++)
		{
		bd.get(j).click();
		System.out.println(bd.get(j).getText());
		Thread.sleep(1000);
		}
		driver.close();
		
		
	}

}
