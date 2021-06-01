package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Companies extends PageObject {

    @FindBy(id="menu-companies")
    private WebElement menuCompanies;

    @FindBy(id="new-company")
    private WebElement createNewCompany;

    @FindBy(id="company-sla-level-2")
    private WebElement level1RadioBtn;

    @FindBy(id="name")
    private WebElement companyName;

    @FindBy(id="ticketPrefix")
    private WebElement ticketPrefix;

    @FindBy(id="company-submit-btn")
    private WebElement submitCompanyBtn;

    @FindBy(xpath = "//a[contains(text(),'TestCompanyName')]")
    private WebElement companyTitle;

    @FindBy(xpath = "//a[contains(text(),'TestCompanyName')]/ancestor::td//following-sibling::td[4]//descendant::i[@class='fa fa-fw fa-lg fa-trash-o icon-delete']")
    private WebElement deleteCompany;

    @FindBy(xpath = "//*[@id='email']")
    private WebElement emailField;

    @FindBy(id = "company.phone")
    private WebElement phoneField;

    @FindBy(xpath = "//*[@href='#collapseOne']")
    private WebElement addInfoBtn;

    @FindBy(xpath = "//tbody/tr[2]/td[1]")
    private WebElement validateTitle;


    WebDriverWait wait = new WebDriverWait(driver, 10);


    public Companies(WebDriver driver) {
        super(driver);
    }

    public ReceiptPage createCompany(String companyName,String emailText ,String phoneText) {

        wait.until(ExpectedConditions.elementToBeClickable(level1RadioBtn));
        level1RadioBtn.click();
        this.companyName.clear();
        this.companyName.sendKeys(companyName);

        wait.until(ExpectedConditions.elementToBeClickable(addInfoBtn));
        addInfoBtn.click();

        wait.until(ExpectedConditions.visibilityOfAllElements(emailField));
        this.emailField.clear();
        this.emailField.sendKeys(emailText);

        wait.until(ExpectedConditions.visibilityOfAllElements(phoneField));
        this.phoneField.clear();
        this.phoneField.sendKeys(phoneText);

        wait.until(ExpectedConditions.elementToBeClickable(submitCompanyBtn));
        submitCompanyBtn.click();

        return new ReceiptPage(driver);
    }
    public ReceiptPage accessMenuCompanies(){
        wait.until(ExpectedConditions.elementToBeClickable(menuCompanies));
        menuCompanies.click();
        return new ReceiptPage(driver);
    }
    public ReceiptPage accessCreateNewCompany(){
        wait.until(ExpectedConditions.elementToBeClickable(createNewCompany));
        createNewCompany.click();
        return new ReceiptPage(driver);
    }
    public String getCompanyTitle(){
        wait.until(ExpectedConditions.visibilityOfAllElements(companyTitle));
        return companyTitle.getText();
    }
    public ReceiptPage deleteCompany(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteCompany));
        deleteCompany.click();
        return new ReceiptPage(driver);
    }
    public String getTicketStage(){
        wait.until(ExpectedConditions.visibilityOfAllElements(validateTitle));
        return validateTitle.getText();
    }
}
