package config.pages;

import config.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Dashboard extends PageObject {

    @FindBy(xpath="//i[contains(text(),'dashboard')]")
    private WebElement menuDashboard;

    @FindBy(xpath = "//button[@id='dashboard-done']")
    private WebElement doneDeadlineButon;

    @FindBy(xpath = "//*[@href='#collapse7']/div")
    private WebElement deadlineIsOverBtn;

    List<WebElement> titleForRazrabotka = driver.findElements(By.xpath("//*[contains(text(),'Разработка')]/ancestor::td/preceding-sibling::td[@style='text-align: left; width: 20%;']"));

    List<WebElement> titleFinansi = driver.findElements(By.xpath("//*[contains(text(),'Финансы')]/ancestor::td/preceding-sibling::td[@style='text-align: left; width: 20%;']"));

    List<WebElement> titleP3 = driver.findElements(By.xpath("//*[contains(text(),'P3')]/preceding-sibling::td[@style='width: 5% !important;']"));



    public Dashboard(WebDriver driver) {
        super(driver);
    }
    public ReceiptPage accessMenuDashboard(){
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
        for(WebElement eachElement : titleForRazrabotka ) {
            System.out.println(eachElement.getText());
        }
    }
    public void getTitleFinansi(){
        for(WebElement eachElement : titleFinansi ) {
            System.out.println(eachElement.getText());
        }
    }
    public void getTitleP3(){
        for(WebElement eachElement : titleP3 ) {
            System.out.println(eachElement.getText());
        }
    }
}
