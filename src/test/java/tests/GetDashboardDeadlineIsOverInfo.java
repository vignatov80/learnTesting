package tests;

import config.BaseChromeConfiguration;
import config.pages.Dashboard;
import config.pages.SIgnUp;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class GetDashboardDeadlineIsOverInfo extends BaseChromeConfiguration {


    @Test
    public void getDashboardDeadlineIsOverInfo(){
        SIgnUp signUpPage = new SIgnUp(driver);
        Dashboard dashboardPage = new Dashboard(driver);

        //Enter User name, Password
        signUpPage.enterUserName(properties.getProperty("db.login"),properties.getProperty("db.password") );
        //Press button
        signUpPage.submit();
        //Press menu dashboard button
        dashboardPage.accessMenuDashboard();
        //Press Menu Dashboard button
        dashboardPage.accessDoneDeadlineButton();
        //Deadline Is Over Button
        dashboardPage.accessDoneDeadlineIsOverButton();

        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.SECONDS);

        //get all Title name for Category = "Разработка"
        System.out.println("Get title where category = РАЗРАБОТКА ");

        dashboardPage.getTitleRazrabotka1();

        dashboardPage.getTitleRazrabotka2();

        dashboardPage.getTitleRazrabotka3();

        dashboardPage.getTitleRazrabotka4();

        //get all Title name for Category = "Финансы"
        System.out.println("Get title where category = ФИНАНСЫ");

        dashboardPage.getTitleFinansi1();

        dashboardPage.getTitleFinansi2();

        //all ID of Priority = P3
        System.out.println("Get ID where Priority = P3");

        dashboardPage.getIdP3();


    }

}

