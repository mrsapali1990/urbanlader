package POM.COMMON;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
	public static void openBrowser()
	{
		if(POM.CONFIGURATION.Config.browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chorome.driver","E:\\software\\chromedriver\\chromedriver.exe");
			POM.CONFIGURATION.Driver.driver=new ChromeDriver();
			
		}
	}

public static String[] readCsv(String fpath) throws IOException
{
	File f=new File(fpath);
	FileReader fr=new FileReader(f.getAbsoluteFile());
	BufferedReader br=new BufferedReader(fr);
	String line=br.readLine();
	String[] data=line.split(",");
	return data;
	
}




}


