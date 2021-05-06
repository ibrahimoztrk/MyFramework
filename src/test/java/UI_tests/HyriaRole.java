package UI_tests;

import UI_pages.RolePage;
import UI_pages.US_14_AccountProfilePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.Set;

public class HyriaRole {
    RolePage rolePage = new RolePage();
    US_14_AccountProfilePage homepage = new US_14_AccountProfilePage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test1() {

        Driver.getDriver().get("https://hyrai.com/auth");
        Driver.waitForClickablility(rolePage.forCompanyLinkText, 5);
        rolePage.forCompanyLinkText.click();
        Driver.wait(2);
        rolePage.companyLogin.click();
        Driver.wait(2);
        rolePage.companySigninEmail.sendKeys("demo_corp@hyrai.com");
        rolePage.companySigninPassword.sendKeys("123123");
        Driver.clickWithJS(rolePage.companySigninSubmitButton);
        Driver.wait(2);
        rolePage.newRoleButton.click();
        rolePage.rolNameInput.sendKeys("QA Ing");
        rolePage.typeOfEngineer.click();
        Driver.wait(1);
        rolePage.engineerSkillsInput2.sendKeys("3d");
        Driver.wait(2);
        actions.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER).build().perform();
     //   hyriaRolePage.engineerSkillsInput2.sendKeys(Keys.ENTER);


        Driver.wait(2);
        Driver.clickWithJS(rolePage.engineerskillAlgort);
        Driver.wait(2);
        rolePage.salaryMin.sendKeys("15");
        rolePage.salaryMax.sendKeys("22");
        Driver.wait(2);
        Driver.getDriver().switchTo().frame(0);
        rolePage.iframeBody.sendKeys("Hi Everyone! I'm from Us and I want to work there");
        Driver.getDriver().switchTo().defaultContent();
        Driver.scrollToElement(rolePage.primaryContactInput);
        rolePage.primaryContactInput.sendKeys("Demo" + Keys.ENTER);
        actions.sendKeys(Keys.TAB);
        Driver.wait(2);
        rolePage.interviewLocationInput.sendKeys("Alaska" + Keys.ENTER);
        Driver.wait(2);
        rolePage.hiringLocationInput.sendKeys("Alaska" + Keys.ENTER);
        rolePage.hyraiTargetInput.sendKeys("22");
        Driver.wait(2);
        rolePage.jobUrlInput.sendKeys("www.google.com");
        Driver.wait(2);
        Driver.clickWithJS(rolePage.publishNewRole);
//        Assert.assertTrue(homepage.successMessage.isDisplayed());


    }

    @Test
    public void test2(){
        Driver.getDriver().get("https://hyrai.com/auth");
        Driver.waitForClickablility(rolePage.forCompanyLinkText, 5);
        rolePage.forCompanyLinkText.click();
        Driver.wait(2);
        rolePage.companyLogin.click();
        Driver.wait(2);
        rolePage.companySigninEmail.sendKeys("demo_corp@hyrai.com");
        rolePage.companySigninPassword.sendKeys("123123");
        Driver.clickWithJS(rolePage.companySigninSubmitButton);
        Driver.wait(2);

        rolePage.meetingButton.click();
        Driver.wait(2);


        String parentWindowHandle = Driver.getDriver().getWindowHandle();
        System.out.println(parentWindowHandle);
        rolePage.meetingEkrem.click();
        rolePage.gotoMeetingLink.click();
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
        Driver.clickWithJS(rolePage.meetingEkrem);

        Driver.wait(2);
        Driver.clickWithJS(rolePage.deleteMeeingButton);
        Driver.wait(2);
        Driver.clickWithJS(rolePage.meetingcancelButton);
        Driver.wait(2);
        Driver.clickWithJS(rolePage.deleteMeeingButton);
        //hyriaRolePage.deleteOK.click();



    }
}
