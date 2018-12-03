package com.telRan.ashkelon;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() {
        initContactCreation();
        fillContactForm(new ContactData("name", "lname", "Tel-Aviv", "s@g.com", "123455666"));
        submitContactCreation();
    }

    public void submitContactCreation() {
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getfName());
        type(By.name("lastname"), contactData.getlName());
        type(By.name("address"), contactData.getAddress());
        type(By.name("email"), contactData.getEmail());
        type(By.name("home"), contactData.getPhoneHome());
    }

    public void initContactCreation() {
        click(By.xpath("//a[@href='edit.php']"));
    }


}
