package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUp {

	@BeforeMethod
	public void SignUp1() {

		System.out.println("This is SignUp 1 method");

	}

	@Test
	public void signup() {

		System.out.println("This is signup method");

	}


	@AfterMethod
	public void SignUp2() {

		System.out.println("This is SignUp 2 method");

	}



}
