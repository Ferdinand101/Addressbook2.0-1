package com.telran.repeat.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupDeletionTests extends  TestBase {
  @BeforeMethod
  public void ensurePreconditions(){
    app.getNavigationHelper().openGroupsPage();

    if(!app.getGroupHelper().isGroupPresent()){
      app.getGroupHelper().createGroup();
    }
  }

  @Test
  public  void testGroupDeletion(){
    int before = app.getGroupHelper().getGroupsCount();

    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteGroup();
    app.getGroupHelper().returnToGroupsPage();

    int after = app.getGroupHelper().getGroupsCount();

    Assert.assertEquals(after, before-1);

  }

}
