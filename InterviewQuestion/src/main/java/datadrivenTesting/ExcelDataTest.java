package datadrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataTest {
	@Test(dataProvider="logintestData",dataProviderClass=ExcelDataSupllayer.class)

	public void testLogin(String UserName,String Password) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		String expTitle="OrangeHRM";
		String actTitle=driver.getTitle();
		Assert.assertEquals(expTitle, actTitle,"Not match to expTitle");
		System.out.println("**************************");
		Thread.sleep(2000);
		driver.quit();


	}
}
