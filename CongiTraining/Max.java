
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Max {

public static void main(String args[]) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

// Navigate to a website
driver.get("https://www.google.com/");

//Mazimize current window
driver.manage().window().maximize();

//Delay execution for 5 seconds to view the maximize operation
Thread.sleep(5000);

//Close the browser
driver.quit();
} 
}