package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

public class Managers extends PageObject {

    @FindBy(id="menu-managers")
    private WebElement menuManagers;

    @FindBy(id="managers-new-manager")
    private WebElement newManager;

    @FindBy(id="firstName")
    public WebElement firstName;

    @FindBy(id="lastName")
    public WebElement lastName;

    @FindBy(xpath="//*[@id = 'email']")
    public WebElement email;

    @FindBy(id ="login")
    private WebElement login;

    @FindBy(id ="phone")
    public WebElement phone;

    @FindBy(id ="skype")
    public WebElement skype;

    @FindBy(id ="manager-form-department-select")
    public WebElement departmentId;

    @FindBy(id ="manager-form-submit")
    private WebElement submit;

    @FindBy(id = "search-manager-firstname")
    private WebElement searchFirstName;

    @FindBy(id = "search-manager-lastname")
    private WebElement searchLastName;

    @FindBy(xpath = "//*[@id='search-manager-filter']")
    private WebElement filterManagers;

    @FindBy(xpath = "//td[contains (text(),'Комната добра')]/preceding-sibling::td/a")
    private WebElement createdManager;

    @FindBy(xpath = "//div[contains (text(),'Name')]/following-sibling::div/p[@class='text-left']")
    public WebElement getTitle;

    @FindBy(xpath = "//div[contains (text(),'Phone')]/following-sibling::div/p[@class='text-left']")
    public WebElement getPhoneNr;

    @FindBy(xpath = "//div[contains (text(),'Skype')]/following-sibling::div/p[@class='text-left']")
    public WebElement getSkype;

    @FindBy(xpath = "//td[contains(text(),'.com')]")
    public WebElement getEmail;

    @FindBy(xpath = "//div[contains (text(),'Login')]/following-sibling::div/p[@class='text-left']")
    public WebElement getLogin;

    @FindBy(xpath = "//div[contains (text(),'Department')]/following-sibling::div/p[@class='text-left']")
    public WebElement getDepartment;

    @FindBy(id="manager-details-backtolist")
    public WebElement goBack;


    WebDriverWait wait = new WebDriverWait(driver, 10);


    public Managers(WebDriver driver) {
        super(driver);
    }
    Map<String,String> map = new HashMap<>();

    public ReceiptPage accessMenuDepartments(){
        wait.until(ExpectedConditions.elementToBeClickable(menuManagers));
        menuManagers.click();
        return new ReceiptPage(driver);
    }

    public ReceiptPage createNewManager( String insertFirstName, String insertLastName,
                                             String insertEmail, String insertPhoneNumber,
                                             String optionDepartment){
        wait.until(ExpectedConditions.elementToBeClickable(newManager));
        newManager.click();

        wait.until(ExpectedConditions.visibilityOfAllElements(firstName));
        this.firstName.clear();
        this.firstName.sendKeys(insertFirstName);

        wait.until(ExpectedConditions.visibilityOfAllElements(lastName));
        this.lastName.clear();
        this.lastName.sendKeys(insertLastName);

        this.email.clear();
        this.email.sendKeys(insertEmail);

        this.login.clear();
        this.login.sendKeys(insertLastName);

        this.phone.clear();
        this.phone.sendKeys(insertPhoneNumber);

        this.skype.clear();
        this.skype.sendKeys(insertLastName);

        Select drpCompany = new Select(departmentId);
        drpCompany.selectByVisibleText(optionDepartment);



        return new ReceiptPage(driver);
    }

    public void submitManager(){
                submit.click();
    }

    public void managerSearch(String sFirstName,String sLastName){
        wait.until(ExpectedConditions.visibilityOfAllElements(searchFirstName));
        this.searchFirstName.clear();
        this.searchFirstName.sendKeys(sFirstName);

        wait.until(ExpectedConditions.visibilityOfAllElements(searchLastName));
        this.searchLastName.clear();
        this.searchLastName.sendKeys(sLastName);

        wait.until(ExpectedConditions.elementToBeClickable(filterManagers));
        filterManagers.click();

        wait.until(ExpectedConditions.elementToBeClickable(createdManager));
        createdManager.click();
    }

    public void getBack(){
        goBack.click();
        wait.until(ExpectedConditions.visibilityOf(getEmail));
    }


}
