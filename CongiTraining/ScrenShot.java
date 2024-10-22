import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrenShot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//WebDriverManager.chromeDriver().setup();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

//		WebElement sec=driver.findElement(By.xpath("//h1[text()=\"Practice Page\"]"));

		//Screenshot for perticular element
		
		//File src= sec.getScreenshotAs(OutputType.FILE);

//		System.out.println(driver.manage().window().getSize());
//		Dimension d = new Dimension(420,600);
//		driver.manage().window().setSize(d);
		
		//Screenshot of section or portion of webPage
		WebElement section=driver.findElement(By.xpath("//div[@class=\"block large-row-spacer\"]"));
		File sectionsrc=section.getScreenshotAs(OutputType.FILE);
		Files.copy(sectionsrc,new File("E:\\Screen\\screenshot12dff45.png"));

		//full page screenshot
//		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		Files.copy(src,new File("E:\\Screen\\screenshot1245.png"));
//		driver.close();

	}

}
