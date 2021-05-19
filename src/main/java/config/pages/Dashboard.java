package config.pages;

import config.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends PageObject {

    @FindBy(id="menu-dashboard")
    private WebElement menuDashboard;

    @FindBy(xpath = "//button[@id='dashboard-done']")
    private WebElement doneDeadlineButon;

    @FindBy(xpath = "//tbody/tickets-block[1]/div[1]/div[1]/div[1]/h4[1]/a[1]/div[1]")
    private WebElement deadlineIsOverBtn;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/ticketshub-application[1]/div[2]/div[3]/dashboard[1]/div[1]/div[1]/div[1]/div[1]/tbody[1]/tickets-block[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[3]/a[1]")
    private WebElement titleRazrabotka1;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/ticketshub-application[1]/div[2]/div[3]/dashboard[1]/div[1]/div[1]/div[1]/div[1]/tbody[1]/tickets-block[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[7]/td[3]/a[1]")
    private WebElement titleRazrabotka2;

    @FindBy(xpath = "//tbody/tr[9]/td[3]/a[1]")
    private WebElement titleRazrabotka3;

    @FindBy(xpath = "//tbody/tr[10]/td[3]/a[1]")
    private WebElement titleRazrabotka4;

    @FindBy(xpath = "//a[@href= '#/ticket/2066']")
    private WebElement titleFinansi1;

    @FindBy(xpath = "//a[@href= '#/ticket/2067']")
    private WebElement titleFinansi2;

    @FindBy(xpath = "//tbody/tr[12]/td[2]")
    private WebElement idP3;




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
    public void getTitleRazrabotka1(){
        System.out.println((titleRazrabotka1).getText());
    }
    public void getTitleRazrabotka2(){
        System.out.println((titleRazrabotka2).getText());
    }
    public void getTitleRazrabotka3(){
        System.out.println((titleRazrabotka3).getText());
    }
    public void getTitleRazrabotka4(){
        System.out.println((titleRazrabotka4).getText());
    }
    public void getTitleFinansi1(){
        System.out.println((titleFinansi1).getText());
    }
    public void getTitleFinansi2(){
        System.out.println((titleFinansi2).getText());
    }
    public void getIdP3(){
        System.out.println((idP3).getText());
    }

}
