package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("www.google.com");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "document.getElementById('APjFqb').value = 'Hello World';";
        jsExecutor.executeScript(script);
        
		
	}
	
	
    

}
