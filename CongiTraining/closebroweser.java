
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closebroweser
{
public static void main(String[] args) throws Exception
{
System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("www.google.com");
driver.close(); //closes the browser
}
}