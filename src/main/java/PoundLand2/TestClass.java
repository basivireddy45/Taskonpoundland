package PoundLand2;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass extends Baseclass{
    LoginPage loginpage;
   Homepage1 homepage1;
   BasketPage basketPage;
    @BeforeClass
    public  void initializePages(){
        loginpage = new LoginPage(driver);
        homepage1 = new Homepage1(driver);
        basketPage = new BasketPage(driver);
    }


    @Test
    public void verifySuccessfulLogin() throws InterruptedException {
        loginpage.acceptcookie();
      loginpage.siginbox();
        loginpage.siginbox1();
       loginpage.login("basivireddykalakoti@gmail.com","4512Kbr@");
        Thread.sleep(2000);

        homepage1.goToSearchBar();
        homepage1.clickOnFirstSuggesion();

        Thread.sleep(3000);

        String searchProductName=homepage1.getProductName();
        Thread.sleep(3000);
        String searchProductPrice=homepage1.getProductPrice();
        System.out.println(searchProductName);
        System.out.println(searchProductPrice);
        homepage1.clickOnAddButton();
        basketPage.clickOnCartButton();
        basketPage.getbasketProductName();
        basketPage.getbasketProductPrice();

        String basketProductName= basketPage.getbasketProductName();
        String basketProductPrice=basketPage.getbasketProductPrice();
        System.out.println(basketProductName);
        System.out.println(basketProductPrice);
        Assert.assertEquals(searchProductName,basketProductName);
        Assert.assertEquals(searchProductPrice,basketProductPrice);

    }
}

