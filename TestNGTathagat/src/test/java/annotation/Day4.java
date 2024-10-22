package annotation;

import org.testng.annotations.Test;

public class Day4 {
	@Test
	public void webLoginHomeLoan() {
		System.out.println("webloginHome");
	}
	
	@Test
	public void mobileLoginHomeLoan() {
		System.out.println("mobileloginHome");
	}
	
	@Test(groups= {"Smoke"})
	public void loginAPIHomeLoan() {
		System.out.println("APIloginHome");
	}

}
