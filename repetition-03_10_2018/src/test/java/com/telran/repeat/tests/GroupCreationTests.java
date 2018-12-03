package com.telran.repeat.tests;

import com.telran.repeat.model.Group;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupCreationTests extends TestBase {
  @DataProvider
  public Iterator<Object[]> validGroups(){
    List<Object[]>list = new ArrayList<>();
    list.add(new Object[]{"test1", "test1", "test1"});
    list.add(new Object[]{"test2", "test2", "test2"});
    list.add(new Object[]{"test3", "test3", "test3"});

    return list.iterator();
  }
@Test (dataProvider = "validGroups")
  public void testGroupCreation(String groupName, String groupHeader, String groupFooter){
  app.getNavigationHelper().openGroupsPage();
  int before = app.getGroupHelper().getGroupsCount();

  app.getGroupHelper().initGroupCreation();
 // Group group = new Group();


  //app.getGroupHelper().fillGroupForm(group);

  app.getGroupHelper().confirmGroupCreation();
  app.getGroupHelper().returnToGroupsPage();

  int after = app.getGroupHelper().getGroupsCount();

 // System.out.println("count before is: " + before + " and count after is: " + after);
  Assert.assertEquals(after, before+1);

}
}
