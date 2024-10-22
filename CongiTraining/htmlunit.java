
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.html5.*;
public class htmlunit {				
		public static void main(String[] args) {
                     // Creating a new instance of the HTML unit driver
                      
                    // WebDriver driver = new HtmlUnitDriver();
                     WebDriver driver=new ChromeDriver();
                     
                      
           		     // Navigate to Google		
                     driver.get("http://www.google.com");	
                     
                     //maximize window after launching
                     driver.manage().window().maximize();
          
					 // Locate the searchbox using its name		
                     WebElement element = driver.findElement(By.name("q"));	
                     
                    // Enter a search query		
                    element.sendKeys("Facebook");	
                   
		            // Submit the query. Webdriver searches for the form using the text input element automatically		
                    // No need to locate/find the submit button		
                    element.submit();			
                    
            		// This code will print the page title		
                    System.out.println("Page title is: " + driver.getTitle());		
                    
                    
                    //close the broweser
                    driver.close();
                    
                    driver.quit();			
         }		
}