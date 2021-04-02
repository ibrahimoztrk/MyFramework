package database;

import org.junit.Test;
import utilities.DatabaseConnector;

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




    }



