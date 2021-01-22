package Steps;

import UIPages.ContactsPage;
import UIPages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginPageSteps {

    private LoginPage loginPage;

    @Step
    public void isOnLoginPage(){
        loginPage.open();
    }

    @Step
    public void loginAsUser(){
        loginPage.doLogin();
    }

    @Step
    public void userShouldBeLogin(){
        Assert.assertTrue(loginPage.accountPageIsVisible().equals("MY ACCOUNT"));
    }

    @Step
    public void navigateToContactsPage(){
        loginPage.navigateToContactsPage();
    }

}
