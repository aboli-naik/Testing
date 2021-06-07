package org.bits.demo.base;


import org.openqa.selenium.Alert;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop = new Properties();
    public static FileInputStream fis;
    public static WebDriverWait wait;
    public static JavascriptExecutor executor = null;

    @BeforeTest
    public static void setUp() throws Exception {

   /*     if (driver == null) {
            File f = new File(System.getProperty("user.dir") + "/src/test/java/resources/config.properties");
            fis = new FileInputStream(f);
            prop = new Properties();
            prop.load(fis);
        }
        System.out.println(prop.getProperty("browser"));
        if (prop.getProperty("browser").equals("firefox")) {
            //  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//src//test//resources//executables//geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (prop.getProperty("browser").equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (prop.getProperty("browser").equals("ie")) {
            System.setProperty("webdriver.ie.driver",
                System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
*/



       }
}


