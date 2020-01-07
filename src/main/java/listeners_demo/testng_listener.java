package listeners_demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testng_listener implements ITestListener {

	public void onTestStart(ITestResult result) {
	System.out.println("the test case start and details are: " +result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("the test case success and details are: " +result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("the test case failed and details are: " +result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("the test case skipped and details are: " +result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		
		
	}

}
