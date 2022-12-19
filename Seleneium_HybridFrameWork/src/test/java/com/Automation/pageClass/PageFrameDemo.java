package com.Automation.pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PageFrameDemo {

    WebDriver driver;
    WebElement element;

    public  PageFrameDemo(WebDriver driver){
        this.driver=driver;
    }
   @FindBy(xpath="//a[@href='java/util/package-frame.html' and@target='packageFrame']")
    WebElement utility;

    @FindBy(linkText = "Collection")
    WebElement collect;

    @FindBy(xpath = "//h2[@title='Interface Collection'and@class='title']")
    WebElement display;

  public void verifydemo() throws InterruptedException {
    driver.switchTo().frame("packageListFrame");
      utility.click();
  Thread.sleep(3000);
   driver.switchTo().defaultContent();
      Thread.sleep(3000);
      driver.switchTo().frame("packageFrame");
      collect.click();
      Thread.sleep(3000);
      driver.switchTo().defaultContent();
      driver.switchTo().frame("classFrame");
       String text=display.getText();
      System.out.println(text);

      Assert.assertEquals(text,"Interface Collection<E>");
  }


}
