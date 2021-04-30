package database_tests;


import com.sun.codemodel.JStatement;
import io.cucumber.java.it.Data;
import io.cucumber.java.it.Ma;
import org.junit.Test;
import org.testng.Assert;
import utilities.DatabaseConnector;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class Exists01 {


    @Test
    public void name() {
    }

    @Test
    public void testName() {
        String query = "SELECT product_name\n" +
                "FROM products\n" +
                "WHERE EXISTS (SELECT product_id\n" +
                "              FROM order_details\n" +
                "              WHERE products.product_id = order_details.product_id);";
        //System.out.println(DatabaseConnector.getQueryResultWithAListMap(query));
        List<Map<String,String>> myResult = DatabaseConnector.getQueryResultWithAListMap(query);
        for (Map<String, String> w:myResult
             ) {
            System.out.println(w);


        }







    }

    @Test
    public void TC02() {
        String queryCustomer1 = "select*" +
                "from customers";
        List<Map<String,String>> mydata1 = DatabaseConnector.getQueryResultWithAListMap(queryCustomer1);
        int a = mydata1.size();
        System.out.println(a);

        String query = "insert into customers(contact_name,company_name,customer_id)\n" +
                "select first_name,title,employee_id from employees\n" +
                "ORDER BY random() LIMIT 1;";
          DatabaseConnector.executeInsertQuery(query);



        String queryCustomer2 = "select*" +
                "from customers";

        List<Map<String,String>> mydata2 = DatabaseConnector.getQueryResultWithAListMap(queryCustomer2);
        int b = mydata2.size();
        System.out.println(b);

        Assert.assertTrue(b==a+1);







    }
}
