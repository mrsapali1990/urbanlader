package handlingTables;



	import java.util.List;
	 
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.awt.*;
	 
	public class search {
	 
		public static void main(String[] args) {
			
			System.out.println("Execution Starts");
			// Setting chrome driver property and opening chrome browser
			System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			System.out.println("Browser opened.");
			// loading URL
			driver.get("E:\\selenium\\table\\sample.html");
						
// Printing table header of a web table assuming first row as header
List <WebElement> allHeadersOfTable= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
System.out.println("Headers in table are below:");
System.out.println("Total headers found: "+allHeadersOfTable.size());
for(WebElement header:allHeadersOfTable)
	{
	System.out.println( header.getText());
		}
	}
	}
	