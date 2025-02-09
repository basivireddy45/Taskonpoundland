package PoundLand2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage1 {
    Seleniumactions seleniumactions;

    public Homepage1(WebDriver driver){
        seleniumactions=new Seleniumactions(driver);

    }
    By SearchBar =By.xpath("//input[@type='text']");
   // By Suggesion = By.xpath("(//ul[@id='klevu_acList']/li/a)[1]");
    By SearchButton = By.xpath("(//button[@type='submit'])[1]");
    By ProductName = By.xpath("//span[contains(@class,'product-item-name')]/a");
    By ProductPrice = By.xpath("//span[@class='decimal']/../parent::span");
    By AddTOCartButton =By.xpath("//button[@type='submit' and @title='Add']/span");
    public void goToSearchBar(){
        seleniumactions.enterValue(SearchBar,"biscuits");
    }
    public void clickOnSearchButton(){
        seleniumactions.clickOnElement(SearchButton);
    }

    public String getProductName(){
        return seleniumactions.getTextMessage(ProductName);
    }

    public String getProductPrice(){
        return seleniumactions.getTextMessage(ProductPrice);
    }
    public void clickOnAddButton(){
        seleniumactions.clickOnElement(AddTOCartButton);
    }

    }



