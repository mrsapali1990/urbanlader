	package synchronization;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    
	 
	public class checkbox 
	{
	 
	public static void main(String[] args) throws InterruptedException
	{
	 
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
//open url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
//enter data in  username and password
		// driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		// driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		 
//click on login button
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//div[@id=\"divPassword\"]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"divLoginButton\"]/input")).click();
		
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList/reset/1");
	         
	   // WebElement input = driver.findElement(By.className("dropdown-toggle"));
	   // input.click();
	         
	  
	    WebElement check = driver.findElement(By.xpath("//*[@id=\"ohrmList_chkSelectRecord_54\"]"));
	    check.click();
	    WebElement check1=driver.findElement(By.xpath("//input[@type='checkbox']"));
	    
	    if(check.isEnabled())
	    {
	    	System.out.println("check box enable");
	    }
	    else
	    {
	    	System.out.println("UnClicked Check Box..");
	    }
	    //System.out.println("Clicked Check Box..");
	    //Thread.sleep(3000);
	    //driver.findElement(By.name("chkSelectRow[]"));
	    //check.click();
	    //System.out.println("deselect Check Box..");
	    
	         
	   // WebElement checkall = driver.findElement(By.xpath("//input[@type='checkbox']"));
	   // checkall.click();
	   // System.out.println("Checked all check Boxes..");
	  //  Thread.sleep(3000);
	  //  driver.findElement(By.xpath("//input[@type='checkbox']"));
	   // checkall.click();
	  //  System.out.println("deselect All Check Boxes..");
	    
	    
	     
		
	}
	 
	}

	