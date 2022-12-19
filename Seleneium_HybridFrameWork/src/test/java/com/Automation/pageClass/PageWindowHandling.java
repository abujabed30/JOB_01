package com.Automation.pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PageWindowHandling {
    WebDriver driver;
    WebElement element;

    public PageWindowHandling(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='windowButton']")
    WebElement clickon;

    public void windowverify() throws InterruptedException {

        String windowid = driver.getWindowHandle();
        System.out.println(windowid);
        Thread.sleep(3000);
        clickon.click();
        Thread.sleep(3000);

        Set<String> windowids = driver.getWindowHandles();


     Iterator<String> it= windowids.iterator();
      String parentwindowid=it.next();
     String childwindowid= it.next();
        System.out.println(parentwindowid);
        System.out.println(childwindowid);

        List<String> windowidlist = new ArrayList(windowids);

        // String parentwindowid = windowidlist.get(0);
       // String childwindowid = windowidlist.get(1);
        // System.out.println("parentwindow" + parentwindowid);
        // System.out.println("childwindow" + childwindowid);
        //  driver.switchTo().window(childwindowid);
        // System.out.println("child window tile"+driver.getTitle());

        Thread.sleep(3000);
        for (String winid : windowidlist) {

            System.out.println(winid);
            driver.switchTo().window(winid);
            // System.out.println(title);
//
//        }
            // driver.close();
            // driver.quit();
        }
    }
    }