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

import static org.junit.Assert.assertEquals;

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

    @FindBy(xpath = "//*[@id='search-manager-filter']")
    private WebElement filterManagers;

    @FindBy(xpath = "//td[contains (text(),'Комната добра')]/preceding-sibling::td/a")
    private WebElement createdManager;

    @FindBy(xpath = "//div[contains (text(),'Name')]/following-sibling::div/p[@class='text-left']")
    private WebElement getTitle;

    @FindBy(xpath = "//div[contains (text(),'Phone')]/following-sibling::div/p[@class='text-left']")
    private WebElement getPhoneNr;

    @FindBy(xpath = "//div[contains (text(),'Skype')]/following-sibling::div/p[@class='text-left']")
    private WebElement getSkype;

    @FindBy(xpath = "//td[contains(text(),'.com')]")
    private WebElement getEmail;

    @FindBy(xpath = "//div[contains (text(),'Login')]/following-sibling::div/p[@class='text-left']")
    private WebElement getLogin;

    @FindBy(xpath = "//div[contains (text(),'Department')]/following-sibling::div/p[@class='text-left']")
    private WebElement getDepartment;

    @FindBy(id="manager-details-backtolist")
    private WebElement goBack;


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
    public ReceiptPage createNewDepartments( String insertFirstName, String insertLastName,
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
    public void managerValidation(String optionDepartment){
        String sFirstName = "First name";
        String sLastName = "Last name";
        String sEmail = "Email";
        String sDepartment = "Department";
        String sPhone = "Phone";
        String sSkype = "Skype";
        String fullName = map.get(sFirstName)+" "+map.get(sLastName);


        map.put(sFirstName,firstName.getAttribute("value"));
        map.put(sLastName,lastName.getAttribute("value"));
        map.put(sEmail,email.getAttribute("value"));
        map.put(sDepartment,departmentId.getAttribute("value"));
        map.put(sPhone,phone.getAttribute("value"));
        map.put(sSkype,skype.getAttribute("value"));

        submit.click();

        wait.until(ExpectedConditions.visibilityOfAllElements(searchFirstName));
        this.searchFirstName.clear();
        this.searchFirstName.sendKeys(map.get(sFirstName));

        wait.until(ExpectedConditions.visibilityOfAllElements(searchLastName));
        this.searchLastName.clear();
        this.searchLastName.sendKeys(map.get(sLastName));

        wait.until(ExpectedConditions.elementToBeClickable(filterManagers));
        filterManagers.click();

        wait.until(ExpectedConditions.elementToBeClickable(createdManager));
        createdManager.click();


        assertEquals(getTitle.getText(),map.get(sFirstName)+" "+map.get(sLastName));
        assertEquals(getPhoneNr.getText(), map.get(sPhone));
        assertEquals(getSkype.getText(), map.get(sSkype) );
        assertEquals(getLogin.getText(), map.get(sSkype) );
        assertEquals(getDepartment.getText(), optionDepartment );

        goBack.click();

        wait.until(ExpectedConditions.visibilityOf(getEmail));
        assertEquals(getEmail.getText(), map.get(sEmail).toLowerCase() );
    }

}
