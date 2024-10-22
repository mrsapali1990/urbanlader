package handlingTables;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAll {

	public static void main(String[] args) {
		
		System.out.println("Execution Starts");
		// Setting chrome driver property and opening chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println("Browser opened.");
		// loading URL
		driver.get("E:\\selenium\\table\\sample.html");
		// TODO Auto-generated method stub
		//Finding number of Rows
		//List<WebElement> rowsNumber = driver.findElements(By.xpath(“//*[@id="content-8b4988b9-2ec9-4e77-9b4d-9c2994bd9e8a"]/html/body/table”));
		//int rowCount = rowsNumber.size();
		//System.out.println("No of rows in this table : " + rowCount);
		}
	}


