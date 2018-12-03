package com.telran.repeat.manager;

import com.telran.repeat.model.Group;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase {

  public GroupHelper(WebDriver wd) {
    super(wd);
  }

  public void deleteGroup() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }


  public void returnToGroupsPage() {
    click(By.linkText("group page"));
  }

  public void initGroupModification() {
    click(By.name("edit"));

  }

  public void confirmGroupModification() {
    click(By.name("update"));
  }

  public void fillGroupForm(Group group) {
    type(By.name("group_name"), group.getGroupName());
    type(By.name("group_header"), group.getGroupHeader());
    type(By.name("group_footer"), group.getGroupFooter());
  }

//  public int getGroupsCount() {
//   return wd.findElements(By.name("selected[]")).size();
//  }

  public int getGroupsCount() {
    int count = wd.findElements(By.name("selected[]")).size();
    return count;
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void confirmGroupCreation() {
    click(By.name("submit"));
  }

  public boolean isGroupPresent() {
    return isElementPresent(By.name("selected[]"));

  }

  public void createGroup() {
    initGroupCreation();
    fillGroupForm(new Group("new", "new 1", "new"));
    confirmGroupCreation();
    returnToGroupsPage();
  }

  public void openGroupsPage() {
    click(By.cssSelector("href='group.php'"));
  }

//  public void createGroup() {
//    initGroupCreation();
//    fillGroupForm(new Group("new", "new 1", "new"));
//    confirmGroupCreation();
//    returnToGroupsPage();
//  }
}
