package Listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListerner implements ITestListener{
	public void onTestStart(ITestResult result) {
		System.out.println("test of onTestStart: "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test  of onTestSuccess: "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test  of onTestFailure: "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test  of onTestSkipped:"+result.getName());
	}
}
