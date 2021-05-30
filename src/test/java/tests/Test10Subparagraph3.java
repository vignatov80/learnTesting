package tests;

import config.BaseChromeConfiguration;
import config.pages.Departments;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test10Subparagraph3 extends BaseChromeConfiguration {

    @Test
    public void createNewDepartment() throws InterruptedException {

        Departments departmentsPage = new Departments(driver);
        String department = "Test Department";
        String phoneNr = "37322999999";
        String skypeId = "Test Skype Id";
        String webSite = "www.TestWebPage.com";
        String email = "TestEmail@Test.com";
        String country = "Afganistan";
        String street = "Aladin";
        String buildingNr = "23";
        String city = "Kabul";
        String zipCode = "4001";
        String roomNumber = "98";


        departmentsPage.accessMenuDepartments();

        departmentsPage.accessCreateDepartment();

        departmentsPage.enterDepartmentName(department);

        departmentsPage.accessAdditionalInfo();

        departmentsPage.enterPhoneNumber(phoneNr);

        departmentsPage.enterSkypeId(skypeId);

        departmentsPage.enterWebSite(webSite);

        departmentsPage.enterEmail(email);

        departmentsPage.enterAddress(country,street,buildingNr,city);

        departmentsPage.enterZipCode(zipCode);

        departmentsPage.enterRoomNumber(roomNumber);

        departmentsPage.accessDepartmentSubmit();

        departmentsPage.accessCreatedDepartment();

        assertEquals(department,departmentsPage.validateNameField());

        assertEquals(city,departmentsPage.validateCity());

        assertEquals(phoneNr,departmentsPage.validatePhoneNr());

        assertEquals(skypeId,departmentsPage.validateSkypeId());

        assertEquals(webSite,departmentsPage.validateWebSiteField());

        assertEquals(email,departmentsPage.validateEmail());

        assertEquals(country,departmentsPage.validateCountry());

        assertEquals(street,departmentsPage.validateStreet());

        assertEquals(buildingNr,departmentsPage.validateBuildingNr());

        assertEquals(roomNumber,departmentsPage.validateRoomNr());

        departmentsPage.goBack();

        departmentsPage.deleteDepartment();

        departmentsPage.handleAlert();

        assertNotSame(department,departmentsPage.validateDepartmentTitle());
    }
}
