package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseChromeTest extends ReadProperties {
    private WebDriver driver;
    private WebDriverManager ChromeDriverManager;

    @Before
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver.path"));
        String headless = System.getProperty("db.baseUrl");

        if("true".equals(headless)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else {
            driver = new ChromeDriver();
        }
    }

    @After
    public void afterSuite() {
        if(null != driver) {
            driver.close();
            driver.quit();
        }
    }

}
