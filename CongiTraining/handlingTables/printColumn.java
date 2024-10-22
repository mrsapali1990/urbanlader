package handlingTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printColumn {

	public static void main(String[] args)
{
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//open url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 
		 driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.className("button")).click();
		 driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]")).click();
		
		
		WebElement baseTable = driver.findElement(By.tagName("table"));
		
		//To find the second row of a table
				WebElement Rowtable = baseTable.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]"));
				String rowtext = Rowtable.getText();
				System.out.println("The row text of the web table : "+rowtext);
				
		//To get 2nd row's 2nd column data
		
		WebElement cellNo = Rowtable.findElement(By.xpath("//html/body/table/tbody/tr[1]/td[1]"));
		String valueNo = cellNo.getText();
		System.out.println("Cell value is : "+valueNo);
		driver.close();


		//close browesr
		driver.close();

	}

}
