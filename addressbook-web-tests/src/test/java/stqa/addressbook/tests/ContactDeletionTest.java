package stqa.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by tatyanas on 3/31/17.
 */
public class ContactDeletionTest extends TestBase{

  @Test
  public void testContactDeletion(){
    app.getContactHelper().selectContact();
    app.getContactHelper().initDeleteContact();
    app.getContactHelper().confirmContactDeletion();

  }
}
