package tests;

import config.BaseChromeConfiguration;
import config.pages.SIgnUp;
import config.pages.Tickets;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test9 extends BaseChromeConfiguration {

    @Test
    public void getTicketPage(){
        Tickets ticketsPage = new Tickets(driver);

        //Enter User name, Password
//        signUpPage.enterUserName(properties.getProperty("db.login"),properties.getProperty("db.password") );
        //Press button
//        signUpPage.submit();
//        signUpPage.logIn(properties.getProperty("db.login"),properties.getProperty("db.password"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("Titles:");
        ticketsPage.getTicketsTitle();

        System.out.println("IDs:");
        ticketsPage.getTicketsId();

        System.out.println("Assignee:");
        ticketsPage.getTicketsAssignee();

        System.out.println("Stage:");
        ticketsPage.getTicketStage();
    }

}
