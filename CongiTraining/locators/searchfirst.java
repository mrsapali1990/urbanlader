package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
public class searchfirst{
   @SuppressWarnings("deprecation")
public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver",
         "E:\\software\\chromedriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      //implicit wait
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //URL launch
      driver.get("https://www.google.com/");
      //identify element
      WebElement r = driver.findElement(By.name("q"));
      r.sendKeys("selenium java");
      // press ENTER
      r.sendKeys(Keys.RETURN);
      driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/a/h3/input")).click();
      
   }
}