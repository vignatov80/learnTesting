package tests;

import Configuration.BaseChromeConfiguration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ChromeTest extends BaseChromeConfiguration {
    private WebDriver driver;

    @Before
    public void initDriver() {
        driver = initConfig();
    }

    @After
    public void screenShot() {
        makeScreenShot(driver);
        driver.quit();
    }

    @Test
    public void chromeTest () {
        driver.get("http://serviceacc.foxminded.com.ua/");
    }
}