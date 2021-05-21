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

        Dashboard dashboardPage = new Dashboard(driver);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Press menu dashboard button
        dashboardPage.accessMenuDashboard();
        //Press Menu Dashboard button
        dashboardPage.accessDoneDeadlineButton();
        //Deadline Is Over Button
        dashboardPage.accessDoneDeadlineIsOverButton();

        //driver.manage().timeouts().implicitlyWait(60000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //get all Title name for Category = "Разработка"
//        System.out.println("Get title where category = РАЗРАБОТКА ");
//        dashboardPage.getTitleRazrabotka();

//        get all Title name for Category = "Финансы"
        System.out.println("Get title where category = ФИНАНСЫ");
        dashboardPage.getTitleFinansi();
//
//        //all ID of Priority = P3
//        System.out.println("Get ID where Priority = P3");
//        dashboardPage.getTitleP3();


    }

}

