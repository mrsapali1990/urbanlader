import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class zigwils 
{

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\software\\ChromeDriver100\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.zigwheels.com/");
		WebElement tesxtbox=driver.findElement(By.xpath("//*[@id=\"headerSearch\"]"));
		tesxtbox.sendKeys("Honda Bike");
		
		driver.findElement(By.xpath("//*[@id=\"search-Sml\"]/span[4]")).click();
		
		
		
		List<WebElement> prize = driver.findElements(By.xpath("//div[@class=\"clr-bl\"]"));
		List<WebElement> Productlist = driver.findElements(By.xpath("//span[@class=\"lnk-hvr fnt-16 b block of-hid h-height\"]"));
		
		for(int i=0;i<Productlist.size();i++) {
			String str =prize.get(i).getText();
			
			//String str1=str.replaceAll("[^ 0-9 ]","");
			String str1=str.replaceAll("[^0-9]","");
			//System.out.println(Productlist.get(i).getText() + "---"+str1+"--"+str1.length());
			System.out.println(Productlist.get(i).getText() + "---"+str1);
			int in=Integer.parseInt(str1);
			System.out.println(in);
			
//			int foo;
//			try {
//			   foo = Integer.parseInt(str1);
//			   System.out.println(foo);
//			}
//			catch (NumberFormatException e) {
//			   foo = 0;
//			}
			
			
//			if (str1.length() == 10) {
//				String lastfive = str1.substring(str1.length()-5);
//				System.out.println(Productlist.get(i).getText() + "---"+lastfive);
//				}
//			else if (str1.length() == 8)
//			    {
//					String lastfive = str1.substring(str1.length()-4);
//					System.out.println(Productlist.get(i).getText() + "---"+lastfive+"Laks");
//					
//					
//				}
//			else if (str1.length() == 6) 
//			    {
//					String lastfive = str1.substring(str1.length()-3);
//					System.out.println(Productlist.get(i).getText() + "---"+lastfive+"Laks");
//				}
//			else if (str1.length() == 5) 
//			    {
//					String lastfive = str1.substring(str1.length()-5);
//					System.out.println(Productlist.get(i).getText() + "---"+lastfive);
//			
//				}
//			else if (str1.length() == 4) 
//			    {
//					String lastfive = str1.substring(str1.length()-4);
//					System.out.println(Productlist.get(i).getText() + "---"+lastfive+"Laks");
//			
//				}
//			else if (str1.length() == 3) 
//				{
//					String lastfive = str1.substring(str1.length()-3);
//					System.out.println(Productlist.get(i).getText() + "---"+lastfive+"Laks");
//				}
//			
//		        }
//							
//	               driver.close();
	               
	               
	}

	}}
