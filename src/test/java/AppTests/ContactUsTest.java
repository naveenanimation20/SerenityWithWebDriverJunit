package AppTests;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Steps.LoginPageSteps;
import Steps.ContactUsPageSteps;

@RunWith(SerenityRunner.class)
public class ContactUsTest extends BaseTest{


    String expMesg = "Your message has been successfully sent to our team.";

    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    ContactUsPageSteps contactUsPageSteps;

    @Before
    public void setup(){
        loginPageSteps.isOnLoginPage();
        loginPageSteps.navigateToContactsUsPage();
    }

    @Test
    public void fillContactUsPageTest(){
       String actualMessage =  contactUsPageSteps.fillContactsUsFormStep();
        System.out.println(actualMessage);
        Assert.assertTrue(actualMessage.equals(expMesg));
    }

    @Pending
    @Test
    public void test1(){

    }

    @Pending
    @Test
    public void test2(){

    }

    @Pending
    @Test
    public void test3(){

    }


}
