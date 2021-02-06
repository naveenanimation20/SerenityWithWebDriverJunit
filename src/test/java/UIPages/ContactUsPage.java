package UIPages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactUsPage extends PageObject {

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "id_order")
    WebElement orderRef;

    @FindBy(id = "message")
    WebElement message;

    @FindBy(id= "submitMessage")
    WebElement sendButton;

    By heading = By.id("id_contact");
    By chooseFile = By.id("fileUpload");
    By successMesg = By.cssSelector(".alert-success");

    public String fillContactsUsPage(){
        email.sendKeys("naveen@gmail.com");
        orderRef.sendKeys("12345");
        message.sendKeys("Hi pleas solve this query...");

        element(heading).selectByVisibleText("Webmaster");
        upload("/Users/naveenautomationlabs/Downloads/logo.jpg").to(find(chooseFile));
        sendButton.click();
       return element(successMesg).getText();


    }






}
