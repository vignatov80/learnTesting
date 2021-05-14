package tests;

import config.BaseChromeConfiguration;
import config.pages.ReceiptPage;
import config.pages.SIgnUp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SignupFormTestChrome extends BaseChromeConfiguration {

    @Test
    public void logIn(){

        //Imoport Selenium driver
        SIgnUp signUpPage = new SIgnUp(driver);

        //Enter User name, Password
        signUpPage.enterUserName(properties.getProperty("db.login"),properties.getProperty("db.password") );

        //Press button
        ReceiptPage receiptPage = signUpPage.submit();

        // Sign in
        assertEquals("Tickets", receiptPage.confirmationHeader());
    }
}
