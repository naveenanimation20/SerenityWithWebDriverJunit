package AppTests;

import Steps.LoginPageSteps;
import Steps.ContactsPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginPageTest {

    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    ContactsPageSteps contactsPageSteps;

    @Managed(clearCookies = ClearCookiesPolicy.BeforeEachTest, driver = "chrome")
    WebDriver browser;

    @Test
    public void appLoginTest(){
        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginAsUser();
        loginPageSteps.userShouldBeLogin();
    }

    @Test
    public void contactsTest(){
        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginAsUser();
        loginPageSteps.userShouldBeLogin();
        loginPageSteps.navigateToContactsPage();
        contactsPageSteps.selectHeading("Webmaster");
    }

}
