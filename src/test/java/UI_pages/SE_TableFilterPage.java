package UI_pages;

import org.apache.commons.math3.optim.nonlinear.scalar.LineSearch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.List;

public class SE_TableFilterPage {
    public SE_TableFilterPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "advanced_example")
    public WebElement advancedButton;
    @FindBy(xpath = "//*[.='No, thanks!']")
    public WebElement popUpMessage;
    @FindBy(id="btn_basic_example")
    public WebElement startButton;
    @FindBy(xpath = "//div[@class='list-group']//a[.='Table Filter ']")
    public WebElement tableFilterLink;
    @FindBy(xpath = "//p[@class='summary']")
    public List<WebElement> numberOfElements;
    @FindBy(xpath = "//button[.='Orange']")
    public WebElement orangeButton;
    @FindBy(xpath = "//tbody//tr[@data-status]" + "")
    public List<WebElement> allColors;
    @FindBy(partialLinkText = "Table Sort")
    public WebElement tableSortLink;
    @FindBy(id="example_info")
    public WebElement infoBar;
    @FindBy(id="example")
    public List<WebElement> table;
    @FindBy(xpath = "//select[@name='example_length']")
    public WebElement select1;
    @FindBy(xpath = "//tr[@role='row']")
    public List<WebElement> numberOfRow;
    @FindBy(xpath = "//tbody//tr//td[6]")
    public List<WebElement> salary;

    public void selectLenght(WebElement element ) {
        Select select = new Select(element);
        select.selectByValue("50");

    }


}
