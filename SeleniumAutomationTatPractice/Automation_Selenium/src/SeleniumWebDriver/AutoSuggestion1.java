package SeleniumWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("how stuff works ");
		List<WebElement> serchList = driver.findElements(By.xpath("//*[@role='listbox']/li"));
		Thread.sleep(3000);
		System.out.println(serchList.size());

		for (int i = 0; i < serchList.size(); i++) {
			String str = serchList.get(i).getText();
			String finalString = "how stuff works App";
			if (str.equalsIgnoreCase(finalString)) {
				serchList.get(i).click();
				System.out.println("You have selected:" + finalString);
				break;

			}
		}

		driver.close();

	}

}
