package handlingmultiplewindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {public static void main(String[] args) throws InterruptedException
{

System.setProperty("webdriver.chrome.driver", "E:\\software\\Chromedrivernew\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/browser-windows");
//driver.findElement(By.id("windowButton")).click();
String parentWindowHandle = driver.getWindowHandle();
System.out.println("Parent window's handle -> " + parentWindowHandle);
WebElement clickElement = driver.findElement(By.id("windowButton"));
driver.manage().window().maximize();

for(int i = 0; i < 3; i++)
{
clickElement.click();
Thread.sleep(3000);
}

Set<String> allWindowHandles = driver.getWindowHandles();

for(String handle : allWindowHandles)
{
System.out.println("Window handle - > " + handle);
}

}

}
