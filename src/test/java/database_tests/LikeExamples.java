package database_tests;

import org.junit.Test;
import utilities.DatabaseConnector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LikeExamples {

    @Test
    public void like1() {

        String query = "select company_name\n" +
                "from Suppliers\n" +
                "WHERE company_name like 'L%';";

        List<Map<String,String>>  listOfL= DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println("Il y a " + listOfL.size() + " company commençant avec L " );
//        for (Map<String, String> w :listOfL
//             ) {
//            System.out.println(w);
//        }
    }
  @Test
    public void like2() {

        String query = "select company_name\n" +
                "from Suppliers\n" +
                "WHERE company_name like '%a%';";

        List<Map<String,String>>  listOfA= DatabaseConnector.getQueryResultWithAListMap(query);
       System.out.println("Il y a " + listOfA.size() + " company qui inclus a");
//        for (Map<String, String> w :listOfA
//        ) {
//            System.out.println(w);
//        }
    }

    @Test
    public void like3() {

        String query = "select company_name\n" +
                "from Suppliers\n" +
                "WHERE company_name like 'a%';";

        List<Map<String,String>>  listOfA= DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println("Il y a " + listOfA.size() + " company qui commence par a");
//        for (Map<String, String> w :listOfA
//        ) {
//            System.out.println(w);
//        }
    }


    @Test
    public void like4() {

        String query = "select supplier_id\n" +
                "from suppliers \n" +
                "where company_name like '%a%e'";

        List<Map<String,String>> mylist = DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println(mylist);
        List<String> newlist = new ArrayList<>();
        for (Map<String,String> w : mylist) {
              newlist.add(w.get("supplier_id"));
            }
        System.out.println(newlist);
        }



    @Test
    public void like5() {

        String query = "select supplier_id\n" +
                "from suppliers \n" +
                "where company_name like '%u%e%'";

        List<Map<String,String>> mylist = DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println(mylist.size());

    }
    @Test
    public void like6() {

        String query = "select supplier_id\n" +
                "from suppliers \n" +
                "where company_name like '%e%u%'";

        List<Map<String,String>> mylist = DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println(mylist.size());

    }
    @Test
    public void like7() {

        String query = "select country\n" +
                "from suppliers\n" +
                "where country ilike 'u_%_%';";

        List<Map<String,String>> mylist = DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println(mylist);

    }

    @Test
    public void like8() {

        String query = "select last_name\n" +
                "from employees\n" +
                "where city like '___o%';";

        List<Map<String,String>> mylist = DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println(mylist);

    }

    @Test
    public void like9() {

        String query = "select extension, first_name\n" +
                "from employees\n" +
                "where extension not like '___' and first_name not like 'Robert';";

        List<Map<String,String>> mylist = DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println(mylist);

    }

    @Test
    public void like10() {

        String query = "\n" +
                "select product_name, quantity_per_unit  , supplier_id\n" +
                "from products\n" +
                "where product_name not like '____' and quantity_per_unit like '3%' and supplier_id=2;";

        List<Map<String,String>> mylist = DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println(mylist);
        System.out.println(mylist.get(0).get("supplier_id"));

    }

    @Test
    public void like11() {

        String query = "select product_name, quantity_per_unit\n" +
                "from products\n" +
                "where product_name not like '____' or quantity_per_unit like '3%';";

        List<Map<String,String>> mylist = DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println(mylist.size());


    }

    @Test
    public void like12() {

        String query = "select unit_price, reorder_level\n" +
                "from products\n" +
                "Where unit_price > (select avg(unit_price)\n" +
                "from products) ";

        List<Map<String,String>> mylist = DatabaseConnector.getQueryResultWithAListMap(query);
        System.out.println("plus de moyen "+ mylist.size());

        String query2 = "select unit_price, reorder_level\n" +
                "from products\n" +
                "Where unit_price > (select avg(unit_price)\n" +
                "from products) and reorder_level >9; ";

        List<Map<String,String>> mylist2 = DatabaseConnector.getQueryResultWithAListMap(query2);
        System.out.println("plus de 1 chiffre "+ mylist2.size());


    }















}



