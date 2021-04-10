package UI_tests;

import UI_pages.HyriaResumePage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

public class HyriaSettingsStepDef {

    HyriaResumePage hyriaResumePage = new HyriaResumePage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("user click settings")
    public void user_click_settings() {
        hyriaResumePage.accountMenu.click();
        hyriaResumePage.settingsModule.click();
    }

    @Given("user click other button")
    public void user_click_other_button() {
        hyriaResumePage.settingsOther.click();

    }

    @Given("user change employment type")
    public void user_change_employment_type() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        jse.executeScript("arguments[0].click()", hyriaResumePage.changeEmploymentType);
        Driver.wait(3);
        Driver.wait(2);
        actions.sendKeys("Freelance").perform();
        Driver.wait(2);
        Driver.clickWithJS(hyriaResumePage.changeEmploymentTypeSave);
        Driver.wait(2);
    }

    @Given("user change salary expectation")
    public void user_change_salary_expectation() {
        Driver.clickWithJS(hyriaResumePage.changeSalaryExpectation);
        Driver.wait(2);
        actions.sendKeys("16").perform();
        Driver.wait(2);
        Driver.clickWithJS(hyriaResumePage.changeSalaryTypeSave);
        Driver.wait(2);
    }

    @Given("user change technologies experience")
    public void user_change_technologies_experience() {
        Driver.clickWithJS(hyriaResumePage.changeSkillSet);
        Driver.wait(2);
        actions.sendKeys("h" + Keys.ENTER).perform();
        Driver.clickWithJS(hyriaResumePage.changeSkillSetSave);
        Driver.wait(2);

    }

    @Given("user change years of experience")
    public void user_change_years_of_experience() {
      Driver.clickWithJS(hyriaResumePage.changeYearsOfExperience);
      Driver.wait(2);
      actions.sendKeys("12" + Keys.ENTER).perform();
      Driver.clickWithJS(hyriaResumePage.changeYearsOfExperienceSave);
      Driver.wait(2);

    }

    @Given("user change years of remote experience")
    public void user_change_years_of_remote_experience() {
        Driver.clickWithJS(hyriaResumePage.changeYearsOfRemoteExperience);
        Driver.wait(2);
        actions.sendKeys("24").perform();
        Driver.wait(2);
        Driver.clickWithJS(hyriaResumePage.changeYearsOfRemoteExperienceSave);
        Driver.wait(2);

    }

    @Given("user change type of engineering experience")
    public void user_change_type_of_engineering_experience() {
        Driver.clickWithJS(hyriaResumePage.changeTypeOfEngineeringExperience2);
        Driver.wait(2);
        Driver.clickWithJS(hyriaResumePage.chooseEngineeringExperience);
        Driver.wait(2);
        Driver.clickWithJS(hyriaResumePage.changeTypeOfEngineeringExperienceSave);
        Driver.wait(2);
    }


}
