package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	public WebDriver driver;
	public Properties prop;
//	@BeforeMethod
	
	public WebDriver initializeDriver() throws IOException 
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Tathagat\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println("Browser Name is :-"  +browserName);
		
		
		if (browserName.equals("chrome"))
		{
			//			System.setProperty("webdriver.chrome.driver", "E:\\software\\Chromedrivernew\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver=new ChromeDriver(options);

//			driver =new ChromeDriver();

		}
		else if (browserName.equals("firefox"))
		{
			//			System.setProperty("webdriver.gecko.driver", "E:\\software\\Firefoxdriver\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();

		}else if (browserName.equals("Edge"))
		{
			//			System.setProperty("webdriver.edge.driver", "E:\\software\\edgedriver\\msedgedriver.exe");
			WebDriverManager.edgedriver().setup(); 
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		return driver;
		
		
	}
//	@AfterMethod
//	public void TearDown()
//	{
//		driver.quit();
//	}
	
	
}
