package Configuration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class BaseChromeConfiguration {
    public WebDriver initConfig() {
        System.setProperty("webdriver.chrome.driver", "C:\\progs\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public void makeScreenShot(WebDriver driver) {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Adriana\\Desktop\\Screenshots\\serviceac2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
