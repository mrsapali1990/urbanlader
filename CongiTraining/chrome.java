import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class chrome 
{

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
//		driver.get("https://www.facebook.com/");
		
////		JavascriptExecutor JS=(JavascriptExecutor)driver;
////		JS.executeScript("document.getElementByName('q').value='test.com'");
////		
//		// Initialize JS object
//		JavascriptExecutor JS = (JavascriptExecutor)driver;
//		// Enter username
//		JS.executeScript("document.getElementById('email').value='Tathagat'");
//		// Enter password
//		JS.executeScript("document.getElementById('pass').value='password123'");
////		boolean txtSelecated=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
////		
////		driver.close();
		
	    // WebDriverWait wait = new WebDriverWait(driver, 30);

	     driver.get("https://www.ibm.com/in-en");
	     String drpdwn = "document.querySelector(\"#container-9225520bd9 > div.masthead > dds-masthead-container > dds-masthead > dds-masthead-logo\").shadowRoot.querySelector(\"#link\")"+ ".click()";
	     
	     
			((JavascriptExecutor)driver).executeScript(drpdwn);
			
			System.out.println("Webelement located");
		
	    // Enter value in Search textbox and press enter
//	    WebElement SearchTextbox = wait.until(ExpectedConditions.presenceOfElementLocated(
//	        (By.xpath("//input[contains(@id,\"gh-\") and @type=\"text\"]"))));
//	    SearchTextbox.click();
//	    SearchTextbox.sendKeys("iphone 8");
//	    SearchTextbox.sendKeys(Keys.ENTER);
//
//	    // Collected all the productName review WebElements
//	    List<WebElement> ProductReviews = driver.findElements(By.xpath("//span[@role=\"heading\"]"));
//	    
//	    
//	    List<WebElement> starRaiting = driver.findElements(By.xpath("//div[@class='x-star-rating']"));
//	    
//	    
//	    List<WebElement> voteRaiting = driver.findElements(By.xpath("//span[@class='s-item__reviews-count']"));
//	    
//	    for(int i=0;i<ProductReviews.size();i++) {
//	    	String str1 =ProductReviews.get(i).getText();
//	    	String str2 =starRaiting.get(i).getText();
//			String str3 =voteRaiting.get(i).getText();
//			System.out.println(str1+"---"+str2+" --"+str3+"--");
//	    }
//			
//	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
//	    // Made a list to accumulate all products number.
//	    ArrayList<Integer> mylist = new ArrayList<>();
//	    
//
//	    // Loop through all the WebElement and Extract number from String i.e. "70 product ratings"
//	    // (Extracting 70 in above case)
//	    for (WebElement ProdInfo : ProductReviews) {
//	      try {
//	        mylist.add(Integer.parseInt(ProdInfo.getText().split("product")[0].trim()));
//	        System.out.println("product info-----------" +ProdInfo);
//	      } catch (Exception ignored) {
//	      }
//	    }
//
//	    // Printed mylist to verify
//	    // and Extracted max number so that we can use that in xpath to search exact element and click on it.
//	    System.out.println(mylist);
//	    Integer max_number = Collections.max(mylist);
//	    System.out.println(max_number);
//	    driver.findElement(By.xpath(String.format("//span[text()=\"%s product ratings\"]", max_number))).click();
//	System.out.println("Tathagat......");
	}
}

