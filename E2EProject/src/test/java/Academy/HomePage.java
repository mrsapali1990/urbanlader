package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	public static WebDriver driver;

	@BeforeTest
	public void initialize() throws Exception
	{
		driver=initializeDriver();

	}

	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password,String text) throws Exception
	{

		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();   //same as driver.findelement(By.xpath()
		LoginPage lp=new LoginPage(driver);

		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		System.out.println(text);
		lp.getLogin().click();
		

	}
	
	
	@DataProvider
	public  Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test

		// Array size is 2
		// 0,1
		Object[][] data=new Object[2][3];
		//0th row
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="123456";
		data[0][2]="Restrcited User";
		//1st row
		data[1][0]="restricteduser@qw.com";
		data[1][1]="456788";
		data[1][2]= "Non restricted user";
		

		return data;
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
