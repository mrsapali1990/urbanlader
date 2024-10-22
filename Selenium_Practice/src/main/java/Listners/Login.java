package Listners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listners.ListnerClass.class)
public class Login {

	
	
	@Test
	public void Login3() {
		Assert.assertTrue(false);
	
	}
	
	

}
