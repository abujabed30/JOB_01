package com.Automation.pageClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.naming.ldap.Control;
import javax.xml.xpath.XPath;

public class PageKeyBoad {



    WebDriver driver;
    WebElement element;

    public PageKeyBoad(WebDriver driver){
        this.driver=driver;
    }
  @FindBy(xpath ="//textarea[@id='inputText1'and@name='text1']")
  WebElement text;
  @FindBy(xpath="//textarea[@id='inputText2'and@name='text2']")
  WebElement text1;


  public void keyboadaction() throws InterruptedException {
      text.sendKeys("i like to make tiktok vedio");
      Actions act = new Actions(driver);
      act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
      Thread.sleep(2000);
      act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
      act.sendKeys(Keys.TAB).build().perform();
      Thread.sleep(2000);
      act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
      if (text1.getAttribute("value").equals(text1.getAttribute("value"))) {
          System.out.println("it is copied");
      } else {
          System.out.println("it is not copid");
      }

  }



}
