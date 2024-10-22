package SeleniumWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//for company List
		List<WebElement> companyList=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println(companyList.size());
		
		//for company current Price
		List<WebElement> companyPrice=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println(companyPrice.size());
		String str="Divyashakti";
		for(int i=0;i<companyList.size();i++)
		{
			if(companyList.get(i).getText().equalsIgnoreCase(str))
			{
				System.out.println(companyList.get(i).getText()+"=="+companyPrice.get(i).getText());
				companyList.get(i).click();
				break;
			}
		}
	
	}
	

}
