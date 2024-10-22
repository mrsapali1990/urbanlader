package handlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printLastrow {

	public static void main(String[] args) 
	
	
	{
		System.out.println("Execution Starts");
		// Setting chrome driver property and opening chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println("Browser opened.");
		// loading URL
		driver.get("E:\\selenium\\table\\sample.html");
		System.out.println("Directly printing column values of last row of table: ");
		List<WebElement>columnOfLastRow= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[last()]/td"));
		for(WebElement e:columnOfLastRow)
		{
			System.out.println(e.getText());
		}
		

	}

}
