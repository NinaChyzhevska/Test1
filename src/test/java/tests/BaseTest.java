package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Nina_Chyzhevska on 10/25/2018.
 */
public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    protected void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    protected void quit(){
        driver.quit();
    }
}
