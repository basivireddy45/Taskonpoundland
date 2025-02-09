package PoundLand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumActions {
    public WebDriver driver;

    public SeleniumActions(WebDriver driver){

        this.driver = driver;
    }

    public String getTextMessage(WebElement element){

        return element.getText();
    }

    public String getTextMessage(By by){

        return driver.findElement(by).getText();
    }

    public void clickOnElement(WebElement element){

        element.click();
    }

    public void enterValue(WebElement element, String data){

        element.sendKeys(data);
    }

    public void enterValue(By by, String data){

        driver.findElement(by).sendKeys(data);
    }

    public void clickOnElement(By by){
        driver.findElement(by).click();

    }
    public void elementNot1(By by){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element1.click();

    }
    public void moveToElement(WebElement source,WebElement target){
        Actions actions=new Actions(driver);
        actions.moveToElement(source).moveToElement(target).click().perform();
    }

}
