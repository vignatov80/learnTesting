package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class SIgnUp extends PageObject {
    @FindBy(id="username")
    private WebElement userName;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(id="login-signin")
    private WebElement signin;

    public SIgnUp(WebDriver driver) {
        super(driver);
    }


    public void enterUserName(String userName) {
        this.userName.clear();
        this.userName.sendKeys(userName);
    }
    public void enterPassword(String password){
        this.password.clear();
        this.password.sendKeys(password);
    }
    public ReceiptPage submit (){
        signin.click();
        return new ReceiptPage(driver);
    }

}
