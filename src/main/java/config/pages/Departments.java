package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Departments extends PageObject {

    @FindBy(id="menu-departments")
    private WebElement menuDepartments;

    @FindBy(id= "new-department")
    private WebElement createDepartment;

    public Departments(WebDriver driver) {
        super(driver);
    }
    public ReceiptPage accessMenuDepartments(){
        menuDepartments.click();
        return new ReceiptPage(driver);
    }
    public ReceiptPage accessCreateDepartment(){
        createDepartment.click();
        return new ReceiptPage(driver);
    }
}
