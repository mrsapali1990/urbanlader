package SeleniumWebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesLogic {
	public static void main(String[] args) throws Exception {
		// for load properties file

		// specify the location of file
		File src = new File("C:\\Users\\samsung\\eclipse-workspace\\Automation_Selenium\\Repositery\\LoginProperties");

		// We need FileInputStream object to load the file
		FileInputStream frs = new FileInputStream(src);

		// create Properties class object to read file
		Properties pro = new Properties();
		pro.load(frs);

		// for launch browser
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys("m.wasnik@gmail.com");
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys("123456");

	}

}
