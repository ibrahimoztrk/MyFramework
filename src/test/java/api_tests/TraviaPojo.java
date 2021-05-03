package api_tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojos.Example;
import pojos.Result;
import pojos.TriviaPojo;
import utilities.JsonUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class TraviaPojo {

    ObjectMapper objectMapper;
    Response response;
    String endpoint;

    {
        objectMapper = new ObjectMapper();
        endpoint = "https://opentdb.com/api.php?amount=10&category=23&difficulty=easy&type=multiple";
    }

    @Test
    public void TC01() throws IOException, JsonProcessingException {
//        response = given().accept(ContentType.JSON)
//                .when().get(endpoint);
//
//        response.then().assertThat().statusCode(200);
//        response.prettyPrint();
//
//        TriviaPojo example = objectMapper.readValue(response.asString(),TriviaPojo.class);
//        System.out.println(example.getResults().get(0).getCorrectAnswer());

        response = given().
                accept(ContentType.JSON).
                when().
                get(endpoint);

        response.then().
                assertThat().
                statusCode(200);

        //response.prettyPrint();

        TriviaPojo triviaPojo = objectMapper.readValue(response.asString(), TriviaPojo.class);
        System.out.println(triviaPojo.getResults().size());
        response.then()
                .assertThat()
                .statusCode(200);

    }

    @Test
    public void TC02() throws JsonProcessingException {

        response = JsonUtil.getResponse(endpoint);
        TriviaPojo triviaPojo = objectMapper.readValue(response.asString(), TriviaPojo.class);
        Assert.assertEquals(triviaPojo.getResults(), 10);


    }

    @Test
    public void TC03() throws JsonProcessingException {
        response = JsonUtil.getResponse(endpoint);
        TriviaPojo triviaPojo = objectMapper.readValue(response.asString(), TriviaPojo.class);
        List<String> numberQuestion = new ArrayList<>();
        for (Result w : triviaPojo.getResults()) {
            numberQuestion.add(w.getQuestion());
            Assert.assertNotNull(w.getQuestion());
        }


        Assert.assertEquals(numberQuestion.size(), 10);
    }

    @Test
    public void TC04() throws JsonProcessingException {

        response = JsonUtil.getResponse(endpoint);

        TriviaPojo triviaPojo = objectMapper.readValue(response.asString(), TriviaPojo.class);
        int count = 0;
        for (Result w : triviaPojo.getResults()) {
            Assert.assertNotNull(w.getCorrectAnswer());
            if (w.getCorrectAnswer() == null) {
                count++;
            }
        }
        Assert.assertEquals(count, 0);
    }

    @Test
    public void TC05() throws JsonProcessingException {
        response = JsonUtil.getResponse(endpoint);
        TriviaPojo triviaPojo = objectMapper.readValue(response.asString(), TriviaPojo.class);
        for (Result w : triviaPojo.getResults()) {
            Assert.assertEquals(w.getIncorrectAnswers().size(), 3);
        }

    }

    @Test
    public void testName() {

        response = given().

                post();
    }
}
