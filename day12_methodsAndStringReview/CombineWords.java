package day12_methodsAndStringReview;

import java.util.Locale;
import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("please enter a word:");
        String word=kb.next().trim();
        word=word.toLowerCase();
        System.out.println("please enter a second word:");
        String word2=kb.next().trim();
        word2=word2.toLowerCase();
        int length=word.length();

        if(word.charAt(length-1)==(word2.charAt(0))){

            System.out.println(word+word2.substring(1));
        }
        else System.out.println(word+word2);

    }
}
