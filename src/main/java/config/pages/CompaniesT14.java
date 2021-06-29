package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompaniesT14 extends PageObject {

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

    public CompaniesT14() {}

    public CompaniesT14(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public CompaniesT14(WebElement menuCompanies,
                        WebElement createNewCompany,
                        WebElement level1RadioBtn,
                        WebElement companyName,
                        WebElement ticketPrefix,
                        WebElement submitCompanyBtn,
                        WebElement companyTitle,
                        WebElement deleteCompany) {
        this.menuCompanies = menuCompanies;
        this.createNewCompany = createNewCompany;
        this.level1RadioBtn = level1RadioBtn;
        this.companyName = companyName;
        this.ticketPrefix = ticketPrefix;
        this.submitCompanyBtn = submitCompanyBtn;
        this.companyTitle = companyTitle;
        this.deleteCompany = deleteCompany;
    }

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

    public static CompaniesT14 using(WebDriver driver) {
        return new CompaniesT14(driver);
    }

    public CompaniesT14 clickMenuCompanies() {
        wait.until(ExpectedConditions.elementToBeClickable(menuCompanies));
        this.menuCompanies.click();
        wait.until(ExpectedConditions.elementToBeClickable(createNewCompany));
        this.createNewCompany.click();
        return this;
    }

    public CompaniesT14 companyName(String insertCompanyName) {
        wait.until(ExpectedConditions.visibilityOfAllElements(companyName));
        this.companyName.clear();
        this.companyName.sendKeys(insertCompanyName);
        return this;
    }

    public CompaniesT14 serviceProgram() {
        this.level1RadioBtn.click();
        return this;
    }

    public CompaniesT14 submit() {
        this.submitCompanyBtn.click();
        return this;
    }

    public void deleteCompany(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteCompany));
        this.deleteCompany.click();
    }

    public String getCompanyTitle(){
        wait.until(ExpectedConditions.visibilityOfAllElements(companyTitle));
        return companyTitle.getText();
    }

    public static class Builder {
        private WebElement menuCompanies;

        private WebElement createNewCompany;

        private WebElement level1RadioBtn;

        private WebElement companyName;

        private WebElement ticketPrefix;

        private WebElement submitCompanyBtn;

        private WebElement companyTitle;

        private WebElement deleteCompany;

        public Builder(){}

        public Builder setMenuCompanies(WebElement menuCompanies) {
            this.menuCompanies = menuCompanies;
            return this;
        }

        public Builder setCreateNewCompany(WebElement createNewCompany) {
            this.createNewCompany = createNewCompany;
            return this;
        }

        public Builder setLevel1RadioBtn(WebElement level1RadioBtn) {
            this.level1RadioBtn = level1RadioBtn;
            return this;
        }

        public Builder setCompanyName(WebElement companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder setTicketPrefix(WebElement ticketPrefix){
            this.ticketPrefix = ticketPrefix;
            return this;
        }

        public Builder setSubmitCompanyBtn(WebElement submitCompanyBtn) {
            this.submitCompanyBtn = submitCompanyBtn;
            return this;
        }

        public Builder setCompanyTitle(WebElement companyTitle) {
            this.companyTitle = companyTitle;
            return this;
        }

        public Builder setDeleteCompany(WebElement deleteCompany) {
            this.deleteCompany = companyTitle;
            return this;
        }

        public CompaniesT14 build() {
            return new CompaniesT14(menuCompanies,
                    createNewCompany,
                    level1RadioBtn,
                    companyName,
                    ticketPrefix,
                    submitCompanyBtn,
                    companyTitle,
                    deleteCompany);
        }
    }
}
