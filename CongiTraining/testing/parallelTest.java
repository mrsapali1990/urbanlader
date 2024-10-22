package testing;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelTest {

	private WebDriver driver;
	

	@Parameters({ "browser" })
	@BeforeTest
	public void openBrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"E:\\software\\Firefoxdriver\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"E:\\software\\chromedriver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver",
						"E:\\software\\edgedriver\\msedgedriver.exe");
				driver = new InternetExplorerDriver();
			}
		
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void login_TestCase() {
		driver.navigate().to("http://www.google.com");
                //do something
	}

	@Test
	public void search_TestCase() {
		driver.navigate().to("http://www.google.com");
             //do something
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}