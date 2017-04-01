package stqa.addressbook.tests;

import org.testng.annotations.Test;
import stqa.addressbook.tests.model.GroupData;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().createGroup(new GroupData("test1", null, null));
  }

}
