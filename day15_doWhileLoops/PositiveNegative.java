package day15_doWhileLoops;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int number;
                int negative=0; int positive=0; int zeroes=0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Please enter a number : ");
            number=kb.nextInt();
            if(number<0) negative++;
            else if(number>0) positive++;
            else zeroes++;
        }
        System.out.println(negative);
        System.out.println(positive);
        System.out.println(zeroes);
    }
}
