package Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

public class TablesSorting {
    WebDriver driver;

    String firstName = "Cierra";
    String firstName1 = "Alden";
    String firstName2 = "Kierra";
    String firstName3 = "Alden";
    String FirstName4 = "Kierra";
    @BeforeClass
    public void initializeBrowser() {
        driver = new ChromeDriver();

    }

    @Test
    public void fetchingTextBasedOnTheName() {

        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().window().maximize();
//td[@scope='row' and contains(normalize-space(),'Cierra')]/../td[not(a)]
//td[@scope='row' and contains(normalize-space(),'Cierra')]/parent::tr/td[not(a)]
        List<WebElement> data = driver.findElements(By.xpath("//td[@scope='row' and contains(normalize-space(),'" + firstName1 + "')]/../td[not(a)]"));
        List<String> tableData = new ArrayList<>();

        for (int i = 0; i < data.size(); i++) {
            tableData.add(data.get(i).getText());
        }
        System.out.println(tableData);

    }
    @Test
    public void fetchingSpecificColumnDataAndSortingInAscendingOrder(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().window().maximize();

//th[normalize-space()='First Name']/parent::tr/../following-sibling::tbody/tr/td[1]

        List<WebElement> firstNamesColum = driver.findElements(By.xpath("//th[normalize-space()='First Name']/parent::tr/../following-sibling::tbody/tr/td[1]"));
        List<String> firstNamesData = new ArrayList<>();
      // String[] firstNamesData  = new String[firstNamesColum.size()];
        for (int i = 0; i < firstNamesColum.size(); i++) {
           // firstNamesData[i] =firstNamesColum.get(i).getText();
            firstNamesData.add(firstNamesColum.get(i).getText());
           // Collections.sort(firstNamesData);
           // System.out.println(Arrays.toString(firstNamesData));
        }
        //LinkedHashMap<String, String> removeDuplicateNames = new HashSet<>(firstNamesData,);
        //System.out.println(removeDuplicateNames);
    }
    }

