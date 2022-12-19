package com.Automation.testClass;

import com.Automation.appinitialize.AppInIT;
import com.Automation.pageClass.PageMouseeventAndKeybordevent;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMouseEventAndKeybordevent extends AppInIT {
    PageMouseeventAndKeybordevent obj;
@Test

    public void testmousekeboardevent() throws InterruptedException {
    extentTest = extentReports.createTest("testmousekeboardevent");
    PageMouseeventAndKeybordevent obj= PageFactory.initElements(driver,PageMouseeventAndKeybordevent.class);
    Thread.sleep(3000);
 //obj.loginpage();

   obj.keybordactions();
}










}
