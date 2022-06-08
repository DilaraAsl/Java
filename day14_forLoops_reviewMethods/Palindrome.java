package day14_forLoops_reviewMethods;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = kb.next();
        int length = str.length();
        int mid;
        String sub1 = "";
        String sub2 = "";
        if (length % 2!= 0) {
            mid = (length + 1) / 2;
            for (int i = 0; i < mid; i++) {
                sub1 += "" + str.charAt(i);
                sub2 += "" + str.charAt(length - 1 - i);

            }
            if (sub1.equalsIgnoreCase(sub2)) System.out.println(true);
            else System.out.println(false);
        } else {

            mid = length / 2;
            for (int i = 0; i < mid; i++) {
                sub1 += "" + str.charAt(i);
                sub2 += "" + str.charAt(length - 1 - i);

            }
            if (sub1.equalsIgnoreCase(sub2)) System.out.println(true);
            else System.out.println(false);



        }
        float f1=(1_560.00>12_60)?10:20;
        System.out.println(f1);
        float f2=(12_345.1>123_45.0)?12_456:124_56.02f;
        float f3=f2+1024;
        System.out.println(f3);
    }
}

