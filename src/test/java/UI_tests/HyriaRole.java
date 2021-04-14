package UI_tests;

import UI_pages.HyriaRolePage;
import UI_pages.US_14_AccountProfilePage;
import io.cucumber.java.bs.A;
import org.apache.poi.hssf.record.chart.DatRecord;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.Set;

public class HyriaRole {
    HyriaRolePage hyriaRolePage = new HyriaRolePage();
    US_14_AccountProfilePage homepage = new US_14_AccountProfilePage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test1() {

        Driver.getDriver().get("https://hyrai.com/auth");
        Driver.waitForClickablility(hyriaRolePage.forCompanyLinkText, 5);
        hyriaRolePage.forCompanyLinkText.click();
        Driver.wait(2);
        hyriaRolePage.companyLogin.click();
        Driver.wait(2);
        hyriaRolePage.companySigninEmail.sendKeys("demo_corp@hyrai.com");
        hyriaRolePage.companySigninPassword.sendKeys("123123");
        Driver.clickWithJS(hyriaRolePage.companySigninSubmitButton);
        Driver.wait(2);
        hyriaRolePage.newRoleButton.click();
        hyriaRolePage.rolNameInput.sendKeys("QA Ing");
        hyriaRolePage.typeOfEngineer.click();
        Driver.wait(1);
        hyriaRolePage.engineerSkillsInput2.sendKeys("3d");
        Driver.wait(2);
        actions.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER).build().perform();
     //   hyriaRolePage.engineerSkillsInput2.sendKeys(Keys.ENTER);


        Driver.wait(2);
        Driver.clickWithJS(hyriaRolePage.engineerskillAlgort);
        Driver.wait(2);
        hyriaRolePage.salaryMin.sendKeys("15");
        hyriaRolePage.salaryMax.sendKeys("22");
        Driver.wait(2);
        Driver.getDriver().switchTo().frame(0);
        hyriaRolePage.iframeBody.sendKeys("Hi Everyone! I'm from Us and I want to work there");
        Driver.getDriver().switchTo().defaultContent();
        Driver.scrollToElement(hyriaRolePage.primaryContactInput);
        hyriaRolePage.primaryContactInput.sendKeys("Demo" + Keys.ENTER);
        actions.sendKeys(Keys.TAB);
        Driver.wait(2);
        hyriaRolePage.interviewLocationInput.sendKeys("Alaska" + Keys.ENTER);
        Driver.wait(2);
        hyriaRolePage.hiringLocationInput.sendKeys("Alaska" + Keys.ENTER);
        hyriaRolePage.hyraiTargetInput.sendKeys("22");
        Driver.wait(2);
        hyriaRolePage.jobUrlInput.sendKeys("www.google.com");
        Driver.wait(2);
        Driver.clickWithJS(hyriaRolePage.publishNewRole);
        Assert.assertTrue(homepage.successMessage.isDisplayed());


    }

    @Test
    public void test2(){
        Driver.getDriver().get("https://hyrai.com/auth");
        Driver.waitForClickablility(hyriaRolePage.forCompanyLinkText, 5);
        hyriaRolePage.forCompanyLinkText.click();
        Driver.wait(2);
        hyriaRolePage.companyLogin.click();
        Driver.wait(2);
        hyriaRolePage.companySigninEmail.sendKeys("demo_corp@hyrai.com");
        hyriaRolePage.companySigninPassword.sendKeys("123123");
        Driver.clickWithJS(hyriaRolePage.companySigninSubmitButton);
        Driver.wait(2);

        hyriaRolePage.meetingButton.click();
        Driver.wait(2);


        String parentWindowHandle = Driver.getDriver().getWindowHandle();
        System.out.println(parentWindowHandle);
        hyriaRolePage.meetingEkrem.click();
        hyriaRolePage.gotoMeetingLink.click();
        Driver.wait(2);
        Set<String> allHandlse = Driver.getDriver().getWindowHandles();

        for (String childWindowHandle: allHandlse) {
             if(!childWindowHandle.equals(parentWindowHandle)) {
                 Driver.getDriver().switchTo().window(childWindowHandle);
                 System.out.println(childWindowHandle);
                 Assert.assertTrue(!childWindowHandle.equals(parentWindowHandle));
             }
        }

        Driver.getDriver().switchTo().window(parentWindowHandle);
        Driver.wait(4);
        Driver.clickWithJS(hyriaRolePage.meetingEkrem);

        Driver.wait(2);
        Driver.clickWithJS(hyriaRolePage.deleteMeeingButton);
        Driver.wait(2);
        Driver.clickWithJS(hyriaRolePage.meetingcancelButton);
        Driver.wait(2);
        Driver.clickWithJS(hyriaRolePage.deleteMeeingButton);
        //hyriaRolePage.deleteOK.click();



    }
}
