package tests;

import config.BaseChromeConfiguration;
import config.pages.Companies;
import config.pages.CompaniesT14;
import config.pages.PopUps;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test14 extends BaseChromeConfiguration {

    @Test
    public void createTestCompany() {

        String companyName = "TestCompanyName";

        //import Companies class. This will be used for verification of company name and deleting that.
        Companies companies = new Companies(driver);

        //create company
        new CompaniesT14.Builder()
                .setCompanyName(companyName)
                .build();

        //verify company name
        assertEquals(companies.getCompanyTitle(),companyName);

        //delete company
        companies.deleteCompany();
        PopUps.using(driver)
                .handleAlert();

    }

}
