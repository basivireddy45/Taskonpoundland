package PoundLand2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage {
    Seleniumactions seleniumactions;
    public BasketPage(WebDriver driver){
        seleniumactions=new Seleniumactions(driver);
    }

    By basketButton=By.xpath("(//span[@class='basket-amount']/span/span[@class='price'])[2]");
    By basketProductName=By.xpath("//div[contains(@class,'item-details')]/strong/a");
    By basketProductPrice=By.xpath("//span[@class='cart-price']/span");
    public void clickOnCartButton(){
        seleniumactions.clickOnElement(basketButton);
    }
    public String getbasketProductName(){


       return   seleniumactions.getTextMessage(basketProductName);
    }
    public String getbasketProductPrice(){
       return   seleniumactions.getTextMessage(basketProductPrice);
    }
}
