package day14_forLoops_reviewMethods;

import java.util.Scanner;

public class ReturnSumOfDigitsString {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=kb.next();
        int sum=0;
        for (int i = 0; i <str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                sum+=(str.charAt(i)-48);// ASCII value of 0 is 48
            }

        }
        System.out.println(sum);
        {

        }
    }
}
