package UI_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class SEasyDataDownPage {
    public SEasyDataDownPage() {
        PageFactory.initElements(Driver.getDriver(),this) ;   }

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;
    @FindBy(xpath ="//*[@id=\"example\"]/thead/tr/th[5]")
    public List<WebElement> startDate;
    @FindBy(partialLinkText = "Data Download")
    public WebElement tableDataDown;
    @FindBy(id="btn_basic_example")
    public WebElement startButton;
    @FindBy(linkText = "Table")
    public WebElement tableButton;
    @FindBy(xpath = "(//tr[@role = 'row']/td[3])")
    public List<WebElement> cityColumn;


}
