package UI_tests;

import UI_pages.SE_DataFilterPage;
import UI_pages.SE_JQueryBoxListPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;


public class SEasyUS_05 {
    Actions actions;
    SE_JQueryBoxListPage jqueryBox;
    SE_DataFilterPage dataFilterPage;

    {

        jqueryBox = new SE_JQueryBoxListPage();
        dataFilterPage = new SE_DataFilterPage();
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
    public void TC03() {
        //"Kullanici, INTERMEDIATE ==> File Download linkine tiklar. 'Enter Data' textarea'ya
        //""Selenium practice yapiyorum!"" seklinde yazdiginda textarea'nin hemen altindaki satirda
        //472 karekter daha kaldigini dogrular.
        //'Generate File' butonuna tikladiktan sonra cikan 'Download' linkine tiklar.
        //""Selenium practice yapiyorum!"" cumlesinin download edildigini dogrular."





    }
}