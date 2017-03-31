package stqa.addressbook.tests;

import org.testng.annotations.Test;
import stqa.addressbook.tests.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactHelper().initAddNewContact();
    app.getContactHelper().fillContactForm(new ContactData("Alex","Alexandrov", "Street 13", "345-345-345", "adotest13@gmail.com"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }

}

