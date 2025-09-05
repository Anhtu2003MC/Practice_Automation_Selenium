package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	public static ExtentReports createInstance() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("test-output/ExtentReport.html");
        reporter.config().setDocumentTitle("Automation Report");
        reporter.config().setReportName("Amazon Product Search");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        return extent;
    }

	public void log(Status info, String string) {
		// TODO Auto-generated method stub
		
	}

	public void info(String string) {
		// TODO Auto-generated method stub
		
	}

	public void pass(String string) {
		// TODO Auto-generated method stub
		
	}
}
