package tests;

import config.BaseChromeConfiguration;
import config.pages.Tickets;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test10Subparagraph2 extends BaseChromeConfiguration {

    @Test
    public void createNewTicket() throws InterruptedException {
        Tickets ticketsPage = new Tickets(driver);
        //values from dropdown
        String category = "YouTube";
        String stage = "OPEN";
        String company = "test";
        String priority = "P4";
        String department = "Комната добра";
        String manager = "Thadmin Thadmin";
        String contactId = "4: 2592";
        String fullName = "Vlad Vlad";
        String loginName = "aaa@mai.ru";


        ticketsPage.accessCreateTickets();

        ticketsPage.enterTitleDescription(properties.getProperty("db.ticket.title"),properties.getProperty("db.ticket.description") );

        ticketsPage.enterCategory(category);

        ticketsPage.enterStage(stage);

        ticketsPage.enterCompany(company);

        ticketsPage.enterPriority(priority);

        ticketsPage.enterDepartment(department);

        ticketsPage.enterManager(manager);

        ticketsPage.enterContactId(contactId);

        ticketsPage.accessSubmit();

        ticketsPage.accessCreatedTicket();

        assertEquals(fullName, ticketsPage.validateFullName());

        assertEquals(company,ticketsPage.validateCompanyName());

        assertEquals(loginName,ticketsPage.validateLoginField());

        assertEquals(loginName,ticketsPage.validateEmailField());

        ticketsPage.accessCloseTicket();

        ticketsPage.handleAlert();

    }
}
