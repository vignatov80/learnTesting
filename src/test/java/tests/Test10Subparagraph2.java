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

        ticketsCreate.enterTitleDescription(properties.getProperty("db.ticket.title"),properties.getProperty("db.ticket.description") );

        ticketsCreate.enterCategory();

        ticketsCreate.enterStage();

        ticketsCreate.enterCompany();

        ticketsCreate.enterPriority();

        ticketsCreate.enterDepartment();

        ticketsCreate.enterManager();

        ticketsCreate.enterContactId();

        ticketsCreate.accessSubmit();

    }


}
