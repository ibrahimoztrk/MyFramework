package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.swing.plaf.PanelUI;
import java.util.List;

public class SEasyForm_List_Page {

    public SEasyForm_List_Page() {

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(partialLinkText = "Input")
    public WebElement inputFormButton;
    @FindBy(partialLinkText = "Ajax ")
    public WebElement ajaxFormButton;
    @FindBy(id = "title")
    public WebElement nameArea;
    @FindBy(id = "description")
    public WebElement descriptionText;
    @FindBy(id = "btn-submit")
    public WebElement submitButton;
    @FindBy(id = "submit-control")
    public WebElement submitMessage;
    @FindBy(partialLinkText = "List Box")
    public WebElement listBoxButton;
    @FindBy(partialLinkText = "Bootstrap")
    public WebElement bootstrapButton;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[1]/div/ul/li[1]")
    public WebElement bootstrapItem;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[3]/div/ul/li[1]")
    public WebElement crasJustoItem;
    @FindBy(xpath = "(//ul[@class='list-group'])[1]")
    public List<WebElement> leftTable;
    @FindBy(xpath = "//button[@class='btn btn-default btn-sm move-left']")
    public WebElement leftButton;
    @FindBy(xpath = "//button[@class='btn btn-default btn-sm move-right']")
    public WebElement rightButton;
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[3]/div/ul/li[6]")
   public  WebElement bootsrapItemNew;
    @FindBy(xpath = "(//ul[@class='list-group'])[2]")
    public List<WebElement> rightTable;














}
