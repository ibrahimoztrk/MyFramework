package UI_tests;

import UI_pages.SE_JQueryDownload;
import UI_pages.US06_TablePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import static utilities.BrowserUtils.waitForClickablility;

public class SEasyUS_10 {

    SE_JQueryDownload seJquery = new SE_JQueryDownload() ;
    US06_TablePage us06;
    WebDriverWait wait;
    Actions actions;

    {

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
          actions = new Actions(Driver.getDriver());
          seJquery.dragDropSlidersButton.click();
          actions.dragAndDrop(seJquery.valueSetGreyDrag,seJquery.valueSetGreyDrop).perform();



    }
}
