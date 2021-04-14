package UI_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.plugin.com.PropertyGetDispatcher;
import utilities.Driver;

public class HyriaRolePage {

    public HyriaRolePage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//span[text()='For Companies'])[1]")
    public WebElement forCompanyLinkText;

    @FindBy(xpath = "//span[text()='Login']")
    public WebElement companyLogin;

    @FindBy(xpath = "//button[text()='Sign in']")
    public WebElement companySigninButton;

    @FindBy(xpath = "(//span[text()='Sign In'])[1]")
    public WebElement companySigninText;

    @FindBy(xpath = "//span[text()='or connect with ;']")
    public WebElement companySigninOrConnectWithText;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement companySigninEmail;

    @FindBy(xpath= "//input[@placeholder='Password']")
    public WebElement companySigninPassword;

    @FindBy(xpath = "(//span[text()='Sign In'])[2]")
    public WebElement companySigninSubmitButton;
    @FindBy(xpath = "//button[@class='button__Button-sc-1m6iuh2-0 jpVLNb']")
    public WebElement newRoleButton;
    @FindBy(xpath = "//input[@name='roleName']")
    public WebElement rolNameInput;
    @FindBy(xpath = "(//input[@name='typesOfEngineering'])[1]")
    public WebElement typeOfEngineer;
    @FindBy(id = "react-select-2-input")
    public WebElement engineerSkillsInput;
    @FindBy(xpath = "(//input[@type='checkbox'])[9]")
    public WebElement engineerskillAlgort;
    @FindBy(xpath = " //input[@type='text']")
    public WebElement engineerSkillsInput2;



    @FindBy(id = "tiny-react_26016574921618085710490_ifr")
    public WebElement iframe1;
    @FindBy(id = "tinymce")
    public WebElement iframeBody;
    @FindBy(xpath = "//input[@name='salary.min']")
    public WebElement salaryMin;
    @FindBy(xpath = "//input[@name='salary.max']")
    public WebElement salaryMax;
    @FindBy(xpath = "//input[@role='spinbutton']")
    public WebElement hyraiTargetInput;
    @FindBy(xpath = "//input[@name='jobUrl']")
    public WebElement jobUrlInput;

    @FindBy(id="react-select-4-input")
    public WebElement interviewLocationInput;
    @FindBy(id="react-select-5-input")
    public WebElement hiringLocationInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement publishNewRole;
    @FindBy(id="react-select-3-input")
    public WebElement primaryContactInput;


    @FindBy(xpath = "(//button[@class='ant-btn ant-btn-block'])[2]")
    public WebElement meetingEkrem;

    @FindBy(partialLinkText = "Go")
    public WebElement gotoMeetingLink;




    @FindBy(linkText = "Delete meeting")
  public WebElement deleteMeeingButton;


    @FindBy(xpath = "//span[@title='Apr']")
    public WebElement calenderApril;

    @FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[2]")
    public WebElement calenderMay;

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-sm']")
    public WebElement meetingcancelButton;
    @FindBy(xpath = "//input[@class='ant-select-selection-search-input']")
    public WebElement yearInput;

    @FindBy(xpath = "//span[@class='ant-select-selection-item']")
    public WebElement year2019;


    @FindBy(xpath = "(//button[@class='button__Button-sc-1m6iuh2-0 jpVLNb'])[4]")
    public WebElement meetingButton;

    @FindBy(xpath = "//span[@class='ant-select-selection-search']")
    public WebElement meetingSearchYear;

    @FindBy(xpath = "(//span[@class='ant-select-selection-search'])[2]")
    public WebElement meetingSearchMonth;

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-sm']")
    public WebElement deleteOK;













}
