package StepDefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjectsModels.LoginPage;

public class LoginSteps extends Base {
	
	@Before
	public void setup() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\software\\ChromeDriver100\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		ap=new LoginPage(driver);
	}
	
	
	
	
	
	@Given("User Launch chrome Browser")
	public void user_launch_chrome_browser() throws Exception {
//		System.setProperty("webdriver.chrome.driver","E:\\software\\ChromeDriver100\\chromedriver.exe");
//		driver=new ChromeDriver();
//		Thread.sleep(2000);
//		ap=new LoginPage(driver);

	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
	@When("User open URL")
	public void user_open_url() {
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String username, String password) throws Exception {

		ap.setUserName(username);
		ap.setPassword(password);
	}

	@When("User click on Login")
	public void user_click_on_login() {
		ap.clickLogin();

	}
	@When("User should have his name in welcome note")
	public void user_should_have_his_name_in_welcome_note() {
	    ap.getTitle();
	}
	
	@When("User should have get errMsg")
	public void user_should_have_get_err_msg() {
	    ap.getMsg();
	}
	
	@When("close Browser")
	public void close_browser() {
	    driver.quit();
	}
	
//	No example keyworrd it get applied for single step
//	And Admin user should be login
//	|Admin|admin123|
	@When("Admin user should be login")
	public void admin_user_should_be_login(DataTable dataTable) throws Exception {
	   List<List<String>> data=dataTable.cells();
	   Thread.sleep(5000);
	   driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	   driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}
	
	//No exmple keyword using Map
	@When("Admin user should be login with valid data")
	public void admin_user_should_be_login_with_valid_data(DataTable dataTable) throws Exception {
	List<Map<String,String>> data= dataTable.asMaps(String.class,String.class) ;
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys(data.get(0).get("username"));
	driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
	}
	
	@And("click on Admin")
	public void click_on_admin() throws Exception {
//		Thread.sleep(5000);
		
//		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
//	    ap.clickAdmin();
	}
	
	@When("user click on Add")
	public void user_click_on_add() {
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
	}

	@When("User Enters skill name")
	public void user_enters_skill_name() {
	    driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Tathafggadgjhjddtdfgdfg");
	}

	@When("User click on save button")
	public void user_click_on_save_button() {
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	}

	@Then("Skill should be added skill button")
	public void skill_should_be_added_skill_button() {
	    
	}
	@Then("select skill for edit")
	public void select_skill_for_edit() throws Exception {
	   Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[20]/div/div[4]/div/button[2]")).click();
	}

	@Then("clear the the textbox field")
	public void clear_the_the_textbox_field() {
	   driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).clear();
	}

	@Then("enter the new data")
	public void enter_the_new_data() {
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Robot Freredamework");
	}

	@Then("Skill should be edited")
	public void skill_should_be_edited() {
	    driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	}
	@When("select skill for delete")
	public void select_skill_for_delete() throws InterruptedException {
		driver.findElement(By.xpath("//div[@role='table']//div[1]//div[1]//div[4]//div[1]//button[1]//i[1]")).click();   
	Thread.sleep(5000);
	}

	@When("click on Yes delete option")
	public void click_on_yes_delete_option() throws Exception {
		
    driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
    Thread.sleep(5000);  
	}

	@Then("Deleted skill succsefully")
	public void deleted_skill_succsefully() {
	    
	}

	@After
	public void teardown()
	{
		System.out.println("Tear Down method executed..");
		//driver.quit();
	}

}
