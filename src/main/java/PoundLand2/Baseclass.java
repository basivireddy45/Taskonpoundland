package PoundLand2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Baseclass {

        WebDriver driver;

        @BeforeSuite
        public void initializeDrivers() {

            driver = new EdgeDriver();

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().deleteAllCookies();

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


