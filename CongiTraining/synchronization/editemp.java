    
    package synchronization;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import java.util.concurrent.TimeUnit;
	 
	public class editemp 
	{
	 
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
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
	         
	  
	    WebElement check = driver.findElement(By.xpath("//*[@id=\\\"resultTable\\\"]/tbody/tr[2]/td[3]/a"));
	    check.click();
	   driver.findElement(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]")).sendKeys("Adm");
	    check.click();
	    String expTxt="Admin";
		  boolean actTxt=driver.getPageSource().contains(expTxt);
		  if(actTxt)
		  {
			  System.out.println("edit emp info");
		  
		  }
		  else
		  {
			  System.out.println(" not edit emp info");
		  }
	    driver.findElement(By.id("btnSave")).click();
	    
	   // WebElement check1 = driver.findElement(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]"));
	  //  check1.click();
	  //  
	   //driver.findElement(By.id("btnSave"));
	 //  check.getText();
	  //  System.out.println("edited " + check1);
	    
	   // driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
	    //WebElement TxtBoxContent = driver.findElement(By.id(WebelementID));
	   // TxtBoxContent.getText();
	   // 
	        
	}

}
