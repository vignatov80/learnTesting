package tests;

import config.BaseFirefoxConfiguration;
import config.pages.ReceiptPage;
import config.pages.SIgnUp;
import config.pages.Tickets;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class SignUpFormTestMozila extends BaseFirefoxConfiguration {



    @Test
    public void logIn(){
        //Access to base URL
        driver.get(properties.getProperty("db.baseUrl"));

        //Imoport Selenium driver
        SIgnUp signUpPage = new SIgnUp(driver);

        //Write login, password
        signUpPage.enterUserName(properties.getProperty("db.login"),properties.getProperty("db.password"));

        //Press button
        ReceiptPage receiptPage = signUpPage.submit();

        //Page validation
        $(By.xpath("//title")).shouldHave(text("Bigom"));
//        String expectedTitle = "Bigom";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
