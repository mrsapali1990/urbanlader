package handlingTables;

	import java.util.List;
		 
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import java.awt.*;
		 
		public class findingName {

			public static void main(String[] args) {
				
				System.out.println("Execution Starts");
				// Setting chrome driver property and opening chrome browser
				System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				System.out.println("Browser opened.");
				// loading URL
				driver.get("E:\\selenium\\table\\sample.html");
							
	System.out.println("Books written by Tathagat are below:");
	List<WebElement> allColumnsInRow=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[text()='Mukesh']/../td[1]"));
	for(WebElement e: allColumnsInRow)
	{
		System.out.println(e.getText());
	}

	}

}
