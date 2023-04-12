package amazon.pages;

import config.common.WebTestBase;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataGettingFromExcel extends WebTestBase {

    public DataGettingFromExcel(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void testDataFromExcel() throws IOException, InterruptedException {
        String filePath = "../TDD-DEMO_WebAutomation-Framework_QE_SUMMER2022/DataTest/TestData1.xlsx";;
       // String filePath1 = "../TDD-DEMO_WebAutomation-Framework_QE_SUMMER2022/DataTest/TestDataForSearchBox.xlsx";;
        FileInputStream fileInputStream;
        Workbook workbook;
       // fileInputStream=new FileInputStream(filePath);
        fileInputStream=new FileInputStream(filePath);
        workbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet= (XSSFSheet) workbook.getSheetAt(0);
        //XSSFSheet xssfSheet=workbook.getSheet("sheet7");
        driver.findElement(By.xpath("//span[normalize-space()='Sign In']")).click();
        int rowCount=sheet.getLastRowNum();
        for (int i=1; i<rowCount;i++){
            XSSFRow cellData=sheet.getRow(i);
        int columnCount=sheet.getRow(i).getLastCellNum();
        System.out.println("RowCount :"+rowCount+"Column Count :"+columnCount);


            String mail=cellData.getCell(0).getStringCellValue();
            String password=cellData.getCell(1).getStringCellValue();

           // String testData=cellData.getCell(0).getStringCellValue();

//             Map<String, String > newMap= new HashMap<>();
//             newMap.put("email","fokrulislambd3@gmail.com");
//             newMap.put("password","Test123");




            driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(mail);
            driver.findElement(By.xpath("//*[@id=\"pw-input\"]")).clear();
            driver.findElement(By.xpath("//*[@id=\"pw-input\"]")).sendKeys(password);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
            driver.findElement(By.xpath("//*[@id=\"pw-input\"]")).clear();
          // driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[4]/div[1]/div/form/button/text()")).click();

            System.out.println(i+"."+mail+"|| " +"Password "+" || " +password);
           // driver.findElement(By.xpath("//*[@id=\"globalSearchInputField\"]")).click();
//            driver.findElement(By.xpath("//*[@id=\"globalSearchInputField\"]")).clear();
//            driver.findElement(By.xpath("//*[@id=\"globalSearchInputField\"]")).sendKeys(testData);

        }
    }



    public void demo(){
        List<String> productList= new ArrayList<>();
        productList.add("Hand Sanitizer");
        productList.add("Face mask");
        productList.add("iPhone 14");
        productList.add("T-shirt");
        productList.add("Pant");
        for (String st:productList) {
            driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(st);
            driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
            // Assertion

            driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
        }

    }
}
