package UI_tests;

import UI_pages.SE_JQueryDownload;
import UI_pages.US06_TablePage;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import static utilities.BrowserUtils.*;

public class SEasyUS_09 {

    SE_JQueryDownload seJquery;
    US06_TablePage us06;
    WebDriverWait wait;

    {
        seJquery = new SE_JQueryDownload();
        us06 = new US06_TablePage();
        wait = new WebDriverWait(Driver.getDriver(),10);
    }

    @BeforeMethod
    public void setup() {
        Driver.getDriver().get("https://www.seleniumeasy.com/test/");

        try {
            waitForClickablility(us06.noThanks, 10).click();
        }catch (Exception ignored) {

        }
        seJquery.advancedButton.click();
    }


    @Test
    public void TC01() {



        seJquery.jqueryButton.click();
        clickWithJS(seJquery.downloadButton);



        waitForVisibility(seJquery.successMessage,10);
        Assert.assertTrue(seJquery.successMessage.isDisplayed());

    }

    @Test
    public void TC02() {
        seJquery.Bootstrap.click();
        clickWithJS(seJquery.bootstrapDownload);

        Assert.assertTrue(seJquery.percentValue65.isDisplayed());
        Assert.assertTrue(seJquery.percentValue100.isDisplayed());



    }
   int a;
    public static void main(String[] args) {
        for (int i = 0;  ; i++) {
            System.out.println("s");




        }
    }
}
