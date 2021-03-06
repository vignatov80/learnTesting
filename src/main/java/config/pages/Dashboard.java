package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Dashboard extends PageObject {
    /*
    Declare all locators
     */
    @FindBy(xpath="//a[@href='#/dashboard']")
    private WebElement menuDashboard;

    @FindBy(xpath = "//button[@id='dashboard-done']")
    private WebElement doneDeadlineButon;

    @FindBy(xpath = "//*[@href='#collapse7']/div")
    private WebElement deadlineIsOverBtn;

    @FindBy(xpath="//*[contains(text(),'Разраб')]/ancestor::td/preceding-sibling::td[@style='text-align: left; width: 20%;']")
    List<WebElement> titleForRazrabotka;

    @FindBy(xpath="//*[contains(text(),'Финансы')]/ancestor::td/preceding-sibling::td[@style='text-align: left; width: 20%;']")
    List<WebElement> titleFinansi;

    @FindBy(xpath="//*[contains(text(),'P3')]/preceding-sibling::td[@style='width: 5% !important;']")
    List<WebElement> titleP3;

    WebDriverWait wait = new WebDriverWait(driver, 10);
     /*
    Accessing the locators
     */
    public Dashboard(WebDriver driver) {
        super(driver);
    }

    public ReceiptPage accessMenuDashboard(){
        wait.until(ExpectedConditions.elementToBeClickable(menuDashboard));
        menuDashboard.click();
        return new ReceiptPage(driver);
    }
    public ReceiptPage accessDoneDeadlineButton(){
        doneDeadlineButon.click();
        return new ReceiptPage(driver);
    }
    public ReceiptPage accessDoneDeadlineIsOverButton(){
        deadlineIsOverBtn.click();
        return new ReceiptPage(driver);
    }
    public void getTitleRazrabotka(){
        wait.until(ExpectedConditions.visibilityOfAllElements(titleForRazrabotka));
        for(WebElement eachElement : titleForRazrabotka ) {
            System.out.println(eachElement.getText());
        }
    }
    public void getTitleFinansi(){
        wait.until(ExpectedConditions.visibilityOfAllElements(titleFinansi));
        for(WebElement eachElement : titleFinansi ) {
            System.out.println(eachElement.getText());
        }
    }
    public void getTitleP3(){
        wait.until(ExpectedConditions.visibilityOfAllElements(titleP3));
        for(WebElement eachElement : titleP3 ) {
            System.out.println(eachElement.getText());
        }
    }

}


