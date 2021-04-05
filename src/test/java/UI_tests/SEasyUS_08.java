package UI_tests;

import UI_pages.SEasyDataDownPage;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class SEasyUS_08 {

       SEasyDataDownPage sdataDownPage = new SEasyDataDownPage();
    @Test
    public void test1() {
        Driver.getDriver().get("https://www.seleniumeasy.com/test/");
        sdataDownPage.startButton.click();
        sdataDownPage.tableButton.click();
        sdataDownPage.tableDataDown.click();
        for (WebElement w:sdataDownPage.cityColumn) {
            System.out.println(w.getText());
        }
    }
}
