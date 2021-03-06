package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUps extends PageObject {

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public PopUps(WebDriver driver) {
        super(driver);
    }

    public static PopUps using(WebDriver driver) {
        return new PopUps(driver);
    }


    public void handleAlert(){
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}
