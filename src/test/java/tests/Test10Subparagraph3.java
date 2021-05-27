package tests;

import config.BaseChromeConfiguration;
import config.pages.Departments;
import org.junit.Test;

public class Test10Subparagraph3 extends BaseChromeConfiguration {

    @Test
    public void createNewDepartment() throws InterruptedException {
        Departments departmentsPage = new Departments(driver);

        departmentsPage.accessMenuDepartments();

        departmentsPage.accessCreateDepartment();

        departmentsPage.enterDepartmentName("Test Department");

        departmentsPage.accessAdditionalInfo();

        departmentsPage.enterPhoneNumber("37322999999");

        departmentsPage.enterSkypeId("Test Skype Id");

        departmentsPage.enterWebSite("www.TestWebPage.com");

        departmentsPage.enterEmail("TestEmail@Test.com");

        departmentsPage.enterAddress("Afganistan","Ali Aladin","23","Kabul");

        departmentsPage.enterZipCode("4001");

        departmentsPage.enterRoomNumber("98");

        departmentsPage.accessDepartmentSubmit();


    }
}
