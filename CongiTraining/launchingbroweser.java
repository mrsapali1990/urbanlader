
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingbroweser
{
public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "E:\\software\\Chromedrivernew\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.close(); //closes the browser
}
}