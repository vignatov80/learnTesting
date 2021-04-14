package config;

import model.FileNum;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;

public class BaseFirefoxConfiguration {
    protected WebDriver driver;

    @Before
    public void initConfig() {
        System.setProperty("webdriver.gecko.driver","C:\\progs\\geckodriver-master\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @After
    public void makeScreenShot() {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotFile, new File("screenshots\\firefox"+getSomeKindOfSequece()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        getSomeKindOfSequece();
        driver.quit();
    }

    private Long getSomeKindOfSequece() {
        final String SEQ_PATH = "sequence\\firefoxSeqFile";

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
