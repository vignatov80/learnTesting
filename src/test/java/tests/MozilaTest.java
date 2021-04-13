package tests;

import Configuration.BaseFirefoxConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class MozilaTest extends BaseFirefoxConfiguration {
    @Test
    public void mozilaTest () {
        WebDriver driver = initConfig();
        driver.get("http://serviceacc.foxminded.com.ua/");
        makeScreenShot(driver);
        driver.quit();
    }
}
