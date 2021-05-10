package UI_pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.nio.file.Watchable;
import java.util.List;

public class SE_JQueryDownload {

    public SE_JQueryDownload() {
        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(id = "advanced_example")
    public WebElement advancedButton;
    @FindBy(partialLinkText = "JQuery")
    public WebElement jqueryButton;
    @FindBy(id = "downloadButton")
    public WebElement downloadButton;
    @FindBy(xpath = "//*[text()='Complete!']")
    public WebElement successMessage;
    @FindBy(partialLinkText = "Bootstrap")
    public WebElement Bootstrap;
    @FindBy(id = "cricle-btn")
    public WebElement bootstrapDownload;

    @FindBy(xpath = "//div[.='65%']")
    public WebElement percentValue65;
    @FindBy(xpath = "//div[.='100%']")
    public WebElement percentValue100;


    @FindBy(xpath = "//div[@class='list-group']//a[.='Drag & Drop Sliders']")
    public WebElement dragDropSlidersButton;
    @FindBy(xpath = "//input[@type='range']")
    public List<WebElement> sliders;
    @FindBy(xpath = "(//input[@type='range'])[1]")
    public WebElement firstSlider10;
    @FindBy(xpath = "//output")
    public List<WebElement> outputs;


    public void setSlider(WebElement slider, WebElement output, int target) {
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.waitFor(1);

        actions.clickAndHold(slider).perform();

        while (true) {

            int value = Integer.parseInt(output.getText());
            if (value == target) break;
            if (value > target) {
                actions.sendKeys(Keys.ARROW_LEFT).perform();
            } else {
                actions.sendKeys(Keys.ARROW_RIGHT).perform();


            }


        }
    }
}