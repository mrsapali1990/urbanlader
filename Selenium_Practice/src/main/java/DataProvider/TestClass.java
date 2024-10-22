package DataProvider;

import org.testng.annotations.Test;

public class TestClass    {
	

	
    @Test(dataProvider="dataForTest",dataProviderClass=BaseClass.class)
	public void dataprovider(String uname , String password) {
    	
    	System.out.println("uname");
     	System.out.println("password");
	}
    
   
}
