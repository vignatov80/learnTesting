package config;

import model.FileNum;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;

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
    }

    /**
     * Close Firefox Driver
     */
    @After
    public void quitDriver() {
        driver.quit();
    }
}
