         package org.apache.commons.io;
		import java.io.File;
		import java.io.IOException;
		import org.apache.commons.io.*;
		import org.apache.commons.io.FilenameUtils;
		import org.openqa.selenium.OutputType;
		import org.openqa.selenium.TakesScreenshot;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		

		public class screenShot 
		{
		 public static void main(String[] args) throws IOException 
		 {
			 System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com");
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src,new File("E:\\selenium\\screenshot\\homepage.png"));
		 }

		}
		// TODO Auto-generated method stub

	


