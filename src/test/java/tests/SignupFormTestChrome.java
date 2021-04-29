package tests;

import config.BaseChromeConfiguration;
import config.pages.ReceiptPage;
import config.pages.SIgnUp;
import org.junit.Assert;
import org.junit.Test;

public class SignupFormTestChrome extends BaseChromeConfiguration {
    @Test
    public void logIn(){

        //Access to base URL
        driver.get(properties.getProperty("db.baseUrl"));

        //Imoport Selenium driver
        SIgnUp signUpPage = new SIgnUp(driver);

        //Enter User name
        signUpPage.enterUserName(properties.getProperty("db.login"));

        //Enter Password
        signUpPage.enterPassword(properties.getProperty("db.password"));

        // Sign in
        ReceiptPage receiptPage = signUpPage.submit();

        //Page validation
        String expectedTitle = "Bigom";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
