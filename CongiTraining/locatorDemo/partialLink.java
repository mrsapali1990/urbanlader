package locatorDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLink {

	public static void main(String[] args) {								
        String baseUrl = "http://demo.guru99.com/test/newtours/";					
        System.setProperty("webdriver.chrome.driver","E:\\software\\chromedriver\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);					
      //  String theLinkText = driver.findElement(By.partialLinkText("egis")).getText();		/
      //  System.out.println(theLinkText);					
      // theLinkText = driver.findElement(By		/			
               // .partialLinkText("EGIS"))	/		
             //   .getText();		
       // System.out.println(theLinkText);					

        driver.quit();			

    }
		// TODO Auto-generated method stub

	}

//
