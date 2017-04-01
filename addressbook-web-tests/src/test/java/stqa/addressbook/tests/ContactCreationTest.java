package stqa.addressbook.tests;

import org.testng.annotations.Test;
import stqa.addressbook.tests.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().createContact(new ContactData("FN", "LN", "addr", "34567","adotest13@gmail.com", "test1"));
    app.getNavigationHelper().goToHomePage();
  }

}

