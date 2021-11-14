package basic_java.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {


    //mm%dd%yyyy   12%31%1980
    public void printDayOfWeek(String dateAsText) {

    }


    public static void main(String[] args) {




        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.TAIWAN));
        LocalDate date = localDate.plusYears(1);
        System.out.println(date.getDayOfWeek());
        LocalDate localDate1 = localDate.withMonth(3);
        LocalDate evgenyBirthday = LocalDate.of(1978, 10, 3);
        LocalDate pinhasBirthday = LocalDate.of(1995, 3, 31);
        long between = ChronoUnit.MONTHS.between(evgenyBirthday, pinhasBirthday);
        System.out.println("between = " + between);


    }
}








