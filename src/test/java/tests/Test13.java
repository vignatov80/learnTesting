package tests;

import config.BaseChromeConfiguration;
import config.pages.CompaniesT13;
import config.pages.PopUps;
import org.junit.Test;

public class Test13  extends BaseChromeConfiguration {

    @Test
    public void createTestCompany(){

        String companyName = "TestCompany";

        CompaniesT13.using(driver)
                    .clickMenuCompanies()
                    .companyName(companyName)
                    .serviceProgram()
                    .submit()
                    .deleteCompany();

        PopUps.using(driver)
                .handleAlert();

    }

}
