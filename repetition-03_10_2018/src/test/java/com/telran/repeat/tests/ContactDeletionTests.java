package com.telran.repeat.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends  TestBase {
  @Test
  public void testContactDeletion(){
      //app.getGroupHelper().openGroupsPage();
    int before = app.getContactHelper().getContactCount();
    app.getNavigationHelper().openHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
    app.getContactHelper().confirmAlert();
  }
}
