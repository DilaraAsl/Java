package day14_forLoops_reviewMethods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=kb.nextInt();
        int factorial=1;
        for(int i=number;i>0;i--){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
