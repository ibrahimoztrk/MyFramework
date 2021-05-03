package api_tests;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class TraviaAPI {

    String endpoint;
    Response response;

    {

        endpoint = "https://opentdb.com/api.php?amount=10&category=23&difficulty=easy&type=multiple";
    }

    @Test
    public void TC01() {

        response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(endpoint);

        response.then()
                .assertThat()
                .statusCode(200);

        //  response.prettyPrint();

        JsonPath jsonPath = response.jsonPath();

        int dd = jsonPath.getInt("response_code");
        System.out.println("INTEGER "+ dd);

        List<String> myList = jsonPath.getList("results");
        Assert.assertEquals(myList.size(), 10);

        List<String> myListQuestion = jsonPath.getList("results.question");

        for (String w: myListQuestion) {
            Assert.assertNotNull(w);
        }

        List<String> myListAnswer= jsonPath.getList("results.correct_answer");
        for (String w: myListAnswer) {
            Assert.assertNotNull(w);
        }

        int count =0;
        List<Map<String,String>> mapData = jsonPath.getList("results");
        for (Map<String, String> mapDatum : mapData) {
            if (mapDatum.containsKey("correct_answer")) {
                count++;
            }
            Assert.assertTrue(mapDatum.containsKey("correct_answer"));

        }

        Assert.assertEquals(count, 10);

        List<List<String>> myListIncorrect= jsonPath.getList("results.incorrect_answers");
        System.out.println(myListIncorrect.size());
        for (List<String> strings : myListIncorrect) {
            Assert.assertEquals(strings.size(), 3);
        }



        }







    }

