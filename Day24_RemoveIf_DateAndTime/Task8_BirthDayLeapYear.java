package Day24_RemoveIf_DateAndTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Task8_BirthDayLeapYear {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the year of your birthday: ");
        int year=kb.nextInt();
        System.out.println(isBirthdayLeapYear(year));
    }

    private static boolean isBirthdayLeapYear(int year) {
       if(year%4==0) return true;
        return false;
    }
}
