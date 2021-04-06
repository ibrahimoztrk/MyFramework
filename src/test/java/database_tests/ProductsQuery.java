package database_tests;

import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.junit.Test;
import utilities.DatabaseConnector;

import java.util.List;
import java.util.Map;

public class ProductsQuery {
    @Test
    public void name1() {

         String query = "select count(category_name) total_product\n" +
                 "from categories \n" +
                 "join products on products.product_id = categories.category_id";

        List<Map<String,String>> mydata = DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println(mydata);

    }

    @Test
    public void name() {

        String query = "\n" +
                "select contact_title, region \n" +
                "from customers\n" +
                "where contact_title = 'Owner' and region is null";

        List<Map<String,String>> mydata = DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println(mydata.size());
        Assert.assertTrue(mydata.size()==13);

    }

    @Test
    public void name2() {

        String query = "select product_name , category_name\n" +
                "from categories\n" +
                "join products on products.product_id = categories.category_id\n" +
                "where category_name = 'Seafood'";

        List<Map<String,String>> mydata = DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println(mydata.size());


    }


    @Test
    public void name3() {

        String query = "\n" +
                "select country, product_name\n" +
                "from suppliers \n" +
                "join products on suppliers.supplier_id = products.product_id\n" +
                "where suppliers.country = 'Germany'";

        List<Map<String,String>> mydata = DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println(mydata.size());


    }


    @Test
    public void name4() {

        String query = "select region, product_name\n" +
                "from suppliers\n" +
                "join products on suppliers.supplier_id = products.product_id\n" +
                "where suppliers.region='OR'";

        List<Map<String,String>> mydata = DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println(mydata.size());


    }

    @Test
    public void name5() {

  //--customers tablosunda sehri London olan musteri sayisi, sehri Berlin olan musteri saysindan fazladir.

        String query = "select customer_id, city sehir\n" +
                "from customers\n" +
                "where city = 'Berlin'";


        List<Map<String,String>> mydata = DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println(mydata.size());

        String query2 = "select customer_id, city sehir\n" +
                "from customers\n" +
                "where city = 'London'";

        List<Map<String,String>> mydata2 = DatabaseConnector.getQueryResultWithAListMap(query2);
        System.out.println(mydata2.size());


        Assert.assertTrue(mydata2.size()>mydata.size());

        //Deuxiéme solution

        String query3 = "\n" +
                "select city,count(*)\n" +
                "from customers\n" +
                "group by city";
        List<Map<String,String>> mydata3 = DatabaseConnector.getQueryResultWithAListMap(query3);
        System.out.println(mydata2.size());




    }


    @Test
    public void name7() {
        //-customers tablosunda sehri Berlin olan en az bir musteri vardir.

        String query = "\n" +
                "select city, customer_id\n" +
                "from customers\n" +
                "where city = 'Berlin'";

        List<Map<String,String>> mydata = DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println(mydata.size());
        Assert.assertTrue(mydata.size()==1);



    }

    @Test
    public void name8() {


        //--Customers tablosunda 69 farakli city vardir

      String query = "select count (distinct city) as total_city\n" +
              "from customers";

      List<Map<String, String>> mydata = DatabaseConnector.getQueryResultWithAListMap(query);
     Assert.assertTrue(mydata.get(0).get("total_city").equals("69"));

    }

    @Test
    public void name9() {
           //Products tablosunda kac farkli ürün vardir.(77 üürn oldugunu dogrulayiniz)

        String query = " \n" +
                " select count(product_id)\n" +
                " from products";

        List<Map<String, String>> mydata = DatabaseConnector.getQueryResultWithAListMap(query);
        Assert.assertTrue(mydata.get(0).get("count").equals("77"));
    }


}
