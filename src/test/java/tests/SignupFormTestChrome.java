package tests;

import com.codeborne.selenide.Condition;
import config.BaseChromeConfiguration;
import config.pages.ReceiptPage;
import config.pages.SIgnUp;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SignupFormTestChrome extends BaseChromeConfiguration {

    @Test
    public void logIn(){

        //Access to base URL
        driver.get(properties.getProperty("db.baseUrl"));

        //Imoport Selenium driver
        SIgnUp signUpPage = new SIgnUp(driver);

        //Enter User name, Password
        signUpPage.enterUserName(properties.getProperty("db.login"),properties.getProperty("db.password") );

        // Sign in
        ReceiptPage receiptPage = signUpPage.submit();

        $(By.xpath("//title")).shouldHave(text("Bigom"));
    }
}
