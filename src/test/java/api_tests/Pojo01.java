package api_tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.Infos;
import pojos.Users;
import utilities.JsonUtil;

public class Pojo01 {


    String endPoint;
    Response response;
    JsonPath json;
    ObjectMapper objectMapper;

    {
        endPoint = "https://gorest.co.in/public-api/users/";
        objectMapper = new ObjectMapper();

    }

    @Test
    public void pojo01() throws JsonProcessingException {
        response = JsonUtil.responseMethod(endPoint);

        Users allUsers = objectMapper.readValue(response.asString(), Users.class);
        System.out.println(allUsers.getData().get(0).getId());

        System.out.println(allUsers.getData().get(allUsers.getData().size() - 1).getEmail());
        System.out.println(allUsers.getData().size());
        System.out.println("Code " + allUsers.getCode());
        System.out.println("Limit : " + allUsers.getMeta().getPagination().getLimit());

        System.out.println("---------------------------");

        for (Infos w : allUsers.getData()) {
            if (w.getGender().equals("Male")) {
                System.out.println(w.getGender());
            }


        }
        System.out.println(" Pages "+allUsers.getMeta().getPagination().getPages());
    }
}


