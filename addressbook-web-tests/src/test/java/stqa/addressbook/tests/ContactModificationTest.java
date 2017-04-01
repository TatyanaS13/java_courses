package stqa.addressbook.tests;

import org.testng.annotations.Test;
import stqa.addressbook.tests.model.ContactData;

/**
 * Created by tatyanas on 3/31/17.
 */
public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification(){
    app.getNavigationHelper().goToHomePage();
    if (! app.getContactHelper().isThereContact()){
      app.getContactHelper().createContact(new ContactData("Kelly", "Carter", "Street56", "232323", "arctest13@gmail.com", "test1"));
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Serg","Sergeev", "Street 16", "388-377-377", "arctest13@gmail.com", null), false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().goToHomePage();
  }
}
