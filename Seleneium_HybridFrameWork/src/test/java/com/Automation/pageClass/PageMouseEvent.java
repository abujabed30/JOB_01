package com.Automation.pageClass;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class PageMouseEvent {

    WebDriver driver;
    WebElement element;

    public PageMouseEvent(WebDriver driver){
        this.driver=driver;
    }


    @FindBy(linkText = "Electronics")
    WebElement elect;
@FindBy(partialLinkText = "Clothing")
WebElement clthe;
    @FindBy(linkText = "Men'Shoes")
    WebElement shoes;
    @FindBy(linkText  = "Boots")
    WebElement display;

public void cheack() throws InterruptedException {

    Actions act = new Actions(driver);
    act.moveToElement(elect).moveToElement(clthe).build().perform();
    Thread.sleep(3000);
    act.clickAndHold(shoes).build().perform();
    Thread.sleep(3000);
   try {


       WebDriverWait wait = new WebDriverWait(driver, 20);

      // wait.until(ExpectedConditions.visibilityOfElementLocated);

       act.clickAndHold(display).build().perform();
   }
catch (Exception e) {
    System.out.println(e);

}
   finally {
       System.out.println("current url");
   }

   }
    //  @FindBy(linkText = "Electronics")
//    WebElement electo;
//    @FindBy(partialLinkText ="Clothing")
//    WebElement clthe;
//    @FindBy(partialLinkText ="Shoes")
//    WebElement clickmen;
//    @FindBy(linkText = "Boots")
//    WebElement shooes;
//
//  public void  verify() throws InterruptedException {
//      Actions act=new Actions(driver);
//
//      act.moveToElement(electo).moveToElement(clthe).build().perform();
//   Thread.sleep(4000);
//   act.moveToElement(clickmen).doubleClick().build().perform();
//    Thread.sleep(2000);
//   try {
//
//
//       WebDriverWait wait = new WebDriverWait(driver, 20);
//       wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Boots")));
//       Thread.sleep(2000);
//       act.moveToElement(shooes).clickAndHold().build().perform();
//   }
// catch (Exception e){
//     System.out.println(e);
//  }
//finally {
//       System.out.println("current url");
//   }
//   }
}
