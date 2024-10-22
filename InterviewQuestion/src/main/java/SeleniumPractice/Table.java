package SeleniumPractice;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		List<WebElement> num=driver.findElements(By.xpath("//table[@id=\"customers\"]//td[contains(text(),'a')]"));
		int size=num.size();
		
		Thread.sleep(1000);
		System.out.println(size);
	
		for(int i=0;i<size;i++)
		{
			System.out.println("COuntry whose name conatain A char  "+num.get(i).getText());
		}
		
	}

}
