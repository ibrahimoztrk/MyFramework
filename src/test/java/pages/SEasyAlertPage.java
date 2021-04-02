package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SEasyAlertPage {

    public SEasyAlertPage() {
         PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Javascript ")
    public WebElement javaScriptButton;
    @FindBy(xpath = "//button[@onclick='myAlertFunction()']")
    public WebElement clickMe1;
    @FindBy(xpath = "//button[@onclick='myConfirmFunction()']")
    public WebElement clickMe2;
    @FindBy(xpath = "//button[@onclick='myPromptFunction()']")
    public WebElement clickMe3;
    @FindBy(id = "confirm-demo")
    public WebElement cancelMessage;
    @FindBy(id = "prompt-demo")
    public WebElement promptMessage;






}



