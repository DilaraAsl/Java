package day15_doWhileLoops;


import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int max=kb.nextInt();
        int min=max;

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter the next number");
            int num=kb.nextInt();
            if(max<num){
                max=num;
            }
            if(min>num){
                min=num;
            }

        }
        kb.close();
        System.out.println(max);
        System.out.println(min);
    }
}
