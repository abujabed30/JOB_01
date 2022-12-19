package com.Automation.appinitialize;

import com.Automation.utility.DriverBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

public class AppInIT extends DriverBase {
    public ExtentHtmlReporter htmlReporter;
    public ExtentReports extentReports;
    public ExtentTest extentTest;

    @BeforeClass

    public void initializemyapp() throws IOException, InterruptedException {

        loadglobalproperties();
        launchbrowser();
        KillerBrowser();


        htmlReporter = new ExtentHtmlReporter("C:\\Users\\banon\\IdeaProjects\\Seleneium_HybridFrameWork\\src\\test\\ExtentReport\\extentReport.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setReportName("Ui Login");
        extentReports.setSystemInfo("Automation Engeineer", "javeed");

    }

    @AfterMethod

    public void  reportextent(ITestResult result) throws IOException, InterruptedException {

        if (result.getStatus() == ITestResult.FAILURE) {

            extentTest.log(Status.FAIL, "this is fail" + result.getName());
            TakesScreenshot obj = (TakesScreenshot) driver;
            File mamorylocation = obj.getScreenshotAs(OutputType.FILE);
            FileHandler.copy(mamorylocation, new File("C:\\Users\\banon\\IdeaProjects\\Seleneium_HybridFrameWork\\src\\test\\ScreenShot\\ss1.png"));
        }
        else if (result.getStatus() == ITestResult.SUCCESS) {

            extentTest.log(Status.PASS,"it is pass"+result.getName());
        }

    }
    @AfterTest
    public void KillerBrowser(){


    }
    @AfterClass
    public void quit(){

        driver.quit();
        extentReports.flush();

    }
}
