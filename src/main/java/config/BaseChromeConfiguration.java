package config;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseChromeConfiguration extends ReadProperties {
    protected static WebDriver driver;

    /**
     * Initialization of Chrome driver
     */
    @Before
    public void initConfig() {
        configFileReader();
        System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver.path"));
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    /**
     * Clear Cookies
     */
    @After
    public void cleanUp(){
        driver.manage().deleteAllCookies();
    }

    /**
     * Close Firefox Driver
     */
    @AfterClass
    public static void quitDriver() {
        driver.close();
    }
}