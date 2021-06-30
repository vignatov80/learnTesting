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

        Companies companies = new Companies(driver);

        new CompaniesT14.Builder()
                .setCompanyName(companyName)
                .build();

        assertEquals(companies.getCompanyTitle(),companyName);

        companies.deleteCompany();

        PopUps.using(driver)
                .handleAlert();

    }

}
