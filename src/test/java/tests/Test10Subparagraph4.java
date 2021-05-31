package tests;

import config.BaseChromeConfiguration;
import config.pages.Companies;
import config.pages.PopUps;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class Test10Subparagraph4 extends BaseChromeConfiguration {


    @Test
    public void createNewCompany() throws InterruptedException {

        /**
         * Declare variable
         */
        Companies companies = new Companies(driver);
        PopUps popUps = new PopUps(driver);
        //Variables for registration fields
        String companyName = "TestCompanyName";
        String email = "EmailTest@TestMail.com";
        String phone = "999999999";

        //Access menu companies
        companies.accessMenuCompanies();
        //Access create company
        companies.accessCreateNewCompany();
        //Access level 2 radio btn
        companies.accessLevel2RadioBtn();
        //Inset company name
        companies.enterCompanyName(companyName);
        //Additional information
        companies.addInfoBtn();
        //Insert company email, phone number
        companies.enterCompanyName(email,phone);
        //submit
        companies.submitCompany();
        //Validate that company was created
        assertEquals(companyName,companies.getCompanyTitle());
        //Delete company
        companies.deleteCompany();
        PopUps.handleAlert();
        //Validate that company was deleted
        assertNotSame( companyName,companies.getTicketStage());
    }
}
