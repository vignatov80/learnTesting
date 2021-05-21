package config.pages;

import config.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Tickets extends PageObject {
    @FindBy(id="menu-tickets")
    private WebElement menuTickets;

    @FindBy(id= "create-new-ticket")
    private WebElement createTickets;

    @FindBy(xpath = "//a[@class='ticket-title-id locked-link']")
    private WebElement ticketsTitle;

    List<WebElement> ticketTitle = driver.findElements(By.xpath("//a[@class='ticket-title-id locked-link']/span[2]"));

    List<WebElement> ticketId = driver.findElements(By.xpath("//td[@width='80px']"));

    List<WebElement> ticketAssignee = driver.findElements(By.xpath("//tr[@class='assigned-manager']"));

    List<WebElement> ticketStage = driver.findElements(By.xpath("//td[@width='130px']"));

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

