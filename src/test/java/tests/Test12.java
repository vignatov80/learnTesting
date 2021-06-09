package tests;

import config.BaseFirefoxConfiguration;
import config.pages.Managers;
import org.junit.Test;
import utils.RandomGeneration;

public class Test12  extends BaseFirefoxConfiguration {
    @Test
    public void createManager() throws InterruptedException {

        Managers managers = new Managers(driver);
        RandomGeneration random = new RandomGeneration();

        int lengthOfName = 7;
        int lengthOfTelephoneNumber = 10;
        String department = "Комната добра";

        managers.accessMenuDepartments();
        managers.createNewDepartments(random.randomString(lengthOfName),random.randomString(lengthOfName),
                random.randomString(lengthOfName)+"@"+random.randomString(4)+".com",
                random.randomStringNumbers(lengthOfTelephoneNumber),department);

//        Thread.sleep(1000);
        managers.getMappedData();
//        Thread.sleep(1000);
        managers.managerSubmit();

                System.out.println(managers.getMappedData());

//        managers.insertCredentials();
    }
}
