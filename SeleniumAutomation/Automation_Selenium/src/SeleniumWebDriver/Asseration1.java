package SeleniumWebDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asseration1 {
		@Test
		public void testCase1()
		{
			int a=10;
			int b=20;
			String actualString="Google";
			String expectedTring="Gooogle";
			//try {
				Assert.assertEquals(actualString, expectedTring, "String Not Matched:");
			//	}
			//catch (AssertionError a1)
			//{
				//System.out.println(a1);
			//}
			System.out.println("String Match");
			Assert.assertFalse(a>b, " assertion condin failed ");
			System.out.println(" balle balle");
		}
		//scope of assertion will be only for TestCase1
		@Test
		public void testcase2()
		{
			System.out.println(" This is testcase2");
		}

	}
