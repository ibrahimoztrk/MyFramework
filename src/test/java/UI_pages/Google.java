package UI_pages;

import org.testng.annotations.Test;
import utilities.Driver;

public class Google {

    RolePage google = new RolePage();
    @Test
    public void testName() {
        Driver.getDriver().get("https://www.google.com");
        Driver.wait(2);
     //   Driver.clickWithJS(google.accepte);



    }
}
