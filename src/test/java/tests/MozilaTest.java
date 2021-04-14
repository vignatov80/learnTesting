package tests;

import config.BaseFirefoxConfiguration;
import org.junit.Test;

public class MozilaTest extends BaseFirefoxConfiguration {

    @Test
    public void mozilaTest() {
        driver.get("http://serviceacc.foxminded.com.ua/");
    }
}
