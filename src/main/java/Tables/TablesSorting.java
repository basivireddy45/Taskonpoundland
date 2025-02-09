package Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TablesSorting {
    WebDriver driver;


    @BeforeClass
    public void initializeBrowser(){
        driver=new ChromeDriver();
    }

    @Test
    public void verifyDataInTheTable(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().window().maximize();

        List<WebElement> headerRow = driver.findElements(By.xpath("//div[@class='bd-example table-responsive']/table/thead/tr/th[not(text()='Action')]"));
        List<String> headerRowData = new ArrayList<>();



