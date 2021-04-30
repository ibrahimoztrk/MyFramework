package UI_pages;

import UI_tests.HyriaRole;
import org.apache.poi.hssf.record.chart.DatRecord;
import org.testng.annotations.Test;
import utilities.Driver;

public class Google {

    HyriaRolePage google = new HyriaRolePage();
    @Test
    public void testName() {
        Driver.getDriver().get("https://www.google.com");
        Driver.wait(2);
     //   Driver.clickWithJS(google.accepte);



    }
}
