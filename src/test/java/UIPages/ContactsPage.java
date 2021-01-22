package UIPages;

import net.serenitybdd.core.pages.PageObject;

public class ContactsPage extends PageObject {

    public String selectHeading(String value){
        String val = $("#id_contact").selectByVisibleText(value).getSelectedVisibleTextValue();
        System.out.println("select value is : " + val);
        return val;
    }




}
