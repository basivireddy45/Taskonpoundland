package PoundLand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    SeleniumActions seleniumActions;

    public HomePage(WebDriver driver) {

        seleniumActions = new SeleniumActions(driver);
        PageFactory.initElements(driver, this);
    }

    By HomePageHeading = By.xpath("//a[@class='logo']/img");
    By productsList = By.xpath("//a[text()='Food & Drink']");
    By itemsSelection = By.xpath("//a[text()='Chocolate']");
    By itemsAddingToFavourites = By.xpath("(//a[@class='action towishlist addtowish'])[2]");
    By addingToCart = By.xpath("(//button[@title='Add'])[2]");

    //@FindBy(xpath ="//a[text()='Food & Drink']")
    //   WebElement productslist;
// @FindBy(xpath = "//a[text()='Chocolate']")
    //  WebElement itemsSelection;

    public String getHomePageHeading() {

        return seleniumActions.getTextMessage(HomePageHeading);
    }

    // public void productslist(){
    //   seleniumActions.moveToElement(productslist,itemsSelection);
    // }
    public void clickonfoodanddrink() throws InterruptedException {
        seleniumActions.elementNot1(productsList);
        //Thread.sleep(10000);
        seleniumActions.elementNot1(itemsSelection);

    }

    public void clickonitems() throws InterruptedException {
        seleniumActions.elementNot1(itemsAddingToFavourites);
        Thread.sleep(1000);
        seleniumActions.elementNot1(addingToCart);
        // }

    }
}

