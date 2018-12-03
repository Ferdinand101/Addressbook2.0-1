package com.telRan.ashkelon;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactDeletionTest extends  TestBase{
    @Test
    public void testDeleteContact(){
        selectContact();
        deleteContact();
        confirmAllert();
    }

    private void confirmAllert() {
        wd.switchTo().alert().accept();
    }

    public void deleteContact() {
        click(By.cssSelector("input[value=Delete]"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }
}
