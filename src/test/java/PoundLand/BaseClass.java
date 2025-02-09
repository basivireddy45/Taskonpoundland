package PoundLand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseClass {
    WebDriver driver;

    @BeforeSuite
    public void initializeDrivers() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @BeforeTest
    public void launchApplication() throws InterruptedException {
        driver.get("https://www.poundland.co.uk/");

    }

    @AfterSuite
    public void killSession() {
        driver.quit();
    }
}
