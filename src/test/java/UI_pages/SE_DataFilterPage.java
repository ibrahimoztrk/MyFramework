package UI_pages;

import io.cucumber.java.an.E;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SE_DataFilterPage {
    public SE_DataFilterPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//div[@class='list-group']//a[.='Data List Filter']")
    public WebElement dataListFilterButton;
    @FindBy(xpath = "//a [@id='inter_example']")
    public WebElement intermediateArrow;
    @FindBy(xpath = "//div[@class='info-block block-info clearfix']")
    public List<WebElement> dataList;
    @FindBy(id = "input-search")
    public WebElement searchBox;
    @FindBy(xpath = "//h4[contains(text(),'Name: Brian Hoyies')]")
    public WebElement filteredName;
}
