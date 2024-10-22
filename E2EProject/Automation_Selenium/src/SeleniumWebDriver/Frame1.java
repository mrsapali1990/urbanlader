package SeleniumWebDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://paytm.com/"); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		//Find No.of frame in Current Window
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));

		System.out.println(frame.size());
		for (int i = 0; i < frame.size(); i++) {
			driver.switchTo().frame(i);
			if (driver.findElement(By.xpath("//span[@class='ng-scope']")).isDisplayed()) {
				driver.findElement(By.xpath("//span[@class='ng-scope']")).click();
			} else {
				System.out.println("controler is out of frame");
			}
		}

	}

}
