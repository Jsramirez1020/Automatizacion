package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {
    protected static  WebDriver driver;
    private static WebDriverWait wait;

    static{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\G42\\Documents\\curso-selemium\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver,10);
    }
    public Basepage(WebDriver driver){
        Basepage.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public static void navigateTo(String url){
        driver.get(url);
        
    }
}
