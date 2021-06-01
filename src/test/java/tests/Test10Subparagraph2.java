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
        String ticketTitle = "TestTitle2";
        String ticketDescription = "TestDescription";
        String category = "YouTube";
        String stage = "OPEN";
        String company = "test";
        String priority = "P4";
        String department = "Комната добра";
        String manager = "Thadmin Thadmin";
        String contactId = "4: 2592";
        String fullName = "Vlad Vlad";
        String loginName = "aaa@mai.ru";
        String closedStatus= "CLOSED";

        //Access create ticket
        ticketsPage.accessCreateTickets();

        /**
         * Create Ticket
         * */
        ticketsPage.createTicket(ticketTitle,ticketDescription,category,stage,
                                 company,priority,department,manager,contactId);

        /**
         * Access already create Ticket
         * */
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

        /**
         * Validate that ticket was closed
         * */
        ticketsPage.accessInfoButton();
        assertEquals(closedStatus,ticketsPage.getStatusField());
    }
}
