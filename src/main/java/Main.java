import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.junit.Assert.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        System.setProperty("webdriver.gecko.driver","C:\\progs\\geckodriver-master\\geckodriver.exe");
        System.out.println("Hello");
        WebDriver obj = new FirefoxDriver();
        obj.get("http://serviceacc.foxminded.com.ua/");
        obj.quit();

        int a = 1;
        String v = "aaaaa";

        if (a == 1 || v == "a") {
            a = 5;
        }

        if (a == 1 && v == "a") {
            a = 5;
        }
    }

    @Test
    public void test() {
        Properties prop = new Properties();
        try {
            InputStream input = new FileInputStream("config.properties");
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(prop.getProperty("vlad"));
        System.out.println(prop.getProperty("path"));

        String pah = prop.getProperty("mozilaPath");
        System.out.println(pah);

        System.out.println("Hello");
        int aa = 1;

        Assert.assertEquals(aa, 1);
    }
}