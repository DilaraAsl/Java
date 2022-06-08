package day12_methodsAndStringReview;
import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Salary");
        double salary=kb.nextDouble();
        System.out.println("no of hours");
        int hours=kb.nextInt();
        calculateSalary(salary,hours);

    }
    public static void calculateSalary(double rate, int hrs){
        System.out.println("Hourly rate "+rate);
        System.out.println("Weekly hrs "+hrs);
        System.out.println("Gross Salary: "+(rate*hrs*4));

    }
}
