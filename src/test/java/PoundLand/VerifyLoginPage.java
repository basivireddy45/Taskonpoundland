package PoundLand;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyLoginPage extends BaseClass {
      PoundLand_Login poundLand_login;
     HomePage homePage;

    @BeforeClass
    public  void initializePages(){
       poundLand_login = new PoundLand_Login(driver);
        homePage = new HomePage(driver);
    }


    @Test
    public void verifySuccessfulLogin() throws InterruptedException {

    poundLand_login.acceptcookie();
    poundLand_login.siginbox();
    poundLand_login.siginbox1();
    poundLand_login.login("basivireddykalakoti@gmail.com","4512Kbr@");
    Thread.sleep(10000);
    // Assert.assertEquals(homePage.getHomePageHeading(),"Poundland");
        homePage.clickonfoodanddrink();
        homePage.clickonitems();
    }
}


