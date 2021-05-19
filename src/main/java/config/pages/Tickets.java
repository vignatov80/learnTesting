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
        List<WebElement> listOfElements = driver.findElements(By.xpath("//a[@class='ticket-title-id locked-link']"));
        for(WebElement eachElement : listOfElements ) {
            System.out.println(eachElement.getText());
        }
    }
    public void getTicketsId(){
        List<WebElement> listOfIdElements = driver.findElements(By.xpath("//td[@width='80px']"));
        for(WebElement eachElement : listOfIdElements ) {
            System.out.println(eachElement.getText());
        }
    }
    public void getTicketsAssignee(){
        List<WebElement> listOfAssigneeElements = driver.findElements(By.xpath("//tr[@class='assigned-manager']"));
        for(WebElement eachElement : listOfAssigneeElements ) {
            System.out.println(eachElement.getText());
        }
    }
    public void getTicketStage(){
        List<WebElement> listOfStageElements = driver.findElements(By.xpath("//td[@width='130px']"));
        for(WebElement eachElement : listOfStageElements ) {
            System.out.println(eachElement.getText());
        }
    }

}

