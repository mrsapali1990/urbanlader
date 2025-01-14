package com.sn.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sn.Commons.TestBase;
import com.sn.Pages.HomePage;
import com.sn.Pages.IncidentCreate;
import com.sn.Pages.LoginPage;
import com.sn.utilities.ExcelUtilities;

public class IncidentCreateTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	IncidentCreate incidentcreate;
	
	static String wbsheet="IncidentData";
	
	public IncidentCreateTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		launch();
		loginpage = new LoginPage();
		homepage = loginpage.LoginData(p.getProperty("un"), p.getProperty("pass"));
		incidentcreate = homepage.SearchIncident();	
	}
	
	@DataProvider
	public Object[][] getIncidentdata() throws IOException
	{
		Object Obj1[][]=ExcelUtilities.getExcel(wbsheet);
		 return Obj1;	
	}
	
	/*
	 * @DataProvider public void writeIncidentdata() {
	 * 
	 * }
	 */
	
	@Test(dataProvider = "getIncidentdata")
	public void createIncident(String Shortdescription, String Incident) throws InterruptedException 
	{
		incidentcreate.ClickonNewButton();
		//Thread.sleep(3000);
		incidentcreate.CreateNewIncident(Shortdescription);
		//Thread.sleep(3000);
		String name = incidentcreate.verifyIncidentPage();
		System.out.println(name);
		Assert.assertEquals(name, "Incidents [Portal view]", "Testcase executed successfully");
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
}
