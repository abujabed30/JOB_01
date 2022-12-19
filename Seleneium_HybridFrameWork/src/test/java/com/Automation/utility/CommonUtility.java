package com.Automation.utility;

import com.Automation.data.Reader.Data;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CommonUtility extends Data {

   public ChromeDriver driver;

    public  String currentdirectory= new File(System.getProperty("user.dir")).getAbsolutePath();
    public  String screeshotpath=currentdirectory+File.separator+"ScreenShotFolder"+File.separator;

 public void screenshot() throws IOException {

     TakesScreenshot obj =driver;
     File memorylocation=obj.getScreenshotAs(OutputType.FILE);
     FileHandler.copy(memorylocation,new File(screeshotpath+"ss1.png"));

 }

public void elementscrollview(ChromeDriver driver, WebElement element){
    JavascriptExecutor js =driver;
    js.executeScript("argument[0],scrollIntoView();",element);


}



}
