package UI_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SE_FileDownloadPage {

    public SE_FileDownloadPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "File Download")
    public WebElement fileDownloadLink;
    @FindBy(id="textbox")
    public WebElement dataTextBox;
    @FindBy(id="textarea_feedback")
    public WebElement feedBack;
    @FindBy(id="create")
    public WebElement generateButton;
    @FindBy(id="link-to-download")
    public WebElement downloadButton;



}
