package tests;

import config.BaseChromeConfiguration;
import config.pages.SIgnUp;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GetTicketTitleChrome extends BaseChromeConfiguration {


    @Test
    public void getTitleChrome() {

        SIgnUp signUpPage = new SIgnUp(driver);

        //Enter User name, Password
        signUpPage.enterUserName(properties.getProperty("db.login"),properties.getProperty("db.password") );

        //Press button
        signUpPage.submit();

        System.out.println("Title");

        List<WebElement> listOfElements = driver.findElements(By.xpath("//a[@class='ticket-title-id locked-link']"));
        for(WebElement eachElement : listOfElements ) {
            System.out.println(eachElement.getText());
        }
        System.out.println("Id");
        List<WebElement> listOfIdElements = driver.findElements(By.xpath("//td[@width='80px']"));
        for(WebElement eachElement : listOfIdElements ) {
            System.out.println(eachElement.getText());
        }
        System.out.println("Assignee");
        List<WebElement> listOfAssigneeElements = driver.findElements(By.xpath("//td[@class='ticket_assignee']"));
        for(WebElement eachElement : listOfAssigneeElements ) {
            System.out.println(eachElement.getText());
        }
        System.out.println("Stage");
        List<WebElement> listOfStageElements = driver.findElements(By.xpath("//td[@class='ticket_assignee']"));
        for(WebElement eachElement : listOfStageElements ) {
            System.out.println(eachElement.getText());
        }

//        System.out.println(driver.findElements(By.className("ticket-title-id locked-link")));
        System.out.println("Test passed ");

    }
}

//*[@class='ticket_title']

//td[@width='80px']

//td[@class='ticket_assignee']