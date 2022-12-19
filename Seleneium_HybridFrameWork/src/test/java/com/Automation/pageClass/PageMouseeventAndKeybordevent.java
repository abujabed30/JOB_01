package com.Automation.pageClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PageMouseeventAndKeybordevent {

WebElement element;
     WebDriver driver;
   public PageMouseeventAndKeybordevent(WebDriver driver){

    this.driver=driver;


}
//  @FindBy(xpath = "//*[@id=\"email\"]")
// WebElement insertemail;
//@FindBy(xpath = "//*[@id=\"passwd\"]")
//WebElement insertpasswrd;
//@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
//  WebElement clickon;
//
//public void loginpage(){
//   new Actions(driver).
//    sendKeys("javeedtiktok@gmail.com").
//           sendKeys(Keys.TAB).
//           sendKeys("kamala").
//           sendKeys(Keys.TAB).
//           click(clickon).build().perform();
//}


@FindBy(xpath = "//textarea[@class='inputText' and@id='inputText1']")
WebElement text;
@FindBy(xpath="//textarea[@class='inputText'and@id='inputText1']")
WebElement text1;

  public void keybordactions() {
      text.sendKeys("hi how are you");
      Actions act = new Actions(driver);
      act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
      act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
      act.sendKeys(Keys.TAB);
      act.perform();
      act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
      if (text.getAttribute("value").equals(text1.getAttribute("value"))) {
          System.out.println("text copied");
      } else {

          System.out.println("text is not copied");
      }

  }

}
 //newActions(driver).clickAndHold().build.perfrom.
//newActions(driver).contextClick().bulid.perfrom.
