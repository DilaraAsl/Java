package day14_forLoops_reviewMethods;
import java.util.*;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int n1= kb.nextInt();
        int n2= kb.nextInt();
        int n3= kb.nextInt();
        kb.close();
        int sum1=sumNumbers(n1,n2);
        int sum2=sumNumbers(n1,n2,n3);
        System.out.println("Sum of two numbers: "+sum1);
        System.out.println("Sum of three numbers: "+sum2);

    }
    public static int sumNumbers(int number1,int number2){
        return number1+number2;
    }
    public static int sumNumbers(int number1,int number2,int number3){
        return number1+number2+number3;
    }
}
