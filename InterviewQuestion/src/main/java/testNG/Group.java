package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Group {
	
	@Test(groups="Smoke")
	public void test1()
	{
		System.out.println("Smoke");
		
	}

	@Test(groups="Smoke")
	public void test2()
	{
		System.out.println("Smoke");
		
	}
	
	//@Ignore
	@Test(groups="smoke")
	public void test3()
	{
		
		System.out.println("smoke");
		
	}
	
	@Test(groups="sanity")
	public void test4()
	{
		int a=5/0;
		System.out.println("sanity");
		
	}
	@Test(groups="sanity")
	public void test5()
	{
		System.out.println("sanity");
		
	}
	@Test(groups="regression")
	public void test6()
	{
		System.out.println("regression");
		
	}
	@Test(groups="regression")
	public void test7()
	{
		System.out.println("regression");
		
	}




}
