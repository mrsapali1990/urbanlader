package Learn.Automation;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		
		// Start browser
				WebDriver driver = new ChromeDriver();

				// Start application
				driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

				// Click on timer button to start
				driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

				// Create object of WebDriverWait class and it will wait max of 20 seconds.
				// By default it will accepts in Seconds
				WebDriverWait wait = new WebDriverWait(driver, 20);

				// Here we will wait until element is not visible, if element is visible then it will return web element
				// or else it will throw exception
				WebElement element = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

				// if element found then we will use- In this example I just called isDisplayed method
				boolean status = element.isDisplayed();

				// if else condition
				if (status) {
					System.out.println("===== WebDriver is visible======");
				} else {
					System.out.println("===== WebDriver is not visible======");
				}

			}

		}
		 