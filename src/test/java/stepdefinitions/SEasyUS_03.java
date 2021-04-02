package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.SEasyAlertPage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.ReusableMethods;

public class SEasyUS_03 extends BrowserUtils {
    SEasyAlertPage sEasyAlertPage = new SEasyAlertPage();

    @Given("The user clicks on Javascript Alerts")
    public void the_user_clicks_on_Javascript_Alerts() {

        sEasyAlertPage.javaScriptButton.click();
    }

    @Given("user clicks Click Me button")
    public void user_clicks_Click_Me_button() {
        sEasyAlertPage.clickMe1.click();
    }

    @Then("user verify that {string} message is displayed")
    public void user_verify_that_message_is_displayed(String string) {

        wait(2);
      //  System.out.println(Driver.getDriver().switchTo().alert().getText());
      //  Assert.assertTrue(Driver.getDriver().switchTo().alert().getText().contains(string));
    }

    @Then("user accepts alert")
    public void user_accepts_alert() {
        wait(2);
        Driver.getDriver().switchTo().alert().accept();
    }

    @Given("user clicks cancel button")
    public void user_clicks_cancel_button() {
        wait(2);
        sEasyAlertPage.clickMe2.click();
        Driver.getDriver().switchTo().alert().dismiss();

    }

    @Then("user verify that {string}second message is displayed")
    public void userVerifyThatSecondMessageIsDisplayed(String arg0) {
        wait(2);
        Assert.assertTrue(sEasyAlertPage.cancelMessage.isDisplayed());


    }

    @Given("user clicks Click for Prompt Box button")
    public void user_clicks_Click_for_Prompt_Box_button() {
        wait(2);
        sEasyAlertPage.clickMe3.click();

    }

    @Given("user enter  {string} to Prompt Box")
    public void user_enter_to_Prompt_Box(String string) {
        wait(2);
        Driver.getDriver().switchTo().alert().sendKeys(string);

    }

    @Given("user clicks OK button")
    public void user_clicks_OK_button() {
        wait(2);
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("user verfy that {string} is displayed")
    public void user_verfy_that_is_displayed(String string) {
        wait(2);
        Assert.assertTrue(sEasyAlertPage.promptMessage.isDisplayed());

    }


}
