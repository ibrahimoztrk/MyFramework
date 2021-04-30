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
import pojos.Pagination;
import pojos.Users;
import utilities.JsonUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
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
                Assert.assertNotNull(w.getName());
            }


        }

    }

    @Test
    public void TC04() throws JsonProcessingException {
        // check dublicate names
        response = JsonUtil.responseMethod(endPoint);
        Users allUser = objectMapper.readValue(response.asString(), Users.class);

        List<String> allName = new ArrayList<>();
        for (Infos w : allUser.getData()) {
            allName.add(w.getName());
        }

        int numberOfDublicate = 0;
        for (int i = 0; i < allName.size() - 1; i++) {
            for (int j = i + 1; j < allName.size(); j++) {
                if (allName.get(i).equals(allName.get(j))) {
                    System.out.println(allName.get(i));
                    numberOfDublicate++;
                }
            }

        }
        Assert.assertTrue(numberOfDublicate == 0);
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
        Assert.assertTrue(countOfMale < countOfFemale);
    }

    @Test
    public void TC06() throws JsonProcessingException {
        //active status count assertion

        response = JsonUtil.responseMethod(endPoint);
        Users allusers = objectMapper.readValue(response.asString(), Users.class);
        int numberOfActives = 0;
        for (Infos w : allusers.getData()) {
            if (w.getStatus().equals("Active")) {
                System.out.println(w.getName());
                numberOfActives++;
            }
        }
        System.out.println(numberOfActives);
        Assert.assertTrue(numberOfActives == 7);
    }

    @Test
    public void TC07() throws JsonProcessingException {

        response = JsonUtil.responseMethod(endPoint);
        Users allusers = objectMapper.readValue(response.asString(), Users.class);
        List<Integer> allId = new ArrayList<>();
        for (Infos w : allusers.getData()) {
            allId.add(w.getId());
        }
        Assert.assertTrue(allId.contains(41));

    }

    @Test
    public void TC08() throws JsonProcessingException {
        //null data verification
        response = JsonUtil.responseMethod(endPoint);
        response.prettyPrint();
        Users allusers = objectMapper.readValue(response.asString(), Users.class);
        for (int i = 0; i <allusers.getData().size() ; i++) {
         Assert.assertFalse(allusers.getData().get(i).getGender().equals(null));
            Assert.assertFalse(allusers.getData().get(i).getId()==null);
            Assert.assertFalse(allusers.getData().get(i).getStatus().equals(null));
            Assert.assertFalse(allusers.getData().get(i).getEmail().equals(null));
            Assert.assertFalse(allusers.getData().get(i).getName().equals(null));
            Assert.assertFalse(allusers.getData().get(i).getEmail().equals(null));
            Assert.assertFalse(allusers.getData().get(i).getCreatedAt().equals(null));
        }


    }


    @Test
    public void TC09() throws JsonProcessingException {
        response = JsonUtil.responseMethod(endPoint);
        Users allusers = objectMapper.readValue(response.asString(), Users.class);

        List<String> allName = new ArrayList<>();
        for (Infos w : allusers.getData()) {
            allName.add(w.getName());
        }
        for (String w : allName) {
            Assert.assertFalse(w.contains("Nuri"));
        }


    }

    @Test
    public void TC010() throws JsonProcessingException {
        response = JsonUtil.responseMethod(endPoint);
        Users allusers = objectMapper.readValue(response.asString(), Users.class);
        List<String> allMail = new ArrayList<>();
        for (Infos w : allusers.getData()) {
            allMail.add(w.getEmail());
        }
        int numberOfGmail = 0;
        for (String w : allMail) {
            Assert.assertFalse(w.contains("aliveli@gmail.com"));
            if (w.contains("@gmail")) {
                numberOfGmail++;
            }
        }
        Assert.assertTrue(numberOfGmail == 0);
    }

    @Test
    public void TC011() throws JsonProcessingException {
        response = JsonUtil.responseMethod(endPoint);
        Users allusers = objectMapper.readValue(response.asString(), Users.class);
        Pagination pag = allusers.getMeta().getPagination();



        List<String> allName = new ArrayList<>();
        for (Infos w : allusers.getData()) {
            allName.add(w.getName());
        }
        int numberOfNamesAD = 0;
        for (String w : allName) {
            if (w.startsWith("A") || w.startsWith("D")) {
                numberOfNamesAD++;
            }
        }
        Assert.assertTrue(numberOfNamesAD == 5);

    }

    @Test
    public void TC012() throws JsonProcessingException, ParseException {
        response = JsonUtil.responseMethod(endPoint);
        Users allUsers = objectMapper.readValue(response.asString(), Users.class);
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdformat.parse("2019-04-15");
        Date d2 = sdformat.parse("20120-01-01");

        List<String> allCreateDate = new ArrayList<>();
        for (Infos w : allUsers.getData()) {
            allCreateDate.add(w.getCreatedAt());
        }

        List<String> allUpdateDate = new ArrayList<>();
        for (Infos w : allUsers.getData()) {
            allUpdateDate.add(w.getCreatedAt());

        }

        for (int i = 0; i <allUsers.getData().size() ; i++) {
                 String createDates = allUsers.getData().get(i).getCreatedAt().substring(0,16);
                 String updateDates = allUsers.getData().get(i).getUpdatedAt().substring(0,16);
                 LocalDateTime createTime = LocalDateTime.parse(createDates);
                 LocalDateTime updateTime = LocalDateTime.parse(updateDates);
                 Assert.assertTrue(createTime.isBefore(updateTime) || createTime.isEqual(updateTime));

        }


    }
}



