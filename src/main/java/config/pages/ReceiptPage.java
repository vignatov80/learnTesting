package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReceiptPage extends PageObject {

    @FindBy(xpath = "//span[contains(text(),'Tickets')]")
    private WebElement ticket;

    public ReceiptPage(WebDriver driver) {

        super(driver);
    }
    public boolean isInitialized() {
        return ticket.isDisplayed();
    }

    public String confirmationHeader(){

        return ticket.getText();
    }
}
