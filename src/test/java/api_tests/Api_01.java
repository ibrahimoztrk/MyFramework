package api_tests;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pojos.Money;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class Api_01 {
    Response response;
    String endPoint = "https://api.exchangeratesapi.io/history?start_at=2018-01-01&end_at=2018-09-01";
    JsonPath json;
    SoftAssert softAssert;

    public Response getResponse(String url) {

        response = given().accept(ContentType.JSON).get(url);
        return response;
    }

    @Test
    public void name() throws IOException {
        SoftAssert softAssert = new SoftAssert();
        response = getResponse(endPoint);
        response.
                then().
                assertThat().
                statusCode(200);
       // response.prettyPrint();

        json = response.jsonPath();
        String start = json.getString("start_at");
        softAssert.assertTrue(start.equals("2018-01-01"));
        String base = json.getString("base");
        System.out.println(base);
        softAssert.assertTrue(base.equals("EUR"));
        String end = json.getString("end_at");
        System.out.println(end);
        softAssert.assertTrue(end.equals("2018-09-01"));


    }
}
