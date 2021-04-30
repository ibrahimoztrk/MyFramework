package api_tests;

import net.bytebuddy.asm.Advice;
import org.testng.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExam {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime time = LocalDateTime.parse("2021-04-18T03:50");
        LocalDateTime time2 = LocalDateTime.parse("2019-12-18T03:50");
        String date1 = dtf.format(time);
        System.out.println(date1);
        System.out.println(time);
        System.out.println(time2);
        Assert.assertTrue(time.isAfter(time2));

    }
}
//2021-04-18T03:50:04.243+05:30