package Utilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestReportListener implements ITestListener {
    ExtentReports extentReports = ExtentReportManager.getInstance();
    ExtentTest extentTest;

    public void onTestStart(ITestResult result) {
        extentTest = extentReports.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        extentTest.pass("Test Passed");
    }

    public void onTestFailure(ITestResult result) {
        extentTest.fail(result.getThrowable());
    }
    public void onTestSkipped(ITestResult result) {
        System.out.println("Method skipped"+ result);

    }

    public void onFinish(ITestContext context) {
        extentReports.flush();
    }

}
