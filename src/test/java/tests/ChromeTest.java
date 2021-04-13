package tests;

import Configuration.BaseChromeConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class ChromeTest extends BaseChromeConfiguration {
    @Test
    public void chromeTest () {
        WebDriver driver = initConfig();
        driver.get("http://serviceacc.foxminded.com.ua/");
        makeScreenShot(driver);
        driver.quit();
    }
}