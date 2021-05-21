package tests;

import config.BaseChromeConfiguration;
import config.pages.ReceiptPage;
import config.pages.SIgnUp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SignUpFormTestChrome extends BaseChromeConfiguration {


    @Test
    public void logIn(){

        //Imoport Selenium driver
        SIgnUp signUpPage = new SIgnUp(driver);
        ReceiptPage receiptPage = new ReceiptPage(driver);

        //Enter User name, Password
        signUpPage.enterUserName(properties.getProperty("db.login"),properties.getProperty("db.password") );

        //Press button
        signUpPage.submit();

        // Sign in
        assertEquals("Tickets", receiptPage.confirmationHeader());

    }


}
