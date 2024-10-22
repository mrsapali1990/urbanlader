package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amzon24Percentage {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/s?k=bata+shoes+for+men&crid=3C472G6KWD5EP&sprefix=bata%2Caps%2C295&ref=nb_sb_ss_ts-doa-p_2_4");
		driver.manage().window().maximize();
		List<WebElement> ele=driver.findElements(By.xpath("(//span[contains(text(),\"(24% off)\")])"));

		int count=ele.size();
		System.out.println("size of element "+count);
		for(int i=0;i<count;i++)
		{
			System.out.println("whose price get  24% is    "+ele.get(i).getAttribute("class"));
		}
		//************************************************************************//
		// Use XPath to find the prices of products with 24% off
		String xpathExpression = "//span[contains(text(),\"(28% off)\")]";
		List<WebElement> priceElements = driver.findElements(By.xpath(xpathExpression));

		// Extract and print the prices
		for (WebElement priceElement : priceElements) {

			String price = priceElement.getText();
			System.out.println("Price: " + price);
		}

		// Close the browser
		
	}}
