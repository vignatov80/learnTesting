package tests;

import config.BaseFirefoxConfiguration;
import org.junit.Test;

public class MozilaTest extends BaseFirefoxConfiguration {

    /**
     * Access foxminded web page
     */
     @Test
     public void mozilaTest() {
     driver.get(properties.getProperty("db.baseUrl"));
    }

}
