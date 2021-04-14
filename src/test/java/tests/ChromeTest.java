package tests;

import config.BaseChromeConfiguration;
import org.junit.Test;

public class ChromeTest extends BaseChromeConfiguration {

    @Test
    public void chromeTest () {
        driver.get("http://serviceacc.foxminded.com.ua/");
    }
}