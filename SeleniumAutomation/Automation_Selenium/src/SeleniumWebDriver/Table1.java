package SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> tColum =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(tColum.size());
		System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[2]")).getText());
		List<WebElement> trow =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println(trow.size());
		
		
	}
	

}
