package MiniProject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class serviceNow {

	public static void main(String[] args) throws Exception
	{
		//Launch Google Chrome
		System.setProperty("webdriver.gecko.driver", "E:\\software\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();

		//implicit wait
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

				//read properties file
				Properties p=new Properties();
				FileInputStream f=new FileInputStream("C:\\Users\\Tathagat\\eclipse-workspace\\OrangeHRM\\Login1.properties");
				p.load(f);

				//open url
				driver.get(p.getProperty("url"));
				driver.manage().window().maximize();

				//Read data from csv file
				BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\Tathagat\\eclipse-workspace\\OrangeHRM\\serviceNow.csv"));

				//read line by line
				String line=br.readLine();
				String[] data=line.split(",");

				//login
				driver.findElement(By.id(p.getProperty("user"))).sendKeys(data[0]);
				driver.findElement(By.id(p.getProperty("butt"))).click();
				driver.findElement(By.id(p.getProperty("pass"))).sendKeys(data[1]);
				driver.findElement(By.id(p.getProperty("butt1"))).click();
				Thread.sleep(10000);

				driver.get("https://developer.servicenow.com/dev.do#!/home");
				Thread.sleep(10000);
				
				//shadowroot locator
				String DrpDwn = "document.querySelector(\"body > dps-app\").shadowRoot.querySelector(\"div > header > dps-navigation-header\").shadowRoot.querySelector(\"header > div > div.dps-navigation-header-utility > ul > li:nth-child(2) > dps-login\").shadowRoot.querySelector(\"div > button\")" + ".click()";		

				//click on DropDown		
				((JavascriptExecutor)driver).executeScript(DrpDwn);
				Thread.sleep(20000);

				//shadowroot locator		
				String StartBldng = "document.querySelector(\"body > dps-app\").shadowRoot.querySelector(\"div > main > dps-home-auth-quebec\").shadowRoot.querySelector(\"div > section:nth-child(1) > div > dps-page-header > div:nth-child(1) > button\")" + ".click()";
				
				//click on button with JavaScript		
				((JavascriptExecutor)driver).executeScript(StartBldng);
				Thread.sleep(10000);

				//Login to 
				driver.findElement(By.className("form-control")).sendKeys("admin");
				driver.findElement(By.id("user_password")).sendKeys("Abc@1234");
				driver.findElement(By.id("sysverb_login")).click();

 

	}

}
