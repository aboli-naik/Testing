package org.bits.demo.test;


import java.util.concurrent.TimeUnit;
import org.bits.demo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {


    @Test
    public void loginLogoutTest() throws InterruptedException {

        FirefoxBinary fb = new FirefoxBinary();

        fb.addCommandLineOptions("--headless");

        FirefoxOptions fo= new FirefoxOptions();

        fo.setBinary(fb);
        WebDriver driver = new FirefoxDriver(fo);
        driver.get("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(30,
            TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 20);
        driver.findElement(By.name("email")).sendKeys("username");
        driver.findElement(By.name("password")).sendKeys("username");
        Select select = new Select(driver.findElement(By.name("role")));
        select.selectByValue("faculty");
        driver.findElement(By.xpath("//input[@value='login]")).click();
        Thread.sleep(3000);
        driver.quit();

    }


}
