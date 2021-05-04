package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReceiptPage extends PageObject {

    @FindBy(tagName = "//title")
    private WebElement header;

    public ReceiptPage(WebDriver driver) {

        super(driver);
    }
    public boolean isInitialized() {
        return header.isDisplayed();
    }

    public String confirmationHeader(){

        return header.getText();
    }
}
