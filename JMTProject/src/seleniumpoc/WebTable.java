package seleniumpoc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\SoftwareJMT\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> li=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[1]/th"));
		System.out.println(li.size());
		System.out.println(driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[2]/td[2]")).getText());

	}

}
