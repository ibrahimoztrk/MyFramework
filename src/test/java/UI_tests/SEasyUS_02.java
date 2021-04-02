package UI_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import UI_pages.SePage01;
import UI_pages.SelectPage;
import utilities.BrowserUtils;

import java.util.List;

public class SEasyUS_02 extends BrowserUtils {

    SelectPage selectPage = new SelectPage();
    SePage01 sePage01 = new SePage01();
    Actions actions;


    @Given("The user clicks on the on Select Dropdown List")
    public void the_user_clicks_on_the_on_Select_Dropdown_List() {
        selectPage.selectButton.click();
    }

    @Given("Kullanici select {string}")
    public void kullanici_select(String string) {
        Select option = new Select(selectPage.selectDay);
        option.selectByVisibleText(string);

    }

    @Then("user Assert that the {string} has selected")
    public void userAssertThatTheHasSelected(String arg0) {
        Assert.assertTrue(selectPage.daySelectedValue.getText().contains(arg0));
    }

    @Given("User select {string}")
    public void user_select(String string) {
        Select option = new Select(selectPage.selectDay);
        option.selectByVisibleText(string);
        System.out.println(selectPage.daySelectedValue.getText());

    }

    @Then("user Assert that the select day is {string}")
    public void user_Assert_that_the_select_day_is(String string) {
        Assert.assertTrue(selectPage.daySelectedValue.getText().contains(string));
    }

    @Given("User select all citys")
    public void user_select_all_citys() {
        Select option = new Select(selectPage.multiSelect);
        List<WebElement> options = option.getOptions();

        for (WebElement w : options) {
            w.click();
        }


    }

    @Given("The user clicks on Get All Selected button")
    public void the_user_clicks_on_Get_All_Selected_button() {
        selectPage.getAllSelectButton.click();
    }

    @Then("user Assert that {string} message is displayed")
    public void user_Assert_that_message_is_displayed(String string) {
        verifyElementDisplayed(selectPage.multiSelectMessage);
    }


}
