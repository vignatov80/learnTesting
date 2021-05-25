package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    WebDriverWait wait = new WebDriverWait(driver, 10);

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
        wait.until(ExpectedConditions.visibilityOfAllElements(ticketTitle));
        for(WebElement eachElement : ticketTitle ) {
            System.out.println(eachElement.getText());
        }
    }
    public void getTicketsId(){
        wait.until(ExpectedConditions.visibilityOfAllElements(ticketId));
        for(WebElement eachElement : ticketId ) {
            System.out.println(eachElement.getText());
        }
    }
    public void getTicketsAssignee(){
        wait.until(ExpectedConditions.visibilityOfAllElements(ticketAssignee));
        for(WebElement eachElement : ticketAssignee ) {
            System.out.println(eachElement.getText());
        }
    }
    public void getTicketStage() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfAllElements(ticketStage));
        for(WebElement eachElement : ticketStage ) {
            System.out.println(eachElement.getText());
        }
    }
    public void confirmTicketTitle() throws InterruptedException {
        for(WebElement eachElement : ticketTitle ) {
            eachElement.getText();
        }


    }

}

