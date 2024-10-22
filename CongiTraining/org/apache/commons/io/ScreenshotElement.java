package org.apache.commons.io;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class ScreenshotElement{
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      String url = "https://www.tutorialspoint.com/tutor_connect/index.php";
      WebElement drpdwn = driver.findElement(By.xpath("//select[@name=’selType’]"));
      // capture screenshot with getScreenshotAs() of the dropdown
      File f = drpdwn.getScreenshotAs(OutputType.FILE);
      //FileUtils.copyFile(f, new File(“screenshots.png”));
      driver.quit();
   }
}
