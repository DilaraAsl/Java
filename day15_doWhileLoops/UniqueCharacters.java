package day15_doWhileLoops;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = kb.next();
        String newString = "";
        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {

                newString +=""+ str.charAt(i);
            }


        }
        System.out.println(newString);
    }
    }