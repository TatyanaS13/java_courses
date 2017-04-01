package stqa.addressbook.tests;

import org.testng.annotations.Test;
import stqa.addressbook.tests.model.ContactData;

/**
 * Created by tatyanas on 3/31/17.
 */
public class ContactDeletionTest extends TestBase{

  @Test
  public void testContactDeletion(){
    if (! app.getContactHelper().isThereContact()){
      app.getContactHelper().createContact(new ContactData("FN1","FN2","street" , "phone", "email", "test1"));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().initDeleteContact();
    app.getContactHelper().confirmContactDeletion();

  }
}
