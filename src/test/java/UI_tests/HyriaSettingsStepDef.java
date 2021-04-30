package UI_tests;

import UI_pages.US_14_AccountProfilePage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utilities.Driver;

public class HyriaSettingsStepDef {

    US_14_AccountProfilePage hyriaResumePage = new US_14_AccountProfilePage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("user click settings")
    public void user_click_settings() {
        Driver.waitForClickablility(hyriaResumePage.accountMenu, 10);
        hyriaResumePage.accountMenu.click();
        hyriaResumePage.settingsModule.click();

    }

    @Given("user click other button")
    public void user_click_other_button() {
        hyriaResumePage.settingsOther.click();
        Driver.clickWithJS( hyriaResumePage.companySizeChange);
        hyriaResumePage.companySizeInput.sendKeys("5-10" + Keys.ENTER);
        Driver.clickWithJS(hyriaResumePage.companySizeSave);
        Assert.assertTrue(hyriaResumePage.successMessage.isDisplayed());

    }

    @Given("user change employment type")
    public void user_change_employment_type() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        jse.executeScript("arguments[0].click()", hyriaResumePage.changeEmploymentType2);
        Driver.wait(3);
        hyriaResumePage.employmentTypeInput.sendKeys("Full Time" + Keys.ENTER);
        Driver.wait(2);
        Driver.clickWithJS(hyriaResumePage.changeEmploymentTypeSave);
        Driver.wait(2);
        Assert.assertTrue(hyriaResumePage.successMessage.isDisplayed());

    }

    @Given("user change salary expectation")
    public void user_change_salary_expectation() {
        Driver.clickWithJS(hyriaResumePage.changeSalaryExpectation);
        Driver.wait(2);
        hyriaResumePage.salaryInput.sendKeys("22" + Keys.ENTER);
        Driver.wait(2);
        Driver.clickWithJS(hyriaResumePage.changeSalaryTypeSave);
        Driver.wait(2);
        Assert.assertTrue(hyriaResumePage.successMessage.isDisplayed());
    }

    @Given("user change technologies experience")
    public void user_change_technologies_experience() {
        Driver.clickWithJS(hyriaResumePage.changeSkillSet);

        hyriaResumePage.skillSetInput.click();
      //  Driver.clickWithJS(hyriaResumePage.skillSetInputClear);
    //    hyriaResumePage.skillSetInputClear.click();
        Driver.wait(3);
        hyriaResumePage.skillSetInput.sendKeys("Net");
        Driver.wait(1);
        actions.sendKeys(Keys.TAB).perform();
        Driver.wait(1);
        Driver.clickWithJS(hyriaResumePage.changeSkillSetSave);
        Driver.wait(2);
        Assert.assertTrue(hyriaResumePage.successMessage.isDisplayed());


    }

    @Given("user change years of experience")
    public void user_change_years_of_experience() {
        Driver.clickWithJS(hyriaResumePage.changeYearsOfExperience);
        Driver.wait(2);
        hyriaResumePage.yearsOfExperienceInput.sendKeys("6" + Keys.ENTER);
        Driver.clickWithJS(hyriaResumePage.changeYearsOfExperienceSave);
        Driver.wait(2);
        Assert.assertTrue(hyriaResumePage.successMessage.isDisplayed());
    }

    @Given("user change years of remote experience")
    public void user_change_years_of_remote_experience() {
        Driver.clickWithJS(hyriaResumePage.changeYearsOfRemoteExperience);
        Driver.wait(2);
        hyriaResumePage.remooteExperienceInput.sendKeys("3");
        Driver.wait(2);
        Driver.clickWithJS(hyriaResumePage.changeYearsOfRemoteExperienceSave);
        Driver.wait(2);
        Assert.assertTrue(hyriaResumePage.successMessage.isDisplayed());
    }

    @Given("user change type of engineering experience")
    public void user_change_type_of_engineering_experience() {
        Driver.clickWithJS(hyriaResumePage.changeTypeOfEngineeringExperience2);
        Driver.wait(2);
        Driver.clickWithJS(hyriaResumePage.chooseEngineeringExperience);
        Driver.wait(2);
        Driver.clickWithJS(hyriaResumePage.changeTypeOfEngineeringExperienceSave);
        Driver.wait(2);
        Assert.assertTrue(hyriaResumePage.successMessage.isDisplayed());
    }


}
