package amazon.pages;

import config.common.WebTestBase;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderFromExce extends WebTestBase {

//    public DataProviderFromExce(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }
//    @Test(dataProvider = "getTestData")
//    public void signInTest(){
//
//        Object [][] data= {
//            {"fokrulislambd@gmail.com", "Test123"},
//            {"test@gmail.com", "Test123"}
//        };
//
//       Object[][] arrayData=getData();
//
//       driver.findElement(By.xpath("//span[normalize-space()='Sign In']")).click();
//        driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
//        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(arrayData);
//        driver.findElement(By.xpath("//*[@id=\"pw-input\"]")).clear();
//        driver.findElement(By.xpath("//*[@id=\"pw-input\"]")).sendKeys(arrayData);
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[4]/div[1]/div/form/button/text()")).click();
//
//    }
//
//@DataProvider(name="getTestData")
//    public Object[][] getData(){
//        String [][] data=new String[][]{
//                {"fokrulislambd@gmail.com", "Test123"},
//                {"test@gmail.com", "Test123"}
//        };
//
//    for (String[] dt : data) {
//        for (Object dtt : dt) {
//            System.out.println(dtt);
//        }
//
//    }
//
//        return data;
//    };


}
