/**
 * 
 */
package com.mystore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actionDriver.Action;
import com.mystore.base.BaseClass;


public class ShippingPage extends BaseClass {
	
	Action action= new Action();
	
	@FindBy(id="cgv")
	private WebElement terms;
	
	@FindBy(xpath="//button/span[contains(text(),'Proceed to checkout')]")
	private WebElement proceedToCheckOutBtn;
	
	public ShippingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkTheTerms() throws Throwable {
		action.click(driver, terms);
		Thread.sleep(2000);
	}
	
	public PaymentPage clickOnProceedToCheckOut() throws Throwable {
		action.click(driver, proceedToCheckOutBtn);
		Thread.sleep(2000);
		return new PaymentPage();
	}

}
