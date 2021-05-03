package UI_tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDr {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/ibrah/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

}
