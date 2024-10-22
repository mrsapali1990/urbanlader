package SeleniumPractice;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrenShot {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		//WebDriverManager.chromeDriver().setup();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement sec=driver.findElement(By.xpath("//h1[text()=\"Practice Page\"]"));

		//Screenshot for perticular element
		//File src= sec.getScreenshotAs(OutputType.FILE);
//******************************************************************************
		//full page screenshot
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("E://screenshot1245.png"));
		driver.close();

	}

}
//System.out.println(driver.manage().window().getSize());
//Dimension d = new Dimension(420,600);
//driver.manage().window().setSize(d);