package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TicketsCreate extends PageObject {

    @FindBy(xpath="//input[@id='title']")
    private WebElement ticketTitle;

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

    public TicketsCreate(WebDriver driver) {
        super(driver);
    }
    public void enterTitleDescription(String ticketTitle, String ticketDescription) {
        this.ticketTitle.clear();
        this.ticketTitle.sendKeys(ticketTitle);

        this.ticketDescription.clear();
        this.ticketDescription.sendKeys(ticketDescription);
    }

    public void enterCategory(){
        Select drpCategory = new Select(category);
        drpCategory.selectByVisibleText("YouTube");
    }

    public void enterStage(){
//        wait.until(ExpectedConditions.elementToBeSelected(stage));
        Select drpStage = new Select(stage);
        drpStage.selectByVisibleText("CLOSED");
    }
    public void enterCompany(){
        Select drpCompany = new Select(company);
        drpCompany.selectByVisibleText("test");
    }
    public ReceiptPage accessCreateContact(){
        createContact.click();
        return new ReceiptPage(driver);
    }
    public void enterPriority(){
        Select drpPriority = new Select(priority);
        drpPriority.selectByVisibleText("P4");
    }
    public void enterContactId(){
        Select drpPriority = new Select(contactId);
        drpPriority.selectByValue("4: 2592");
    }
    public void enterDepartment(){
        Select drpDepartment = new Select(department);
        drpDepartment.selectByVisibleText("Комната добра");
    }
    public void enterManager(){
        Select drpManager = new Select(manager);
        drpManager.selectByVisibleText("Thadmin Thadmin");
    }
    public ReceiptPage accessSubmit() {
        submit.click();
        return new ReceiptPage(driver);
    }


}
