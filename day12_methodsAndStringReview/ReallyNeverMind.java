package day12_methodsAndStringReview;

import java.util.Scanner;

public class ReallyNeverMind {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("please enter a word:");
        String word=kb.next().trim();
        int length=word.length();
        if (word.substring(length-2,length).equals("ly"))
            System.out.println("Really???");
        else System.out.println("never mind");

    }
}
