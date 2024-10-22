package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","E:\\software\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	
	
	//find element return single web element
	//Scenario first
	WebElement searchBox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	searchBox.sendKeys("Tathagat");
	
	//scenario two
	List<WebElement> ele=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
	
	//System.out.println(ele.getText());
	
	//scenario three
	WebElement none=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	

	}

}
