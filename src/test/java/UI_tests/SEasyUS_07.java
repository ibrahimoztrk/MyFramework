package UI_tests;

import UI_pages.SE_TableFilterPage;
import io.cucumber.java.sl.In;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class SEasyUS_07 {

    SE_TableFilterPage tableFilterPage;

    {
        tableFilterPage = new SE_TableFilterPage();
    }

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("https://www.seleniumeasy.com/test/");
        tableFilterPage.startButton.click();

        try {
            tableFilterPage.popUpMessage.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

        tableFilterPage.advancedButton.click();


    }


    @Test
    public void TC01() {
        tableFilterPage.tableFilterLink.click();
        Assert.assertTrue(tableFilterPage.numberOfElements.size() == 5);

    }

    @Test
    public void TC02() throws InterruptedException {
        tableFilterPage.tableFilterLink.click();
        Thread.sleep(2000);
        int numberOfOrange = 0;
        for (WebElement w : tableFilterPage.allColors) {
            tableFilterPage.orangeButton.click();
            if (!w.getAttribute("style").equals("display: none;")) {

                numberOfOrange++;
            }
        }
        System.out.println(numberOfOrange);

        Assert.assertTrue(numberOfOrange == 2);

    }

    @Test
    public void TC03() {
        tableFilterPage.tableSortLink.click();
        String info = "Showing 1 to 32 of 32 entries";
        tableFilterPage.selectLenght(tableFilterPage.select1);

        Assert.assertTrue(info.equals(tableFilterPage.infoBar.getText()));
        Assert.assertTrue(tableFilterPage.numberOfRow.size() == 33);

        List<Integer> newSalary = new ArrayList<>();
        for (WebElement w : tableFilterPage.salary) {
            int a = Integer.parseInt(w.getText().substring(1, w.getText().indexOf("/")).replace(",", ""));
            newSalary.add(a);
        }
        int numberOfSalaries = 0;
        for (Integer w : newSalary) {
            if (w > 200000) {
                numberOfSalaries++;
                System.out.println(w);
            }
        }

        Assert.assertTrue(numberOfSalaries == 18);


    }


}