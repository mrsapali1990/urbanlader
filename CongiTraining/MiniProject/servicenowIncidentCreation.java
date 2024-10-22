package MiniProject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class servicenowIncidentCreation 
{

	public static void main(String[] args) throws Exception
	{

		System.setProperty("webdriver.chrome.driver","E:\\software\\ChromeDriver100\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		//Object repository where store the value of locators properties file
		Properties p=new Properties();
		FileInputStream f=new FileInputStream("C:\\Users\\Tathagat\\eclipse-workspace\\OrangeHRM\\Login1.properties");
		p.load(f);

		//open url
		driver.get(p.getProperty("url"));
		
		//CheckPoints 
		String expectedTitle1="ServiceNow SignOn";
		String actualTitle1=driver.getTitle();
		//System.out.println(expectedTitle);
		if (actualTitle1.equals(expectedTitle1)) {
		               System.out.println("Pass");
		}else{
		               System.out.println("fail");
		}
		
		// To verify if LOgo or value is present :
		WebElement ServiceNowLogo = driver.findElement(By.xpath("//div[@class='logo']"));
		Assert.assertEquals(true, ServiceNowLogo.isDisplayed());
		System.out.println("ServiceNow Logo Is present-AssertPassed");
		
		//Maximize broweser window
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
		
		//Using Checkpoints VerifyTitle
		String title = "ServiceNow Developers";
		String actualTitle = driver.getTitle();
        System.out.println("Verifying the page title has started");
        Assert.assertEquals(actualTitle,title,"Page title doesnt match");
        System.out.println("The page title has been successfully verified");
        System.out.println("User logged in successfully");
 
		//open link
		driver.get("https://developer.servicenow.com/dev.do#!/home");
		Thread.sleep(10000);

		//Shadowroot locator
		String DrpDwn = "document.querySelector(\"body > dps-app\").shadowRoot.querySelector(\"div > header > dps-navigation-header\").shadowRoot.querySelector(\"header > div > div.dps-navigation-header-utility > ul > li:nth-child(2) > dps-login\").shadowRoot.querySelector(\"div > button\")" + ".click()";		

		//click on DropDown		
		((JavascriptExecutor)driver).executeScript(DrpDwn);
		Thread.sleep(20000);

		//shadowroot locator		
		String StartBldng = "document.querySelector(\"body > dps-app\").shadowRoot.querySelector(\"div > main > dps-home-auth-quebec\").shadowRoot.querySelector(\"div > section:nth-child(1) > div > dps-page-header > div:nth-child(1) > button\")" + ".click()";

		//click on button with JavaScript		
		((JavascriptExecutor)driver).executeScript(StartBldng);
		Thread.sleep(10000);

		driver.get("https://dev120243.service-now.com/login.do?user_name=admin&sys_action=sysverb_login&user_password=iwkeX5iGLDA1");

		//get window handles used checkpoints show title
		Set<String> handles = driver.getWindowHandles();
		for (String handle:handles)
		{
			System.out.println(driver.switchTo().window(handle).getTitle());
			System.out.println(handle);
			driver.switchTo().window(handle);
			Thread.sleep(3000);
		}

		//Login to 
		driver.findElement(By.className("form-control")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Abc@1234");
		driver.findElement(By.id("sysverb_login")).click();

		//click on incidents
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incidents");
		String strText=driver.findElement(By.xpath("//input[@id='filter']")).getAttribute("value");

		//to print the text
		System.out.println(strText);

		//driver.findElement(By.className("sn-widget-list-title")).click();
		driver.findElement(By.xpath("//a[@id='4fed4395c0a8016400fcf06c27b1e6c6']//div[@class='sn-widget-list-title'][normalize-space()='Incidents']")).click();

		
		
		//used frame concept
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		//Read data from csv file
		//BufferedReader cr =new BufferedReader(new FileReader("C:\\Users\\Tathagat\\eclipse-workspace\\OrangeHRM\\callerName.csv"));
		//read line by line
			//	String line1=br.readLine();
				//String[] data1=line.split(",");

		//driver.findElement(By.name(p.getProperty("sys_display.incident.caller_id"))).sendKeys(data1[0]);
		
	
		driver.findElement(By.id("sys_display.incident.caller_id")).sendKeys("Abel Tuter");
		driver.findElement(By.id("incident.short_description")).sendKeys("Database Team email is not working");

		//driver.findElement(By.xpath("//button[@id='lookup.incident.caller_id']")).click();
		Thread.sleep(2000);

		//click on submit button
		driver.findElement(By.id("sysverb_insert")).click();
		driver.findElement(By.linkText("INC0010198")).click();

		//Click on resolution information
		driver.findElement(By.xpath("//span[normalize-space()='Resolution Information']")).click();

		//click on resolution tab
		driver.findElement(By.id("incident.close_code")).click();

		//Selecting the dropdown element by locating its Index
		WebElement listbox=driver.findElement(By.id("incident.close_code"));
		Select select=new Select(listbox);
		select.selectByIndex(2);
        
		//Dropdown
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		
		//enter resolution notes enter any test value
		driver.findElement(By.id("incident.close_notes")).sendKeys("All the issue solved");

		//click on resolve
		driver.findElement(By.xpath("//button[@id='resolve_incident']")).click();

		//Broweser close
		driver.close();

	}
}
