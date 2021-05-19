package UI_tests;

import UI_pages.SE_JQueryDownload;
import UI_pages.US06_TablePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

import static utilities.BrowserUtils.selectRandomTextFromDropdown;
import static utilities.BrowserUtils.waitForClickablility;

public class SEasyUS_10 {

    SE_JQueryDownload seJquery = new SE_JQueryDownload() ;
    US06_TablePage us06;
    WebDriverWait wait;

    {

        us06 = new US06_TablePage();
        wait = new WebDriverWait(Driver.getDriver(),10);

    }

    @BeforeMethod
    public void setup() {
        Driver.getDriver().get("https://www.seleniumeasy.com/test/");



        try {
            waitForClickablility(us06.noThanks, 2).click();
        }catch (Exception ignored) {

        }
        Driver.clickWithJS(seJquery.advancedButton);
        seJquery.dragDropSlidersButton.click();
    }

    @Test
    public void TC01() {

            seJquery.setSlider( seJquery.sliders.get(1),seJquery.outputs.get(1), 1);

            String actualResult = seJquery.outputs.get(1).getText();
            String expected = "1";
            Assert.assertEquals(expected,actualResult);


    }
    @Test
    public void TC02() {
        seJquery.setSlider( seJquery.sliders.get(2),seJquery.outputs.get(2), 33);

        String actualResult = seJquery.outputs.get(2).getText();
        String expected = "33";
        Assert.assertEquals(expected,actualResult);


    }
    @Test
    public void TC03() {
        seJquery.setSlider( seJquery.sliders.get(3),seJquery.outputs.get(3), 100);

        String actualResult = seJquery.outputs.get(3).getText();
        String expected = "100";
        Assert.assertEquals(expected,actualResult);


    }
}
