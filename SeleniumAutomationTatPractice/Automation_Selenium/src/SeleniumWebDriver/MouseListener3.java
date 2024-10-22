package SeleniumWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseListener3 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		System.out.println("No of Frame:" + frame.size());
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDropBy(src, 50, 50).build().perform();// drag by x and y direction

	}

}
