package UI_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SePage01 {

    public SePage01() {
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(id="btn_basic_example")
    public WebElement startButton;
    @FindBy(partialLinkText = "Simple Form ")
    public WebElement simpleFormButton;
    @FindBy(id="user-message")
    public WebElement simpleFormuserMessage;
    @FindBy(id="display")
    public WebElement displayMessage;
    @FindBy(xpath = "//button[@onclick='showInput();']")
    public WebElement showMessageButton;
    @FindBy(id="sum1")
    public WebElement simpleFormaAvalue;
    @FindBy(id="sum2")
    public WebElement simpleFormaBvalue;
    @FindBy(xpath = "//button[@onclick='return total()']")
    public WebElement getTotalButton;
    @FindBy(id="displayvalue")
    public WebElement displayvalue;
    @FindBy(xpath = "//*[.='No, thanks!']")
    public WebElement popUpMessage;
    //






}
