

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryCatchSelenium {
	
	    public static void main(String[] args) {
	        // Set the path to the chromedriver executable
	        System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");

	        // Initialize ChromeDriver
	       
	        WebDriver driver=new ChromeDriver();

	        try {
	            // Navigate to a web page
	            driver.get("https://www.google.com");

	            // Find an element on the page
	            driver.findElement(By.id("nonExistentElement"));
	        } catch (NoSuchElementException e) {
	            // Handle the exception if the element is not found
	            System.out.println("Element not found: " + e.getMessage());
	        } finally {
	            // Quit the driver and close the browser
	            driver.quit();
	        }
	    }}

