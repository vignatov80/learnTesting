package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Tickets extends PageObject {
    /*
    Declare all locators
     */

    @FindBy(id="menu-tickets")
    private WebElement menuTickets;

    @FindBy(xpath= "//*[@id='create-new-ticket']")
    private WebElement createTickets;

    @FindBy(xpath = "//a[@class='ticket-title-id locked-link']")
    private WebElement ticketsTitle;

    @FindBy(xpath="//a[@class='ticket-title-id locked-link']/span[2]")
    List<WebElement> ticketTitle;

    @FindBy(xpath="//td[@width='80px']")
    List<WebElement> ticketId;

    @FindBy(xpath="//tr[@class='assigned-manager']")
    List<WebElement> ticketAssignee;

    @FindBy(xpath="//*[contains(text(),'YouTub')]/ancestor::td/preceding-sibling::td[@width='130px']/span")
    List<WebElement> ticketStage;

    /*
    Declare all locators
     */

    public WebElement getMenuTickets() {
        return menuTickets;
    }

    public void setMenuTickets(WebElement menuTickets) {
        this.menuTickets = menuTickets;
    }

    public Tickets(WebDriver driver) {
        super(driver);
    }

    public ReceiptPage accessMenuTickets(){
        menuTickets.click();
        return new ReceiptPage(driver);
    }
    public ReceiptPage accessCreateTickets(){
        createTickets.click();
        return new ReceiptPage(driver);
    }
    public void getTicketsTitle(){
        for(WebElement eachElement : ticketTitle ) {
            System.out.println(eachElement.getText());
        }
    }
    public void getTicketsId(){
        for(WebElement eachElement : ticketId ) {
            System.out.println(eachElement.getText());
        }
    }
    public void getTicketsAssignee(){
        for(WebElement eachElement : ticketAssignee ) {
            System.out.println(eachElement.getText());
        }
    }
    public void getTicketStage(){
        for(WebElement eachElement : ticketStage ) {
            System.out.println(eachElement.getText());
        }
    }

}

