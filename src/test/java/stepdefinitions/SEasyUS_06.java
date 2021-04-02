package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.US06_TablePage;
import utilities.BrowserUtils;

public class SEasyUS_06 extends BrowserUtils {

    US06_TablePage us06 = new US06_TablePage();

    @Given("The user clicks on the Table")
    public void the_user_clicks_on_the_Table() {
        waitForClickablility(us06.noThanks, 10).click();
        us06.tableButton.click();

    }

    @Given("The user clicks on Table Pagination")
    public void the_user_clicks_on_Table_Pagination() {
        us06.paginationButton.click();
    }

    @Given("Kullanici # satirinin {string} ile basladigini assert eder")
    public void kullanici_satirinin_ile_basladigini_assert_eder(String string) {
        Assert.assertTrue(us06.firstCell1.getText().equals(string));
    }

    @Given("Kullanici ikinci. sayfa linkine tiklar")
    public void kullanici_ikinci_sayfa_linkine_tiklar() {
        us06.page2Button.click();
    }


    @Given("Kullanici ikinci. sayfanin  # satirinin {string} ile basladigini assert eder")
    public void kullanici_ikinci_sayfanin_satirinin_ile_basladigini_assert_eder(String string) {
        Assert.assertTrue(us06.firstCell6.getText().equals(string));
    }

    @Given("Kullanici ucuncu.sayfanin linkine tiklar")
    public void kullanici_ucuncu_sayfanin_linkine_tiklar() {
        us06.page3Button.click();
    }

    @Given("Kullanici ucuncu sayfa  # satirinin {string} ile basladigini assert eder")
    public void kullanici_ucuncu_sayfa_satirinin_ile_basladigini_assert_eder(String string) {
        Assert.assertTrue(us06.firstCell11.getText().equals(string));
    }

    @And("Kullanici tekrar birinci sayfaya doner")
    public void kullaniciTekrarBirinciSayfayaDoner() {
        us06.page1Button.click();

    }

    @Given("Kullanici ileri sayfa linkine tiklar")
    public void kullanici_ileri_sayfa_linkine_tiklar() {
        us06.nextButton.click();
    }

    @Given("Kullanici # satirinin ilk hucresinin {string} ile basladigini assert eder")
    public void kullanici_satirinin_ilk_hucresinin_ile_basladigini_assert_eder(String string) {
        Assert.assertTrue(us06.firstCell6.getText().equals(string));

    }


    @Given("Kullanici geri sayfa linkine tiklar")
    public void kullanici_geri_sayfa_linkine_tiklar() {
        us06.backButton.click();
    }

    @Given("Kullanici # satirinin birinci hucresinin {string} ile basladigini assert eder")
    public void kullanici_satirinin_birinci_hucresinin_ile_basladigini_assert_eder(String string) {
        Assert.assertTrue(us06.firstCell1.getText().equals(string));
        System.out.println(us06.numberOfCell.size());
    }


    @Then("Kullanici toplam {int} cell oldugunu assert eder")
    public void kullanici_toplam_cell_oldugunu_assert_eder(Integer int1) {

        Assert.assertTrue(us06.numberOfCell.size() == int1);
    }

    @Given("Kullanici table data search linkine tiklar")
    public void kullanici_table_data_search_linkine_tiklar() {
        us06.tableButton.click();
        us06.tableDataButton.click();
    }

    @Given("Kullanici Tasks panelinin altinda sirasiyla Task, Assignee, Status basliklarinin oldugunu dogrular.")
    public void kullanici_Tasks_panelinin_altinda_sirasiyla_Task_Assignee_Status_basliklarinin_oldugunu_dogrular() {
        wait(2);
        Assert.assertTrue(us06.taskHead.getText().contains("Task"));
        Assert.assertTrue(us06.assigneHead.getText().contains("Assignee"));
        Assert.assertTrue(us06.statusHead.getText().contains("Status"));
    }


    @Given("Kullanici input'ta Filter by Task,Assignee,Status textinin yer aldigini dogrular")
    public void kullanici_input_ta_Filter_by_Task_Assignee_Status_textinin_yer_aldigini_dogrular() {
        String message = us06.inputText.getAttribute("placeholder");
        Assert.assertTrue(message.contains("Filter by Task / Assignee / Status "));
    }


    @Given("Kullanici input'a {string} yazar")
    public void kullanici_input_a_yazar(String string) throws InterruptedException {
        us06.taskeInput.sendKeys(string);
    }

    @Then("Kullanici tabloda sadece bir satir oldugunu ve bu satirin {string} ismine ait oldugunu assert eder")
    public void kullanici_tabloda_sadece_bir_satir_oldugunu_ve_bu_satirin_ismine_ait_oldugunu_assert_eder(String string) {
        for (WebElement w :
                us06.queryMike) {
            Assert.assertTrue(w.getText().contains(string));
        }
        Assert.assertTrue(us06.queryMike.size() == 1);
    }

    @Given("Kullanici Listed Users panelinin aldindaki {int} tane input'un aktif olmadigini assert eder")
    public void kullanici_Listed_Users_panelinin_aldindaki_tane_input_un_aktif_olmadigini_assert_eder(Integer int1) {
        Assert.assertFalse(us06.listUserTh1.isEnabled());
        Assert.assertFalse(us06.listUserTh2.isEnabled());
        Assert.assertFalse(us06.listUserTh3.isEnabled());
        Assert.assertFalse(us06.listUserTh4.isEnabled());
    }


    @Given("Kullanici filtre butonuna basar")
    public void kullanici_filtre_butonuna_basar() {
        us06.filterButton.click();
    }

    @Given("Kullanici firstname inputune {string} harfi girer")
    public void kullanici_firstname_inputune_harfi_girer(String string) {
        us06.listUserTh3.sendKeys(string);
    }

    @Then("Kullanici tablo'da B harfi ile baslayan iki isime ait satirlari gorur")
    public void kullanici_tablo_da_B_harfi_ile_baslayan_iki_isime_ait_satirlari_gorur() {
        for (WebElement w : us06.queryB) {
            Assert.assertTrue(w.getText().startsWith("B"));
        }



    }


}
