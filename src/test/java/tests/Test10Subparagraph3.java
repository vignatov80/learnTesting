package tests;

import config.BaseChromeConfiguration;
import config.pages.Departments;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test10Subparagraph3 extends BaseChromeConfiguration {

    @Test
    public void createNewDepartment() throws InterruptedException {

        /**
         * Declare variable
         */
        Departments departmentsPage = new Departments(driver);
        //Variables for registration fields
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

        //Access menu departments
        departmentsPage.accessMenuDepartments();
        //Access create departments
        departmentsPage.accessCreateDepartment();

        /**
         * Enter values for department registration
         */
        departmentsPage.enterDepartmentName(department);
        departmentsPage.accessAdditionalInfo();
        departmentsPage.enterPhoneNumber(phoneNr);
        departmentsPage.enterSkypeId(skypeId);
        departmentsPage.enterWebSite(webSite);
        departmentsPage.enterEmail(email);
        departmentsPage.enterAddress(country,street,buildingNr,city);
        departmentsPage.enterZipCode(zipCode);
        departmentsPage.enterRoomNumber(roomNumber);

        //Press submit
        departmentsPage.accessDepartmentSubmit();
        //Access created department
        departmentsPage.accessCreatedDepartment();

        /**
         * Validate department details
         */
        assertEquals(department,departmentsPage.getNameField());
        assertEquals(city,departmentsPage.validateCity());
        assertEquals(phoneNr,departmentsPage.getPhoneNr());
        assertEquals(skypeId,departmentsPage.getSkypeId());
        assertEquals(webSite,departmentsPage.getWebSiteField());
        assertEquals(email,departmentsPage.getEmail());
        assertEquals(country,departmentsPage.getCountry());
        assertEquals(street,departmentsPage.getStreet());
        assertEquals(buildingNr,departmentsPage.getBuildingNr());
        assertEquals(roomNumber,departmentsPage.getRoomNr());

        //Press back button
        departmentsPage.goBack();

        //Delete department
        departmentsPage.deleteDepartment();
        departmentsPage.handleAlert();

        /**
         * Validate that department was deleted
         */
        assertNotSame(department,departmentsPage.getDepartmentTitle());
    }
}
