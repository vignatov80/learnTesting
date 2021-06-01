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

        /**
         * Create department
         */
        departmentsPage.createDepartment(department,phoneNr,skypeId,email,webSite,country,street,
                                            buildingNr,city,zipCode,roomNumber);

        /**
         * Access already created department
         */
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

        /**
         * Validate that department was deleted
         */
        assertNotSame(department,departmentsPage.getDepartmentTitle());
    }
}
