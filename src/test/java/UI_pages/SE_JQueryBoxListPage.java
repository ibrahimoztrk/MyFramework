package UI_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.Driver;

public class SE_JQueryBoxListPage {


    public SE_JQueryBoxListPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="btn_basic_example")
    public WebElement startButton;
    @FindBy(xpath = "//*[.='No, thanks!']")
    public WebElement popUpMessage;
    @FindBy(xpath = "//*[.='List Box']")
    public WebElement listBoxButton;
    @FindBy(xpath = "//div[@class='list-group']//a[.='JQuery List Box']")
    public WebElement jQueryListBoxLink;
    @FindBy(xpath = "//div[@class='list-group']//a[.='Data List Filter']")
    public WebElement dataListFilterButton;
    @FindBy(xpath = "//a [@id='inter_example']")
    public WebElement intermediateArrow;
    @FindBy(partialLinkText = "JQuery")
    public WebElement jqueryButton;
    @FindBy(xpath = "//select[@class='form-control pickListSelect pickData']")
    public WebElement selectList;
    @FindBy(xpath = "//select[@class='form-control pickListSelect pickListResult']")
    public WebElement selectResultList;
    @FindBy(xpath = "//button[@class='pAdd btn btn-primary btn-sm']")
    public WebElement addButton;
    @FindBy(xpath = "//button[@class='pAddAll btn btn-primary btn-sm']")
    public WebElement addAllButton;
    @FindBy(xpath = "//button[@class='pRemove btn btn-primary btn-sm']")
    public WebElement removeButton;
    @FindBy(xpath = "//button[@class='//button[@class='pRemoveAll btn btn-primary btn-sm']']")
    public WebElement removeAllButton;


    public void selectList(String allnames[], WebElement element) {
        Select select = new Select(element);
        for (String w : allnames ) {
                 select.selectByVisibleText(w);
        }
    }






}
