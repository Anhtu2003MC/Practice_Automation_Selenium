package ExtentReport;

import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

public class ExtentListener implements ITest{

	 public static ExtentListener extent = ExtentManager.createInstance();
	    public static ExtentManager test;

	    @Override
	    public void onTestStart(ITest result) {
	        test = extent.createTest(result.getMethod().getMethodName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        test.log(Status.PASS, "Test Passed");
	    }
	    
	    @Override
	    public void onTestFailure(ITestResult result) {
	        test.log(Status.FAIL, "Test Failed: " + result.getThrowable());
	        String path = takeScreenshot(result.getMethod().getMethodName());
	        test.addScreenCaptureFromPath(path);
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        test.log(Status.SKIP, "Test Skipped: " + result.getThrowable());
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        extent.flush();
	    }
	    public String takeScreenshot(String name) {
	        File src = ((org.openqa.selenium.TakesScreenshot) BaseTest.driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
	        String dest = "test-output/screenshots/" + name + ".png";
	        try {
	            File target = new File(dest);
	            target.getParentFile().mkdirs();
	            Files.copy(src.toPath(), target.toPath());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return dest;
	    }

		public Object createTest(String string) {
			// TODO Auto-generated method stub
			return null;
		}

		public Object createTest(String string) {
			// TODO Auto-generated method stub
			return null;
		}

}
