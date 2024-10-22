package org.apache.commons.io;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class comparepage 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//implicit wait
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				//open url
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
				driver.findElement(By.xpath("//div[@id=\"divPassword\"]/input")).sendKeys("admin123");
				driver.findElement(By.xpath("//*[@id=\"divLoginButton\"]/input")).click();
				driver.manage().window().maximize();
				
				
				
				
				
				
				
				
				 WebElement check = driver.findElement(By.tagName("body"));
				 System.out.println("Text content:"+check.getText());
				    
				    
				    if(driver.getPageSource().contains("emp distribution by subunit"))
				    {
				    	System.out.println("text is present");
				    }
				    else
				    {
				    	System.out.println("text is not present");
				    }
				

	}

}
