package tests;

import config.BaseFirefoxConfiguration;
import config.pages.Managers;
import org.junit.Test;
import utils.RandomGeneration;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Test12  extends BaseFirefoxConfiguration {

    RandomGeneration random = new RandomGeneration();
    Map<String,String> map = new HashMap<>();

    public String emailString(Integer lengthOfEmailName, Integer lengthOfDomain){
        String name = random.randomString(lengthOfEmailName);
        String domain = random.randomString(lengthOfDomain);
        String email = name + "@" + domain + ".com";
                return email;
    }

    @Test
    public void createManager() throws InterruptedException {

        Managers managers = new Managers(driver);


        int lengthOfName = 7;
        int lengthOfTelephoneNumber = 10;
        int lengthOfDomain = 10;
        String department = "Комната добра";
        String sFirstName = "First name";
        String sLastName = "Last name";
        String sEmail = "Email";
        String sDepartment = "Department";
        String sPhone = "Phone";
        String sSkype = "Skype";

        /**
         * Access manager menu
         */
        managers.accessMenuDepartments();

        /**
         * Create manager
         */
        managers.createNewManager(random.randomString(lengthOfName),random.randomString(lengthOfName),
                                      emailString(lengthOfName,lengthOfDomain),
                                      random.randomStringNumbers(lengthOfTelephoneNumber),department);

        /**
         * Save managers information manager
         */
        map.put(sFirstName,managers.firstName.getAttribute("value"));
        map.put(sLastName,managers.lastName.getAttribute("value"));
        map.put(sEmail,managers.email.getAttribute("value"));
        map.put(sDepartment,managers.departmentId.getAttribute("value"));
        map.put(sPhone,managers.phone.getAttribute("value"));
        map.put(sSkype,managers.skype.getAttribute("value"));

        String fullName = map.get(sFirstName)+" "+map.get(sLastName);
        String randomFirstName = map.get(sFirstName);
        String randomLastName = map.get(sLastName);

        /**
         * Submit Manager
         */
        managers.submitManager();

        /**
         * Search created manager
         */
        managers.managerSearch(randomFirstName,randomLastName);

        /**
         * Validate managers information manager
         */
        assertEquals(managers.getTitle.getText(),fullName);
        assertEquals(managers.getPhoneNr.getText(), map.get(sPhone));
        assertEquals(managers.getSkype.getText(), map.get(sSkype) );
        assertEquals(managers.getLogin.getText(), map.get(sSkype) );
        assertEquals(managers.getDepartment.getText(), department );

        /**
         * Go back
         */
        managers.getBack();

        /**
         * Validate manager email
         */
        assertEquals(managers.getEmail.getText(), map.get(sEmail).toLowerCase() );

    }
}
