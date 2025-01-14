import java.time.Duration;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ebay 

{
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\software\\ChromeDriver100\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		driver.get("https://www.ebay.com/");



		WebElement SearchTextbox=driver.findElement(By.xpath("//input[contains(@id,\"gh-\") and @type=\"text\"]"));

		SearchTextbox.sendKeys("iphone 8");
		SearchTextbox.sendKeys(Keys.ENTER);



		List<WebElement> ProductReviews = driver.findElements(By.xpath("//div[@class=\"s-item__title\"]"));

		List<WebElement> starRaiting = driver.findElements(By.xpath("//div[@class='x-star-rating']"));

		List<WebElement> voteRaiting = driver.findElements(By.xpath("//span[@class='s-item__reviews-count']"));
		
		System.out.println("StarRating & voteRaiting Iphone Product page 1 list size is : "+starRaiting.size());
		System.out.println("                                          ");
		
		for(int j=0;j<starRaiting.size();j++) {
			
			Thread.sleep(10000);		  
		    starRaiting.get(j).click();
		  
			for(int i=j;j<starRaiting.size();j++) {
				
			System.out.println("                                     ");
			//Thread.sleep(5000);
			String PN =driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[3]/div[1]/div/div/h1")).getText();
			//Thread.sleep(5000);
			String SR =driver.findElement(By.xpath("//*[@id=\"s0-0-19-5-11-12-3\"]/span[1]")).getText();
			//Thread.sleep(5000);
			String VR =driver.findElement(By.xpath("//*[@id=\"s0-0-19-5-11-12-3\"]/span[3]/a")).getText();
			
			if(PN.isEmpty()&&SR.isEmpty()&&VR.isEmpty()==false) {
				System.out.println("-------------------------------" );
			}else {
				String str1=SR.replaceAll("[^0-9]","");
				String str2=VR.replaceAll("[^0-9]","");
				int StarRating = Integer.parseInt(str1);
				int VoteRating = Integer.parseInt(str2);
				
				
				
				if(StarRating>400&&VoteRating>20) {
					System.out.println("Sr.No:"+j+": "+"Product name is :"+PN);
					System.out.println("Star rating is :"+SR);
					System.out.println("Vote rating is :"+VR);
				}else {
					System.out.println("Sr.No:"+j+"--> Product is Skiped " );
					
				}
				
				
				
			}
			
			driver.navigate().back();
			
			break;
			
			}
											     
            }
		
		
		driver.findElement(By.xpath("(//a[@class=\"pagination__item\"])[2]")).click();
		
		List<WebElement> ProductReviews1 = driver.findElements(By.xpath("//div[@class=\"s-item__title\"]"));

		List<WebElement> starRaiting1 = driver.findElements(By.xpath("//div[@class='x-star-rating']"));

		List<WebElement> voteRaiting1 = driver.findElements(By.xpath("//span[@class='s-item__reviews-count']"));
		
		System.out.println("                                          ");
		System.out.println("StarRating & voteRaiting Iphone Product page 2 list size is  : "+starRaiting1.size());
		System.out.println("                                          ");
		
		
		for(int m=0;m<starRaiting1.size();m++) {
			
			Thread.sleep(10000);		  
		    starRaiting1.get(m).click();
		  
			for(int k=m;k<starRaiting1.size();k++) {
				
			System.out.println("                                  ");
			//Thread.sleep(5000);
			String PN =driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[3]/div[1]/div/div/h1")).getText();
			//Thread.sleep(5000);
			String SR =driver.findElement(By.xpath("//*[@id=\"s0-0-19-5-11-12-3\"]/span[1]")).getText();
			//Thread.sleep(5000);
			String VR =driver.findElement(By.xpath("//*[@id=\"s0-0-19-5-11-12-3\"]/span[3]/a")).getText();
			
			if(PN.isEmpty()&&SR.isEmpty()&&VR.isEmpty()==false) {
				System.out.println("-------------------------------" );
			}else {
				String str1=SR.replaceAll("[^0-9]","");
				String str2=VR.replaceAll("[^0-9]","");
				int StarRating = Integer.parseInt(str1);
				int VoteRating = Integer.parseInt(str2);
				
				
				
				if(StarRating>400&&VoteRating>20) {
					System.out.println("Sr.No :"+m+":"+"Product name is :"+PN);
					System.out.println("Star rating is :"+SR);
					System.out.println("Vote rating is :"+VR);
				}else {
					System.out.println("Sr.No:"+m+"--> Product is Skiped " );
					
				}
				
				
				
			}
			
			driver.navigate().back();
			
			break;
			
			}
	        }
		 
		
}
}	
