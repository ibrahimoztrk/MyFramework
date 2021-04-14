package UI_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_14_AccountProfilePage {

    public US_14_AccountProfilePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    //giris
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
    @FindBy(xpath = "//button[@class='button__Button-sc-1m6iuh2-0 gQCVJU sign-in_button__x3hrZ']")
    public WebElement signInButton2_1;
    @FindBy(xpath = "class=\"ant-message-custom-content ant-message-success\"")
    public WebElement successMessageResume;
    //================================================//
    // CANDIDATE ACCOUNT MENUSU
    //profile
    @FindBy(xpath = "//button[@class='button__StyledButton-sc-914rhs-0 jcIapi']")
    public WebElement accountMenu;
    @FindBy(xpath ="//span[contains(text(),'Profile')]")
    public WebElement profileMenu;
    @FindBy(xpath ="(//label[@class='switch_reactSwitchLabel__32mbU'])[1]")
    public WebElement profileVisible;
    @FindBy(xpath ="(//label[@class='switch_reactSwitchLabel__32mbU'])[2]")
    public WebElement jobStatus;
    @FindBy(xpath ="(//*[@class='button__StyledButton-sc-914rhs-0 herKrN'])[1]")
    public WebElement educationMenu;
    @FindBy(xpath ="//*[@name='schoolName']")
    public WebElement schoolName;
    @FindBy(xpath ="//*[@name='field']")
    public WebElement departement;
    @FindBy(xpath ="/html/body/div[3]/div/div[2]/div/div/div/div[3]/div[1]/div[1]/div/div/input")
    public WebElement startDate;
    @FindBy(xpath ="/html/body/div[3]/div/div[2]/div/div/div/div[3]/div[1]/div[2]/div/div/input")
    public WebElement endDate;
    @FindBy(xpath ="(//*[@class='button__StyledButton-sc-914rhs-0 iaJXTB'])[1]")
    public WebElement typeWork;
    @FindBy(xpath ="//*[@name='description']")
    public WebElement description;
    @FindBy(xpath ="//*[@class='button__StyledButton-sc-914rhs-0 gqbpqr']")
    public WebElement saveButton;
    @FindBy(partialLinkText ="Deneme")
    public WebElement deleteButton;
    //profile bitti
    //ADD EXPERIENCE MENU
    @FindBy(xpath ="(//*[@class='button__StyledButton-sc-914rhs-0 herKrN'])[2]")
    public WebElement experienceMenu;
    @FindBy(xpath ="(//*[@class='input__Input-sc-98umss-0 iGQdLe'])[1]")
    public WebElement companyName;
    @FindBy(xpath ="(//*[@class='input__Input-sc-98umss-0 iGQdLe'])[2]")
    public WebElement companyTitle;
    @FindBy(xpath ="/html/body/div[3]/div/div[2]/div/div/div/div[3]/div[1]/div[1]/div/div/input")
    public WebElement companyStartDate;
    @FindBy(xpath ="/html/body/div[3]/div/div[2]/div/div/div/div[3]/div[1]/div[2]/div/div/input")
    public WebElement companyEndDate;
    @FindBy(xpath ="//input[@class='checkbox__Checkbox-sc-16nutb4-0 bPtPkU']")
    public WebElement companyDatePresentBox;
    @FindBy(xpath ="(//*[@class='button__StyledButton-sc-914rhs-0 iaJXTB'])[3]")
    public WebElement companyTypeWork;
    @FindBy(xpath ="//*[@name='description']")
    public WebElement companyDiscription;
    @FindBy(xpath ="//*[@class='button__StyledButton-sc-914rhs-0 gqbpqr']")
    public WebElement experienceSave;
    // ADD EXPERIENCE MENU FINISH
    //  Project
    @FindBy(xpath ="(//*[@class='button__StyledButton-sc-914rhs-0 herKrN'])[3]")
    public WebElement projectMenu;
    @FindBy(xpath ="(//*[@class='input__Input-sc-98umss-0 iGQdLe'])[1]")
    public WebElement projectName;
    @FindBy(xpath ="(//*[@class='input__Input-sc-98umss-0 iGQdLe'])[2]")
    public WebElement projectLink;
    @FindBy(xpath = "(//div[@class='ant-picker-input'])[1]")
    public WebElement projectStartDate;
    @FindBy(xpath ="(//div[@class='ant-picker-input'])[2]")
    public WebElement projectEndDate;
    @FindBy(xpath ="//*[@class='button__StyledButton-sc-914rhs-0 iaJXTB']")
    public WebElement projectTypeWork;
    @FindBy(xpath ="/html/body/div[3]/div/div[2]/div/div/div/div[6]/div/textarea")
    public WebElement projectDiscription;
    @FindBy(xpath ="/html/body/div[3]/div/div[2]/div/div/div/div[7]/button[2]/span")
    public WebElement projectSave;
    //Project finish
    //profile edit kismi
    @FindBy(xpath ="//span[contains(text(),'Edit Profile')]")
    public WebElement editProfile;
    @FindBy(xpath ="//input[@type='file']")
    public WebElement profilePicture;
    //div[@class='ant-upload ant-upload-select ant-upload-select-picture-card']
    @FindBy(xpath ="//div[contains(text(),'Upload')]")
    public WebElement uploadPicture;
    @FindBy(xpath ="//*[@class='text__StyledText-sc-1s1i12s-0 cYMNcv']")
    public WebElement deletePicture;
    @FindBy(xpath ="//span[contains(text(),'OK')]")
    public WebElement editImageOk;
    @FindBy(xpath ="(//*[@class='input__Input-sc-98umss-0 iGQdLe'])[1]")
    public WebElement editFisrtName;
    @FindBy(xpath ="(//*[@class='input__Input-sc-98umss-0 iGQdLe'])[2]")
    public WebElement editLastName;
    @FindBy(xpath ="//button[contains(text(),'Save')]")
    public WebElement editSaveButton;
    //candidate/account/settings
    @FindBy(xpath ="//span[contains(text(),'Settings')]")
    public WebElement settingsModule;
    @FindBy(xpath ="(//span[contains(text(),'Change')])[2]")
    public WebElement phoneNumbersChange;
    @FindBy(xpath ="//input[@name='phoneNumber']")
    public WebElement addPhoneNumbers;
    @FindBy(xpath ="(//span[contains(text(),'Save')])[1]")
    public WebElement phoneSave;
    @FindBy(xpath = "//span[contains(text(),'Other')]")
    public WebElement settingsOther;
    @FindBy(xpath ="(//div[@class='box__StyledDiv-sc-1g3kgmk-0 cEtgoo'])[3]")
    public WebElement visaStatus;
    @FindBy(xpath ="(//div[@class=' css-1hwfws3'])[1]")
    public WebElement visaStatusChange;
    @FindBy(xpath ="(//*[@class='css-8mmkcg'])[1]")
    public WebElement visaStatusAsagiOkMenu; // onceki calismazsa bunu dene
    @FindBy(xpath ="(//button[@class='button__StyledButton-sc-914rhs-0 cPdvYS'])[1]")
    public WebElement visaStatusSave;
    @FindBy(xpath ="(//div[@class='box__StyledDiv-sc-1g3kgmk-0 cEtgoo'])[5]")
    public WebElement currentLocation;
    @FindBy(xpath ="//*[@name='location']")
    public WebElement currentLocationChange;
    @FindBy(xpath ="(//button[@class='button__StyledButton-sc-914rhs-0 cPdvYS'])[2]")
    public WebElement currentLocationSave;
    @FindBy(xpath ="(//span[@class='text__StyledText-sc-1s1i12s-0 hoeQNY'])[3]")
    public WebElement workingLocation;
    //(//div[@class='box__StyledDiv-sc-1g3kgmk-0 cEtgoo'])[7]
    @FindBy(xpath ="(//div[@class=' css-1wy0on6'])[2]")
    public WebElement workingLocationChange;
    @FindBy(xpath ="(//button[@class='button__StyledButton-sc-914rhs-0 cPdvYS'])[3]")
    public WebElement workingLocationSave;
    @FindBy(xpath ="(//span[contains(text(),'Change')])[10]")
    public WebElement jobAcceptanceDuration;
    @FindBy(xpath ="(//span[contains(text(),'Change')])[13]")
    public WebElement changeCompanySize;
    @FindBy(xpath ="(//span[contains(text(),'Change')])[16]")
    public WebElement changeEmploymentType;
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
    public WebElement skillSetInutClear;
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

    // Settings Other Finish
//Resume bolumu
    @FindBy(xpath ="(//*[@class='text__StyledText-sc-1s1i12s-0 eBQuok'])[1]")
    public WebElement passwordSave;
    @FindBy(xpath ="(//*[@class='text__StyledText-sc-1s1i12s-0 eBQuok'])[1]")
    public WebElement linksSave;
    @FindBy(xpath ="(//*[@class='text__StyledText-sc-1s1i12s-0 eJXBTy'])[4]")
    public WebElement resume;
    @FindBy(xpath ="(//*[@class='ant-btn'])[1]")
    public WebElement resumeSelect;
    @FindBy(xpath = "//input[@type='file']")
    public WebElement resumeSelect3;
    @FindBy(xpath ="(//*[@class='ant-btn'])[2]")
    public WebElement resumeUpload;
    @FindBy(xpath ="//button[@style='border-radius: 7px; margin-right: 20px; width: 200px; padding: 20px; align-items: center; display: flex;']")
    public WebElement resumeSelect2;
    @FindBy(xpath ="(//*[@class='ant-btn'])[3]")
    public WebElement resumeDelete;
    @FindBy(xpath ="//span[@class='ant-popover-disabled-compatible-wrapper']")
    public WebElement resumeDelete2;
    @FindBy(xpath = "//button[@class='button__Button-sc-1m6iuh2-0 dqQjhN']")
    public WebElement newRoleButton;
    @FindBy(xpath = "//input[@name='roleName']")
    public WebElement rolNameInput;
    @FindBy(xpath = "//input[@name='typesOfEngineering']")
    public WebElement typeOfEngineer;
    @FindBy(id = "react-select-2-input")
    public WebElement engineerSkillsInput;
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
    @FindBy(xpath = "//input[@role='spinbutton']")
    public WebElement jobUrlInput;
    @FindBy(id="react-select-4-input")
    public WebElement interviewLocationInput;
    @FindBy(id="react-select-5-input")
    public WebElement hiringLocationInput;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement publishNewRole;
    @FindBy(id= "react-select-5-input")
    public WebElement companySizeInput;
    @FindBy(xpath = "(//button[@class='button__StyledButton-sc-914rhs-0 cPdvYS'])[5]")
    public WebElement companySizeSave;
    @FindBy(xpath = "(//button[@class='button__StyledButton-sc-914rhs-0 dOCYDw'])[5]")
    public WebElement companySizeChange;











    //input[@name='salary.min'] (edited)
//input[@name='salary.max']

}
