package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContractCreate extends PageObject {

    @FindBy(id="firstName")
    private WebElement firstName;

    @FindBy(id="lastName")
    private WebElement lastName;

    @FindBy(id="email")
    private WebElement email;

    @FindBy(id="login")
    private WebElement login;

    @FindBy(id="contact-form-submit")
    private WebElement contactSubmit;



    public ContractCreate(WebDriver driver) {
        super(driver);
    }

    public void enterFirstNameLastName(String firstName, String lastName) {
        this.firstName.clear();
        this.firstName.sendKeys(firstName);

        this.lastName.clear();
        this.lastName.sendKeys(lastName);
    }

    public void enterEmailLogin(String email, String login) {
        this.email.clear();
        this.email.sendKeys(email);

        this.login.clear();
        this.login.sendKeys(login);
    }
    public ReceiptPage submit(){
        contactSubmit.click();
        return new ReceiptPage(driver);
    }

}
