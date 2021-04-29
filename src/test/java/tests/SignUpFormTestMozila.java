package tests;

import config.BaseFirefoxConfiguration;
import config.pages.ReceiptPage;
import config.pages.SIgnUp;
import config.pages.Tickets;
import org.junit.Assert;
import org.junit.Test;


public class SignUpFormTestMozila extends BaseFirefoxConfiguration {



    @Test
    public void logIn(){
        //Access to base URL
        driver.get(properties.getProperty("db.baseUrl"));

        //Imoport Selenium driver
        SIgnUp signUpPage = new SIgnUp(driver);

        //Write login
        signUpPage.enterUserName(properties.getProperty("db.login"));

        //Write password
        signUpPage.enterPassword(properties.getProperty("db.password"));

        //Press button
        ReceiptPage receiptPage = signUpPage.submit();

        //Page validation
        String expectedTitle = "Bigom";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
