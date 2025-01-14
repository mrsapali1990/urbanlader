package com.sn.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sn.Commons.TestBase;

public class IncidentCreate extends TestBase{

	@FindBy(id = "sysverb_new")
	WebElement CreateNewIncident;
	
	@FindBy(id = "sys_display.incident.caller_id")
	WebElement Caller;
	
	@FindBy (id = "incident.category")
	WebElement Category;
	
	@FindBy (id = "incident.subcategory")
	WebElement SubCategory;
	
	@FindBy(id = "sys_display.incident.business_service")
	WebElement Service;
	
	@FindBy(id = "sys_display.incident.service_offering")
	WebElement ServiceOffering;
	
	@FindBy(id = "sys_display.incident.cmdb_ci")
	WebElement ConfigurationItem;
	
	@FindBy(id = "incident.short_description")
	WebElement ShortDescription;

	@FindBy(id = "sysverb_insert_bottom")
	WebElement Submit;

	@FindBy(xpath ="//*[@id=\"list_nav_incident\"]/div/div[1]/h1/a")
	WebElement IncidentCreate;
	
	@FindBy(id = "incident.number")
	WebElement Incidentnumber;
	
	@FindBy(linkText = "Inquiry / Help")
	WebElement Incidentlink;
	
	@FindBy(xpath = "//*[@id=\"section-bf1d96e3c0a801640190725e63f8ac80.header\"]/nav/div/div[1]/button[2]")
	WebElement IncidentOptions;
	
	//@FindBy(linkText = "Create Child Incident")
	@FindBy(xpath = "//*[@id=\"context_1\"]/div[8]")
	WebElement CreateChildIncident;
	
	//@FindBy(id = "sys_display.incident.caller_id")
	//WebElement ChildCallerid;
	
	//@FindBy(id = "incident.short_description")
	//WebElement childshortdescription;
	
	//@FindBy(id = "sysverb_insert_bottom")
	//WebElement ChildShortDescription;
	
	//@FindBy(linkText = "Inquiry / Help")
	//WebElement Incidentlink;
	
	public IncidentCreate()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyIncidentPage()
	{
		return IncidentCreate.getText();	
	}
	
	public void ClickonNewButton() throws InterruptedException
	{
		driver.switchTo().frame("gsft_main");
		CreateNewIncident.click();
		
		
	}
	
	public void CreateNewIncident(String Shortdescription) throws InterruptedException
	{
		Thread.sleep(3000);
		String IncidentNo = Incidentnumber.getAttribute("value");
		System.out.println(IncidentNo);
		ShortDescription.sendKeys(Shortdescription);
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(3000);
		System.out.println("Incident Created successfully");
		//Incidentlink.click();
		//System.out.println("Incident link clicked");
		//Thread.sleep(5000);
		
	}
	
	public void ClickonChildIncident() throws InterruptedException
	{
		System.out.println("Create child incident Test");
		driver.switchTo().frame("gsft_main");
		Incidentlink.click();
	    System.out.println("Incident link clicked");
	    Thread.sleep(3000);
	    IncidentOptions.click();
	    System.out.println("Clicked on incident more options");
	    CreateChildIncident.click();
	    System.out.println("Clicked on Create child incident");
	    
	    
	}
	
	public void CreatechildIncident(String caller,String childshortdescr) throws InterruptedException
	{
		Thread.sleep(3000);
		String ChildIncidentnum = Incidentnumber.getAttribute("value");
		System.out.println("The child incident is:" +ChildIncidentnum);
		Caller.sendKeys(caller);
		//Thread.sleep(3000);
		ShortDescription.sendKeys(childshortdescr);
		//Thread.sleep(3000);
		Submit.click();
		System.out.println("Child incident created successfully");
	}
	
	
	
}
