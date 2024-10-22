package locatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

 public static void main(String[] args) {
  
  System.setProperty("webdriver.chrome.driver","E:\\software\\chromedriver\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("http://automationpractice.com/index.php");
  
  driver.manage().window().maximize(); // maximize web page
  
  
  // id & name locators
  WebElement searchbox=driver.findElement(By.id("search_query_top"));
  searchbox.sendKeys("T-shirts");
  
  driver.findElement(By.name("submit_search")).click();

  //linkText & partial linkText
  //driver.findElement(By.linkText("Printed Chiffon Dress")).click();
  driver.findElement(By.partialLinkText("Chiffon Dress")).click();
  //normal locator id,link test,partial test,name
  
  //tag and class name is for finding multiple web element
//  customize locator css and xpath
  
 }

}
