package TestComponents;

import AbstractComponents.FrameworkAssertionLibrary;
import Utils.ExtentReporterNG;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;

import java.util.List;

public class AssertionListener implements ITestListener {

    ExtentTest test;
    ExtentReports extent = ExtentReporterNG.getReportObject();

  //  @Override
//    public void onFinish(ITestContext context) {
//        System.out.println("Test Finished: " + context.getName());
//
//        List<FrameworkAssertionLibrary.AssertionInfo> allAssertions = FrameworkAssertionLibrary.getAllAssertions();
//
//        for (FrameworkAssertionLibrary.AssertionInfo assertion : allAssertions) {
//            String status = assertion.getStatus() ? "Pass" : "Fail";
//            String message = "STEP: " + status + " - " + assertion.getMessage();
//            if (test != null) {
//                if (assertion.getStatus()) {
//                    test.log(Status.PASS, message);
//                } else {
//                    test.log(Status.FAIL, message);
//                }
//            }
//        }
//        if (test != null) {
//            extent.flush();
//        }
//    }
}

