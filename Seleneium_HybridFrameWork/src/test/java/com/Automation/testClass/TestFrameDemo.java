package com.Automation.testClass;

import com.Automation.appinitialize.AppInIT;
import com.Automation.pageClass.PageFrameDemo;
import com.Automation.pageClass.PageKeyBoad;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestFrameDemo extends AppInIT {

    PageFrameDemo obj;
    @Test
    public void testFrameDemo() throws InterruptedException {

        extentTest = extentReports.createTest("testFrameDemo");
        obj = PageFactory.initElements(driver, PageFrameDemo.class);
        obj.verifydemo();
    }

/*Page of Model is a design patern that separte page class from the test class. we keep our object repositories
page elments in a separate class. it helps us in reducing code easy to maintain.
In the page class we keep
a. constructor where WebDriver drive is a parameter. we assign local driver to global dirver.
b. page elements with @Findby annotation and xpaths i used as locator
c. and methods accroding to actions.
   in the test class we use Page Factory class with initelements method to initialze the elemnts from the page class.
   in that we can call our methods from the page class and validate here.
 */

}
