package tests;

import config.BaseChromeConfiguration;
import config.pages.Tickets;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test10Subparagraph2 extends BaseChromeConfiguration {

    @Test
    public void createNewTicket() throws InterruptedException {
        /**
         * Declare variables
        */
        Tickets ticketsPage = new Tickets(driver);
        //values for dropdown
        String category = "YouTube";
        String stage = "OPEN";
        String company = "test";
        String priority = "P4";
        String department = "Комната добра";
        String manager = "Thadmin Thadmin";
        String contactId = "4: 2592";
        String fullName = "Vlad Vlad";
        String loginName = "aaa@mai.ru";

        //Access create ticket
        ticketsPage.accessCreateTickets();
        //Insert values in title and description
        ticketsPage.enterTitleDescription(properties.getProperty("db.ticket.title"),properties.getProperty("db.ticket.description") );
        /**
         * Populate dropdowns
         * */
        ticketsPage.enterCategory(category);
        ticketsPage.enterStage(stage);
        ticketsPage.enterCompany(company);
        ticketsPage.enterPriority(priority);
        ticketsPage.enterDepartment(department);
        ticketsPage.enterManager(manager);
        ticketsPage.enterContactId(contactId);

        //Access submit
        ticketsPage.accessSubmit();
        //Access create Ticket
        ticketsPage.accessCreatedTicket();

        /**
         * Validate fullName, company, login, email fields
         * */
        assertEquals(fullName, ticketsPage.getFullName());
        assertEquals(company,ticketsPage.getCompanyName());
        assertEquals(loginName,ticketsPage.getLoginField());
        assertEquals(loginName,ticketsPage.getEmailField());

        /**
         * Close ticket
         * */
        ticketsPage.accessCloseTicket();
        ticketsPage.handleAlert();
    }
}
