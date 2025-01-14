package com.sn.Testcases;

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

public class ChildIncidentTest extends TestBase
{
	
	LoginPage loginpage;
	HomePage homepage;
	IncidentCreate incidentcreate;
	
	String wbsheet = "ChildIncidentData";


	public ChildIncidentTest()
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
	  public Object[][] getchildincidentdata ()
	  {
		  Object[][] obj1 = ExcelUtilities.getExcel(wbsheet); return obj1; 
	  }
	 
	
	@Test(dataProvider = "getchildincidentdata")
	public void createchildincident( String caller , String childshortdescr ) throws InterruptedException
	{
		//incidentcreate.ClickonNewButton();
		//Thread.sleep(3000);
		//incidentcreate.CreateNewIncident(Shortdescription);
		//Thread.sleep(3000);
		incidentcreate.ClickonChildIncident();
		incidentcreate.CreatechildIncident(caller,childshortdescr);
		//Assert.assertEquals("Child Incidents (1)", "Child Incidents (1)", "Child incident is created successfully");
		
		//childincident.CreateChildIncident();
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	}




