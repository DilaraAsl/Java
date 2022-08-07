package Day24_RemoveIf_DateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now(); // static method we can call it through the class name
        System.out.println(today); // default format of printing date
        LocalDate birthDay=LocalDate.of(1973,10,15);// accepts numbers
        System.out.println(birthDay);
        System.out.println("-------------------------------------------");
        System.out.println(today.getYear());//today object calls getYear method which returns the year
        System.out.println(today.getMonth());// returns the name of the month String
        System.out.println(today.getMonthValue());//returns the number value of the month
        System.out.println(birthDay.getYear());
        System.out.println(birthDay.getDayOfWeek()); // returns the day name
        System.out.println(birthDay.getDayOfMonth());
        System.out.println(birthDay.getDayOfYear());
        System.out.println(today.minusYears(birthDay.getYear()));
        System.out.println(today.plusYears(4));

        LocalDate graduationDate=LocalDate.of(2025,6,12);
       graduationDate= graduationDate.plusYears(2); // must be re-referenced it is immutable
       graduationDate= graduationDate.plusMonths(7);
        graduationDate= graduationDate.plusDays(100);
        System.out.println(graduationDate);
        if(graduationDate.isBefore(today)){
            System.out.println("You have graduated. Congrats!!");
        }
        else System.out.println(" A few more years to graduate. Keep studying!!");
    }
}
