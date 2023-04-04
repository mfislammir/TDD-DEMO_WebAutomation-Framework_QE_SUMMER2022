package amazon.pages;

import config.common.GlobalReUsableMethods;
import config.common.WebTestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static amazon.pageElements.HomePageElements.*;
import static config.common.GlobalReUsableMethods.*;


public class HomePage extends WebTestBase {
    // Action Methods class for all type of business logic/ function/ actions purpose: Page Object class

    // Constructor of the Page Object class and pass driver from WebTestBase class
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        //  WebTestBase.driver = driver;
    }

    @FindBy(xpath = manButton)public  WebElement man;
    @FindBy(xpath = menPageList)public  WebElement men;
    @FindBy (xpath= clearance)public WebElement clearanceSales;
    @FindBy (xpath= searchField)public WebElement globalSearchBox;
    //
    @FindBy (xpath= signIN)public WebElement signIn;
    @FindBy (xpath= signIN1)public WebElement signIn1;

    @FindBy (xpath= clickSignIn)public WebElement clickSignInLink;
    @FindBy (xpath= customerService)public WebElement customerServiceLink;
    @FindBy (xpath= customerServiceLink1)public WebElement customerService1;
    @FindBy(how = How.XPATH, using = kidsButton) public WebElement kids;
    @FindBy(how = How.XPATH, using = newArrival)public WebElement newArrivalForKids;
    @FindBy(xpath = home)public WebElement homeButton;
    @FindBy(xpath = getText)public WebElement getHomePageText;
    @FindBy(xpath = beauty)public WebElement getIntoBeauty;
    @FindBy(xpath = beautyText)public WebElement getBeautyText;

    @FindBy(xpath = jewelry)public WebElement jewelryButton;
    @FindBy(xpath = bestSeller)public WebElement bestSellerJewelry;

    @FindBy(xpath = women)public WebElement womenButton;
    @FindBy(xpath = sale)public WebElement saleButton;



    // Action Method:

    public void clickOnMenButton() throws InterruptedException {
        //selectByValueFromSelect(man,"Men");
        clickOnWebElement(man);
        waitFor(5);
        //getListOfElementsByXpath(menPageList);
        //getListOfElementsFromWebElement(men);
       // getListOfString(men);
        //multipleWebElementsWithValidationAndClick(menPageList);
        clickOnWebElement(clearanceSales);
    }

    public void searchCustomItem(){
        clickOnWebElement(man);
        enterValueOnElementByXpath(searchField,"Dress Shirt");
        clickOnWebElement(globalSearchBox);

    }

    public void selectSignInOption() throws InterruptedException {
        waitFor(5);
       mouseHoverByWebElementWithPerform(signIn1);
     // mouseHoverByWebElementWithOutPerform(signIn1);
       // clickOnWebElement(signIn);
       // mouseHoverByWebElement(signIn);
        waitFor(5);
      //  clickOnWebElement(clickSignInLink);
    }

    public void footerLink(){
       // scrollDownToElement(clickSignInLink);
        clickOnWebElement(customerService1);

    }
    public void getIntoKidsPage(){
        clickOnWebElement(kids);
        clickOnWebElement(newArrivalForKids);
    }

    public void getIntoHomePage(){
        clickOnWebElement(homeButton);
        getText(getHomePageText,text);
    }

    public void getIntoBeautyPage() throws InterruptedException {
        mouseHoverByWebElementWithPerform(getIntoBeauty);
        waitFor(5);
        clickOnWebElement(getIntoBeauty);
        getText(getBeautyText,beautyText);

    }
    public void getIntoJewelryPage(){
        clickOnWebElement(jewelryButton);
        clickOnWebElement(bestSellerJewelry);
    }
    public void getIntoWomenPage(){
        clickOnWebElement(womenButton);
    }
    public void getIntoSalePage(){
        clickOnWebElement(saleButton);
    }


}
