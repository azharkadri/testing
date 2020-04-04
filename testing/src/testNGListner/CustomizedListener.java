package testNGListner;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomizedListener extends FWUtils implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		System.out.println("failed test script");
		FWUtils.takeScreenshot(result.getMethod().getMethodName());
	}
}
