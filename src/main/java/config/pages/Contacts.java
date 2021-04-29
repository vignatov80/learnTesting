package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contacts extends PageObject {

    @FindBy(id="menu-contacts")
    private WebElement menuContacts;

    @FindBy(id= "create-contact")
    private WebElement createContact;

    public Contacts(WebDriver driver) {
        super(driver);
    }
    public ReceiptPage accessMenuContacts(){
        menuContacts.click();
        return new ReceiptPage(driver);
    }
    public ReceiptPage accessCreateContact(){
        createContact.click();
        return new ReceiptPage(driver);
    }
}