package annotation;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test
	public void methode2() {
		System.out.println("good");
	}
	
	@BeforeTest
	public void preRequiste() {
		System.out.println("************I will execute first");
		
	}

}
