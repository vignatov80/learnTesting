package tests;

import config.BaseFirefoxConfiguration;
import config.pages.ReceiptPage;
import config.pages.SIgnUp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SignUpFormTestMozila extends BaseFirefoxConfiguration {

    @Test
    public void logIn(){

        //Access to base URL
        driver.get(properties.getProperty("db.baseUrl"));

        //Imoport Selenium driver
        SIgnUp signUpPage = new SIgnUp(driver);

        //Write login, password
        signUpPage.enterUserName(properties.getProperty("db.login"),properties.getProperty("db.password"));

        //Press button
        ReceiptPage receiptPage = signUpPage.submit();

        //Page validation
        ReceiptPage ticket;
        assertEquals("Tickets", receiptPage.confirmationHeader());

    }
}
