package listenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("testcases started and detailes are" +result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("testcases succes hurray and detailes are" +result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("testcases failed and detailes are" +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("testcases skipped and detailes are" +result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

	
	

}
