package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {

    static ExtentReports extent;

    public static ExtentReports getReportObject()
    {

        String path =System.getProperty("user.dir")+"\\reports\\tests\\CurrencyRatesPageTestReports.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Luminor Project Automation Results");
        reporter.config().setDocumentTitle("Test Results");

        extent =new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Mounika Lamu");
        return extent;

    }
}
