package day12_methodsAndStringReview;

import java.util.Scanner;

public class ConvertFirstToUpper {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("please enter a word:");
        String firstN=kb.next().trim();
        String firstNchar= firstN.substring(0,1).toUpperCase();
        firstN=firstNchar+firstN.substring(1).toLowerCase();
        System.out.println("please enter a word:");
        String lastN=kb.next().trim();
        kb.close();
        String lastNchar=lastN.substring(0,1).toUpperCase();
        lastN=lastNchar+lastN.substring(1).toLowerCase();
        System.out.println(firstN+" "+lastN);

    }
}
