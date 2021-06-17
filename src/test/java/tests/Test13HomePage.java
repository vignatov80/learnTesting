package tests;

import config.BaseChromeTest;
import config.HomePage;
import org.junit.Test;


public class Test13HomePage extends BaseChromeTest {


    @Test
    public void homepageTests()  {
        HomePage homePage = new HomePage(getDriver());
    }
}
