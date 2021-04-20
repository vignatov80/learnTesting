package config;

import model.FileNum;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;

public class BaseChromeConfiguration extends ReadProperties {
    protected WebDriver driver;
    /**
     * Initialization of Chrome driver
     */
    @Before
    public void initConfig() {
        configFileReader();
        System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver.path"));
        driver = new ChromeDriver();
    }

    /**
     * Make screenshots
     */
    @After
    public void makeScreenShot() {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotFile, new File("screenshots\\chrome"+getSomeKindOfSequece()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        getSomeKindOfSequece();
        driver.quit();
    }

    /**
     * Autoincrement for Chrome screens
     */
    private Long getSomeKindOfSequece() {
        final String SEQ_PATH = "sequence\\chromeSeqFile";

        File file = new File(SEQ_PATH);
        if (!file.exists()) {
            System.out.println("File not exists");

            FileNum fileNum = new FileNum(1L);

            try {
                FileOutputStream fileOutputStream = new FileOutputStream(SEQ_PATH);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(fileNum);
                objectOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        try {
            Long num;
            FileInputStream fileInputStream = new FileInputStream(SEQ_PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            FileNum fileNum1 = (FileNum) objectInputStream.readObject();
            num = fileNum1.getNum();
            fileNum1.setNum(num+1);

            FileOutputStream fileOutputStream = new FileOutputStream(SEQ_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(fileNum1);
            objectOutputStream.close();

            return num;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
