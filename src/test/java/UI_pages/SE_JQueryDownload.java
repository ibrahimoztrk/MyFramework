package UI_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

import java.nio.file.Watchable;

public class SE_JQueryDownload {

    public SE_JQueryDownload() {
        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(id="advanced_example")
    public WebElement advancedButton;
    @FindBy(partialLinkText = "JQuery")
    public WebElement jqueryButton;
    @FindBy(id = "downloadButton")
    public WebElement downloadButton;
    @FindBy(xpath = "//*[text()='Complete!']")
    public WebElement successMessage;
    @FindBy(partialLinkText = "Bootstrap")
    public WebElement Bootstrap;
    @FindBy(id ="cricle-btn")
    public WebElement bootstrapDownload;

    @FindBy(xpath = "//div[.='65%']")
    public WebElement percentValue65;
    @FindBy(xpath = "//div[.='100%']")
    public WebElement percentValue100;




    @FindBy(xpath = "//div[@class='list-group']//a[.='Drag & Drop Sliders']")
    public WebElement dragDropSlidersButton;
    @FindBy(xpath = "(//output[.='10'])")
    public WebElement valueSetGreyDrag;
    @FindBy(xpath = "(//output[.='19'])")
    public WebElement valueSetGreyDrop;









}
