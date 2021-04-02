package UI_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import UI_pages.SePage01;
import utilities.Driver;
import utilities.ReusableMethods;

public class SEasyUS_01 extends ReusableMethods {
    SePage01 sePage01 = new SePage01();



    @Given("The user is on the page of {string}")
    public void the_user_is_on_the_page_of(String string) {
        Driver.getDriver().get(string);


    }

    @Given("The user clicks on the Start Practicing")
    public void the_user_clicks_on_the_Start_Practicing() {
        sePage01.startButton.click();
//        sePage01.popUpMessage.click();
    }


    @Given("The user clicks on the Simple Form Demo")
    public void the_user_clicks_on_the_Simple_Form_Demo() {
        sePage01.simpleFormButton.click();

    }

    @Given("Kullanici {string} sayfasi uzerindedir")
    public void kullanici_sayfasi_uzerindedir(String string) {
        Driver.getDriver().get(string);
    }

    @Given("Kullanici, Single Input Field basligi altindaki Enter message box'ina {string} yazar")
    public void kullanici_Single_Input_Field_basligi_altindaki_Enter_message_box_ina_yazar(String string) throws InterruptedException {
        sePage01.simpleFormuserMessage.sendKeys(string);
        sePage01.popUpMessage.click();
        waitFor(3);

    }

    @Then("Kullanici Show Message butonuna tikladiginda Your Message: kisminda mesaj box'ina yazmis oldugu {string} gormeli ve dogrulamalidir")
    public void kullanici_Show_Message_butonuna_tikladiginda_Your_Message_kisminda_mesaj_box_ina_yazmis_oldugu_gormeli_ve_dogrulamalidir(String string) {
        sePage01.showMessageButton.click();
        Assert.assertTrue(sePage01.displayMessage.getText().equals(string));
    }

    @Given("Kullanici a kutusuna sayisal deger girer")
    public void kullanici_a_kutusuna_sayisal_deger_girer() {
        sePage01.simpleFormaAvalue.sendKeys("5");
    }

    @Given("Kullanici b kutusuna saysal deger girer")
    public void kullanici_b_kutusuna_saysal_deger_girer() {
        sePage01.simpleFormaAvalue.sendKeys("9");
    }

    @Given("kullanici a ve b kutusuna girdigi degerlerin toplamini get total butonuna basinca gorebilir")
    public void kullanici_a_ve_b_kutusuna_girdigi_degerlerin_toplamini_get_total_butonuna_basinca_gorebilir() {
        sePage01.getTotalButton.click();
        sePage01.displayvalue.getText().contains("14");
    }

    @Given("Kullanici a kutusuna sayisal deger disinda bir deger girer")
    public void kullanici_a_kutusuna_sayisal_deger_disinda_bir_deger_girer() {
        sePage01.simpleFormaAvalue.sendKeys("a");
    }

    @Given("Kullanici b kutusuna sayisal deger disinda bir deger girer")
    public void kullanici_b_kutusuna_sayisal_deger_disinda_bir_deger_girer() {
        sePage01.simpleFormaAvalue.sendKeys("g");
    }

    @Then("kullanici a ve b kutusuna girdigi degerlerin toplamini get total butonuna basinca {string} olarak gorur")
    public void kullanici_a_ve_b_kutusuna_girdigi_degerlerin_toplamini_get_total_butonuna_basinca_olarak_gorur(String string) {
        sePage01.getTotalButton.click();
        sePage01.displayvalue.getText().contains(string);
    }


}
