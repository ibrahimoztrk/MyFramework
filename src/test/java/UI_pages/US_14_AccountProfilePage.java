package UI_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_14_AccountProfilePage {

    public US_14_AccountProfilePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    public WebElement login;
    @FindBy(xpath = "//span[contains(text(),'Sign Up')]")
    public WebElement linkSignUp;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div[2]/div[1]/button[2]")
    public WebElement signInButton;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement signInMail;
    @FindBy(xpath = "//*[@name='password']")
    public WebElement signInPassword;
    @FindBy(xpath = "(//*[@class='text__Text-sc-1j50qoj-0 eikqEd'])[3]")
    public WebElement signInButton2;
    @FindBy(xpath = "//button[@class='button__StyledButton-sc-914rhs-0 jcIapi']")
    public WebElement accountMenu;

    public WebElement settingsModule;
    @FindBy(xpath ="(//span[contains(text(),'Change')])[2]")

    public WebElement settingsOther;

    @FindBy(xpath = "(//button[@class='button__StyledButton-sc-914rhs-0 dOCYDw'])[6]")
    public WebElement changeEmploymentType2;
    @FindBy(id="react-select-6-input")
    public WebElement employmentTypeInput;
    @FindBy(xpath ="(//button[@class='button__StyledButton-sc-914rhs-0 cPdvYS'])[6]")
    public WebElement changeEmploymentTypeSave;
    @FindBy(xpath = "(//button[@class='button__StyledButton-sc-914rhs-0 cPdvYS'])[7]")
    public WebElement changeSalaryTypeSave;
    @FindBy(xpath = "//input[@name='salary']")
    public WebElement salaryInput;
    @FindBy(xpath ="(//button[@class='button__StyledButton-sc-914rhs-0 dOCYDw'])[7]")
    public WebElement changeSalaryExpectation;
    @FindBy(xpath ="(//button[@class='button__StyledButton-sc-914rhs-0 dOCYDw'])[8]")
    public WebElement changeSkillSet;
    @FindBy(xpath = "(//div[@class=' css-tlfecz-indicatorContainer'])[7]")
    public WebElement skillSetInputClear;
    @FindBy(xpath ="(//button[@class='button__StyledButton-sc-914rhs-0 dOCYDw'])[9]")
    public WebElement changeYearsOfExperience;

    @FindBy(xpath ="(//button[@class='button__StyledButton-sc-914rhs-0 dOCYDw'])[10]")
    public WebElement changeYearsOfRemoteExperience;
    @FindBy(xpath = "//input[@name='remoteExperience']")
    public WebElement remooteExperienceInput;
    @FindBy(id ="react-select-7-input")
    public WebElement skillSetInput;
    @FindBy(xpath = "(//button[@class='button__StyledButton-sc-914rhs-0 cPdvYS'])[8]")
    public WebElement changeSkillSetSave;
    @FindBy(xpath = "(//button[@class='button__StyledButton-sc-914rhs-0 cPdvYS'])[9]")
    public WebElement changeYearsOfExperienceSave;
    @FindBy(xpath = "//input[@name='totalExperience']")
    public WebElement yearsOfExperienceInput;

    @FindBy(xpath = "(//button[@class='button__StyledButton-sc-914rhs-0 cPdvYS'])[10]")
    public WebElement changeYearsOfRemoteExperienceSave;
    @FindBy(xpath = "(//button[@class='button__StyledButton-sc-914rhs-0 cPdvYS'])[11]")
    public WebElement changeTypeOfEngineeringExperienceSave;
    @FindBy(xpath = "(//span[@class='text__StyledText-sc-1s1i12s-0 iaWFso'])[2]")
    public WebElement chooseEngineeringExperience;
    @FindBy(xpath ="(//span[@class='text__StyledText-sc-1s1i12s-0 hoeQNY'])[10]")
    public WebElement changeTypeOfEngineeringExperience2;
    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement resumeDeleteOK;
    @FindBy(xpath = "//div[@class='ant-message-custom-content ant-message-success']")
    public WebElement successMessage;

    public WebElement resume;
    @FindBy(xpath ="(//*[@class='ant-btn'])[1]")

    public WebElement resumeSelect3;
    @FindBy(xpath ="(//*[@class='ant-btn'])[2]")
    public WebElement resumeUpload;

    @FindBy(xpath ="(//*[@class='ant-btn'])[3]")
    public WebElement resumeDelete;

    public WebElement companySizeInput;
    @FindBy(xpath = "(//button[@class='button__StyledButton-sc-914rhs-0 cPdvYS'])[5]")
    public WebElement companySizeSave;
    @FindBy(xpath = "(//button[@class='button__StyledButton-sc-914rhs-0 dOCYDw'])[5]")
    public WebElement companySizeChange;












}
