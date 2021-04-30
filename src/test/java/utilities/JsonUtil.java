package utilities;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class JsonUtil {

    Response response;

    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }

    public static String convertJavaToJson(Object object) {
        String jsonResult = "";
        try {
            jsonResult = mapper.writeValueAsString(object);
        } catch (JsonGenerationException e) {
            System.out.println("Java objectini Jsona cevirirken exception olustu." + e.getMessage());
        } catch (JsonMappingException e) {
            System.out.println("Java objectini Jsona cevirirken exception olustu." + e.getMessage());
        } catch (IOException e) {
            System.out.println("Java objectini Jsona cevirirken exception olustu." + e.getMessage());
        }
        return jsonResult;
    }

    public static <T> T convertJsonToJavaOneData(String json, Class<T> cls) {
        T javaResult = null;
        try {
            javaResult = mapper.readValue(json, cls);
        } catch (JsonParseException e) {
            System.out.println("1-Json'i Java'ya cevirirken Exception olustu" + e.getMessage());
        } catch (JsonMappingException e) {
            System.out.println("2-Json'i Java'ya cevirirken Exception olustu" + e.getMessage());
        } catch (IOException e) {
            System.out.println("3-Json'i Java'ya cevirirken Exception olustu" + e.getMessage());
        }
        return javaResult;

    }

    public static Response responseMethod(String url) {
        Response response = given().auth().oauth2(ConfigurationReader.getProperty("token")).
                accept(ContentType.JSON).
                when().
                get(url);
        //  response.prettyPrint();

        return response;
    }

    public static Response getResponse(String url) {

        return given().
                accept(ContentType.JSON).
                when().
                get(url);
    }


    public static String getToken() {

        String username = "ttrycatch";
        String pass = "JQ3iPpTEKTLjSQJ!";
        String body = "{\n" +
                "  \"userName\": \"ttrycatch\",\n" +
                "  \"password\": \"JQ3iPpTEKTLjSQJ!\"\n" +
                "}";
        String enpoint = "https://demoqa.com/Account/v1/GenerateToken";
        Response response = given().
                                contentType(ContentType.JSON).
                                auth().basic(username, pass).
                                body(body).
                            when().
                                post(enpoint);
        JsonPath json = response.jsonPath();

        return json.getString("token");
    }

    // List data convert json to java

    // Customer[] allCustomer = mapper.readValue(json, Customer[].class);
    // List<Customer> allCustomerList = mapper.readValue(response.asString(), new TypeReference<List<Customer>>(){};

}
