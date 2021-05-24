package tests;

import config.BaseChromeConfiguration;
import config.pages.Dashboard;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class Test9Subparagraph4 extends BaseChromeConfiguration {

    @Test
    public void getDashboardDeadlineIsOverInfo(){

        Dashboard dashboardPage = new Dashboard(driver);

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        //Press menu dashboard button
        dashboardPage.accessMenuDashboard();
        //Press Menu Dashboard button
        dashboardPage.accessDoneDeadlineButton();
        //Deadline Is Over Button
        dashboardPage.accessDoneDeadlineIsOverButton();


        //  get all Title name for Category = "Разработка"
        System.out.println("Get title where category = РАЗРАБОТКА ");
        dashboardPage.getTitleRazrabotka();

        //get all Title name for Category = "Финансы"
        System.out.println("Get title where category = ФИНАНСЫ");
        dashboardPage.getTitleFinansi();

        //all ID of Priority = P3
        System.out.println("Get ID where Priority = P3");
        dashboardPage.getTitleP3();


    }

}

