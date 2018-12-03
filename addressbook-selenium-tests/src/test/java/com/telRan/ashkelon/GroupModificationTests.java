package com.telRan.ashkelon;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupModificationTests extends  TestBase {
    @BeforeMethod
    public void ensurePreconditions(){
        openGroupsPage();
        if(!isGroupPresent()){
            createGroup();
        }
    }

    @Test
    public void testGroupModification(){

        openGroupsPage();
        selectGroup();
        initGroupModification();
        fillGroupForm(new GroupData("new name", "", ""));
        confirmGroupModification();
        returnToGroupsPage();
    }

}
