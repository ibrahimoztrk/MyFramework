package api_tests;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;
import pojos.Token;
import utilities.JsonUtil;

import javax.naming.CompositeName;
import javax.print.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Post01 {

    String username;
    String password;
    String endPoint;
    String token;

    {
        username = "ttrycatch";
        password = "JQ3iPpTEKTLjSQJ!";
        endPoint = "https://demoqa.com/Account/v1/GenerateToken";

    }

    @Test
    public void TC01() {
//         String body = "{\n" +
//                 "  \"userName\": \"ttrycatch\",\n" +
//                 "  \"password\": \"JQ3iPpTEKTLjSQJ!\"\n" +
//                 "}";
//         Response response = given().
//                                 contentType(ContentType.JSON).
//                                 body(body).
//                                 auth().basic(username,password).
//                                 when().
//                                 post(endPoint);

         token = JsonUtil.getToken();
         System.out.println(token);

         //response.prettyPrint();

      //  JsonPath json = response.jsonPath();
     //   System.out.println(json.getString("token"));


    }

    @Test
    public void TC02() {
        Map<String, Object> bodyPost = new HashMap<>();
        bodyPost.put("userName", username);
        bodyPost.put("password", password);

        Response response = given().
                                contentType(ContentType.JSON).
                                auth().basic(username,password).
                                body(bodyPost).
                            when().
                                post(endPoint);
        response.prettyPrint();
         JsonPath jsonPath = response.jsonPath();
         System.out.println(jsonPath.getString("expires"));


    }

    @Test
    public void TC03() {
        JSONObject body = new JSONObject();
        body.put("userName", username);
        body.put("password",password);


         Response response = given().
                                    contentType(ContentType.JSON).
                                    auth().basic(username,password).
                                    body(body.toString()).
                            when().
                                    post(endPoint);
        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.getString("result"));

    }

    @Test
    public void TC04() {
        Token body = new Token();
        body.setUserName(username);
        body.setPassword(password);
        System.out.println(body);


        Response response = given().
                                contentType(ContentType.JSON).
                                auth().basic(username,password).
                                body(body).
                when().
                            post(endPoint);
        response.prettyPrint();

        JsonPath jsonPath = response.jsonPath();
       // System.out.println(jsonPath.getString("token"));

    }


}
