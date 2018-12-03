package com.telran.repeat.tests;

import com.telran.repeat.model.Contact;
import org.testng.annotations.Test;

public class ContactModificationTests extends  TestBase {
  @Test
  public void testsContactModification(){
    app.getNavigationHelper().openHomePage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new Contact("hh", "jj", "hh", "ss", "sss"));
    app.getContactHelper().confirmContactModification();
    }

}
