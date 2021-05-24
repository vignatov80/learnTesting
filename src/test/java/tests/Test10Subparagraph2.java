package tests;

import config.BaseChromeConfiguration;
import config.pages.ContractCreate;
import config.pages.Tickets;
import config.pages.TicketsCreate;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Test10Subparagraph2 extends BaseChromeConfiguration {
    @Test
    public void createNewTicket(){
        Tickets ticketsPage = new Tickets(driver);
        TicketsCreate ticketsCreate = new TicketsCreate(driver);
        ContractCreate contractCreate = new ContractCreate(driver);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ticketsPage.accessCreateTickets();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ticketsCreate.enterTitleDescription(properties.getProperty("db.ticket.title"),properties.getProperty("db.ticket.description") );

        ticketsCreate.enterCategory();

        ticketsCreate.enterStage();

        ticketsCreate.enterCompany();

        ticketsCreate.enterPriority();

        ticketsCreate.enterDepartment();

        ticketsCreate.enterManager();

        ticketsCreate.accessCreateContact();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        contractCreate.enterEmailLogin(properties.getProperty("db.email"),properties.getProperty("db.login"));
//
        contractCreate.enterFirstNameLastName(properties.getProperty("db.firstname"),properties.getProperty("db.lastname"));
//
        contractCreate.submit();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        ticketsCreate.accessSubmit();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//        assertEquals("TestTitle2", ticketsPage.confirmTicketTitle());
    }


}
