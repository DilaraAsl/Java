package Day25_ConstructorsAndDateFormatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingPractice {
    public static void main(String[] args) {

        DateTimeFormatter df= DateTimeFormatter.ofPattern("E-MMMM,d-yy");
        DateTimeFormatter df2= DateTimeFormatter.ofPattern("y/MMM/d");
        LocalDate today= LocalDate.now();
        System.out.println(today.format(df));
        System.out.println(today.format(df2));

       DateTimeFormatter df3=DateTimeFormatter.ofPattern("h:m a");
       LocalTime timeR=LocalTime.now();
        System.out.println(timeR.format(df3));

        LocalDateTime dT=LocalDateTime.now();
        DateTimeFormatter df4=DateTimeFormatter.ofPattern("EEEE MMM d,y h:mm a");
        System.out.println("Java Programming "+dT.format(df4));

        LocalDateTime setDayTime=LocalDateTime.of(2020,11,24,13,00);
        DateTimeFormatter df5=DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");
        System.out.println(setDayTime.format(df5));
    }
}
