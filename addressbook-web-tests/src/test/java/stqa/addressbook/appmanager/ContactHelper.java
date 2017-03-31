package stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import stqa.addressbook.tests.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void initAddNewContact() {
    click(By.linkText("add new"));
  }

  public void returnToHomePage() {
    click(By.linkText("home page"));
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getPhone());
    type(By.name("email"), contactData.getEmail());
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
}
