package com.Automation.testClass;

import com.Automation.appinitialize.AppInIT;
import com.Automation.pageClass.PageKeyBoad;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestKeyBoad extends AppInIT {         //extentTest = extentReports.createTest("hoberoverFunctonalityTest");W

    PageKeyBoad obj;
   @Test
    public void testkeyboadaction() throws InterruptedException {

        extentTest = extentReports.createTest("testkeyboadaction");
        obj = PageFactory.initElements(driver,PageKeyBoad.class );


       obj.keyboadaction();

    }



}