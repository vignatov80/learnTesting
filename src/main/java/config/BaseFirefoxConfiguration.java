package config;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class BaseFirefoxConfiguration extends ReadProperties {
    protected static WebDriver driver;

    /**
     * Initialization of Firefox driver
     */
    @Before
    public void initConfig() {
        configFileReader();
        System.setProperty("webdriver.gecko.driver", properties.getProperty("webdriver.gecko.driver.path"));
        driver = new FirefoxDriver();
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
