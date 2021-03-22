package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.SePage01;
import pages.SelectPage;

public class SelectStepDef {

    SelectPage selectPage = new SelectPage();
    SePage01 sePage01 = new SePage01();


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


}
