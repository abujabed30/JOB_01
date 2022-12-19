package com.Automation.testClass;

import com.Automation.appinitialize.AppInIT;
import com.Automation.pageClass.PageFrameDemo;
import com.Automation.pageClass.PageIframe;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestIframe extends AppInIT {

    PageIframe obj;
    @Test
    public void testIframe() throws InterruptedException {

        extentTest = extentReports.createTest("testIframe");
        obj = PageFactory.initElements(driver, PageIframe.class);
     obj.verify();

    }

}
