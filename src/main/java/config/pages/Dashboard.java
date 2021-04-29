package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends PageObject {

    @FindBy(id="menu-dashboard")
    private WebElement menuDashboard;

    public Dashboard(WebDriver driver) {
        super(driver);
    }
    public ReceiptPage accessMenuDashboard(){
        menuDashboard.click();
        return new ReceiptPage(driver);
    }
}
