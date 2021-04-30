package api_tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.Assert;
import pojos.Country;
import pojos.Users;
import pojos.UsersGMI;
import utilities.JsonUtil;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public class Api_Gmi {

         Response response;
         JsonPath jsonPath;
         ObjectMapper objectMapper;
         UsersGMI[] users;
         static String newSsn;
         Country countries;

    {

        objectMapper = new ObjectMapper();
    }



    @Given("kullaniciii tum musteri bilgilerini okur sayfasina giderek {string}")
    public void kullaniciii_tum_musteri_bilgilerini_okur_sayfasina_giderek(String string) {
           response = JsonUtil.responseMethod(string);
         //  response.prettyPrint();


    }

    @Given("kullaniciii {string}  kayitli musteriyi bulur")
    public void kullaniciii_kayitli_musteriyi_bulur(String string) throws IOException {
        users = objectMapper.readValue(response.asString(), UsersGMI[].class);

        for (int i = 0; i < users.length; i++) {
            if (users[i].getSsn().equals(string)) {
                System.out.print(users[i].getFirstName() + "  ");
                System.out.println(users[i].getId());
                newSsn =  (users[i].getSsn());
                System.out.println(newSsn);
            }


        }

        Assert.assertTrue(newSsn.equals("291-34-8312"));
    }

    @Then("kullaniciii adrese gider {string} ssn {string} numarasi  {string} ile  assert yapar")
    public void kullaniciii_adrese_gider_ssn_numarasi_ile_assert_yapar(String string, String string2, String string3) {

        Assert.assertTrue(newSsn.equals(string3));


    }

    @Given("kullaniciii tum countr bilgilerini okur sayfasina giderek {string}")
    public void kullaniciii_tum_countr_bilgilerini_okur_sayfasina_giderek(String string) {
        response  = JsonUtil.responseMethod(string);
      //  response.prettyPrint();
    }

    @Then("kullaniciii country assert {string} eder")
    public void kullaniciii_country_assert_eder(String string) throws JsonProcessingException {
        jsonPath = response.jsonPath();

        List<String> country = jsonPath.getList("name");
        for (String w : country) {
            System.out.println(w);
            if (w.equals(string)) {
                Assert.assertTrue(w.contains(string));
                break;
            }
        }

    }

    @Given("kullaniciii tum state bilgilerini okur sayfasina giderek {string}")
    public void kullaniciii_tum_state_bilgilerini_okur_sayfasina_giderek(String string) {
             response = JsonUtil.responseMethod(string);
             response.prettyPrint();



    }

    @Then("kullaniciii state {string} aseert eder")
    public void kullaniciii_state_aseert_eder(String string) {
        jsonPath = response.jsonPath();
        List<String> states = jsonPath.getList("name");
        for (String w : states) {
              if(w.equals(string)) {
                   Assert.assertTrue(w.contains(string));
                   break;
              }
        }

    }

    @Given("kullaniciii state bilgilerini okur sayfasina giderek {string}")
    public void kullaniciii_state_bilgilerini_okur_sayfasina_giderek(String string) {

    }

    @Given("kullaniciii yeni  bir  state olusturur {string} ve assert eder")
    public void kullaniciii_yeni_bir_state_olusturur_ve_assert_eder(String string) {

    }

    @Given("kullaniciii country gunceller ve assert eder")
    public void kullaniciii_country_gunceller_ve_assert_eder() {

    }

    @Given("kullaniciii yeni  bir  country olusturur {string} ve assert eder")
    public void kullaniciii_yeni_bir_country_olusturur_ve_assert_eder(String string) {

    }


}
