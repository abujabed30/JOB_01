package com.Automation.testClass;

import com.Automation.appinitialize.AppInIT;
import com.Automation.pageClass.PageMouseEvent;
import com.Automation.pageClass.PageWindowHandling;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestWindowHandling extends AppInIT {



    PageWindowHandling obj;

    @Test
    public void  testWindowHandling() throws InterruptedException {

        extentTest = extentReports.createTest(" testWindowHandling");
        obj = PageFactory.initElements(driver, PageWindowHandling.class);
        obj.windowverify();


    }


}
