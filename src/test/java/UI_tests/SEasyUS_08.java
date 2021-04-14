package UI_tests;

import UI_pages.SEasyDataDownPage;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import utilities.Driver;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;
import utilities.ReadTxt;

public class SEasyUS_08 {

    SEasyDataDownPage sdataDownPage = new SEasyDataDownPage();

    @BeforeMethod
    public void test1() {
        Driver.getDriver().get("https://www.seleniumeasy.com/test/");
        sdataDownPage.startButton.click();
        sdataDownPage.tableButton.click();
        sdataDownPage.tableDataDown.click();

    }

    @Test
    public void test2() {
        sdataDownPage.searchBox.sendKeys("2012");
        int numberOfCity = 0;
        System.out.println(sdataDownPage.office2012.size());

        List<String> allCity = new ArrayList<>();
        for (int i = 0; i < sdataDownPage.office2012.size() - 1; i++) {
            System.out.println(sdataDownPage.office2012.get(i).getText());
            if (!allCity.contains(sdataDownPage.office2012.get(i).getText())) {
                allCity.add(sdataDownPage.office2012.get(i).getText());
            }
        }
        System.out.println("<<<<<<<<<---------------->>>>>>>>>>>");
        for (String w : allCity) {

            System.out.println(w);
        }
        Assert.assertTrue(allCity.size() == 4);


    }

    @Test
    public void test3() {
         sdataDownPage.searchBox.sendKeys("London");
         sdataDownPage.pdfButton.click();
         Driver.wait(4);
         String filePath = "C:\\Users\\ibrahim\\Downloads\\Selenium Easy - Download Table Data to CSV, Excel, PDF and Print.pdf";
         boolean isDownloaded= Files.exists(Paths.get(filePath));
         Assert.assertTrue(isDownloaded);



     //   Assert.assertEquals(ReadTxt.readTxt(downloadPath).get(0),text);

        Assert.assertTrue(ReadTxt.readTxt(filePath).contains("London"));

    }


}