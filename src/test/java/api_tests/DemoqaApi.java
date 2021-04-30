package api_tests;

import io.cucumber.java.bs.A;
import io.cucumber.java.it.Ma;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.checkerframework.checker.units.qual.C;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class DemoqaApi {

    String endPoint;
    Response response;
    JsonPath json;
    String token;
    String username;
    String password;
    String endPoint2;
    String endPoint3;
    String endPoint4;
    Map<String, String> body = new HashMap<>();

    {

        endPoint = "https://demoqa.com/Account/v1/User/ee45e996-0a24-4a32-847d-aa7533f32de9";
        endPoint2 = "https://demoqa.com/Account/v1/GenerateToken";
        endPoint3 = "https://demoqa.com/Account/v1/Authorized";
        endPoint4 = "https://demoqa.com/Account/v1/User";
        username = "ttrycatch";
        password = "JQ3iPpTEKTLjSQJ!";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6ImFzbGluZmRkZGFhIiwicGFzc3dvcmQiOi\" +\n" +
                "                \"JBU0xpbmRhMTIzISIsImlhdCI6MTYxMTk1NDc3Mn0.TzxIvi7OM-HUPOC04NFL7jg84DwcYNZKKhHOYtoq618";
    }

    @Test
    public void TC01() {
        response = given().
                when().
                accept(ContentType.JSON).auth().basic("Name", "1234!Name")
                .get(endPoint);
        json = response.jsonPath();

        response.then()
                .assertThat().statusCode(401)
                .contentType("application/JSON");
        Assert.assertEquals(json.get("message"), "User not authorized!");

    }

    @Test
    public void TC02() {
        response = given().
                when().
                accept(ContentType.JSON).auth().oauth2(token)
                .get(endPoint);

        response.then().assertThat()
                .statusCode(401)
                .contentType("application/JSON");

        json = response.jsonPath();
        Assert.assertEquals(json.get("message"), "User not authorized!");


    }

    @Test
    public void TC03() {
        String endpoint2 = "https://demoqa.com/Account/v1/User/ee45e996-0a24-4a32-847d-aa7533f32de9";
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IlZlcmdpbGVyIiwicGFzc3dvcmQiOi\" +\n" +
                "                        \"IxMjM0IU5hbWUiLCJpYXQiOjE2MTE3NzY1MTV9.2xJkmuRiGVZDZWOfp_v3gcfvNLyvzY8X5XYxXg4UhR4";
        response = given()
                .when().auth()
                .oauth2(token)
                .get(endpoint2);
        response.then()
                .assertThat()
                .statusCode(401)
                .contentType("application/JSON");
        response.prettyPrint();

        json = response.jsonPath();
        Assert.assertEquals(json.get("userId"), "ee45e996-0a24-4a32-847d-aa7533f32de9");
        Assert.assertEquals(json.get("username"), "Vergiler");
        Assert.assertEquals("books", "[]");

    }

    @Test
    public void TC04() {
        String endpoint = "https://demoqa.com/Account/v1/User/71a98051-8e31-4949-a311-eda781a1f4d0";
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6Ik5hbWUiLCJwYXNzd29yZCI6IjEyMzQhTmFtZ" +
                "SIsImlhdCI6MTYxMTk1NjM3OX0.96Bakdv_QWzIvCzvdJJKTjupoW1mpUUujkHb3GxrgJs";
        response = given()
                .when()
                .auth().oauth2(token)
                .get(endpoint);
        response.then()
                .assertThat().statusCode(401)
                .contentType("application/JSON");
        json = response.jsonPath();
        response.prettyPrint();


    }

    @Test
    public void TC05Post() {

        Map<String, Object> myBody = new HashMap<>();
        myBody.put("userName", username);
        myBody.put("password", password);

        response = given()
                .contentType(ContentType.JSON)
                .when()
                .auth()
                .basic(username, password)
                .body(myBody)
                .post(endPoint2);

        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.getString("status"));
        String statuss = jsonPath.getString("status");
        Assert.assertEquals(statuss, "Success");


        response.then()
                .assertThat().contentType("application/JSON")
                .statusCode(200);

        response.prettyPrint();


    }

    @Test
    public void TC06() {
        Map<String, Object> postBody = new HashMap<>();
        postBody.put("userName", "C");
        postBody.put("password", "JQ3iPpTEKTLjSQJ!");
        response = given().contentType(ContentType.JSON).
                when().
                auth().basic(username, password).
                body(postBody).
                post(endPoint3);

        response.then()
                .assertThat().statusCode(404);
        JsonPath json = response.jsonPath();
        String message = json.getString("message");

        Assert.assertEquals("User not found!", message);

        response.prettyPrint();

    }

    @Test
    public void TC07Post() {

        Map<String, Object> myBody = new HashMap<>();
        myBody.put("userName", "dd");
        myBody.put("password", "ff");

        response = given()
                .contentType(ContentType.JSON)
                .when()
                .auth()
                .basic(username, password)
                .body(myBody)
                .post(endPoint2);

        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.getString("status"));
        String statuss = jsonPath.getString("status");


        response.then()
                .assertThat()
                .body("token", Matchers.equalTo(null),
                        "expires", Matchers.equalTo(null),
                        "status", Matchers.equalTo("Failed"),
                        "result", Matchers.equalTo("User authorization failed."));

        response.prettyPrint();

    }


    @Test
    public void TC08() {

        Map<String, Object> myBody = new HashMap<>();
        myBody.put("userName", null);
        myBody.put("password", null);
        response = given()
                .when()
                .contentType(ContentType.JSON)
                .auth().basic(username, password)
                .body(myBody)
                .post(endPoint2);

        response.prettyPrint();

        response.then()
                .assertThat().statusCode(400)
                .body("code", Matchers.equalTo("1200"),
                        "message", Matchers.equalTo("UserName and Password required."));


    }

    @Test
    public void TC10() {
        int random = (int) (Math.random() * 100);
        String usName = "kim359" + random;
        Map<String, String> body = new HashMap<>();
        body.put("userName", usName);
        body.put("password", "Abc1234!");

        response = given().
                when()
                .contentType(ContentType.JSON)
                .auth()
                .basic(username, password)
                .body(body)
                .post(endPoint4);
        response.prettyPrint();

        JsonPath jsonPath = response.jsonPath();
        String userNameAs = jsonPath.getString("username");
        Assert.assertEquals(userNameAs, usName);
    }


    @Test
    public void TC11() {

        body.put("userName", "abc");
        body.put("password", "Abc1234!");

        response = given().
                when().contentType(ContentType.JSON)
                .auth().basic(username, password)
                .body(body).
                        post(endPoint4);

        response.then()
                .assertThat()
                .statusCode(406)
                .body("message", Matchers.equalTo("User exists!"));


        response.prettyPrint();

    }

    @Test
    public void TC12() {
        body.put("userName", "xyz22");
        body.put("password", null);

        response = given()
                .when()
                .contentType(ContentType.JSON)
                .auth().basic(username, password)
                .body(body).
                        post(endPoint4);
        response.prettyPrint();

        response.then()
                .assertThat()
                .statusCode(400)
                .body("message",Matchers.equalTo("UserName and Password required."));

    }
}


