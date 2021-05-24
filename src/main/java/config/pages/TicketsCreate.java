package config.pages;

import config.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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
        Select drpCategory = new Select(driver.findElement(By.xpath("//*[@id='categoryId']")));
        drpCategory.selectByVisibleText("YouTube");
    }

    public void enterStage(){
        Select drpStage = new Select(driver.findElement(By.xpath("//*[@id='stageId']")));
        drpStage.selectByVisibleText("CLOSED");
    }
    public void enterCompany(){
        Select drpCompany = new Select(driver.findElement(By.id("company")));
        drpCompany.selectByVisibleText("test");
    }
    public ReceiptPage accessCreateContact(){
        createContact.click();
        return new ReceiptPage(driver);
    }
    public void enterPriority(){
        Select drpPriority = new Select(driver.findElement(By.xpath("//select[@id='priority']")));
        drpPriority.selectByVisibleText("P4");
    }
    public void enterDepartment(){
        Select drpDepartment = new Select(driver.findElement(By.id("department")));
        drpDepartment.selectByVisibleText("Комната добра");
    }
    public void enterManager(){
        Select drpManager = new Select(driver.findElement(By.id("manager")));
        drpManager.selectByVisibleText("Thadmin Thadmin");
    }
    public ReceiptPage accessSubmit() {
        submit.click();
        return new ReceiptPage(driver);
    }


}
