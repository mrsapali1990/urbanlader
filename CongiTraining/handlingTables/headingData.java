package handlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class headingData {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\software\\ChromeDriver100\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//open url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
//		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();
//
//		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]")).click();
//
//		// Get all heading
//		List<WebElement> li=driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/th"));
//		for(WebElement we :li)
//		{
//			System.out.println(we.getText());
//
//		}
//
//		//close broweser
	}


}
