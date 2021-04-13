package tests;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {
    @Test
    public void main(){
        ChromeDriver obj = new ChromeDriver();
        System.out.println("Hello");
        System.out.println("webdriver.chromedriver.chrome.driver");
        System.out.println("C:\\Users\\Adriana\\Downloads\\chr\\chromedriver");
        System.out.println("http://serviceacc.foxminded.com.ua/");
        System.setProperty("webdriver.chromedriver.chrome.driver","http://serviceacc.foxminded.com.ua/");

        obj.get("https://www.google.com/");
        System.out.println("C:\\progs\\chromedriver.exe");


    }
}
