package tests;

import config.BaseChromeConfiguration;
import config.pages.CompaniesT14;
import config.pages.PopUps;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test14 extends BaseChromeConfiguration {

    @Test
    public void createTestCompany() {

        String companyName = "TestCompanyName";

        CompaniesT14 companiesT13 = CompaniesT14.using(driver)
                .clickMenuCompanies()
                .companyName(companyName)
                .serviceProgram()
                .submit();

        assertEquals(companyName, companiesT13.getCompanyTitle());

        CompaniesT14.using(driver)
                    .deleteCompany();

        PopUps.using(driver)
                .handleAlert();
    }

}
