package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

    @FindBy(xpath="//input[@id='title']")
    private WebElement createTicketTitle;

    @FindBy(xpath="//*[@id='description']")
    private WebElement ticketDescription;

    @FindBy(xpath="//*[@id='categoryId']")
    private WebElement ticketCategory;

    @FindBy(id="new-contact-for-ticket")
    private WebElement createContact;

    @FindBy(id="submit-btn")
    private WebElement submit;

    @FindBy(xpath = "//*[@id='categoryId']")
    private WebElement category;

    @FindBy(id = "stageId")
    private WebElement stage;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(xpath = "//select[@id='priority']")
    private WebElement priority;

    @FindBy(id = "department")
    private WebElement department;

    @FindBy(id = "manager")
    private WebElement manager;

    @FindBy(id="contactId")
    private WebElement contactId;

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
        wait.until(ExpectedConditions.elementToBeClickable(createTickets));
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
    public void enterTitleDescription(String createTicketTitle, String ticketDescription) {
        this.createTicketTitle.clear();
        this.createTicketTitle.sendKeys(createTicketTitle);

        this.ticketDescription.clear();
        this.ticketDescription.sendKeys(ticketDescription);
    }

    public void enterCategory(String optionCategory){
        Select drpCategory = new Select(category);
        drpCategory.selectByVisibleText(optionCategory);
    }
    public void enterStage(String optionStage){
        Select drpStage = new Select(stage);
        drpStage.selectByVisibleText(optionStage);
    }
    public void enterCompany(String optionCompany){
        Select drpCompany = new Select(company);
        drpCompany.selectByVisibleText(optionCompany);
    }
    public ReceiptPage accessCreateContact(){
        createContact.click();
        return new ReceiptPage(driver);
    }
    public void enterPriority(String optionPriority){
        Select drpPriority = new Select(priority);
        drpPriority.selectByVisibleText(optionPriority);
    }
    public void enterContactId(String valueContactId){
        Select drpPriority = new Select(contactId);
        drpPriority.selectByValue(valueContactId);
    }
    public void enterDepartment(String optionDepartment){
        Select drpDepartment = new Select(department);
        drpDepartment.selectByVisibleText(optionDepartment);
    }
    public void enterManager(String optionManager){
        Select drpManager = new Select(manager);
        drpManager.selectByVisibleText(optionManager);
    }
    public ReceiptPage accessSubmit() {
        submit.click();
        return new ReceiptPage(driver);
    }

}

