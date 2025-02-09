package PoundLand;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class PoundLand_Login {

      SeleniumActions seleniumActions;


        By acceptcookie = By.xpath("(//button[normalize-space()='Accept All Cookies'])[1]");
        By signInBox = By.xpath("//li[contains(@class,'customer-account')]/a[contains(normalize-space(),'sign in')]");
        By signInBox1 = By.xpath("//div[@class='primary']/a[text()='Sign In']");
        By userNameInputBox = By.xpath("//input[@name='Email Address']");
        By passwordInputBox = By.xpath("//input[@name='Password']");
        By loginButton = By.xpath("//button[@type='submit']");

    public PoundLand_Login(WebDriver driver) {
            seleniumActions = new SeleniumActions(driver);
        PageFactory.initElements(driver,this);
        }
        public  void login (String username, String password){

            seleniumActions.enterValue(userNameInputBox, username);
            seleniumActions.enterValue(passwordInputBox, password);
            seleniumActions.clickOnElement(loginButton);
        }
        public void acceptcookie (){
        seleniumActions.elementNot1(acceptcookie);
        }
        public void siginbox(){
        seleniumActions.elementNot1(signInBox);
        }
        public void siginbox1(){
        seleniumActions.elementNot1(signInBox1);
        }
    }

