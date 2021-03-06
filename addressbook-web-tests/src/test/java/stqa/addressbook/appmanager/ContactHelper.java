package stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import stqa.addressbook.tests.model.ContactData;

public class ContactHelper extends HelperBase {

  private ContactData contact;

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void initAddNewContact() {
    click(By.linkText("add new"));
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getPhone());
    type(By.name("email"), contactData.getEmail());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group)")));
    }
  }

  public void initContactModification(){
    click(By.xpath("//img[@title = 'Edit']"));
  }


  public void submitContactModification() {
    click(By.name("update"));
  }

  public void initDeleteContact() {
    click(By.xpath("//input[@value ='Delete']"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public  void confirmContactDeletion(){
    confirmAlert();
  }

  public void createContact(ContactData contact) {
    initAddNewContact();
    fillContactForm(contact, true);
    submitContactCreation();
  }

  public boolean isThereContact() {
    return isElementPresent(By.name("selected[]"));
  }
}
