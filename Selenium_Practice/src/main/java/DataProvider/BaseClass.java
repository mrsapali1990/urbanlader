package DataProvider;

import org.testng.annotations.DataProvider;

public class BaseClass {

    @DataProvider
	public String[][] dataForTest() {

		String  [][] data = new String[3][2];

		//1st set data

		data [0][0]="username1";
		data [0][1]="passwprd1";

		//2st set data

		data [1][0]="username2";
		data [1][1]="passwprd2";

		//3st set data

		data [2][0]="username3";
		data [2][1]="passwprd3";
		
		return data;


	}

}
