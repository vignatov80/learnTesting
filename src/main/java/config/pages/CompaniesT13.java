package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompaniesT13 extends PageObject {

    @FindBy(id = "menu-companies")
    private WebElement menuCompanies;

    @FindBy(id = "new-company")
    private WebElement createNewCompany;

    @FindBy(id = "company-sla-level-2")
    private WebElement level1RadioBtn;

    @FindBy(id = "name")
    private WebElement companyName;

    @FindBy(id = "ticketPrefix")
    private WebElement ticketPrefix;

    @FindBy(id = "company-submit-btn")
    private WebElement submitCompanyBtn;

    @FindBy(xpath = "//a[contains(text(),'TestCompanyName')]")
    private WebElement companyTitle;

    @FindBy(xpath = "//tbody/tr[2]/td[5]/a[1]/i[1]")
    private WebElement deleteCompany;


    public CompaniesT13() {}

    public CompaniesT13(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public WebElement getMenuCompanies() { return menuCompanies; }

    public void setMenuCompanies(WebElement menuCompanies) { this.menuCompanies = menuCompanies; }

    public WebElement getCreateNewCompany() { return createNewCompany; }

    public void setCreateNewCompany(WebElement createNewCompany) { this.createNewCompany = createNewCompany; }

    public WebElement getLevel1RadioBtn() { return level1RadioBtn; }

    public void setLevel1RadioBtn(WebElement level1RadioBtn) { this.level1RadioBtn = level1RadioBtn; }

    public WebElement getCompanyName() { return companyName; }

    public void setCompanyName(WebElement companyName) { this.companyName = companyName; }

    public WebElement getTicketPrefix() { return ticketPrefix; }

    public void setTicketPrefix(WebElement ticketPrefix) { this.ticketPrefix = ticketPrefix; }

    public WebElement getSubmitCompanyBtn() { return submitCompanyBtn; }

    public void setSubmitCompanyBtn(WebElement submitCompanyBtn) { this.submitCompanyBtn = submitCompanyBtn; }

    public WebDriverWait getWait() { return wait; }

    public void setWait(WebDriverWait wait) { this.wait = wait; }

    public static CompaniesT13 using(WebDriver driver) {
        return new CompaniesT13(driver);
    }

    public CompaniesT13 clickMenuCompanies() {
        wait.until(ExpectedConditions.elementToBeClickable(menuCompanies));
        this.menuCompanies.click();
        wait.until(ExpectedConditions.elementToBeClickable(createNewCompany));
        this.createNewCompany.click();
        return this;
    }

    public CompaniesT13 companyName(String insertCompanyName) {
        wait.until(ExpectedConditions.visibilityOfAllElements(companyName));
        this.companyName.clear();
        this.companyName.sendKeys(insertCompanyName);
        return this;
    }

    public CompaniesT13 serviceProgram() {
        this.level1RadioBtn.click();
        return this;
    }

    public CompaniesT13 submit() {
        this.submitCompanyBtn.click();
        return this;
    }

    public void deleteCompany(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteCompany));
        this.deleteCompany.click();
    }
}
