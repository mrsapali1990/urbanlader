package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {

	public static void main(String[] args) throws InterruptedException
	{
		String month="June2022";
		String day="25";
					
		System.setProperty("webdriver.chrome.driver","E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.phptravels.net");
		driver.findElement(By.xpath("//input[@id='checkin']")).click();
		Thread.sleep(2000);
		while(true)
		{
		 String text=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[2]")).getText();
		if(text.equals(month))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/thead[1]/tr[1]/th[3]")).click();
		}
		}
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),'25']")).click();
				

		
	}
	
}
