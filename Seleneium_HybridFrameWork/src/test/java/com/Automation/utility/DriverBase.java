package com.Automation.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverBase extends CommonUtility {

   String myUrl;
   String myBrowser;

   @BeforeClass

 public void loadglobalproperties() throws IOException {

       FileInputStream input = new FileInputStream("C:\\Users\\banon\\IdeaProjects\\Seleneium_HybridFrameWork\\src\\test\\Property\\globalProperties");
       Properties prop = new Properties();
       prop.load(input);
       String myUrl= prop.getProperty("url7");
       String myBrowser= prop.getProperty("Browser");
        this. myUrl=myUrl;
        this.myBrowser=myBrowser;

   }

   public void launchbrowser() throws InterruptedException {

       System.out.println(myUrl);
       System.out.println(myBrowser);

       System.setProperty("webdriver.chrome.driver","C:\\Users\\banon\\IdeaProjects\\Seleneium_HybridFrameWork\\src\\test\\Driver\\chromedriver.exe");
       System.setProperty("webdriver.gecko.driver","C:\\Users\\banon\\IdeaProjects\\Seleneium_HybridFrameWork\\src\\test\\Driver\\geckodriver.exe");

       try {


           if (myBrowser.equalsIgnoreCase("chrome")) {
              //driver = new ChromeDriver();
                driver = new ChromeDriver(); // it will open the chromeBrowser
           }
           else if (myUrl.equalsIgnoreCase("gecko")) {

             //  driver = new FirefoxDriver();
           }
       }
       catch (Exception e) {
      e.printStackTrace();
       }

     Thread.sleep(3000);


     driver.navigate().to(myUrl);
    driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
   }
   public void screenshotfailure(ITestResult result) {
       if (result.getStatus() == ITestResult.FAILURE) ;

       try {
           TakesScreenshot obj = (TakesScreenshot) driver;

           File memorylocation = obj.getScreenshotAs(OutputType.FILE);
           FileHandler.copy(memorylocation, new File(screeshotpath + "ss1.png"));
       }
       catch (Exception e) {
     e.printStackTrace();
       }
   }

    public static void main(String[] args) throws IOException, InterruptedException {
        DriverBase obj = new DriverBase();
       obj.loadglobalproperties();
       obj.launchbrowser();
   }
   }

