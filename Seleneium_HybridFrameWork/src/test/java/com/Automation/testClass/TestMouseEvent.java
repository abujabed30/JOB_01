package com.Automation.testClass;

import com.Automation.appinitialize.AppInIT;
import com.Automation.pageClass.PageKeyBoad;
import com.Automation.pageClass.PageMouseEvent;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMouseEvent extends AppInIT {

    PageMouseEvent obj;

    @Test
    public void testMouseEvent() throws InterruptedException {

        extentTest = extentReports.createTest(" testMouseEvent");
        obj = PageFactory.initElements(driver, PageMouseEvent.class);
        // obj.verify();
    }
}