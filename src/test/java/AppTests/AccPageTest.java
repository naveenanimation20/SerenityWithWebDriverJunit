package AppTests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import Steps.LoginPageSteps;
import Steps.AccPageSteps;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AccPageTest extends BaseTest{

    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    AccPageSteps accPageSteps;

    @Before
    public void setup(){
        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginAsUser();
    }

    @Test
    public void accPageLogoTest(){
        accPageSteps.validateAppLogo();
    }

    @Test
    public void searchTest(){
        String result = accPageSteps.searchProduct("Dress", "T-shirts > Faded Short Sleeve T-shirts");
        Assert.assertTrue(result.equals("Faded Short Sleeve T-shirts"));
    }

    @Test
    public void accPageTitleTest(){
       Assert.assertTrue(accPageSteps.getAccPageTitle().equals("My account - My Store"));
    }

    @Pending
    @Test
    public void accPageOrderHistoryTest(){

    }

    @Pending
    @Test
    public void accPageWishListTest(){

    }

    @Pending
    @Test
    public void accPageMyAddressTest(){

    }



}
