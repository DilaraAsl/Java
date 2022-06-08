package day16_nestedLoops;

import java.util.Scanner;

public class frequencyOfLetters {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=kb.next();
        String newString="";

        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            for (int j =0; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }

            }
            if (!(newString.contains(str.charAt(i)+""))) {
                newString+=""+str.charAt(i);
                System.out.print(""+str.charAt(i) + count+" ");
            }

        }
        System.out.println();
        System.out.println(newString);

        }
    }

