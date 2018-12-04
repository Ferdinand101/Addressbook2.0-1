package com.telran.repeat.manager;

import com.telran.repeat.model.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void confirmContactCreation() {
    click(By.name("submit"));
  }

  public void fillContactForm(Contact contact) {
    type(By.name("firstname"), contact.getfName());
    type(By.name("lastname"), contact.getlName());
    type(By.name("address"), contact.getAddress());
    type(By.name("email"), contact.getEmail());
    type(By.name("home"), contact.getPhoneHome());
  }
  public void fillContactFormModification(Contact contact) {
    type(By.name("firstname"), contact.getfName());
    type(By.name("lastname"), contact.getlName());
    type(By.name("address"), contact.getAddress());
    type(By.name("email"), contact.getEmail());
    type(By.name("home"), contact.getPhoneHome());
  }

  public void initContactCreation() {
    click(By.xpath("//a[@href='edit.php']"));
  }

  public void confirmAlert() {
    wd.switchTo().alert().accept();
  }

  public void deleteContact() {
    click(By.cssSelector("[value=Delete]"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }
  public int getContactCount(){
    return wd.findElements(By.name("selected[]")).size();
  }

  public void initContactModification() {
    click(By.cssSelector("[title=Edit]"));
  }

  public void confirmContactModification() {
    click(By.name("update"));  }

    public boolean isOnTheHomePage() {
      return isElementPresent(By.id("maintable"));

    }
}
