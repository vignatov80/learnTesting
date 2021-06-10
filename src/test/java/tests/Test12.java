package tests;

import config.BaseFirefoxConfiguration;
import config.pages.Managers;
import org.junit.Test;
import utils.RandomGeneration;

public class Test12  extends BaseFirefoxConfiguration {

    RandomGeneration random = new RandomGeneration();

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
        managers.createNewDepartments(random.randomString(lengthOfName),random.randomString(lengthOfName),
                                      emailString(lengthOfName,lengthOfDomain),
                                      random.randomStringNumbers(lengthOfTelephoneNumber),department);

        /**
         * Validate created manager
         */
        managers.managerValidation(department,sFirstName,sLastName,sEmail,sDepartment,sPhone,sSkype);


    }
}
