package UI_tests;

import UI_pages.HyriaResumePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

public class HyriaResumeStepDef {
    HyriaResumePage homePage = new HyriaResumePage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user goes to hyrai homepage {string}")
    public void user_goes_to_hyrai_homepage(String string) {
        Driver.getDriver().get(string);
    }

    @Given("user goes to signIn page")
    public void user_goes_to_signIn_page() {
        homePage.login.click();
        homePage.signInButton.click();
    }

    @Given("user logs in with the valid mail {string}")
    public void user_logs_in_with_the_valid_mail(String string) {
        homePage.signInMail.sendKeys(string);
    }

    @Given("user logs in with the valid password {string}")
    public void user_logs_in_with_the_valid_password(String string) {
        homePage.signInPassword.sendKeys("123456");

    }

    @Then("user click signIn button")
    public void user_click_signIn_button() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        jse.executeScript("arguments[0].click()", homePage.signInButton2);


    }

    @Then("user click resume")
    public void user_click_resume() {
        homePage.accountMenu.click();
        homePage.resume.click();
    }

    @Then("user click selectFile button")
    public void user_click_selectFile_button() throws InterruptedException {
        String filePath = "C:\\Users\\ibrahim\\Downloads\\ibrahimCV.pdf";

        Driver.wait(3);

 //       Driver.getDriver().switchTo().activeElement().sendKeys(filePath);
        homePage.resumeSelect3.sendKeys(filePath);
        Driver.wait(2);


    }

    @Then("user click upload resume")
    public void user_click_upload_resume() throws InterruptedException {
        Driver.wait(5);
        Driver.clickWithJS(homePage.resumeUpload);

    }

    @Then("user delete resume")
    public void user_delete_resume() {
        Driver.wait(2);
        Driver.clickWithJS(homePage.resumeDelete);
       Driver.clickWithJS(homePage.resumeDeleteOK);
    }

}
