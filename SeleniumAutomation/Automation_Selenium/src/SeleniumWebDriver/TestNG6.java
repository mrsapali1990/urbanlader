package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG6 {
WebDriver driver; // declare WebDriver
	
	@BeforeClass
	public void setEnvirment() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	
		//Thread.sleep(3000);
	}
	@DataProvider
	public Object[][] dataSet()
	{
		Object arg[][]=new Object[2][2];
		arg[0][0]="Email1";
		arg[0][1]="Pass1";
		arg[1][0]="Email2";
		arg[1][1]="Pass2";
		return arg;
	}
	@Test(dataProvider ="dataSet" )
	public void enterCrediential(String UserName, String PassWord) throws Exception
	{
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(UserName);
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(PassWord);
		
	}

}


