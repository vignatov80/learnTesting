package tests;

import config.BaseChromeConfiguration;
import config.pages.Tickets;
import config.pages.TicketsCreate;
import org.junit.Test;

public class Test10Subparagraph2 extends BaseChromeConfiguration {
    @Test
    public void createNewTicket(){
        Tickets ticketsPage = new Tickets(driver);
        TicketsCreate ticketsCreate = new TicketsCreate(driver);

        ticketsPage.accessCreateTickets();

        ticketsPage.enterTitleDescription(properties.getProperty("db.ticket.title"),properties.getProperty("db.ticket.description") );

        ticketsPage.enterCategory("YouTube");

        ticketsPage.enterStage("CLOSED");

        ticketsPage.enterCompany("test");

        ticketsPage.enterPriority("P4");

        ticketsPage.enterDepartment("Комната добра");

        ticketsPage.enterManager("Thadmin Thadmin");

        ticketsPage.enterContactId("4: 2592");

        ticketsPage.accessSubmit();

    }


}
