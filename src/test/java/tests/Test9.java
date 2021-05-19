package tests;

import config.BaseChromeConfiguration;
import config.pages.SIgnUp;
import config.pages.Tickets;
import org.junit.Test;

public class Test9 extends BaseChromeConfiguration {
    @Test
    public void getTicketPage(){
        SIgnUp signUpPage = new SIgnUp(driver);
        Tickets ticketsPage = new Tickets(driver);

        //Enter User name, Password
        signUpPage.enterUserName(properties.getProperty("db.login"),properties.getProperty("db.password") );
        //Press button
        signUpPage.submit();

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
