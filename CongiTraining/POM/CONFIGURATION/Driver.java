package POM.CONFIGURATION;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Driver {
public static WebDriver driver;
	public static void main(String[] args) throws IOException 
	{
		POM.SPECS.Login.validLogin();
		
	}

}
