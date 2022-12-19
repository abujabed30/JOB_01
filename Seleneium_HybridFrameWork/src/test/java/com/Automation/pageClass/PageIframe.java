package com.Automation.pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageIframe {

    WebDriver driver;
    WebElement element;

    public PageIframe(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(xpath="/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")
    WebElement clickon;
    @FindBy(xpath="//iframe[@src='MultipleFrames.html']")
    WebElement outerframe;
  @FindBy(xpath = "/html/body/section/div/div/iframe")
    WebElement inerframe;
  @FindBy(xpath="/html/body/section/div/div/div/input")
    WebElement input;
public void verify() throws InterruptedException {

    clickon.click();
    Thread.sleep(3000);
    driver.switchTo().frame(outerframe);
    Thread.sleep(3000);
    driver.switchTo().frame(inerframe);
    Thread.sleep(5000);
    input.sendKeys("welcome");



}
}
