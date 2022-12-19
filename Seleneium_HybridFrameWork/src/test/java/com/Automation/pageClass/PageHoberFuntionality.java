package com.Automation.pageClass;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

import static java.time.Duration.ofMinutes;
import static java.time.Duration.ofSeconds;

public class PageHoberFuntionality {
 WebDriver driver;
WebElement element;

   public PageHoberFuntionality(WebDriver driver){
       this.driver=driver;


   }








//@FindBy(linkText="Electronics")
//    WebElement electro;
//
//  @FindBy(partialLinkText = "Clothing")
//   WebElement cloth;
//@FindBy(linkText = "Men's Shoes")
// WebElement clickonshoes;
//@FindBy(linkText ="Boots")
//WebElement diaplayboots;
//public void verify() throws InterruptedException {
//
//    Actions act =new Actions(driver);
//    act.moveToElement(electro).build().perform();
//    Thread.sleep(3000);
//     act.moveToElement(cloth).build().perform();
//    Thread.sleep(3000);
//    act.moveToElement(clickonshoes).doubleClick().build().perform();
//
//  try {
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//
//      wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Boot")));
//      act.moveToElement(diaplayboots).clickAndHold().build().perform();
//  }
//  catch (Exception e) {
//      System.out.println(e);
//  }
// finally {
//      System.out.println("current url");
//  }
//  }


   //    @FindBy(xpath = "//*[@id=\"ui-id-9\"]")
//    WebElement music;
//   @FindBy(xpath = "//*[@id=\"ui-id-13\"]")
//  WebElement jazz;
//   @FindBy(xpath = "//*[@id=\"ui-id-14\"]")
// WebElement Freejazz;
//
//public void switchto(){
//
//      driver.switchTo().frame(0);
//    }

//   public void hober(){
// Actions act=new Actions(driver);
//  act.moveToElement(music).build().perform();
//
//
////public void jazz2(){
//    act.moveToElement(jazz).build().perform();
//
////}
//
////public void freezaa(){
//    new Actions(driver).moveToElement(Freejazz).click().build().perform();




}
