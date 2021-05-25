package tests;

import config.BaseChromeConfiguration;
import config.pages.Tickets;
import org.junit.Test;

public class Test9Subparagraph3 extends BaseChromeConfiguration {

    @Test
    public void getTicketPage() throws InterruptedException {
        Tickets ticketsPage = new Tickets(driver);

        //Timeout 20 sec
//        Thread.sleep(3000);

        //Display all Titles from Ticket page
        System.out.println("Titles:");
//        with().pollInSameThread().await().atMost(1000, MILLISECONDS).until(...);
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
