package UI_tests;

import UI_pages.SE_DataFilterPage;
import UI_pages.SE_FileDownloadPage;
import UI_pages.SE_JQueryBoxListPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReadTxt;

import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


public class SEasyUS_05 {
    Actions actions;
    SE_JQueryBoxListPage jqueryBox;
    SE_DataFilterPage dataFilterPage;

    SE_FileDownloadPage fileDownloadPage;

    {

        jqueryBox = new SE_JQueryBoxListPage();
        dataFilterPage = new SE_DataFilterPage();
        fileDownloadPage = new SE_FileDownloadPage();
    }


    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("https://www.seleniumeasy.com/test/");
        try {
            jqueryBox.popUpMessage.click();
        } catch (Exception ignored) {

        }
        jqueryBox.intermediateArrow.click();
    }

    @Test
    public void TC01() {
        String[] allNames = {"Valentina", "Giovanna", "Helena", "Lara", "Julia"};
        jqueryBox.jQueryListBoxLink.click();
        jqueryBox.selectList(allNames, jqueryBox.selectList);
        jqueryBox.addButton.click();

        Select select = new Select(jqueryBox.selectList);
        int left = select.getOptions().size();

        select = new Select(jqueryBox.selectResultList);
        int right = select.getOptions().size();

        Assert.assertTrue(left == 10 && right == 5);


    }

    @Test
    public void TC02() {


        jqueryBox.dataListFilterButton.click();
        for (WebElement w : dataFilterPage.dataList) {
            Assert.assertTrue(w.getText().contains("@company.com"));
        }

        String name = "Brian Hoyies";
        dataFilterPage.searchBox.sendKeys(name);
        Assert.assertTrue(dataFilterPage.filteredName.isDisplayed());


    }

    @Test
    public void TC03() throws InterruptedException {


         fileDownloadPage.fileDownloadLink.click();
         String text = "Je fait de la pratique";
         Thread.sleep(2000);
         fileDownloadPage.dataTextBox.sendKeys(text);
         Assert.assertTrue(fileDownloadPage.feedBack.getText().contains("478"));

         fileDownloadPage.generateButton.click();
         fileDownloadPage.downloadButton.click();
         String fileName = fileDownloadPage.downloadButton.getAttribute("download");
         String downloadPath = System.getProperty("user.home") + "\\Downloads\\" + "" + fileName;

         boolean isFileExist = Files.exists(Paths.get(downloadPath));
         Assert.assertTrue(isFileExist);

         Assert.assertEquals(ReadTxt.readTxt(downloadPath).get(0),text);








    }
    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}

