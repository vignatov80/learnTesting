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

    @FindBy(xpath = "//a[contains(text(),'Test Department')]")
    public WebElement createdDepartment;

    @FindBy(xpath = "//div[text()='Name:']/following-sibling::div[@class='col-sm-2']")
    public WebElement validateName;

    @FindBy(xpath = "//div[text()='Phone:']/following-sibling::div[@class='col-sm-2']")
    public WebElement validatePhoneNr;

    @FindBy(xpath = "//div[text()='Skype:']/following-sibling::div[@class='col-sm-2']")
    public WebElement validateSkypeId;

    @FindBy(xpath = "//div[text()='Website:']/following-sibling::div[@class='col-sm-2']")
    public WebElement validateWebSite;

    @FindBy(xpath = "//div[text()='Email:']/following-sibling::div[@class='col-sm-2']")
    public WebElement validateEmail;

    @FindBy(xpath = "//div[text()='Country:']/following-sibling::div[@class='col-sm-2']")
    public WebElement validateCountry;

    @FindBy(xpath = "//div[text()='City:']/following-sibling::div[@class='col-sm-2']")
    public WebElement validateCity;

    @FindBy(xpath = "//div[text()='Street:']/following-sibling::div[@class='col-sm-2']")
    public WebElement validateStreet;

    @FindBy(xpath = "//div[text()='Building:']/following-sibling::div[@class='col-sm-2']")
    public WebElement validateBuildingNr;

    @FindBy(xpath = "//div[text()='Room Number:']/following-sibling::div[@class='col-sm-2']")
    public WebElement validateRoomNr;

    @FindBy(id = "department-details-backtolist")
    private WebElement backBtn;

    @FindBy(xpath = "//td[text()='TestEmail@Test.com']//following-sibling::td[2]/a[@title='Delete']")
    private WebElement deleteDepartmentBtn;

    @FindBy(xpath = "//th[contains(text(),'Title')]/parent::tr/following-sibling::tr[1]/td[1]")
    private WebElement departmentTitle;

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

    public void createDepartment(String departmentName,String addPhoneNr, String addSkype, String addEmail, String addWebSite, String addCountry,
                             String addStreet, String addBuildingNr, String addCity,String addZipCoed,String addRoomNumber){
        wait.until(ExpectedConditions.elementToBeClickable(createDepartment));
        createDepartment.click();

        this.departmentName.clear();
        this.departmentName.sendKeys(departmentName);

        wait.until(ExpectedConditions.elementToBeClickable(additionalInfo));
        additionalInfo.click();

        wait.until(ExpectedConditions.visibilityOfAllElements(addPhoneNumber));
        this.addPhoneNumber.clear();
        this.addPhoneNumber.sendKeys(addPhoneNr);

        wait.until(ExpectedConditions.visibilityOfAllElements(addSkypeId));
        this.addSkypeId.clear();
        this.addSkypeId.sendKeys(addSkype);

        this.addEmail.clear();
        this.addEmail.sendKeys(addEmail);

        this.addWebSite.clear();
        this.addWebSite.sendKeys(addWebSite);

        this.addCountry.clear();
        this.addCountry.sendKeys(addCountry);

        this.addStreet.clear();
        this.addStreet.sendKeys(addStreet);

        this.addBuilding.clear();
        this.addBuilding.sendKeys(addBuildingNr);

        this.addCity.clear();
        this.addCity.sendKeys(addCity);

        this.addZipCoed.clear();
        this.addZipCoed.sendKeys(addZipCoed);

        this.addRoomNumber.clear();
        this.addRoomNumber.sendKeys(addRoomNumber);

        wait.until(ExpectedConditions.elementToBeClickable(departmentSubmit));
        departmentSubmit.click();
    }


    public ReceiptPage accessCreatedDepartment(){
        wait.until(ExpectedConditions.elementToBeClickable(createdDepartment));
        createdDepartment.click();
        return new ReceiptPage(driver);
    }
    public String validateCity(){
        wait.until(ExpectedConditions.visibilityOfAllElements(validateCity));
        return validateCity.getText();
    }
    public String getPhoneNr(){
        wait.until(ExpectedConditions.visibilityOfAllElements(validatePhoneNr));
        return validatePhoneNr.getText();
    }
    public String getSkypeId(){
        wait.until(ExpectedConditions.visibilityOfAllElements(validateSkypeId));
        return validateSkypeId.getText();
    }
    public String getEmail(){
        wait.until(ExpectedConditions.visibilityOfAllElements(validateEmail));
        return validateEmail.getText();
    }
    public String getCountry(){
        wait.until(ExpectedConditions.visibilityOfAllElements(validateCountry));
        return validateCountry.getText();
    }
    public String getStreet(){
        wait.until(ExpectedConditions.visibilityOfAllElements(validateStreet));
        return validateStreet.getText();
    }
    public String getBuildingNr(){
        wait.until(ExpectedConditions.visibilityOfAllElements(validateBuildingNr));
        return validateBuildingNr.getText();
    }
    public String getRoomNr(){
        wait.until(ExpectedConditions.visibilityOfAllElements(validateRoomNr));
        return validateRoomNr.getText();
    }
    public String getNameField(){
        wait.until(ExpectedConditions.visibilityOfAllElements(validateName));
        return validateName.getText();
    }

    public String getWebSiteField(){
        wait.until(ExpectedConditions.visibilityOfAllElements(validateWebSite));
        return validateWebSite.getText();
    }
    public ReceiptPage goBack(){
        wait.until(ExpectedConditions.elementToBeClickable(backBtn));
        backBtn.click();
        return new ReceiptPage(driver);
    }
    public ReceiptPage deleteDepartment(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteDepartmentBtn));
        deleteDepartmentBtn.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        return new ReceiptPage(driver);
    }
    public void handleAlert(){
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    public String getDepartmentTitle(){
        wait.until(ExpectedConditions.visibilityOfAllElements(departmentTitle));
        return departmentTitle.getText();
    }




}
