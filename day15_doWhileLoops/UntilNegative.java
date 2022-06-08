package day15_doWhileLoops;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);

        System.out.println("Enter a number");
        int number=kb.nextInt();
        int sum=0;
        while(number>0)
        { sum+=number;
            System.out.println("Enter a number");
            number=kb.nextInt();
              }
        System.out.println(sum);
    }
}
