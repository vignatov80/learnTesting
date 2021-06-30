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

//    public CompaniesT14() {}

    public CompaniesT14(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public CompaniesT14(WebDriver driver, String insertCompanyName) {

        super(driver);

        wait.until(ExpectedConditions.elementToBeClickable(menuCompanies));
        this.menuCompanies.click();

        wait.until(ExpectedConditions.elementToBeClickable(createNewCompany));
        this.createNewCompany.click();

        wait.until(ExpectedConditions.visibilityOfAllElements(companyName));
        this.companyName.clear();
        this.companyName.sendKeys(insertCompanyName);

        this.level1RadioBtn.click();

        this.submitCompanyBtn.click();

        wait.until(ExpectedConditions.visibilityOfAllElements(companyTitle));
    }

//    public static CompaniesT14 using(WebDriver driver) {
//        return new CompaniesT14(driver);
//    }

    public static class Builder {
        private String insertCompanyName;


        public Builder(){}

        public Builder setCompanyName(String insertCompanyName) {
            this.insertCompanyName = insertCompanyName;
            return this;
        }

        public CompaniesT14 build() {
            return new CompaniesT14(driver,insertCompanyName);
        }
    }
}
