package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//initiate driver
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//open url
		//driver.get("https://cogniwize.com/");
		driver.get("https://cogniwize.com/");
		
		//wait
		Thread.sleep(5000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		//size of links
		System.out.println(links.size());
		
		for(int i=0;i<=links.size();i++)
		{
			//By using href attribute to get url of requiread link
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			URL link=new URL(url);
			
			//create connction with url object"link"
			HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
			//wait time 2000 seconds
			Thread.sleep(2000);
			//extrabilsh connectio
			httpconn.connect();
			//return responce code if responce cide above 400 that is broken link
			
			int resCode =httpconn.getResponseCode();
			if(resCode>=400)
			{
				System.out.println(url + " -" + "Broken Link");
			}
			else
			{
				System.out.println(url + " -" + "is Valid Link");
			}
			
			
		}
		
		
	}

}
