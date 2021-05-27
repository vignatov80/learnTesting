package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Departments extends PageObject {

    @FindBy(id="menu-departments")
    private WebElement menuDepartments;

    @FindBy(id= "new-department")
    private WebElement createDepartment;

    @FindBy(id="name")
    private WebElement departmentName;

    @FindBy(id="department-form-additional-info")
    private WebElement additionalInfo;

    @FindBy(id="phone")
    private WebElement addPhoneNumber;

    @FindBy(id="skype")
    private WebElement addSkypeId;

    @FindBy(id="website")
    private WebElement addWebSite;

    @FindBy(id="email")
    public WebElement addEmail;

    @FindBy(id="country")
    public WebElement addCountry;

    @FindBy(id="street")
    public WebElement addStreet;

    @FindBy(id="building")
    public WebElement addBuilding;

    @FindBy(id="city")
    public WebElement addCity;

    @FindBy(id="zipcode")
    public WebElement addZipCoed;

    @FindBy(id="roomNumber")
    public WebElement addRoomNumber;

    @FindBy(id="department-form-submit")
    public WebElement departmentSubmit;


    WebDriverWait wait = new WebDriverWait(driver, 10);

    public Departments(WebDriver driver) {
        super(driver);
    }

    public ReceiptPage accessMenuDepartments(){
        wait.until(ExpectedConditions.elementToBeClickable(menuDepartments));
        menuDepartments.click();
        return new ReceiptPage(driver);
    }
    public ReceiptPage accessCreateDepartment(){
        wait.until(ExpectedConditions.elementToBeClickable(createDepartment));
        createDepartment.click();
        return new ReceiptPage(driver);
    }
    public void enterDepartmentName(String departmentName) {
        this.departmentName.clear();
        this.departmentName.sendKeys(departmentName);
    }
    public ReceiptPage accessAdditionalInfo(){
        additionalInfo.click();
        return new ReceiptPage(driver);
    }
    public void enterPhoneNumber(String addPhoneNumber) {
        this.addPhoneNumber.clear();
        this.addPhoneNumber.sendKeys(addPhoneNumber);
    }
    public void enterSkypeId(String addSkypeId){
        this.addSkypeId.clear();
        this.addSkypeId.sendKeys(addSkypeId);
    }
    public void enterWebSite(String addWebSite){
        this.addWebSite.clear();
        this.addWebSite.sendKeys(addWebSite);
    }
    public void enterEmail(String addEmail){
        this.addEmail.clear();
        this.addEmail.sendKeys(addEmail);
    }
    public void enterAddress(String addCountry, String addStreet, String addBuildingNr, String addCity){
        this.addCountry.clear();
        this.addCountry.sendKeys(addCountry);

        this.addStreet.clear();
        this.addStreet.sendKeys(addStreet);

        this.addBuilding.clear();
        this.addBuilding.sendKeys(addBuildingNr);

        this.addCity.clear();
        this.addCity.sendKeys(addCity);
    }
    public void enterZipCode(String addZipCoed){
        this.addZipCoed.clear();
        this.addZipCoed.sendKeys(addZipCoed);
    }
    public void enterRoomNumber(String addRoomNumber){
        this.addRoomNumber.clear();
        this.addRoomNumber.sendKeys(addRoomNumber);
    }
    public ReceiptPage accessDepartmentSubmit(){
        wait.until(ExpectedConditions.elementToBeClickable(departmentSubmit));
        departmentSubmit.click();
        return new ReceiptPage(driver);
    }
}
