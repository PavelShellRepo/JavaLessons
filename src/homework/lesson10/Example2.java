package homework.lesson10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class Example2 {
    public static void main(String[] args) {
        Date date = new Date();

        LocalDate localDate = LocalDate.now(); // Get the current date without time
        LocalDateTime localDateTime = LocalDateTime.now(); // Getting the current date and time
        LocalTime localTime = LocalTime.now(); // Getting the current time without date

        System.out.println(date);
        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(localTime);

        LocalDate localDate1 = LocalDate.of(1993, Month.MARCH, 13); // Set date using (of)
        System.out.println(localDate1);
    }
}
