package page.objects;

import org.openqa.selenium.By;

public class LoginPage {
	
	
	public static By txt_username=By.xpath("//input[@placeholder='Username']");
	
	public static By txt_password=By.xpath("//input[@placeholder='Password']");
	
	public static By btn_Login=By.xpath("//button[normalize-space()='Login']");
	

}
