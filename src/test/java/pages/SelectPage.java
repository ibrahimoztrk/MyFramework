package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SelectPage {

    public SelectPage() {
           PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="btn_basic_example")
    public WebElement startButton;
    @FindBy(partialLinkText = "Select")
    public WebElement selectButton;
    @FindBy(id="select-demo")
    public WebElement selectDay;
    @FindBy(xpath="//p[@class='selected-value']")
    public WebElement daySelectedValue;

}
