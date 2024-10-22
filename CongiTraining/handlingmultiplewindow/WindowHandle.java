package handlingmultiplewindow;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Set;
import java.util.Iterator;


public class WindowHandle{
   
   
public void windowHandle() throws Exception 
{
	   System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("http://demo.actitime.com");
      String expectedTitle="actiTIME - Login";
      String actualTitle=driver.getTitle();
      //System.out.println(expectedTitle);
      if (actualTitle.equals(expectedTitle)) {
                     System.out.println("Pass");
      }else{
                     System.out.println("fail");
      }
   }
}