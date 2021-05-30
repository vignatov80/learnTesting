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
        Companies companies = new Companies(driver);
        PopUps popUps = new PopUps(driver);

        String companyName = "TestCompanyName";
        String email = "EmailTest@TestMail.com";
        String phone = "999999999";


        companies.accessMenuCompanies();

        companies.accessCreateNewCompany();

        companies.accessLevel2RadioBtn();

        companies.enterCompanyName(companyName);

        companies.addInfoBtn();

        companies.enterCompanyName(email,phone);

        companies.submitCompany();

        assertEquals(companyName,companies.validateCompanyTitle());

        companies.deleteCompany();

        PopUps.handleAlert();

        assertNotSame( companyName,companies.getTicketStage());
    }
}
