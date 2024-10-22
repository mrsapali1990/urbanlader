package SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		// open alert window
		driver.findElement(By.xpath("//input[@name='proceed']")).click();

		// Switch alert window
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);

		// Handle the alert box
		String alertmsg = "Please enter a valid user name";

		if (driver.switchTo().alert().getText().equalsIgnoreCase(alertmsg))
		{
			driver.switchTo().alert().accept(); // accept alert box;
			System.out.println("Alert window verified");
		}

		driver.close();
	}

}
