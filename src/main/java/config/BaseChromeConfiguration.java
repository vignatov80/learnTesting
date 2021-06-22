package config;

import config.pages.SIgnUp;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseChromeConfiguration extends ReadProperties {
    protected static WebDriver driver;
    protected static SIgnUp signUpPage;
    /**
     * Initialization of Chrome driver
     */
    @Before
    public void initConfig() {
        configFileReader();
        System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver.path"));
        driver = new ChromeDriver();
        //Access to base URL
        driver.get(properties.getProperty("db.baseUrl"));
        driver.manage().window().maximize();
        signUpPage = new SIgnUp(driver);
        //Enter User name, Password
        signUpPage.enterUserName(properties.getProperty("db.login"),properties.getProperty("db.password") );
        //Press button
        signUpPage.submit();
    }
    /**
     * Clear Cookies
     */
//    @After
//    public void cleanUp(){
//        driver.manage().deleteAllCookies();
//    }
//
//    /**
//     * Close Chrome Driver
//     */
//    @AfterClass
//    public static void quitDriver() {
//        driver.close();
//    }
}