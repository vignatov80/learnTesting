package tests;

import Configuration.BaseFirefoxConfiguration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class MozilaTest extends BaseFirefoxConfiguration {
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
    public void mozilaTest () {
        driver.get("http://serviceacc.foxminded.com.ua/");
    }
}
