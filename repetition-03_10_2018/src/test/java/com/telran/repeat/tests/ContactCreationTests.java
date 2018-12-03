package com.telran.repeat.tests;

import com.telran.repeat.model.Contact;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ContactCreationTests extends TestBase {
  @BeforeMethod
  public void ensurePrecondition(){
    if(!app.getContactHelper().isOnTheHomePage()){
      app.getNavigationHelper().openHomePage();
    }

  }
  @Test
  public void createContactTest() throws IOException {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new Contact("Moshe", "Coen", "Tel-Aviv", "gg@hh.com", "134455566"));
    app.getContactHelper().confirmContactCreation();
    

  }
}
