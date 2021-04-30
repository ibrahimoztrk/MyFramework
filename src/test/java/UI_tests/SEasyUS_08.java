package UI_tests;

import UI_pages.SEasyDataDownPage;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;
import utilities.ReadTxt;

import javax.print.*;

public class SEasyUS_08 {

    SEasyDataDownPage sdataDownPage = new SEasyDataDownPage();

//    @BeforeMethod
//    public void test1() {
//        Driver.getDriver().get("https://www.seleniumeasy.com/test/");
//        sdataDownPage.startButton.click();
//        sdataDownPage.tableButton.click();
//        sdataDownPage.tableDataDown.click();
//
//    }

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


        //2. Yontem Set ile yapilabilir. Cunku Set tekrarli ogelere izin vermiyor.

        Set<String> newList = new LinkedHashSet<>();
        for(WebElement w : sdataDownPage.office2012) {
            newList.add(w.getText());
        }
        System.out.println(newList.size());


    }

    @Test
    public void test3() throws IOException {
        Driver.wait(1);
        System.out.println("202122sdf");
         sdataDownPage.searchBox.sendKeys("London");
         sdataDownPage.pdfButton.click();
         Driver.wait(4);
         String filePath = "C:\\Users\\ibrahim\\Downloads\\Selenium Easy - Download Table Data to CSV, Excel, PDF and Print.pdf";
         boolean isDownloaded= Files.exists(Paths.get(filePath));
         Assert.assertTrue(isDownloaded);

       // PdfReader pdfReader = new PdfReader(filePath);





     //   Assert.assertEquals(ReadTxt.readTxt(downloadPath).get(0),text);

     //   Assert.assertTrue(ReadTxt.readTxt(filePath).contains("London"));

    }
    @Test
    public void pdfReader() {
        String filePath = "C:\\Users\\ibrahim\\Downloads\\Selenium Easy - Download Table Data to CSV, Excel, PDF and Print.pdf";
        String page = "";

        try {

            PdfReader reader = new PdfReader(filePath);
            System.out.println("This PDF has " + reader.getNumberOfPages() + " pages.");
            page = PdfTextExtractor.getTextFromPage(reader, 1);
            System.out.println("Page Content:\n\n" + page + "\n\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.contains("London"));

    }

    @Test
    public void tc025() throws FileNotFoundException {

            String filePath = "C:\\Users\\ibrahim\\Downloads\\Selenium Easy - Download Table Data to CSV, Excel, PDF and Print (4).pdf";
            FileInputStream in = new FileInputStream(filePath);
            Doc doc = new SimpleDoc(in, DocFlavor.INPUT_STREAM.AUTOSENSE, null);
            PrintService service = PrintServiceLookup.lookupDefaultPrintService();

            try {
                service.createPrintJob().print(doc, null);
            } catch (PrintException e) {
                e.printStackTrace();
            }

        }



    }
