package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import pages.SEasyForm_List_Page;
import pages.SePage01;
import utilities.BrowserUtils;
import utilities.Driver;

public class SEasyUS_04 extends BrowserUtils {
    Actions actions;
    SEasyForm_List_Page formListPage = new SEasyForm_List_Page();
    SePage01 sePage01 = new SePage01();

    @Given("The user clicks on Input Forms button")
    public void the_user_clicks_on_Input_Forms_button() {

        formListPage.inputFormButton.click();

    }

    @Given("The user clicks on Ajax form submit box button")
    public void the_user_clicks_on_Ajax_form_submit_box_button() {
        formListPage.ajaxFormButton.click();
    }

    @Given("the user enter name {string}")
    public void the_user_enter_name(String string) {
        formListPage.nameArea.sendKeys(string);
    }

    @Given("the user enter Comment {string}")
    public void the_user_enter_Comment(String string) {
        formListPage.descriptionText.sendKeys(string);
    }

    @Given("the user clicks submit button")
    public void the_user_clicks_submit_button() {
        formListPage.submitButton.click();
    }

    @Then("the user verify that succes message displayed")
    public void the_user_verify_that_succes_message_displayed() {
        Assert.assertTrue(formListPage.submitMessage.isDisplayed());
    }

    @Given("user clicks List Box button")
    public void user_clicks_List_Box_button() {
        sePage01.popUpMessage.click();
        formListPage.listBoxButton.click();

    }

    @Given("user clicks Bootstrap List Box")
    public void user_clicks_Bootstrap_List_Box() {
        formListPage.bootstrapButton.click();
    }

    @Given("user moves the item bootstrap-duallist to the right")
    public void user_moves_the_item_bootstrap_duallist_to_the_right() {
        formListPage.bootstrapItem.click();
        formListPage.rightButton.click();

    }

    @Given("user moves the item Cras justo odio to the left")
    public void user_moves_the_item_Cras_justo_odio_to_the_left() throws InterruptedException {
        wait(2);
        formListPage.bootsrapItemNew.click();
        formListPage.crasJustoItem.click();
        formListPage.leftButton.click();
    }

    @Then("user assert that movement is succesfull")
    public void user_assert_that_movement_is_succesfull() {
        for (WebElement w :formListPage.leftTable) {
            System.out.println("Table left");
            System.out.println(w.getText());
            Assert.assertTrue(w.getText().contains("Cras"));
        }

        for (WebElement Z :formListPage.rightTable) {
            System.out.println();
            System.out.println("Table Right");
            System.out.println(Z.getText());
            Assert.assertTrue(Z.getText().contains("bootstrap"));
        }
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}



