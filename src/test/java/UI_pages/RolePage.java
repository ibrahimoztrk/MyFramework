package UI_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RolePage {

    public RolePage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//span[text()='For Companies'])[1]")
    public WebElement forCompanyLinkText;

    @FindBy(xpath = "//span[text()='Login']")
    public WebElement companyLogin;



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

    public WebElement engineerskillAlgort;
    @FindBy(xpath = " //input[@type='text']")
    public WebElement engineerSkillsInput2;




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



    @FindBy(xpath = "//button[@class='ant-btn ant-btn-sm']")
    public WebElement meetingcancelButton;



    @FindBy(xpath = "(//button[@class='button__Button-sc-1m6iuh2-0 jpVLNb'])[4]")
    public WebElement meetingButton;


    @FindBy(xpath = "//button[@class='button__StyledButton-sc-914rhs-0 jcIapi']")
    public WebElement messageButton;

    @FindBy(xpath = "//button[@class='button__StyledButton-sc-914rhs-0 lcTAwk']")
    public WebElement messageClick;















}
