package org.apache.commons.io;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*public class TextFileTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//implicit wait
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				//open url
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
				driver.findElement(By.xpath("//div[@id=\"divPassword\"]/input")).sendKeys("admin123");
				driver.findElement(By.xpath("//*[@id=\"divLoginButton\"]/input")).click();
				driver.manage().window().maximize();
				
				String pageContente =driver.findElement(By.xpath("/html/body")).getText();
				//write to file
				File file =new File("E:\\selenium\\txtact\\txtact.txt");
				//FileWriter fw= new FileWriter(file.getAbsolutePath().false);
				
				//BufferedWriter bw =new BufferedWriter(fw);
			//	char[] pageContents;
			//	bw.write(pageContents);
		//	bw.close();
			driver.close();
			// boolean result =FileCompare("E:\\selenium\\txtact\\txtact.txt","E:\\\\selenium\\\\txtact\\\\txtact.txt") ;
			// if(result)
			 {
				System.out.println("Text Passed");
			 }
		//	 else
					{
		//		 System.out.println("Text failed");
				//	}
				
		// TODO Auto-generated method stub
//;//
				//private static boolean FileCompare(String string1,String string2) throws IOException
		//		{
				//	File f1=new File(string1);
				//	File f1=new File(string2);
		//			Object f2;
			//		boolean result=FileUtils.contentEquals(f1,f2);
			//		return result;
				
//	}

//}//*/

	