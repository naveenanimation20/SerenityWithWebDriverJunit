package Steps;

import UIPages.ContactsPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ContactsPageSteps {

    private ContactsPage contactsPage;

    @Step
    public void selectHeading(String value){
       String selectValue = contactsPage.selectHeading(value);
        Assert.assertTrue(value.equals(selectValue));
    }
}
