package UI_tests;

import java.util.ArrayList;
import java.util.List;

public class Deneme {

    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("hirsiz");
        liste.add("hakim");
        liste.add("polis");
        liste.add("magdur");
        liste.add("adam");

        String yakala = "";
        int count = 0;
        for (int i = 0; i < liste.size(); i++) {
            yakala = liste.get(i);
            count++;
            if (yakala.equals("hirsiz")) {
                break;
            }


        }

        System.out.println(count);

    }
}
//        @Given("user click message")
//        public void user_click_message () {
//            hyriaRolePage.messageButton.click();
//            Driver.wait(2);
//        }
//
//        @Given("user click button")
//        public void user_click_button () {
//            Driver.clickWithJS(hyriaRolePage.messageClick);
//        }
//    }


