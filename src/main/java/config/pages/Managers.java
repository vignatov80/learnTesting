package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;

public class Managers extends PageObject {

    @FindBy(id="menu-managers")
    private WebElement menuManagers;

    @FindBy(id="managers-new-manager")
    private WebElement newManager;

    @FindBy(id="firstName")
    private WebElement firstName;

    @FindBy(id="lastName")
    private WebElement lastName;

    @FindBy(xpath="//*[@id = 'email']")
    private WebElement email;

    @FindBy(id ="login")
    private WebElement login;

    @FindBy(id ="phone")
    private WebElement phone;

    @FindBy(id ="skype")
    private WebElement skype;

    @FindBy(id ="manager-form-department-select")
    private WebElement departmentId;

    @FindBy(id ="manager-form-submit")
    private WebElement submit;

    @FindBy(id = "search-manager-firstname")
    private WebElement searchFirstName;

    @FindBy(id = "search-manager-lastname")
    private WebElement searchLastName;

    WebDriverWait wait = new WebDriverWait(driver, 10);


    public Managers(WebDriver driver) {
        super(driver);
    }


    public ReceiptPage accessMenuDepartments(){
        wait.until(ExpectedConditions.elementToBeClickable(menuManagers));
        menuManagers.click();
        return new ReceiptPage(driver);
    }
    public ReceiptPage createNewDepartments( String insertFirstName, String insertLastName,
                                             String insertEmail, String insertPhoneNumber, String optionDepartment){
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

    HashMap<String,String> map = new HashMap<String, String>();
    public HashMap<String,String> getMappedData(){

        map.put("First name",firstName.getAttribute("value"));
        map.put("Last name",lastName.getAttribute("value"));
        map.put("Email",email.getAttribute("value"));
        map.put("Department",departmentId.getAttribute("value"));
        map.put("Phone",phone.getAttribute("value"));
        map.put("Skype",skype.getAttribute("value"));

        return map;
    }
    public ReceiptPage managerSubmit(){
        submit.click();
        return new ReceiptPage(driver);
    }
    public void insertCredentials(){
        wait.until(ExpectedConditions.textToBePresentInElement(firstName, String.valueOf(true)));
        this.firstName.clear();
        this.firstName.sendKeys(getMappedData().get("First name"));

        wait.until(ExpectedConditions.visibilityOfAllElements(searchLastName));
        this.searchLastName.clear();
        this.searchLastName.sendKeys(getMappedData().get("Last name"));
    }
}
