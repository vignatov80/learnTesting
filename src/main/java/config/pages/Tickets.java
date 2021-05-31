package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Tickets extends PageObject {

    /**
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

    @FindBy(xpath = "//*[contains(text(),'TestTitle')]")
    private WebElement createdTicket;

    @FindBy(xpath = "//tbody/tr[1]/td[@class='last']/a[@href='#/contact/2592']")
    private WebElement fullName;

    @FindBy(xpath = "//a[@id='stage-409']")
    private WebElement closeTicket;

    @FindBy(xpath = "//*[@class='last break-word']//a[ contains (text(), 'test' ) ]")
    private WebElement validateCompany;

    @FindBy(xpath = "//td[ contains (text(), 'aaa@mai.ru' ) ]")
    private WebElement validateLogin;

    @FindBy(xpath = "//div[ contains (text(), 'aaa@mai.ru' ) ]")
    private WebElement validateEmail;

    @FindBy(xpath = "//span[text()='Info']")
    private WebElement infoButton;

    @FindBy(xpath = "//*[@class='ticket-details-table table table-bordered']/tbody/tr[1]/td[contains(text(),'CLOSED')]")
    private WebElement status;
    /**
     Import libraries
     */
    WebDriverWait wait = new WebDriverWait(driver, 10);
    Actions actions = new Actions(driver);
    public WebElement getMenuTickets() {
        return menuTickets;
    }
    public void setMenuTickets(WebElement menuTickets) {
        this.menuTickets = menuTickets;
    }
    public Tickets(WebDriver driver) {
        super(driver);
    }

    //Access Menu tickets
    public ReceiptPage accessMenuTickets(){
        menuTickets.click();
        return new ReceiptPage(driver);
    }
    //Access Create ticket
    public ReceiptPage accessCreateTickets(){
        wait.until(ExpectedConditions.elementToBeClickable(createTickets));
        createTickets.click();
        return new ReceiptPage(driver);
    }

    /**
     * Get list of : ticket title, ticket ids, assignee,stage
     */
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
    //Enter ticket title and description
    public void enterTitleDescription(String createTicketTitle, String ticketDescription) {
        this.createTicketTitle.clear();
        this.createTicketTitle.sendKeys(createTicketTitle);

        this.ticketDescription.clear();
        this.ticketDescription.sendKeys(ticketDescription);
    }

    /**
     *Populate dropdowns
     */
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
    //Click submit
    public ReceiptPage accessSubmit(){
        submit.click();
        return new ReceiptPage(driver);
    }
    //Click create ticket
    public ReceiptPage accessCreatedTicket(){
        wait.until(ExpectedConditions.elementToBeClickable(createdTicket));
        createdTicket.click();
        return new ReceiptPage(driver);
    }

    /**
     *Populate ticket details
     */
    public String getFullName(){
        wait.until(ExpectedConditions.visibilityOfAllElements(fullName));
        return fullName.getText();
    }
    public String getCompanyName(){
        wait.until(ExpectedConditions.visibilityOfAllElements(validateCompany));
        return validateCompany.getText();
    }
    public String getLoginField(){
        wait.until(ExpectedConditions.visibilityOfAllElements(validateLogin));
        return validateLogin.getText();
    }
    public String getEmailField(){
        wait.until(ExpectedConditions.visibilityOfAllElements(validateEmail));
        return validateEmail.getText();
    }
    //Close ticket
    public ReceiptPage accessCloseTicket(){
        wait.until(ExpectedConditions.elementToBeClickable(closeTicket));
        closeTicket.click();
        return new ReceiptPage(driver);
    }
    public void handleAlert(){
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    //Access ticket info
    public ReceiptPage accessInfoButton(){
        wait.until(ExpectedConditions.elementToBeClickable(infoButton));
        infoButton.click();
        return new ReceiptPage(driver);
    }
    //Get ticket status
    public String getStatusField(){
        wait.until(ExpectedConditions.visibilityOfAllElements(status));
        return status.getText();
    }
}