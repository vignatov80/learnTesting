package tests;

import config.BaseChromeConfiguration;
import config.pages.Dashboard;
import org.junit.Test;

public class Test9Subparagraph4 extends BaseChromeConfiguration {

    @Test
    public void getDashboardDeadlineIsOverInfo() {

        Dashboard dashboardPage = new Dashboard(driver);
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        Thread.sleep(2000);

        //Press menu dashboard button
        dashboardPage.accessMenuDashboard();
        //Press Menu Dashboard button
        dashboardPage.accessDoneDeadlineButton();
        //Deadline Is Over Button
        dashboardPage.accessDoneDeadlineIsOverButton();

//        Thread.sleep(2000);
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

