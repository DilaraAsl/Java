package day12_methodsAndStringReview;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("please enter a word:");
        String word=kb.next().trim();
        System.out.println(word.substring(1));
        kb.close();
    }
}
