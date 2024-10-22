package Listners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Listners.ListnerClass.class)
public class MyFirstTestCase {
	public static WebDriver driver;
	@Test
	public void GoogleTitleVerify() {
		
		WebDriverManager.chromedriver().setup();
		// Set Browser to ThreadLocalMap
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
