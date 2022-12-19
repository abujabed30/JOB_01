package com.Automation.pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PageDroapdown {

WebDriver driver;
WebElement element;
public PageDroapdown(WebDriver driver){

this.driver=driver;
   }


@FindBy(xpath="//select[@id='oldSelectMenu']")

  WebElement dropdown;





                  public void dropdown() {

                      Select drop = new Select(dropdown);
                  drop.selectByVisibleText("Red");
                    drop.selectByValue("value");
                   drop.selectByIndex(0);

                  }

}


// Select drop=new Select(dropdown)
// derop.selectByvisibleText("black");
// drop.
