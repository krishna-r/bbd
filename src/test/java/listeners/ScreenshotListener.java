package listeners;

import base.BaseTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ScreenshotListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        BaseTest baseTest = (BaseTest) result.getInstance();
        TakesScreenshot ts = (TakesScreenshot) baseTest.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = "screenshots/" + result.getName() + ".png";
        File finalDestination = new File(destination);

        try {
            Files.copy(source.toPath(), finalDestination.toPath());
            Reporter.log("Screenshot saved at: " + finalDestination.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
