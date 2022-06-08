package day12_methodsAndStringReview;
import java.util.Scanner;
public class EligibleToVote {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=kb.nextInt();
        System.out.println("Are you an American citizen?");
        boolean citizen=kb.nextBoolean();
        isEligible(age,citizen);
    }
    public static void isEligible(int age,boolean yes){
        if (age>21 && yes==true) System.out.println("Eligible to Vote");
        else System.out.println("not eligible");

    }
}
