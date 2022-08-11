package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver= null;
    @Before
    public static void openBrowser(){
     //1- Set System Property
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
     //2- Create new object of WebDriver
        driver =new ChromeDriver();
     //3- Configuration
        //3.1 maximize window
        //3.2 implicitlyWait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
     //4- navigate to Url
        driver.navigate().to("https://demo.nopcommerce.com/");
        //driver.navigate().to("https://www.facebook.com/nopCommerce");
    }
    @After
    public static void closeBrowser() throws InterruptedException {
//          Thread.sleep(5000);
          driver.quit();
    }
}

