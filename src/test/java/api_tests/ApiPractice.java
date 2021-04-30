package api_tests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.JsonUtil;

import java.util.List;

import static org.testng.Assert.*;

public class ApiPractice {

    String endpoint;
    Response response;
    JsonPath jsonPath;

    {
        endpoint = "https://jsonplaceholder.typicode.com/todos";
    }

//   1) Create a class and name it as you wish :)
//            2) When
//    I send a GET Request to https://jsonplaceholder.typicode.com/todos
//    Then
//    HTTP Status code should be "200"
//    And Content type should be in "JSON" format
//    And there should be 200 "title"
//    And "dignissimos quo nobis earum saepe" should be one of the "title"s
//    And 111, 121, and 131 should be among the "id"s
//    And 4th title is "et porro tempora"
//    And last title is "ipsam aperiam voluptates qui"

    @Test
    public void testName() {
        response = JsonUtil.responseMethod(endpoint);
        response.then().assertThat().statusCode(200).contentType("application/JSON");
     response.prettyPrint();

         jsonPath = response.jsonPath();
        List<String>  titles = jsonPath.getList("title");

        System.out.println(titles.size());
        assertTrue(titles.contains("dignissimos quo nobis earum saepe"));
        System.out.println(jsonPath.getString("title[-1]"));
//



    }
}
