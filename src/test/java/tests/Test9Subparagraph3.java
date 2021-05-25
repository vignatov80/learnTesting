package tests;

import config.BaseChromeConfiguration;
import config.pages.Tickets;
import org.junit.Test;

public class Test9Subparagraph3 extends BaseChromeConfiguration {


    @Test
    public void getTicketPage() throws InterruptedException {
        Tickets ticketsPage = new Tickets(driver);


        //Display all Titles from Ticket page
        System.out.println("Titles:");
        ticketsPage.getTicketsTitle();

        //Display all IDs from Ticket page
        System.out.println("IDs:");
        ticketsPage.getTicketsId();

        //Display all Assignee from Ticket page
        System.out.println("Assignee:");
        ticketsPage.getTicketsAssignee();

        //Display all Stages from Ticket page
        System.out.println("Stage:");
        ticketsPage.getTicketStage();
    }

}
