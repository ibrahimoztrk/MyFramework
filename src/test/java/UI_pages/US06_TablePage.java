package UI_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US06_TablePage {

    public US06_TablePage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(linkText = "Table")
    public WebElement tableButton;
    @FindBy(partialLinkText = "Pagination")
    public WebElement paginationButton;
    @FindBy(id="myPager")
    public WebElement numberPage;
    @FindBy(partialLinkText = "Data")
    public WebElement tableDataButton;
    @FindBy(linkText = "1")
    public WebElement page1Button;
    @FindBy(linkText = "2")
    public WebElement page2Button;
    @FindBy(linkText = "3")
    public WebElement page3Button;
    @FindBy(id = "task-table-filter")
    public WebElement taskeInput;
    @FindBy(xpath = "//input[@placeholder='#']")
    public WebElement listUserTh1;
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement listUserTh2;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement listUserTh3;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement listUserTh4;
    @FindBy(xpath = "//button[@class='btn btn-default btn-xs btn-filter']")
    public WebElement filterButton;
    @FindBy(xpath = "//*[@id='myTable']/tr[1]/td[1]")
    public WebElement firstCell1;
    @FindBy(xpath = "//*[@id='myTable']/tr[6]/td[1]")
    public WebElement firstCell6;
    @FindBy(xpath = "//*[@id='myTable']/tr[11]/td[1]")
    public WebElement firstCell11;
    @FindBy(xpath = " //a[@class='next_link']")
    public WebElement nextButton;
    @FindBy(xpath = "//a[@class='prev_link']")
    public WebElement backButton;
    @FindBy(xpath = "//tbody//td")
    public List<WebElement> numberOfCell;
    @FindBy(xpath = "//*[@id='task-table']/thead/tr/th[2]")
    public WebElement taskHead;
    @FindBy(xpath = "//*[@id='task-table']/thead/tr/th[3]")
    public WebElement assigneHead;
    @FindBy(xpath = "//*[@id='task-table']/thead/tr/th[4]")
    public WebElement statusHead;
    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> numberOfRow;
    @FindBy(xpath = "//*[@id='task-table']/tbody/tr[2]/td[3]")
    public WebElement firstRow;
    @FindBy(xpath = "(//tbody//tr[4]//td[3])[2]")
    public WebElement listOfUser1row;
    @FindBy(xpath = "(//tbody//tr[3]//td[3])[2]")
    public WebElement listOfUser2row;
    @FindBy(id = "task-table-filter" )
    public WebElement inputText;
    @FindBy(xpath = "//a[@class='at-cv-button at-cv-lightbox-yesno at-cm-no-button']")
    public WebElement noThanks;
    @FindBy(xpath = "(//tbody)[1]")
    public List<WebElement> queryMike;
    @FindBy(xpath = "(//tbody)[2]")
    public List<WebElement> queryB;

    //(//tbody)[2]













    //button[@class='btn btn-default btn-xs btn-filter']





}
