package com.telRan.ashkelon;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation(){
        openGroupsPage();
        initNewGroupCreation();
        fillGroupForm(new GroupData("name", "header", "footer"));
        confirmNewGroupCreation();
        returnToGroupsPage();
    }

    @Test
    public void testGroupCreationlongName(){
        openGroupsPage();
        initNewGroupCreation();
        fillGroupForm(new GroupData("nameeeeeeeeeeeeeeee", "headereeeeeeeeeeeee", "footereeeeeeeeeeeeeeeee"));
        confirmNewGroupCreation();
        returnToGroupsPage();
    }

    @Test
    public void testGroupCreationEmpty(){
        openGroupsPage();
        initNewGroupCreation();
        fillGroupForm(new GroupData("", "", ""));
        confirmNewGroupCreation();
        returnToGroupsPage();
    }


}
