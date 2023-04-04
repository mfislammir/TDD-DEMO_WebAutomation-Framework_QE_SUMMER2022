package amazon.testPages;

import amazon.pages.RegistrationPage;
import config.common.WebTestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import amazon.pages.HomePage;

import static config.common.GlobalReUsableMethods.clickOnWebElement;

public class HomePageTest extends WebTestBase {

    public HomePage homePage;
    public RegistrationPage registrationPage;

   // @BeforeMethod
    public void getInItElements() {
        PageFactory.initElements(driver, HomePage.class);
        homePage = new HomePage(driver);
        registrationPage = new RegistrationPage(driver);
    }

   // @Test
    public void verifySelectMenButton() throws InterruptedException {
        getInItElements();
        homePage.clickOnMenButton();
        waitFor(5);
    }
  //  @Test
    public void verifySearchCustomItems() throws InterruptedException {
        getInItElements();
        homePage.searchCustomItem();
        waitFor(3);
    }
    @Test
    public void verifyMouseHoverOver() throws InterruptedException {
        getInItElements();
        homePage.selectSignInOption();
    }
   //@Test
    public void verifyCustomerServiceLink(){
        getInItElements();
        homePage.footerLink();
    }
 //  @Test
    public void verifyKidsPage(){
        getInItElements();
        homePage.getIntoKidsPage();

    }
  //  @Test
    public void verifyHomePage(){
        getInItElements();
        homePage.getIntoHomePage();


    }
   // @Test
    public void verifyBeautyPage() throws InterruptedException {
        getInItElements();
        homePage.getIntoBeautyPage();
    }
   // @Test
    public void verifyJewelryPage() throws InterruptedException {
        getInItElements();
        homePage.getIntoJewelryPage();
    }

  //  @Test
    public void verifyWomenPage() throws InterruptedException {
        getInItElements();
        homePage.getIntoWomenPage();
    }

   // @Test
    public void verifySalesPage() throws InterruptedException {
        getInItElements();
        homePage.getIntoSalePage();
    }





}
