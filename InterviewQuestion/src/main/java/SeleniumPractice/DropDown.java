package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	driver.manage().window().maximize();
	WebElement countryDrp=driver.findElement(By.xpath("//div[@class=\"single_tab_div resp-tab-content resp-tab-content-active\"]//p//select"));
	Select country=new Select(countryDrp);
	String s4=country.getFirstSelectedOption().getText();
	System.out.println(s4);
	country.selectByVisibleText("Åland Islands");
	Thread.sleep(5000);
	country.selectByValue("ALA");
	Thread.sleep(5000);
	country.selectByIndex(3);
	Thread.sleep(5000);
	
	
	
	
	
}

}
