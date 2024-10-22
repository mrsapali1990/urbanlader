package handlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singlecell
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//open url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 
		 driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.className("button")).click();
		 driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]")).click();
		
		 //get single  cell data
		 
		 String cellData = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]")).getText();
		 System.out.println(cellData);
		 
		 
	                
		
		 //close groweser
		 driver.close();
		 
		 
		 
	}

}
