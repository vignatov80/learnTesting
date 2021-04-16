package tests;

import config.BaseChromeConfiguration;
import org.junit.Test;

public class ChromeTest extends BaseChromeConfiguration {

    /**
     * Access foxminded web page
     */
    @Test
    public void chromeTest () {
        configFileReader();
        driver.get(properties.getProperty("db.baseUrl"));
    }
}