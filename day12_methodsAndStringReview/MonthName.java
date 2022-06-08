package day12_methodsAndStringReview;
import java.util.Scanner;
public class MonthName {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Please enter the month no:");
        int month=kb.nextInt();
        printMonth(month);
    }
    public static void printMonth(int monthNo){
        String monthName="";
        if(monthNo<=12 && monthNo>0){
            switch(monthNo){
                case 1:
                    monthName="Jan";
                    break;
                case 2:
                    monthName="Feb";
                    break;
                default:
                    System.out.println("Invalid entry!");
            }
            System.out.println(monthName);
        }

    }
}
