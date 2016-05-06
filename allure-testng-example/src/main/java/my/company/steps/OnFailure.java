package my.company.steps;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ru.yandex.qatools.allure.annotations.Step;
import utils.ScreenShots;

public class  OnFailure implements ITestListener { 


	@Step("Hi, I'm step in your OnFailure listener")

	public void onTestFailure(ITestResult result) {
		ScreenShots.createAttachment();
	}


	public void onTestStart(ITestResult result) {

	}


	public void onTestSuccess(ITestResult result) {
		ScreenShots.createAttachment();
	}


	public void onTestSkipped(ITestResult result) {
		//ScreenShots.createAttachment();	
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//ScreenShots.createAttachment();	
	}


	public void onStart(ITestContext context) {

	}


	public void onFinish(ITestContext context) {

	}

	//@Attachment was put to ScreenShotes class!

}