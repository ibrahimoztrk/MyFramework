package api_tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion;
import io.cucumber.java.sl.In;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojos.Infos;
import pojos.Users;
import utilities.JsonUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Pojo01 {


    String endPoint;
    Response response;
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
        System.out.println(" Pages " + allUsers.getMeta().getPagination().getPages());
    }

    @Test
    public void pojo02() throws JsonProcessingException {

        //all page assertion
        response = JsonUtil.responseMethod(endPoint);
        objectMapper = new ObjectMapper();
        Users allUsers = objectMapper.readValue(response.asString(), Users.class);
        System.out.println(allUsers.getMeta().getPagination().getPages());
        response.prettyPrint();

    }

    @Test
    public void TC02() throws JsonProcessingException {

        //id natural order assertion

        response = JsonUtil.responseMethod(endPoint);
        objectMapper = new ObjectMapper();
        Users allUsers = objectMapper.readValue(response.asString(), Users.class);
        List<Integer> allId = new ArrayList<>();
        for (Infos w : allUsers.getData()) {
            allId.add(w.getId());
        }
        for (Integer w : allId) {
            Assert.assertTrue(w - (w + 1) != 1);
        }
    }

    @Test
    public void TC03() throws JsonProcessingException {
        //names are not NULL assertion

        response = JsonUtil.responseMethod(endPoint);
        objectMapper = new ObjectMapper();
        Users user = objectMapper.readValue(response.asString(), Users.class);

        for (Infos w : user.getData()) {
            for (Infos s : user.getData()) {
                Assert.assertTrue(!w.getName().equals(null));
            }


        }

    }

    @Test
    public void TC04() throws JsonProcessingException {
        // check dublicate names
        response = JsonUtil.responseMethod(endPoint);
        Users allUser = objectMapper.readValue(response.asString(), Users.class);


    }

    @Test
    public void TC05() throws JsonProcessingException {
        //more females assertion
        response = JsonUtil.responseMethod(endPoint);
        Users allUser = objectMapper.readValue(response.asString(), Users.class);

        int countOfFemale = 0;
        int countOfMale = 0;

        for (Infos w : allUser.getData()) {
            if (w.getGender().equals("Female")) {
                countOfFemale++;
            } else {
                countOfMale++;
            }
        }
        Assert.assertTrue(countOfMale<countOfFemale);
    }

    @Test
    public void TC06() throws JsonProcessingException {
        //active status count assertion

        response = JsonUtil.responseMethod(endPoint);
        Users allusers = objectMapper.readValue(response.asString(), Users.class);
         int numberOfActives=0;
        for (Infos w : allusers.getData()) {
              if(w.getStatus().equals("Active")) {
                  numberOfActives++;
              }
        }
        Assert.assertTrue(numberOfActives==13);
    }
}



