package config;

import model.FileNum;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;

public class BaseChromeConfiguration extends ReadProperties {
    protected WebDriver driver;

    /**
     * Initialization of Chrome driver
     */
    @Before
    public void initConfig() {
        configFileReader();
        System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver.path"));
        driver = new ChromeDriver();
    }

    @After
    public void closeDriver(){
        driver.quit();
    }
}