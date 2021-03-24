package database;


import org.junit.Test;
import utilities.DatabaseConnector;

import java.util.List;
import java.util.Map;

public class Test01 {


    @Test
    public void testName() {
        String query = "SELECT product_name\n" +
                "FROM products\n" +
                "WHERE EXISTS (SELECT product_id\n" +
                "              FROM order_details\n" +
                "              WHERE products.product_id = order_details.product_id);\n";
        //System.out.println(DatabaseConnector.getQueryResultWithAListMap(query));
        List<Map<String,String>> myResult = DatabaseConnector.getQueryResultWithAListMap(query);
        for (Map<String, String> w:myResult
             ) {
            System.out.println(w);
        }

    }


}
