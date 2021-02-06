package AppTests;

import Steps.LoginPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginPageTest extends BaseTest{


    @Steps
    LoginPageSteps loginPageSteps;

    @Title("Login test with correct data")
    @Test
    public void appLoginTest(){
        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginAsUser();
        loginPageSteps.userShouldBeLogin();
    }

}
