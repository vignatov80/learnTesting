package Configuration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class BaseFirefoxConfiguration {
    public WebDriver initConfig() {
        System.setProperty("webdriver.gecko.driver", "C:\\progs\\geckodriver-master\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    public void makeScreenShot(WebDriver driver) {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Adriana\\Desktop\\Screenshots\\geckotest2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
