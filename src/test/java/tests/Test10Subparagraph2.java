package tests;

import config.BaseChromeConfiguration;
import config.pages.ContractCreate;
import config.pages.Tickets;
import config.pages.TicketsCreate;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class Test10Subparagraph2 extends BaseChromeConfiguration {
    @Test
    public void createNewTicket(){
        Tickets ticketsPage = new Tickets(driver);
        TicketsCreate ticketsCreate = new TicketsCreate(driver);
        ContractCreate contractCreate = new ContractCreate(driver);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ticketsPage.accessCreateTickets();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ticketsCreate.enterTitleDescription(properties.getProperty("db.ticket.title"),properties.getProperty("db.ticket.description") );

        ticketsCreate.enterCategory();

        ticketsCreate.enterStage();

        ticketsCreate.enterCompany();

        ticketsCreate.accessCreateContact();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        contractCreate.enterEmailLogin(properties.getProperty("db.email"),properties.getProperty("db.login"));

        contractCreate.enterFirstNameLastName(properties.getProperty("db.firstname"),properties.getProperty("db.lastname"));

        contractCreate.submit();





    }
}
